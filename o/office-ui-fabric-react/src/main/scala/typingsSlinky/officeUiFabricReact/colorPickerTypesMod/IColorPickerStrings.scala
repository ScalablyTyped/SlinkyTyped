package typingsSlinky.officeUiFabricReact.colorPickerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColorPickerStrings extends js.Object {
  /**
    * Label for the alpha text field.
    * Also used as the aria label for the alpha slider if `alphaAriaLabel` is not provided.
    * @defaultvalue Alpha
    */
  var alpha: js.UndefOr[String] = js.native
  /**
    * Customized aria-label for the alpha slider.
    */
  var alphaAriaLabel: js.UndefOr[String] = js.native
  /**
    * Label for the blue text field.
    * @defaultvalue Blue
    */
  var blue: js.UndefOr[String] = js.native
  /**
    * Label for the green text field.
    * @defaultvalue Green
    */
  var green: js.UndefOr[String] = js.native
  /**
    * Label for the hex text field.
    * @defaultvalue Hex
    */
  var hex: js.UndefOr[String] = js.native
  /**
    * Aria label for the hue slider.
    * @deprecated Use `hueAriaLabel`
    */
  var hue: js.UndefOr[String] = js.native
  /**
    * Aria label for the hue slider.
    * @defaultvalue Hue
    */
  var hueAriaLabel: js.UndefOr[String] = js.native
  /**
    * Label for the red text field.
    * @defaultvalue Red
    */
  var red: js.UndefOr[String] = js.native
  /**
    * Accessible label for the root of the color picker region.
    * The string should contain a placeholder `{0}` for the currently selected color.
    * @defaultvalue `'Color picker, {0} selected.'`
    */
  var rootAriaLabelFormat: js.UndefOr[String] = js.native
  /**
    * Detailed description for how to use the color rectangle. Moving the thumb horizontally adjusts
    * saturation and moving it vertically adjusts value (essentially, brightness).
    * @defaultvalue 'Use left and right arrow keys to set saturation. Use up and down arrow keys to set brightness.'
    */
  var svAriaDescription: js.UndefOr[String] = js.native
  /**
    * Aria label for the color rectangle, which adjusts saturation and value (brightness).
    * @defaultvalue 'Saturation and brightness'
    */
  var svAriaLabel: js.UndefOr[String] = js.native
  /**
    * Format string for the current values of the color rectangle.
    * The string must include descriptions and two placeholders for the current values:
    * `{0}` for saturation and `{1}` for value/brightness.
    * @defaultvalue `'Saturation {0} brightness {1}'`
    */
  var svAriaValueFormat: js.UndefOr[String] = js.native
}

object IColorPickerStrings {
  @scala.inline
  def apply(): IColorPickerStrings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColorPickerStrings]
  }
  @scala.inline
  implicit class IColorPickerStringsOps[Self <: IColorPickerStrings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
        ret
    }
    @scala.inline
    def withAlphaAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlphaAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withBlue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue")(js.undefined)
        ret
    }
    @scala.inline
    def withGreen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("green")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("green")(js.undefined)
        ret
    }
    @scala.inline
    def withHex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hex")(js.undefined)
        ret
    }
    @scala.inline
    def withHue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hue")(js.undefined)
        ret
    }
    @scala.inline
    def withHueAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hueAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHueAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hueAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withRed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red")(js.undefined)
        ret
    }
    @scala.inline
    def withRootAriaLabelFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootAriaLabelFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootAriaLabelFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootAriaLabelFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSvAriaDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svAriaDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvAriaDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svAriaDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withSvAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSvAriaValueFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svAriaValueFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvAriaValueFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svAriaValueFormat")(js.undefined)
        ret
    }
  }
  
}

