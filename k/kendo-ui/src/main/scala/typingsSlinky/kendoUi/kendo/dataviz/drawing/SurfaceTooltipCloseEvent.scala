package typingsSlinky.kendoUi.kendo.dataviz.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SurfaceTooltipCloseEvent extends SurfaceEvent {
  
  var element: js.UndefOr[typingsSlinky.kendoUi.kendo.drawing.Element] = js.native
  
  var target: js.UndefOr[typingsSlinky.kendoUi.kendo.drawing.Element] = js.native
}
object SurfaceTooltipCloseEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Surface): SurfaceTooltipCloseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceTooltipCloseEvent]
  }
  
  @scala.inline
  implicit class SurfaceTooltipCloseEventMutableBuilder[Self <: SurfaceTooltipCloseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: typingsSlinky.kendoUi.kendo.drawing.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setTarget(value: typingsSlinky.kendoUi.kendo.drawing.Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
