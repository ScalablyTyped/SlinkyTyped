package typingsSlinky.reactBigCalendar.mod

import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.DATE
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.NEXT
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.PREV
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.TODAY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigate extends js.Object {
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
  implicit class NavigateOps[Self <: Navigate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDATE(value: DATE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNEXT(value: NEXT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NEXT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPREVIOUS(value: PREV): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PREVIOUS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTODAY(value: TODAY): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TODAY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

