package typingsSlinky.baseui.anon

import org.scalajs.dom.raw.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemAny extends StObject {
  
  var event: org.scalajs.dom.raw.Event | KeyboardEvent = js.native
  
  var item: js.Any = js.native
}
object ItemAny {
  
  @scala.inline
  def apply(event: org.scalajs.dom.raw.Event | KeyboardEvent, item: js.Any): ItemAny = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemAny]
  }
  
  @scala.inline
  implicit class ItemAnyMutableBuilder[Self <: ItemAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: org.scalajs.dom.raw.Event | KeyboardEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventEvent(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventKeyboardEvent(value: KeyboardEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
