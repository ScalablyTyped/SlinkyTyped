package typingsSlinky.reactColor.chromeMod

import typingsSlinky.reactColor.mod.ColorPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromePickerProps extends ColorPickerProps[ChromePicker] {
  var disableAlpha: js.UndefOr[Boolean] = js.native
  var styles: js.UndefOr[ChromePickerStyles] = js.native
}

object ChromePickerProps {
  @scala.inline
  def apply(): ChromePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromePickerProps]
  }
  @scala.inline
  implicit class ChromePickerPropsOps[Self <: ChromePickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableAlpha(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: ChromePickerStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
  }
  
}

