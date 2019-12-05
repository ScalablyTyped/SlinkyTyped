package typingsSlinky.androiduix.android.widget.NumberPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnValueChangeListener extends js.Object {
  def onValueChange(picker: typingsSlinky.androiduix.android.widget.NumberPicker, oldVal: Double, newVal: Double): Unit
}

object OnValueChangeListener {
  @scala.inline
  def apply(onValueChange: (typingsSlinky.androiduix.android.widget.NumberPicker, Double, Double) => Unit): OnValueChangeListener = {
    val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction3(onValueChange))
  
    __obj.asInstanceOf[OnValueChangeListener]
  }
}

