package typingsSlinky.atlaskitSingleSelect

import slinky.core.SyntheticEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Event extends StObject {
    
    var event: SyntheticEvent[org.scalajs.dom.raw.Event, _] = js.native
    
    var isOpen: Boolean = js.native
  }
  object Event {
    
    @scala.inline
    def apply(event: SyntheticEvent[org.scalajs.dom.raw.Event, _], isOpen: Boolean): Event = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: SyntheticEvent[org.scalajs.dom.raw.Event, _]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    }
  }
}
