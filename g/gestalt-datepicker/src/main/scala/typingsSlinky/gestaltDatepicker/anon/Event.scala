package typingsSlinky.gestaltDatepicker.anon

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends js.Object {
  
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
    def setEvent(value: SyntheticEvent[org.scalajs.dom.raw.Event, HTMLInputElement]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Date): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
