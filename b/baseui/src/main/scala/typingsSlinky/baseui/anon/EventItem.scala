package typingsSlinky.baseui.anon

import slinky.core.SyntheticEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventItem extends StObject {
  
  var event: SyntheticEvent[org.scalajs.dom.raw.Event, _] = js.native
  
  var item: js.Any = js.native
}
object EventItem {
  
  @scala.inline
  def apply(event: SyntheticEvent[org.scalajs.dom.raw.Event, _], item: js.Any): EventItem = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  
  @scala.inline
  implicit class EventItemMutableBuilder[Self <: EventItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: SyntheticEvent[org.scalajs.dom.raw.Event, _]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
