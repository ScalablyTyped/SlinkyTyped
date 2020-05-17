package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientPopupControlBase.CloseUp event.
  */
@js.native
trait ASPxClientPopupWindowCloseUpEventArgs extends ASPxClientPopupWindowEventArgs {
  /**
    * Gets the value that identifies the reason the popup window closes.
    */
  var closeReason: ASPxClientPopupControlCloseReason = js.native
}

object ASPxClientPopupWindowCloseUpEventArgs {
  @scala.inline
  def apply(closeReason: ASPxClientPopupControlCloseReason, window: ASPxClientPopupWindow): ASPxClientPopupWindowCloseUpEventArgs = {
    val __obj = js.Dynamic.literal(closeReason = closeReason.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPopupWindowCloseUpEventArgs]
  }
  @scala.inline
  implicit class ASPxClientPopupWindowCloseUpEventArgsOps[Self <: ASPxClientPopupWindowCloseUpEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseReason(value: ASPxClientPopupControlCloseReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeReason")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

