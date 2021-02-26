package typingsSlinky.reactBigCalendar.mod

import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.DATE
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.NEXT
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.PREV
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.TODAY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigate extends StObject {
  
  var DATE: typingsSlinky.reactBigCalendar.reactBigCalendarStrings.DATE = js.native
  
  var NEXT: typingsSlinky.reactBigCalendar.reactBigCalendarStrings.NEXT = js.native
  
  var PREVIOUS: PREV = js.native
  
  var TODAY: typingsSlinky.reactBigCalendar.reactBigCalendarStrings.TODAY = js.native
}
object Navigate {
  
  @scala.inline
  def apply(DATE: DATE, NEXT: NEXT, PREVIOUS: PREV, TODAY: TODAY): Navigate = {
    val __obj = js.Dynamic.literal(DATE = DATE.asInstanceOf[js.Any], NEXT = NEXT.asInstanceOf[js.Any], PREVIOUS = PREVIOUS.asInstanceOf[js.Any], TODAY = TODAY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigate]
  }
  
  @scala.inline
  implicit class NavigateMutableBuilder[Self <: Navigate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDATE(value: DATE): Self = StObject.set(x, "DATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNEXT(value: NEXT): Self = StObject.set(x, "NEXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPREVIOUS(value: PREV): Self = StObject.set(x, "PREVIOUS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTODAY(value: TODAY): Self = StObject.set(x, "TODAY", value.asInstanceOf[js.Any])
  }
}
