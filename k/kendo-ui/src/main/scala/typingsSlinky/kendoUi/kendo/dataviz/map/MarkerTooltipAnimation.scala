package typingsSlinky.kendoUi.kendo.dataviz.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkerTooltipAnimation extends StObject {
  
  var close: js.UndefOr[MarkerTooltipAnimationClose] = js.native
  
  var open: js.UndefOr[MarkerTooltipAnimationOpen] = js.native
}
object MarkerTooltipAnimation {
  
  @scala.inline
  def apply(): MarkerTooltipAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerTooltipAnimation]
  }
  
  @scala.inline
  implicit class MarkerTooltipAnimationMutableBuilder[Self <: MarkerTooltipAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: MarkerTooltipAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setOpen(value: MarkerTooltipAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
