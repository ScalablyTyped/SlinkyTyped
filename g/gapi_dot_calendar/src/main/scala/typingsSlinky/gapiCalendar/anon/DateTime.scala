package typingsSlinky.gapiCalendar.anon

import typingsSlinky.gapiCalendar.gapi.client.calendar.date
import typingsSlinky.gapiCalendar.gapi.client.calendar.datetime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTime extends StObject {
  
  var date: typingsSlinky.gapiCalendar.gapi.client.calendar.date = js.native
  
  var dateTime: datetime = js.native
  
  var timeZone: String = js.native
}
object DateTime {
  
  @scala.inline
  def apply(date: date, dateTime: datetime, timeZone: String): DateTime = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTime]
  }
  
  @scala.inline
  implicit class DateTimeMutableBuilder[Self <: DateTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTime(value: datetime): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
  }
}
