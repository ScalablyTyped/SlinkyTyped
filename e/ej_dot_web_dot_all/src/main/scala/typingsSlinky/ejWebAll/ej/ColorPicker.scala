package typingsSlinky.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorPicker extends Widget_ {
  
  /** Convert color value from HSV to RGB
    * @param {any} Specified HSV code converted to RGB
    * @returns {any}
    */
  def HSVToRGB(HSV: js.Any): js.Any = js.native
  
  /** Convert color value from RGB to HEX
    * @param {any} Specified RGB code converted to HEX code
    * @returns {string}
    */
  def RGBToHEX(RGB: js.Any): String = js.native
  
  /** Convert color value from RGB to HSV
    * @param {any} Specified RGB code converted to HSV code
    * @returns {any}
    */
  def RGBToHSV(RGB: js.Any): js.Any = js.native
  
  var defaults: Model = js.native
  
  /** Disables the color picker control
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** Enable the color picker control
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** Gets the selected color in RGB format
    * @returns {any}
    */
  def getColor(): js.Any = js.native
  
  /** Gets the selected color value as string
    * @returns {string}
    */
  def getValue(): String = js.native
  
  /** To Convert color value from hexCode to RGB
    * @param {string} Specified HEX code converted to RGB
    * @returns {any}
    */
  def hexCodeToRGB(colorCode: String): js.Any = js.native
  
  /** Hides the ColorPicker popup, if in opened state.
    * @returns {void}
    */
  def hide(): Unit = js.native
  
  @JSName("model")
  var model_ColorPicker: Model = js.native
  
  /** Open the ColorPicker popup.
    * @returns {void}
    */
  def show(): Unit = js.native
}
object ColorPicker {
  
  @js.native
  sealed trait ModelType extends StObject
  @JSGlobal("ej.ColorPicker.ModelType")
  @js.native
  object ModelType extends StObject {
    
    ///support palette type mode in color picker.
    @js.native
    sealed trait Palette extends ModelType
    
    ///support palette type mode in color picker.
    @js.native
    sealed trait Picker extends ModelType
  }
  
  @js.native
  sealed trait Palette extends StObject
  @JSGlobal("ej.ColorPicker.Palette")
  @js.native
  object Palette extends StObject {
    
    ///used to show the basic palette
    @js.native
    sealed trait BasicPalette extends Palette
    
    ///used to show the custompalette
    @js.native
    sealed trait CustomPalette extends Palette
  }
  
  @js.native
  sealed trait Presets extends StObject
  @JSGlobal("ej.ColorPicker.Presets")
  @js.native
  object Presets extends StObject {
    
    ///used to show the basic presets
    @js.native
    sealed trait Basic extends Presets
    
    ///used to show the CandyCrush colors presets
    @js.native
    sealed trait CandyCrush extends Presets
    
    ///used to show the Citrus colors presets
    @js.native
    sealed trait Citrus extends Presets
    
    ///used to show the FlatColors presets
    @js.native
    sealed trait FlatColors extends Presets
    
    ///used to show the Misty presets
    @js.native
    sealed trait Misty extends Presets
    
    ///used to show the MoonLight presets
    @js.native
    sealed trait MoonLight extends Presets
    
    ///used to show the PinkShades presets
    @js.native
    sealed trait PinkShades extends Presets
    
    ///used to show the Sandy presets
    @js.native
    sealed trait Sandy extends Presets
    
    ///used to show the Seawolf presets
    @js.native
    sealed trait SeaWolf extends Presets
    
    ///used to show the Vintage presets
    @js.native
    sealed trait Vintage extends Presets
    
    ///used to show the WebColors presets
    @js.native
    sealed trait WebColors extends Presets
  }
  
  @js.native
  trait ButtonText extends StObject {
    
    /** Sets the text for the apply button.
      */
    @JSName("apply")
    var apply: js.UndefOr[String] = js.native
    
    /** Sets the text for the cancel button.
      */
    var cancel: js.UndefOr[String] = js.native
    
    /** Sets the header text for the swatches area.
      */
    var swatches: js.UndefOr[String] = js.native
  }
  object ButtonText {
    
