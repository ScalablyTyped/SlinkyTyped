package typingsSlinky.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayOptions extends js.Object {
  /**
    * Control wether this Overlay should handle Keyboard events.
    * Set this to true if your Overlay contains a TextInput.
    */
  var handleKeyboardEvents: js.UndefOr[Boolean] = js.native
  /**
    * Capture touches outside of the Component View
    */
  var interceptTouchOutside: js.UndefOr[Boolean] = js.native
}

object OverlayOptions {
  @scala.inline
  def apply(): OverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayOptions]
  }
  @scala.inline
  implicit class OverlayOptionsOps[Self <: OverlayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandleKeyboardEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleKeyboardEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleKeyboardEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleKeyboardEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withInterceptTouchOutside(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interceptTouchOutside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterceptTouchOutside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interceptTouchOutside")(js.undefined)
        ret
    }
  }
  
}

