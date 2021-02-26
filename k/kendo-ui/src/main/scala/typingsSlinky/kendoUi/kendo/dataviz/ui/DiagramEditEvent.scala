package typingsSlinky.kendoUi.kendo.dataviz.ui

import typingsSlinky.kendoUi.JQuery
import typingsSlinky.kendoUi.kendo.data.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramEditEvent extends DiagramEvent {
  
  var connection: js.UndefOr[Model] = js.native
  
  var container: js.UndefOr[JQuery] = js.native
  
  var shape: js.UndefOr[Model] = js.native
}
object DiagramEditEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Diagram): DiagramEditEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramEditEvent]
  }
  
  @scala.inline
  implicit class DiagramEditEventMutableBuilder[Self <: DiagramEditEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: Model): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    @scala.inline
    def setContainer(value: JQuery): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setShape(value: Model): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
  }
}
