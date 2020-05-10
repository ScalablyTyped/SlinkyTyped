package typingsSlinky.reactBigCalendar.mod

import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.agenda_
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.day_
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.month_
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.week_
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.work_week_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Views extends js.Object {
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
  implicit class ViewsOps[Self <: Views] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAGENDA(value: agenda_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AGENDA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDAY(value: day_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DAY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMONTH(value: month_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MONTH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWEEK(value: week_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WEEK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWORK_WEEK(value: work_week_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WORK_WEEK")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

