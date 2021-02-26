package typingsSlinky.kendoUi.kendo.dataviz.ui

import typingsSlinky.kendoUi.kendo.dataviz.diagram.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramPanEvent extends DiagramEvent {
  
  var pan: js.UndefOr[Point] = js.native
}
object DiagramPanEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Diagram): DiagramPanEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramPanEvent]
  }
  
  @scala.inline
  implicit class DiagramPanEventMutableBuilder[Self <: DiagramPanEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPan(value: Point): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
  }
}
