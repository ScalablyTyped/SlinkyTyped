package typingsSlinky.gestaltDatepicker

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Event extends StObject {
    
    var event: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLInputElement] = js.native
    
    var value: js.Date = js.native
  }
  object Event {
    
    @scala.inline
    def apply(event: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLInputElement], value: js.Date): Event = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLInputElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
