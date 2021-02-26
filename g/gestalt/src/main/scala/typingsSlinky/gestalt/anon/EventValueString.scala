package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.SyntheticFocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventValueString extends StObject {
  
  var event: SyntheticFocusEvent[HTMLInputElement] | (slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLInputElement]) = js.native
  
  var value: String = js.native
}
object EventValueString {
  
  @scala.inline
  def apply(
    event: SyntheticFocusEvent[HTMLInputElement] | (slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLInputElement]),
    value: String
  ): EventValueString = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventValueString]
  }
  
  @scala.inline
  implicit class EventValueStringMutableBuilder[Self <: EventValueString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(
      value: SyntheticFocusEvent[HTMLInputElement] | (slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLInputElement])
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventBaseSyntheticEvent(value: slinky.core.SyntheticEvent[EventTarget with HTMLInputElement, org.scalajs.dom.raw.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventFocusEvent(value: SyntheticFocusEvent[HTMLInputElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
