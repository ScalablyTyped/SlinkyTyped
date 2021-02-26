package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.SyntheticFocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventFocusEvent extends StObject {
  
  var event: SyntheticFocusEvent[HTMLInputElement] = js.native
  
  var value: String = js.native
}
object EventFocusEvent {
  
  @scala.inline
  def apply(event: SyntheticFocusEvent[HTMLInputElement], value: String): EventFocusEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventFocusEvent]
  }
  
  @scala.inline
  implicit class EventFocusEventMutableBuilder[Self <: EventFocusEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: SyntheticFocusEvent[HTMLInputElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
