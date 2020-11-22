package typingsSlinky.reactBootstrapRangeSlider.mod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeSliderProps extends js.Object {
  
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
  implicit class RangeSliderPropsOps[Self <: RangeSliderProps] (val x: Self) extends AnyVal {
    
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
    def setBsPrefix(value: String): Self = this.set("bsPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsPrefix: Self = this.set("bsPrefix", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setInputProps(value: DetailedHTMLProps[HTMLAttributes[HTMLInputElement], HTMLInputElement]): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setOnAfterChange(value: (/* event */ SyntheticMouseEvent[HTMLInputElement], /* value */ Double) => Unit): Self = this.set("onAfterChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnAfterChange: Self = this.set("onAfterChange", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* event */ ChangeEvent[HTMLInputElement], /* value */ Double) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setRefRefObject(value: ReactRef[HTMLInputElement]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: (js.Function1[/* instance */ HTMLInputElement | Null, Unit]) | ReactRef[HTMLInputElement]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    
    @scala.inline
    def setSize(value: sm | lg): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setTooltip(value: auto | on | off): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTooltipLabel(value: /* value */ Double => ReactElement): Self = this.set("tooltipLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTooltipLabel: Self = this.set("tooltipLabel", js.undefined)
    
    @scala.inline
    def setTooltipPlacement(value: top | bottom): Self = this.set("tooltipPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipPlacement: Self = this.set("tooltipPlacement", js.undefined)
    
    @scala.inline
    def setTooltipProps(value: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]): Self = this.set("tooltipProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipProps: Self = this.set("tooltipProps", js.undefined)
    
    @scala.inline
    def setTooltipStyle(value: CSSProperties): Self = this.set("tooltipStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipStyle: Self = this.set("tooltipStyle", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setVariant(value: primary | secondary | success | danger | warning | info | dark | light): Self = this.set("variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
  }
}
