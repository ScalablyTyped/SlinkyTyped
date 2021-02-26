package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Item extends StObject {
  
  var event: SyntheticFocusEvent[HTMLInputElement] | SyntheticKeyboardEvent[HTMLInputElement] = js.native
  
  var item: js.UndefOr[Label | Null] = js.native
}
object Item {
  
  @scala.inline
  def apply(event: SyntheticFocusEvent[HTMLInputElement] | SyntheticKeyboardEvent[HTMLInputElement]): Item = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: SyntheticFocusEvent[HTMLInputElement] | SyntheticKeyboardEvent[HTMLInputElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventFocusEvent(value: SyntheticFocusEvent[HTMLInputElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventKeyboardEvent(value: SyntheticKeyboardEvent[HTMLInputElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Label): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemNull: Self = StObject.set(x, "item", null)
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
