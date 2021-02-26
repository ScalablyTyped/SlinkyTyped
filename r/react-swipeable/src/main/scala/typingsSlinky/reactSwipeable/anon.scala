package typingsSlinky.reactSwipeable

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.TouchEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.reactSwipeable.typesMod.HandledEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Event extends StObject {
    
    var event: HandledEvents = js.native
  }
  object Event {
    
    @scala.inline
    def apply(event: HandledEvents): Event = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: HandledEvents): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventMouseEvent(value: SyntheticMouseEvent[Element]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventTouchEvent(value: TouchEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
}
