package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventValue extends StObject {
  
  var event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLInputElement] = js.native
  
  var value: Boolean = js.native
}
object EventValue {
  
  @scala.inline
  def apply(event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLInputElement], value: Boolean): EventValue = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventValue]
  }
  
  @scala.inline
  implicit class EventValueMutableBuilder[Self <: EventValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLInputElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
