package typingsSlinky.reactColor.chromeMod

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromePickerDefaultStyles extends js.Object {
  var Alpha: js.UndefOr[CSSProperties] = js.native
  var Hue: js.UndefOr[CSSProperties] = js.native
  var Saturation: js.UndefOr[CSSProperties] = js.native
  var active: js.UndefOr[CSSProperties] = js.native
  var alpha: js.UndefOr[CSSProperties] = js.native
  var body: js.UndefOr[CSSProperties] = js.native
  var color: js.UndefOr[CSSProperties] = js.native
  var controls: js.UndefOr[CSSProperties] = js.native
  var hue: js.UndefOr[CSSProperties] = js.native
  var picker: js.UndefOr[CSSProperties] = js.native
  var saturation: js.UndefOr[CSSProperties] = js.native
  var swatch: js.UndefOr[CSSProperties] = js.native
  var toggles: js.UndefOr[CSSProperties] = js.native
}

object ChromePickerDefaultStyles {
  @scala.inline
  def apply(): ChromePickerDefaultStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromePickerDefaultStyles]
  }
  @scala.inline
  implicit class ChromePickerDefaultStylesOps[Self <: ChromePickerDefaultStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alpha")(js.undefined)
        ret
    }
    @scala.inline
    def withHue(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hue")(js.undefined)
        ret
    }
    @scala.inline
    def withSaturation(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Saturation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaturation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Saturation")(js.undefined)
        ret
    }
    @scala.inline
    def withActive(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withControls(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(js.undefined)
        ret
    }
    @scala.inline
    def withPicker(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picker")(js.undefined)
        ret
    }
    @scala.inline
    def withSwatch(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swatch")(js.undefined)
        ret
    }
    @scala.inline
    def withToggles(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggles")(js.undefined)
        ret
    }
  }
  
}

