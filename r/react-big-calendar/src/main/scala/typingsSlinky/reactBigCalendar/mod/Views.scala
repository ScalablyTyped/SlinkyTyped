package typingsSlinky.reactBigCalendar.mod

import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.agenda_
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.day_
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.month_
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.week_
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.work_week_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Views extends StObject {
  
  var AGENDA: agenda_ = js.native
  
  var DAY: day_ = js.native
  
  var MONTH: month_ = js.native
  
  var WEEK: week_ = js.native
  
  var WORK_WEEK: work_week_ = js.native
}
object Views {
  
  @scala.inline
  def apply(AGENDA: agenda_, DAY: day_, MONTH: month_, WEEK: week_, WORK_WEEK: work_week_): Views = {
    val __obj = js.Dynamic.literal(AGENDA = AGENDA.asInstanceOf[js.Any], DAY = DAY.asInstanceOf[js.Any], MONTH = MONTH.asInstanceOf[js.Any], WEEK = WEEK.asInstanceOf[js.Any], WORK_WEEK = WORK_WEEK.asInstanceOf[js.Any])
    __obj.asInstanceOf[Views]
  }
  
  @scala.inline
  implicit class ViewsMutableBuilder[Self <: Views] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAGENDA(value: agenda_): Self = StObject.set(x, "AGENDA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDAY(value: day_): Self = StObject.set(x, "DAY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMONTH(value: month_): Self = StObject.set(x, "MONTH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWEEK(value: week_): Self = StObject.set(x, "WEEK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWORK_WEEK(value: work_week_): Self = StObject.set(x, "WORK_WEEK", value.asInstanceOf[js.Any])
  }
}
