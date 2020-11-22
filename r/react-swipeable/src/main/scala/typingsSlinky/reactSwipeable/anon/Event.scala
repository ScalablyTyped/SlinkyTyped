package typingsSlinky.reactSwipeable.anon

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.TouchEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.reactSwipeable.typesMod.HandledEvents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends js.Object {
  
  var event: HandledEvents = js.native
}
object Event {
  
  @scala.inline
  def apply(event: HandledEvents): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventMouseEvent(value: SyntheticMouseEvent[Element]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTouchEvent(value: TouchEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: HandledEvents): Self = this.set("event", value.asInstanceOf[js.Any])
  }
}
