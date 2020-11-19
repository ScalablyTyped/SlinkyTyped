package typingsSlinky.rcSlider.createSliderWithTooltipMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.rcSlider.anon.Overlay
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentWrapperProps extends js.Object {
  
  var getTooltipContainer: js.UndefOr[js.Function0[HTMLElement]] = js.native
  
  var handleStyle: js.UndefOr[CSSProperties] = js.native
  
  def tipFormatter(value: Double): ReactElement = js.native
  
  var tipProps: Overlay = js.native
}
object ComponentWrapperProps {
  
  @scala.inline
  def apply(tipFormatter: Double => ReactElement, tipProps: Overlay): ComponentWrapperProps = {
    val __obj = js.Dynamic.literal(tipFormatter = js.Any.fromFunction1(tipFormatter), tipProps = tipProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentWrapperProps]
  }
  
  @scala.inline
  implicit class ComponentWrapperPropsOps[Self <: ComponentWrapperProps] (val x: Self) extends AnyVal {
    
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
    def setTipFormatter(value: Double => ReactElement): Self = this.set("tipFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTipProps(value: Overlay): Self = this.set("tipProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTooltipContainer(value: () => HTMLElement): Self = this.set("getTooltipContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTooltipContainer: Self = this.set("getTooltipContainer", js.undefined)
    
    @scala.inline
    def setHandleStyle(value: CSSProperties): Self = this.set("handleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleStyle: Self = this.set("handleStyle", js.undefined)
  }
}
