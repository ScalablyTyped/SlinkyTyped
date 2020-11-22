package typingsSlinky.officeUiFabricReact.colorSliderTypesMod

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactRef
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.alpha
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.hue
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.transparency
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColorSliderProps extends js.Object {
  
  /**
    * Label of the ColorSlider for the benefit of screen reader users.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  
  /**
    * Additional CSS class(es) to apply to the ColorSlider.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IColorSlider]] = js.native
  
  /**
    * If true, the slider represents an alpha slider and will display a gray checkered pattern
    * in the background. Otherwise, the slider represents a hue slider.
    * @defaultvalue false
    * @deprecated Use `type`
    */
  var isAlpha: js.UndefOr[Boolean] = js.native
  
  /**
    * Maximum value of the slider.
    * @deprecated Will be 100 for alpha or transparency sliders, or 359 for hue sliders.
    */
  var maxValue: js.UndefOr[Double] = js.native
  
  /**
    * Minimum value of the slider.
    * @deprecated Will always be 0
    */
  var minValue: js.UndefOr[Double] = js.native
  
  /**
    * Callback issued when the value changes.
    */
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  
  /**
    * Hex color to use when rendering an alpha or transparency slider's overlay, *without* the `#`.
    */
  var overlayColor: js.UndefOr[String] = js.native
  
  /**
    * Custom style for the overlay element.
    * @deprecated Use `overlayColor` instead
    */
  var overlayStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IColorSliderStyleProps, IColorSliderStyles]] = js.native
  
  /**
    * Theme (provided through customization).
    */
  var theme: js.UndefOr[ITheme] = js.native
  
  /**
    * CSS-compatible string for the color of the thumb element.
    * @deprecated Not used. Use `styles.sliderThumb` instead.
    */
  var thumbColor: js.UndefOr[String] = js.native
  
  /**
    * Type of slider to display.
    * @defaultvalue 'hue'
    */
  var `type`: js.UndefOr[hue | alpha | transparency] = js.native
  
  /**
    * Current value of the slider.
    */
  var value: js.UndefOr[Double] = js.native
}
object IColorSliderProps {
  
  @scala.inline
  def apply(): IColorSliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColorSliderProps]
  }
  
  @scala.inline
  implicit class IColorSliderPropsOps[Self <: IColorSliderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IColorSlider | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRefRefObject(value: ReactRef[IColorSlider]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentRef(value: IRefObject[IColorSlider]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setIsAlpha(value: Boolean): Self = this.set("isAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAlpha: Self = this.set("isAlpha", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: (/* event */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element], /* newValue */ js.UndefOr[Double]) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOverlayColor(value: String): Self = this.set("overlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayColor: Self = this.set("overlayColor", js.undefined)
    
    @scala.inline
    def setOverlayStyle(value: CSSProperties): Self = this.set("overlayStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayStyle: Self = this.set("overlayStyle", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: IColorSliderStyleProps => DeepPartial[IColorSliderStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IColorSliderStyleProps, IColorSliderStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setThumbColor(value: String): Self = this.set("thumbColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbColor: Self = this.set("thumbColor", js.undefined)
    
    @scala.inline
    def setType(value: hue | alpha | transparency): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
