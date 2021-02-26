package typingsSlinky.baseui.anon

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.SyntheticEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Item extends StObject {
  
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
  implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: (SyntheticEvent[org.scalajs.dom.raw.Event, HTMLElement]) | KeyboardEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventBaseSyntheticEvent(value: SyntheticEvent[EventTarget with HTMLElement, org.scalajs.dom.raw.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventKeyboardEvent(value: KeyboardEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
