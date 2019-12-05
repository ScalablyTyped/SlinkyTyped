package typingsSlinky.androiduix.android.content.DialogInterface

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMultiChoiceClickListener extends js.Object {
  def onClick(
    dialog: typingsSlinky.androiduix.android.content.DialogInterface,
    which: Double,
    isChecked: Boolean
  ): Unit
}

object OnMultiChoiceClickListener {
  @scala.inline
  def apply(onClick: (typingsSlinky.androiduix.android.content.DialogInterface, Double, Boolean) => Unit): OnMultiChoiceClickListener = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction3(onClick))
  
    __obj.asInstanceOf[OnMultiChoiceClickListener]
  }
}