    @scala.inline
    def apply(): ButtonText = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonText]
    }
    
    @scala.inline
    implicit class ButtonTextMutableBuilder[Self <: ButtonText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: String): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
      
      @scala.inline
      def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setSwatches(value: String): Self = StObject.set(x, "swatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwatchesUndefined: Self = StObject.set(x, "swatches", js.undefined)
    }
  }
  
  @js.native
  trait ChangeEventArgs extends StObject {
    
    /** return the previous color value
      */
    var changeFrom: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** return the changed color value
      */
    var value: js.UndefOr[String] = js.native
  }
  object ChangeEventArgs {
    
    @scala.inline
    def apply(): ChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeEventArgs]
    }
    
    @scala.inline
    implicit class ChangeEventArgsMutableBuilder[Self <: ChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangeFrom(value: String): Self = StObject.set(x, "changeFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeFromUndefined: Self = StObject.set(x, "changeFrom", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait CloseEventArgs extends StObject {
    
    /** returns the color picker model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CloseEventArgs {
    
    @scala.inline
    def apply(): CloseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseEventArgs]
    }
    
    @scala.inline
    implicit class CloseEventArgsMutableBuilder[Self <: CloseEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CreateEventArgs extends StObject {
    
    /** returns the color picker model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CreateEventArgs {
    
    @scala.inline
    def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit class CreateEventArgsMutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DestroyEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the color picker model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DestroyEventArgs {
    
    @scala.inline
    def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit class DestroyEventArgsMutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
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
    def apply(): typingsSlinky.ejWebAll.ej.ColorPicker.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.ejWebAll.ej.ColorPicker.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typingsSlinky.ejWebAll.ej.ColorPicker.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonMode(value: ButtonMode | String): Self = StObject.set(x, "buttonMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonModeUndefined: Self = StObject.set(x, "buttonMode", js.undefined)
      
      @scala.inline
      def setButtonText(value: ButtonText): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      @scala.inline
      def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      @scala.inline
      def setClose(value: /* e */ CloseEventArgs => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setColumns(value: Double | String): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setCustom(value: js.Array[_]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      @scala.inline
      def setCustomVarargs(value: js.Any*): Self = StObject.set(x, "custom", js.Array(value :_*))
      
      @scala.inline
      def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setDisplayInline(value: Boolean): Self = StObject.set(x, "displayInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayInlineUndefined: Self = StObject.set(x, "displayInline", js.undefined)
      
      @scala.inline
      def setEnableOpacity(value: Boolean): Self = StObject.set(x, "enableOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableOpacityUndefined: Self = StObject.set(x, "enableOpacity", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setHtmlAttributes(value: js.Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setModelType(value: ModelType | String): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelTypeUndefined: Self = StObject.set(x, "modelType", js.undefined)
      
      @scala.inline
      def setOpacityValue(value: Double | String): Self = StObject.set(x, "opacityValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityValueUndefined: Self = StObject.set(x, "opacityValue", js.undefined)
      
      @scala.inline
      def setOpen(value: /* e */ OpenEventArgs => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPalette(value: Palette | String): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      @scala.inline
      def setPresetType(value: Presets | String): Self = StObject.set(x, "presetType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetTypeUndefined: Self = StObject.set(x, "presetType", js.undefined)
      
      @scala.inline
      def setSelect(value: /* e */ SelectEventArgs => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      @scala.inline
      def setShowApplyCancel(value: Boolean): Self = StObject.set(x, "showApplyCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowApplyCancelUndefined: Self = StObject.set(x, "showApplyCancel", js.undefined)
      
      @scala.inline
      def setShowClearButton(value: Boolean): Self = StObject.set(x, "showClearButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowClearButtonUndefined: Self = StObject.set(x, "showClearButton", js.undefined)
      
      @scala.inline
      def setShowPreview(value: Boolean): Self = StObject.set(x, "showPreview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPreviewUndefined: Self = StObject.set(x, "showPreview", js.undefined)
      
      @scala.inline
      def setShowRecentColors(value: Boolean): Self = StObject.set(x, "showRecentColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRecentColorsUndefined: Self = StObject.set(x, "showRecentColors", js.undefined)
      
      @scala.inline
      def setShowSwitcher(value: Boolean): Self = StObject.set(x, "showSwitcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSwitcherUndefined: Self = StObject.set(x, "showSwitcher", js.undefined)
      
      @scala.inline
      def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      @scala.inline
      def setToolIcon(value: String): Self = StObject.set(x, "toolIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolIconUndefined: Self = StObject.set(x, "toolIcon", js.undefined)
      
      @scala.inline
      def setTooltipText(value: TooltipText): Self = StObject.set(x, "tooltipText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipTextUndefined: Self = StObject.set(x, "tooltipText", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait OpenEventArgs extends StObject {
    
    /** returns the color picker model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object OpenEventArgs {
    
    @scala.inline
    def apply(): OpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenEventArgs]
    }
    
    @scala.inline
    implicit class OpenEventArgsMutableBuilder[Self <: OpenEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait SelectEventArgs extends StObject {
    
    /** returns the color picker model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** return the selected color value
      */
    var value: js.UndefOr[String] = js.native
  }
  object SelectEventArgs {
    
    @scala.inline
    def apply(): SelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectEventArgs]
    }
    
    @scala.inline
    implicit class SelectEventArgsMutableBuilder[Self <: SelectEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait TooltipText extends StObject {
    
    /** Sets the tooltip text for the add button.
      */
    var addButton: js.UndefOr[String] = js.native
    
    /** Sets the tooltip text for the basic preset.
      */
    var basic: js.UndefOr[String] = js.native
    
    /** Sets the tooltip text for the candy crush preset.
      */
    var candyCrush: js.UndefOr[String] = js.native
    
    /** Sets the tooltip text for the citrus preset.
      */
    var citrus: js.UndefOr[String] = js.native
    
    /** Sets the tooltip text for the current color area.
      */
    var currentColor: js.UndefOr[String] = js.native
    
    /** Sets the tooltip text for the flat colors preset.
      */
    var flatColors: js.UndefOr[String] = js.native
    
    /** Sets the tooltip text for the misty preset.
      */
    var misty: js.UndefOr[String] = js.native
    
    /** Sets the tooltip text for the mono chrome preset.
      */
    var monoChrome: js.UndefOr[String] = js.native
    
    /** Sets the tooltip text for the moon light preset.
      */
    var moonLight: js.UndefOr[String] = js.native
    
    /** Sets the tooltip text for the pink shades preset.
      */
    var pinkShades: js.UndefOr[String] = js.native
    
    /** Sets the tooltip text for the sandy preset.
      */
    var sandy: js.UndefOr[String] = js.native
    
    /** Sets the tooltip text for the sea wolf preset.
      */
    var seaWolf: js.UndefOr[String] = js.native
    
    /** Sets the tooltip text for the selected color area.
      */
    var selectedColor: js.UndefOr[String] = js.native
    
    /** Sets the tooltip text for the switcher button.
      */
    var switcher: js.UndefOr[String] = js.native
    
    /** Sets the tooltip text for the vintage preset.
      */
    var vintage: js.UndefOr[String] = js.native
    
    /** Sets the tooltip text for the web colors preset.
      */
    var webColors: js.UndefOr[String] = js.native
  }
  object TooltipText {
    
    @scala.inline
    def apply(): TooltipText = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipText]
    }
    
    @scala.inline
    implicit class TooltipTextMutableBuilder[Self <: TooltipText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddButton(value: String): Self = StObject.set(x, "addButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddButtonUndefined: Self = StObject.set(x, "addButton", js.undefined)
      
      @scala.inline
      def setBasic(value: String): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
      
      @scala.inline
      def setCandyCrush(value: String): Self = StObject.set(x, "candyCrush", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCandyCrushUndefined: Self = StObject.set(x, "candyCrush", js.undefined)
      
      @scala.inline
      def setCitrus(value: String): Self = StObject.set(x, "citrus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCitrusUndefined: Self = StObject.set(x, "citrus", js.undefined)
      
      @scala.inline
      def setCurrentColor(value: String): Self = StObject.set(x, "currentColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentColorUndefined: Self = StObject.set(x, "currentColor", js.undefined)
      
      @scala.inline
      def setFlatColors(value: String): Self = StObject.set(x, "flatColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlatColorsUndefined: Self = StObject.set(x, "flatColors", js.undefined)
      
      @scala.inline
      def setMisty(value: String): Self = StObject.set(x, "misty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMistyUndefined: Self = StObject.set(x, "misty", js.undefined)
      
      @scala.inline
      def setMonoChrome(value: String): Self = StObject.set(x, "monoChrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonoChromeUndefined: Self = StObject.set(x, "monoChrome", js.undefined)
      
      @scala.inline
      def setMoonLight(value: String): Self = StObject.set(x, "moonLight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoonLightUndefined: Self = StObject.set(x, "moonLight", js.undefined)
      
      @scala.inline
      def setPinkShades(value: String): Self = StObject.set(x, "pinkShades", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinkShadesUndefined: Self = StObject.set(x, "pinkShades", js.undefined)
      
      @scala.inline
      def setSandy(value: String): Self = StObject.set(x, "sandy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSandyUndefined: Self = StObject.set(x, "sandy", js.undefined)
      
      @scala.inline
      def setSeaWolf(value: String): Self = StObject.set(x, "seaWolf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeaWolfUndefined: Self = StObject.set(x, "seaWolf", js.undefined)
      
      @scala.inline
      def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedColorUndefined: Self = StObject.set(x, "selectedColor", js.undefined)
      
      @scala.inline
      def setSwitcher(value: String): Self = StObject.set(x, "switcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherUndefined: Self = StObject.set(x, "switcher", js.undefined)
      
      @scala.inline
      def setVintage(value: String): Self = StObject.set(x, "vintage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVintageUndefined: Self = StObject.set(x, "vintage", js.undefined)
      
      @scala.inline
      def setWebColors(value: String): Self = StObject.set(x, "webColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebColorsUndefined: Self = StObject.set(x, "webColors", js.undefined)
    }
  }
}
