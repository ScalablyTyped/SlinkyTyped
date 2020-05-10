package typingsSlinky.bootstrapColorpicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * You can set colorpicker options either as a plugin parameter or data-* attributes
  */
@js.native
trait ColorPickerOptions extends js.Object {
  /**
    * 	By default, the colorpicker is aligned to the right of the input. If you need to switch it to the left, set align to 'left'.
    * 
    * Default: 'right'
    */
  var align: js.UndefOr[ColorPickerAlignOptions] = js.native
  /**
    * If not false, sets the color to this value.
    * 
    * Default: false
    */
  var color: js.UndefOr[String] = js.native
  /**
    * 	List of pre selected colors (hex format). If you choose one of these colors, the alias is returned instead of the hex code.
    * 
    * Default: null
    */
  var colorSelectors: js.UndefOr[js.Object] = js.native
  /**
    * Children selector for the component or element that trigger the colorpicker and which background color will change (needs an inner <i> element).
    * 
    * Default: '.add-on, .input-group-addon'
    */
  var component: js.UndefOr[String | JQuery] = js.native
  /**
    * If not false, the picker will be contained inside this element, otherwise it will be appended to the document body.
    * 
    * Default: false
    */
  var container: js.UndefOr[Boolean] = js.native
  /**
    * Adds this class to the colorpicker widget.
    * 
    * Default: null
    */
  var customClass: js.UndefOr[String] = js.native
  /**
    * Fallback color string that will be applied when the color failed to be parsed. If null, it will keep the current color if any.
    * 
    * Default: null
    */
  var fallbackColor: js.UndefOr[String] = js.native
  /**
    * 	Fallback color format (e.g. when not specified or for alias mode, when selecting non aliased colors)
    * 
    * Default: hex
    */
  var fallbackFormat: js.UndefOr[String] = js.native
  /**
    * If not false, forces the color format to be hex, rgb or rgba, otherwise the format is automatically detected.
    * 
    * Default: false
    */
  var format: js.UndefOr[ColorFormat] = js.native
  /**
    * If true, put a '#' (number sign) before hex strings.
    * 
    * Default: true
    */
  var hexNumberSignPrefix: js.UndefOr[Boolean] = js.native
  /**
    * If true, the hue and alpha channel bars will be rendered horizontally, above the saturation selector.
    * 
    * Default: false
    */
  var horizontal: js.UndefOr[Boolean] = js.native
  /**
    * If true, forces to show the colorpicker as an inline element.
    * 
    * Default: false
    */
  var `inline`: js.UndefOr[Boolean] = js.native
  /**
    * Children selector for the input that will store the picker selected value.
    * 
    * Default: 'input'
    */
  var input: js.UndefOr[String | JQuery] = js.native
  /**
    * Vertical sliders configuration (read source code if you really need to tweak this).
    */
  var sliders: js.UndefOr[js.Object] = js.native
  /**
    * Horizontal sliders configuration (read source code if you really need to tweak this).
    */
  var slidersHorz: js.UndefOr[js.Object] = js.native
  /**
    * Customizes the default colorpicker HTML template.
    */
  var template: js.UndefOr[String] = js.native
}

object ColorPickerOptions {
  @scala.inline
  def apply(): ColorPickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorPickerOptions]
  }
  @scala.inline
  implicit class ColorPickerOptionsOps[Self <: ColorPickerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: ColorPickerAlignOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
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
    def withColorSelectors(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSelectors")(js.undefined)
        ret
    }
    @scala.inline
    def withComponent(value: String | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customClass")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: ColorFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHexNumberSignPrefix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hexNumberSignPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHexNumberSignPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hexNumberSignPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: String | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withSliders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliders")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidersHorz(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidersHorz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlidersHorz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidersHorz")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
  }
  
}

