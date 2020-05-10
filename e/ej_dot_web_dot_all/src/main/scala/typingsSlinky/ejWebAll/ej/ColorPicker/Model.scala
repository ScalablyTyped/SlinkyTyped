package typingsSlinky.ejWebAll.ej.ColorPicker

import typingsSlinky.ejWebAll.ej.ButtonMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Allows to change the mode of the button. Please refer below to know available button mode
    * @Default {ej.ButtonMode.Split}
    */
  var buttonMode: js.UndefOr[ButtonMode | String] = js.native
  /** The ColorPicker control allows to define the customized text to displayed in button elements. Using the property to achieve the customized culture values.
    * @Default {{ apply: Apply, cancel: Cancel, swatches: Swatches }}
    */
  var buttonText: js.UndefOr[ButtonText] = js.native
  /** Fires after Color value has been changed successfully.If the user want to perform any operation after the color value changed then the user can make use of this change event.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  /** Fires after closing the color picker popup.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.native
  /** Specifies the number of columns to be displayed color palette model.
    * @Default {10}
    */
  var columns: js.UndefOr[Double | String] = js.native
  /** Fires after Color picker control is created. If the user want to perform any operation after the color picker control creation then the user can make use of this create event.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** This property allows you to customize its appearance using user-defined CSS and custom skin options such as colors and backgrounds.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** This property allows to define the custom colors in the palette model.Custom palettes are created by passing a comma delimited string of HEX values or an array of colors.
    * @Default {empty}
    */
  var custom: js.UndefOr[js.Array[_]] = js.native
  /** Fires after Color picker control is destroyed. If the user want to perform any operation after the color picker control destroyed then the user can make use of this destroy event.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** This property allows to embed the popup in the order of DOM element flow . When we set the value as true, the color picker popup is always in visible state.
    * @Default {false}
    */
  var displayInline: js.UndefOr[Boolean] = js.native
  /** This property allows to enable or disable the opacity slider in the color picker control
    * @Default {true}
    */
  var enableOpacity: js.UndefOr[Boolean] = js.native
  /** This property allows to change the control in enabled or disabled state.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** It allows to define the characteristics of the ColorPicker control. It will helps to extend the capability of an HTML element.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** Defines the localized text values in button and tooltip.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Specifies the model type to be rendered initially in the color picker control. See below to get available ModelType
    * @Default {ej.ColorPicker.ModelType.Default}
    */
  var modelType: js.UndefOr[ModelType | String] = js.native
  /** This property allows to change the opacity value .The selected color opacity will be adjusted by using this opacity value.
    * @Default {100}
    */
  var opacityValue: js.UndefOr[Double | String] = js.native
  /** Fires after opening the color picker popup
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
  /** Specifies the palette type to be displayed at initial time in palette model.There two types of palette model available in ColorPicker control. See below available Palette
    * @Default {ej.ColorPicker.Palette.BasicPalette}
    */
  var palette: js.UndefOr[Palette | String] = js.native
  /** This property allows to define the preset model to be rendered initially in palette type.It consists of 12 different types of presets. Each presets have 50 colors. See below
    * available Presets
    * @Default {ej.ColorPicker.Presets.Basic}
    */
  var presetType: js.UndefOr[Presets | String] = js.native
  /** Fires after Color value has been selected successfully. If the user want to perform any operation after the color value selected then the user can make use of this select event.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.native
  /** Allows to show/hides the apply and cancel buttons in ColorPicker control
    * @Default {true}
    */
  var showApplyCancel: js.UndefOr[Boolean] = js.native
  /** Allows to show/hides the clear button in ColorPicker control
    * @Default {true}
    */
  var showClearButton: js.UndefOr[Boolean] = js.native
  /** This property allows to provides live preview support for current cursor selection color and selected color.
    * @Default {true}
    */
  var showPreview: js.UndefOr[Boolean] = js.native
  /** This property allows to store the color values in custom list.The ColorPicker will keep up to 11 colors in a custom list.By clicking the add button, the selected color from picker
    * or palette will get added in the recent color list.
    * @Default {false}
    */
  var showRecentColors: js.UndefOr[Boolean] = js.native
  /** Allows to show/hides the switcher button in ColorPicker control.It helps to switch palette or picker mode in colorpicker.
    * @Default {true}
    */
  var showSwitcher: js.UndefOr[Boolean] = js.native
  /** This property allows to shows tooltip to notify the slider value in color picker control.
    * @Default {false}
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  /** Specifies the toolIcon to be displayed in dropdown control color area.
    * @Default {null}
    */
  var toolIcon: js.UndefOr[String] = js.native
  /** This property allows to define the customized text or content to displayed when mouse over the following elements. This property also allows to use the culture values.
    * @Default {{ switcher: Switcher, addButton: Add Color, basic: Basic, monoChrome: Mono Chrome, flatColors: Flat Color, seaWolf: Sea Wolf, webColors: Web Colors, sandy: Sandy,
    * pinkShades: Pink Shades, misty: Misty, citrus: Citrus, vintage: Vintage, moonLight: Moon Light, candyCrush: Candy Crush, currentColor: Current Color, selectedColor: Selected
    * Color }}
    */
  var tooltipText: js.UndefOr[TooltipText] = js.native
  /** Specifies the color value for color picker control, the value is in hexadecimal form with prefix of &quot;#&quot;.
    * @Default {null}
    */
  var value: js.UndefOr[String] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonMode(value: ButtonMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonMode")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonText(value: ButtonText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: /* e */ ChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withClose(value: /* e */ CloseEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: /* e */ CreateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* e */ DestroyEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayInline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayInline")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableOpacity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withModelType(value: ModelType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelType")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacityValue(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacityValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacityValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacityValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: /* e */ OpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withPalette(value: Palette | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPalette: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(js.undefined)
        ret
    }
    @scala.inline
    def withPresetType(value: Presets | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presetType")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: /* e */ SelectEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withShowApplyCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showApplyCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowApplyCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showApplyCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withShowClearButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClearButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowClearButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClearButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPreview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPreview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPreview")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRecentColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRecentColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRecentColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRecentColors")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSwitcher(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSwitcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSwitcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSwitcher")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withToolIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipText(value: TooltipText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipText")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

