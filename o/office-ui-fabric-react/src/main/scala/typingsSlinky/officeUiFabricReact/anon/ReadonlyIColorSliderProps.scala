package typingsSlinky.officeUiFabricReact.anon

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactRef
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.colorSliderTypesMod.IColorSlider
import typingsSlinky.officeUiFabricReact.colorSliderTypesMod.IColorSliderStyleProps
import typingsSlinky.officeUiFabricReact.colorSliderTypesMod.IColorSliderStyles
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.alpha
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.hue
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.transparency
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.types.IColorSliderProps> */
@js.native
trait ReadonlyIColorSliderProps extends StObject {
  
  val ariaLabel: js.UndefOr[String] = js.native
  
  val className: js.UndefOr[String] = js.native
  
  val componentRef: js.UndefOr[IRefObject[IColorSlider]] = js.native
  
  val isAlpha: js.UndefOr[Boolean] = js.native
  
  val maxValue: js.UndefOr[Double] = js.native
  
  val minValue: js.UndefOr[Double] = js.native
  
  val onChange: js.UndefOr[
    js.Function2[
      /* event */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element], 
      /* newValue */ js.UndefOr[Double], 
      scala.Unit
    ]
  ] = js.native
  
  val overlayColor: js.UndefOr[String] = js.native
  
  val overlayStyle: js.UndefOr[CSSProperties] = js.native
  
  val styles: js.UndefOr[IStyleFunctionOrObject[IColorSliderStyleProps, IColorSliderStyles]] = js.native
  
  val theme: js.UndefOr[ITheme] = js.native
  
  val thumbColor: js.UndefOr[String] = js.native
  
  val `type`: js.UndefOr[hue | alpha | transparency] = js.native
  
  val value: js.UndefOr[Double] = js.native
}
object ReadonlyIColorSliderProps {
  
  @scala.inline
  def apply(): ReadonlyIColorSliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyIColorSliderProps]
  }
  
  @scala.inline
  implicit class ReadonlyIColorSliderPropsMutableBuilder[Self <: ReadonlyIColorSliderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setComponentRef(value: IRefObject[IColorSlider]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IColorSlider | Null => scala.Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRefRefObject(value: ReactRef[IColorSlider]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
    
    @scala.inline
    def setIsAlpha(value: Boolean): Self = StObject.set(x, "isAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAlphaUndefined: Self = StObject.set(x, "isAlpha", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: (/* event */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element], /* newValue */ js.UndefOr[Double]) => scala.Unit
    ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOverlayColor(value: String): Self = StObject.set(x, "overlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayColorUndefined: Self = StObject.set(x, "overlayColor", js.undefined)
    
    @scala.inline
    def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IColorSliderStyleProps, IColorSliderStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesFunction1(value: IColorSliderStyleProps => DeepPartial[IColorSliderStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setThumbColor(value: String): Self = StObject.set(x, "thumbColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbColorUndefined: Self = StObject.set(x, "thumbColor", js.undefined)
    
    @scala.inline
    def setType(value: hue | alpha | transparency): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
