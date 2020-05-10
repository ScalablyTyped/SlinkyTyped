package typingsSlinky.androiduix.android.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogInterface_ extends js.Object {
  def cancel(): Unit = js.native
  def dismiss(): Unit = js.native
}

object DialogInterface_ {
  @scala.inline
  def apply(cancel: () => Unit, dismiss: () => Unit): DialogInterface_ = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), dismiss = js.Any.fromFunction0(dismiss))
    __obj.asInstanceOf[DialogInterface_]
  }
  @scala.inline
  implicit class DialogInterface_Ops[Self <: DialogInterface_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDismiss(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismiss")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

