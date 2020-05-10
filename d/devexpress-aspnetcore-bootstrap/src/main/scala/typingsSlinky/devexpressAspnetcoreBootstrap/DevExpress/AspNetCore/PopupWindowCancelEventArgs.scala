package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupWindowCancelEventArgs extends CancelEventArgs {
  val closeReason: BootstrapPopupControlCloseReason = js.native
  val window: BootstrapPopupWindow = js.native
}

object PopupWindowCancelEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    closeReason: BootstrapPopupControlCloseReason,
    sender: Control,
    window: BootstrapPopupWindow
  ): PopupWindowCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], closeReason = closeReason.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupWindowCancelEventArgs]
  }
  @scala.inline
  implicit class PopupWindowCancelEventArgsOps[Self <: PopupWindowCancelEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseReason(value: BootstrapPopupControlCloseReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindow(value: BootstrapPopupWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

