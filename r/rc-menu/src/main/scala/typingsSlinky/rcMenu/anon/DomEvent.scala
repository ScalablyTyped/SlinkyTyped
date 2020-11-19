package typingsSlinky.rcMenu.anon

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomEvent extends js.Object {
  
  var domEvent: SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement] = js.native
  
  var key: typingsSlinky.react.mod.Key = js.native
}
object DomEvent {
  
  @scala.inline
  def apply(
    domEvent: SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement],
    key: typingsSlinky.react.mod.Key
  ): DomEvent = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomEvent]
  }
  
  @scala.inline
  implicit class DomEventOps[Self <: DomEvent] (val x: Self) extends AnyVal {
    
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
    def setDomEventKeyboardEvent(value: SyntheticKeyboardEvent[HTMLElement]): Self = this.set("domEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomEventMouseEvent(value: SyntheticMouseEvent[HTMLElement]): Self = this.set("domEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomEvent(value: SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]): Self = this.set("domEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: typingsSlinky.react.mod.Key): Self = this.set("key", value.asInstanceOf[js.Any])
  }
}
