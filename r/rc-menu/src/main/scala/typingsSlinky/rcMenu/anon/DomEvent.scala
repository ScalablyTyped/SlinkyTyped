package typingsSlinky.rcMenu.anon

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomEvent extends StObject {
  
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
  implicit class DomEventMutableBuilder[Self <: DomEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomEvent(value: SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomEventKeyboardEvent(value: SyntheticKeyboardEvent[HTMLElement]): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomEventMouseEvent(value: SyntheticMouseEvent[HTMLElement]): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: typingsSlinky.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
