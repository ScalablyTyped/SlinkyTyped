package typingsSlinky.rcSlider.anon

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<rc-slider.rc-slider/es/createSliderWithTooltip.ComponentWrapperProps> & std.Readonly<{  children :react.react.ReactNode | undefined}> */
@js.native
trait ReadonlyComponentWrapperPChildren extends js.Object {
  
  val children: js.UndefOr[ReactElement] = js.native
  
  val getTooltipContainer: js.UndefOr[js.Function0[HTMLElement]] = js.native
  
  val handleStyle: js.UndefOr[CSSProperties] = js.native
  
  val tipFormatter: js.Function1[/* value */ Double, ReactElement] = js.native
  
  val tipProps: Overlay = js.native
}
object ReadonlyComponentWrapperPChildren {
  
  @scala.inline
  def apply(tipFormatter: /* value */ Double => ReactElement, tipProps: Overlay): ReadonlyComponentWrapperPChildren = {
    val __obj = js.Dynamic.literal(tipFormatter = js.Any.fromFunction1(tipFormatter), tipProps = tipProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyComponentWrapperPChildren]
  }
  
  @scala.inline
  implicit class ReadonlyComponentWrapperPChildrenOps[Self <: ReadonlyComponentWrapperPChildren] (val x: Self) extends AnyVal {
    
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
    def setTipFormatter(value: /* value */ Double => ReactElement): Self = this.set("tipFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTipProps(value: Overlay): Self = this.set("tipProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
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
