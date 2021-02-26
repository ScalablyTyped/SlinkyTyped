package typingsSlinky.reactBigCalendar.anon

import typingsSlinky.reactBigCalendar.mod.stringOrDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllDay[TEvent /* <: js.Object */] extends StObject {
  
  var allDay: Boolean = js.native
  
  var end: stringOrDate = js.native
  
  var event: TEvent = js.native
  
  var start: stringOrDate = js.native
}
object AllDay {
  
  @scala.inline
  def apply[TEvent /* <: js.Object */](allDay: Boolean, end: stringOrDate, event: TEvent, start: stringOrDate): AllDay[TEvent] = {
    val __obj = js.Dynamic.literal(allDay = allDay.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDay[TEvent]]
  }
  
  @scala.inline
  implicit class AllDayMutableBuilder[Self <: AllDay[_], TEvent /* <: js.Object */] (val x: Self with AllDay[TEvent]) extends AnyVal {
    
    @scala.inline
    def setAllDay(value: Boolean): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: stringOrDate): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDate(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: TEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: stringOrDate): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
