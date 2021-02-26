package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSyntheticEvent extends StObject {
  
  var event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticMouseEvent[HTMLDivElement]] = js.native
}
object EventSyntheticEvent {
  
  @scala.inline
  def apply(event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticMouseEvent[HTMLDivElement]]): EventSyntheticEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSyntheticEvent]
  }
  
  @scala.inline
  implicit class EventSyntheticEventMutableBuilder[Self <: EventSyntheticEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticMouseEvent[HTMLDivElement]]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
