package typingsSlinky.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateEvent extends StObject {
  
  var date: js.Date = js.native
  
  var event: org.scalajs.dom.raw.Event = js.native
}
object DateEvent {
  
  @scala.inline
  def apply(date: js.Date, event: org.scalajs.dom.raw.Event): DateEvent = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateEvent]
  }
  
  @scala.inline
  implicit class DateEventMutableBuilder[Self <: DateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
