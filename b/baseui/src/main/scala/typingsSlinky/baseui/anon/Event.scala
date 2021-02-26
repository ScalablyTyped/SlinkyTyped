package typingsSlinky.baseui.anon

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.baseui.dataTableMod.RowT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends StObject {
  
  var event: SyntheticMouseEvent[HTMLButtonElement] = js.native
  
  var row: RowT = js.native
}
object Event {
  
  @scala.inline
  def apply(event: SyntheticMouseEvent[HTMLButtonElement], row: RowT): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: SyntheticMouseEvent[HTMLButtonElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: RowT): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
