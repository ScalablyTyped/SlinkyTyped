package typingsSlinky.reactBootstrapRangeSlider

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.auto
import typingsSlinky.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.bottom
import typingsSlinky.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.danger
import typingsSlinky.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.dark
import typingsSlinky.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.info
import typingsSlinky.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.lg
import typingsSlinky.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.light
import typingsSlinky.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.off
import typingsSlinky.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.on
import typingsSlinky.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.primary
import typingsSlinky.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.secondary
import typingsSlinky.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.sm
import typingsSlinky.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.success
import typingsSlinky.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.top
import typingsSlinky.reactBootstrapRangeSlider.reactBootstrapRangeSliderStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-bootstrap-range-slider", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PropsWithoutRef[RangeSliderProps] with RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("react-bootstrap-range-slider", "RangeSlider")
  @js.native
  val RangeSlider: ForwardRefExoticComponent[PropsWithoutRef[RangeSliderProps] with RefAttributes[HTMLInputElement]] = js.native
  
  @js.native
  trait RangeSliderProps extends StObject {
    
    var bsPrefix: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var inputProps: js.UndefOr[DetailedHTMLProps[HTMLAttributes[HTMLInputElement], HTMLInputElement]] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var onAfterChange: js.UndefOr[
        js.Function2[/* event */ SyntheticMouseEvent[HTMLInputElement], /* value */ Double, Unit]
      ] = js.native
    
    var onChange: js.UndefOr[
        js.Function2[/* event */ ChangeEvent[HTMLInputElement], /* value */ Double, Unit]
      ] = js.native
    
    var ref: js.UndefOr[
        (js.Function1[/* instance */ HTMLInputElement | Null, Unit]) | ReactRef[HTMLInputElement] | Null
      ] = js.native
    
    var size: js.UndefOr[sm | lg] = js.native
    
    var step: js.UndefOr[Double] = js.native
    
    var tooltip: js.UndefOr[auto | on | off] = js.native
    
    var tooltipLabel: js.UndefOr[js.Function1[/* value */ Double, ReactElement]] = js.native
    
    var tooltipPlacement: js.UndefOr[top | bottom] = js.native
    
    var tooltipProps: js.UndefOr[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]] = js.native
    
    var tooltipStyle: js.UndefOr[CSSProperties] = js.native
    
    var value: js.UndefOr[Double] = js.native
    
    var variant: js.UndefOr[primary | secondary | success | danger | warning | info | dark | light] = js.native
  }
  object RangeSliderProps {
    
    @scala.inline
    def apply(): RangeSliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeSliderProps]
    }
    
    @scala.inline
    implicit class RangeSliderPropsMutableBuilder[Self <: RangeSliderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsPrefix(value: String): Self = StObject.set(x, "bsPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsPrefixUndefined: Self = StObject.set(x, "bsPrefix", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setInputProps(value: DetailedHTMLProps[HTMLAttributes[HTMLInputElement], HTMLInputElement]): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOnAfterChange(value: (/* event */ SyntheticMouseEvent[HTMLInputElement], /* value */ Double) => Unit): Self = StObject.set(x, "onAfterChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnAfterChangeUndefined: Self = StObject.set(x, "onAfterChange", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* event */ ChangeEvent[HTMLInputElement], /* value */ Double) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setRef(value: (js.Function1[/* instance */ HTMLInputElement | Null, Unit]) | ReactRef[HTMLInputElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefRefObject(value: ReactRef[HTMLInputElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setSize(value: sm | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setTooltip(value: auto | on | off): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipLabel(value: /* value */ Double => ReactElement): Self = StObject.set(x, "tooltipLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTooltipLabelUndefined: Self = StObject.set(x, "tooltipLabel", js.undefined)
      
      @scala.inline
      def setTooltipPlacement(value: top | bottom): Self = StObject.set(x, "tooltipPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipPlacementUndefined: Self = StObject.set(x, "tooltipPlacement", js.undefined)
      
      @scala.inline
      def setTooltipProps(value: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
      
      @scala.inline
      def setTooltipStyle(value: CSSProperties): Self = StObject.set(x, "tooltipStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipStyleUndefined: Self = StObject.set(x, "tooltipStyle", js.undefined)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVariant(value: primary | secondary | success | danger | warning | info | dark | light): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[PropsWithoutRef[RangeSliderProps] with RefAttributes[HTMLInputElement]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ForwardRefExoticComponent[PropsWithoutRef[RangeSliderProps] with RefAttributes[HTMLInputElement]] = default
}
