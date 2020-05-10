package typingsSlinky.reactColor.chromeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromePickerStyles extends js.Object {
  var default: js.UndefOr[ChromePickerDefaultStyles] = js.native
  var disableAlpha: js.UndefOr[ChromePickerDisableAlphaStyles] = js.native
}

object ChromePickerStyles {
  @scala.inline
  def apply(): ChromePickerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromePickerStyles]
  }
  @scala.inline
  implicit class ChromePickerStylesOps[Self <: ChromePickerStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: ChromePickerDefaultStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAlpha(value: ChromePickerDisableAlphaStyles): Self = {
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
  }
  
}

