package typingsSlinky.kendoUi.kendo.dataviz.ui

import typingsSlinky.kendoUi.kendo.dataviz.diagram.Connection
import typingsSlinky.kendoUi.kendo.dataviz.diagram.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramRemoveEvent extends DiagramEvent {
  
  var connection: js.UndefOr[Connection] = js.native
  
  var shape: js.UndefOr[Shape] = js.native
}
object DiagramRemoveEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Diagram): DiagramRemoveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramRemoveEvent]
  }
  
  @scala.inline
  implicit class DiagramRemoveEventMutableBuilder[Self <: DiagramRemoveEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    @scala.inline
    def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
  }
}
