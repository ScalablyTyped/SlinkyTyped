package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalEndCallbackEventArgs extends EventArgs {
  val control: Control = js.native
}

object GlobalEndCallbackEventArgs {
  @scala.inline
  def apply(control: Control, sender: Control): GlobalEndCallbackEventArgs = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalEndCallbackEventArgs]
  }
  @scala.inline
  implicit class GlobalEndCallbackEventArgsOps[Self <: GlobalEndCallbackEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControl(value: Control): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

