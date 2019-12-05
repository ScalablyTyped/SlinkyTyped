package typingsSlinky.androiduix.android.content.DialogInterface

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnClickListener extends js.Object {
  def onClick(dialog: typingsSlinky.androiduix.android.content.DialogInterface, which: Double): Unit
}

object OnClickListener {
  @scala.inline
  def apply(onClick: (typingsSlinky.androiduix.android.content.DialogInterface, Double) => Unit): OnClickListener = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction2(onClick))
  
    __obj.asInstanceOf[OnClickListener]
  }
}

