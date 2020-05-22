package typingsSlinky.reactBigCalendar.mod

import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.DATE
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.NEXT
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.PREV
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.TODAY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigate extends js.Object {
  var DATE: typingsSlinky.reactBigCalendar.reactBigCalendarStrings.DATE
  var NEXT: typingsSlinky.reactBigCalendar.reactBigCalendarStrings.NEXT
  var PREVIOUS: PREV
  var TODAY: typingsSlinky.reactBigCalendar.reactBigCalendarStrings.TODAY
}

object Navigate {
  @scala.inline
  def apply(DATE: DATE, NEXT: NEXT, PREVIOUS: PREV, TODAY: TODAY): Navigate = {
    val __obj = js.Dynamic.literal(DATE = DATE.asInstanceOf[js.Any], NEXT = NEXT.asInstanceOf[js.Any], PREVIOUS = PREVIOUS.asInstanceOf[js.Any], TODAY = TODAY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigate]
  }
}

