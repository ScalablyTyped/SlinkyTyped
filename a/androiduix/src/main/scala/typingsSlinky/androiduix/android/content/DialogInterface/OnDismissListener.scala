package typingsSlinky.androiduix.android.content.DialogInterface

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnDismissListener extends js.Object {
  def onDismiss(dialog: typingsSlinky.androiduix.android.content.DialogInterface): Unit = js.native
}

object OnDismissListener {
  @scala.inline
  def apply(onDismiss: typingsSlinky.androiduix.android.content.DialogInterface => Unit): OnDismissListener = {
    val __obj = js.Dynamic.literal(onDismiss = js.Any.fromFunction1(onDismiss))
    __obj.asInstanceOf[OnDismissListener]
  }
  @scala.inline
  implicit class OnDismissListenerOps[Self <: OnDismissListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnDismiss(value: typingsSlinky.androiduix.android.content.DialogInterface => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

