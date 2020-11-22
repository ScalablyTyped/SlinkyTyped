package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.SyntheticFocusEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventValueString extends js.Object {
  
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
  implicit class EventValueStringOps[Self <: EventValueString] (val x: Self) extends AnyVal {
    
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
    def setEventBaseSyntheticEvent(value: slinky.core.SyntheticEvent[EventTarget with HTMLInputElement, org.scalajs.dom.raw.Event]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventFocusEvent(value: SyntheticFocusEvent[HTMLInputElement]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(
      value: SyntheticFocusEvent[HTMLInputElement] | (slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLInputElement])
    ): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
