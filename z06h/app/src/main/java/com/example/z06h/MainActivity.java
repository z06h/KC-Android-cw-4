package com.example.z06h;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText bakrwidget = findViewById(R.id.xxx) ;
        EditText bakrwidget2 = findViewById(R.id.RRR) ;
        Button bakrbutton = findViewById(R.id.PPP) ;
        TextView bakrtext = findViewById(R.id.ttt) ;
        TextView bakrtext2 = findViewById(R.id.ccc);

        bakrbutton.setOnClickListener ( new View.OnClickListener()  {
            @Override
            public void onClick(View view)

            {

                int num1 = Integer.parseInt(bakrwidget.getText().toString());
                int num2 = Integer.parseInt(bakrwidget2.getText().toString());
                int button = num1 + num2;

                bakrtext.setText(String.valueOf(button) );
            }
        });
    }

}