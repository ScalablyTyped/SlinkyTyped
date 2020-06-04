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
  @scala.inline
  implicit class NavigateOps[Self <: Navigate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDATE(value: DATE): Self = this.set("DATE", value.asInstanceOf[js.Any])
    @scala.inline
    def setNEXT(value: NEXT): Self = this.set("NEXT", value.asInstanceOf[js.Any])
    @scala.inline
    def setPREVIOUS(value: PREV): Self = this.set("PREVIOUS", value.asInstanceOf[js.Any])
    @scala.inline
    def setTODAY(value: TODAY): Self = this.set("TODAY", value.asInstanceOf[js.Any])
  }
  
}

