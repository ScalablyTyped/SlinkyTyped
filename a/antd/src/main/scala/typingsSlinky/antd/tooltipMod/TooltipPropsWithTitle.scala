package typingsSlinky.antd.tooltipMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipPropsWithTitle
  extends AbstractTooltipProps
     with TooltipProps {
  
  @JSName("overlay")
  var overlay_TooltipPropsWithTitle: js.UndefOr[ReactElement | RenderFunction] = js.native
  
  var title: ReactElement | RenderFunction = js.native
}
object TooltipPropsWithTitle {
  
  @scala.inline
  def apply(): TooltipPropsWithTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipPropsWithTitle]
  }
  
  @scala.inline
  implicit class TooltipPropsWithTitleOps[Self <: TooltipPropsWithTitle] (val x: Self) extends AnyVal {
    
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
    def setOverlayReactElement(value: ReactElement): Self = this.set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayFunction0(value: () => ReactElement): Self = this.set("overlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOverlay(value: ReactElement | RenderFunction): Self = this.set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFunction0(value: () => ReactElement): Self = this.set("title", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTitle(value: ReactElement | RenderFunction): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
