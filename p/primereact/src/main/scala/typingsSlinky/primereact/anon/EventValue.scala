package typingsSlinky.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventValue extends StObject {
  
  var event: org.scalajs.dom.raw.Event = js.native
  
  var value: js.Any = js.native
}
object EventValue {
  
  @scala.inline
  def apply(event: org.scalajs.dom.raw.Event, value: js.Any): EventValue = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventValue]
  }
  
  @scala.inline
  implicit class EventValueMutableBuilder[Self <: EventValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
