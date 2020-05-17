package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events concerning client manipulations on popup windows.
  */
@js.native
trait ASPxClientPopupWindowEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the popup window object related to the event.
    */
  var window: ASPxClientPopupWindow = js.native
}

object ASPxClientPopupWindowEventArgs {
  @scala.inline
  def apply(window: ASPxClientPopupWindow): ASPxClientPopupWindowEventArgs = {
    val __obj = js.Dynamic.literal(window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPopupWindowEventArgs]
  }
  @scala.inline
  implicit class ASPxClientPopupWindowEventArgsOps[Self <: ASPxClientPopupWindowEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWindow(value: ASPxClientPopupWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

