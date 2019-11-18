package typingsSlinky.reactDashBigDashCalendar.reactDashBigDashCalendarMod

import typingsSlinky.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.DATE
import typingsSlinky.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.NEXT
import typingsSlinky.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.PREV
import typingsSlinky.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.TODAY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigate extends js.Object {
  var DATE: typingsSlinky.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.DATE
  var NEXT: typingsSlinky.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.NEXT
  var PREVIOUS: PREV
  var TODAY: typingsSlinky.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.TODAY
}

object Navigate {
  @scala.inline
  def apply(DATE: DATE, NEXT: NEXT, PREVIOUS: PREV, TODAY: TODAY): Navigate = {
    val __obj = js.Dynamic.literal(DATE = DATE.asInstanceOf[js.Any], NEXT = NEXT.asInstanceOf[js.Any], PREVIOUS = PREVIOUS.asInstanceOf[js.Any], TODAY = TODAY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Navigate]
  }
}

