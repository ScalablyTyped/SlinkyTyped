package typingsSlinky.baseui.anon

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Item extends js.Object {
  
  var event: js.UndefOr[(SyntheticEvent[org.scalajs.dom.raw.Event, HTMLElement]) | KeyboardEvent] = js.native
  
  var item: js.Any = js.native
}
object Item {
  
  @scala.inline
  def apply(item: js.Any): Item = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
    
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
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventKeyboardEvent(value: KeyboardEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventBaseSyntheticEvent(value: SyntheticEvent[EventTarget with HTMLElement, org.scalajs.dom.raw.Event]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: (SyntheticEvent[org.scalajs.dom.raw.Event, HTMLElement]) | KeyboardEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
  }
}
