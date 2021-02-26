package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event[T /* <: (slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLElement]) | org.scalajs.dom.raw.Event */] extends StObject {
  
  val event: T = js.native
}
object Event {
  
  @scala.inline
  def apply[T /* <: (slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLElement]) | org.scalajs.dom.raw.Event */](event: T): Event[T] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[T]]
  }
  
  @scala.inline
  implicit class EventMutableBuilder[Self <: Event[_], T /* <: (slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLElement]) | org.scalajs.dom.raw.Event */] (val x: Self with Event[T]) extends AnyVal {
    
    @scala.inline
    def setEvent(value: T): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
