package typingsSlinky.nodeSchedule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecurrenceSpecDateRange extends js.Object {
  /**
    * Ending date in date range.
    */
  var end: js.Date | String | Double = js.native
  /**
    * Cron expression string.
    */
  var rule: String = js.native
  /**
    * Starting date in date range.
    */
  var start: js.Date | String | Double = js.native
  /**
    * Timezone
    */
  var tz: js.UndefOr[Timezone] = js.native
}

object RecurrenceSpecDateRange {
  @scala.inline
  def apply(end: js.Date | String | Double, rule: String, start: js.Date | String | Double): RecurrenceSpecDateRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurrenceSpecDateRange]
  }
  @scala.inline
  implicit class RecurrenceSpecDateRangeOps[Self <: RecurrenceSpecDateRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: js.Date | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: js.Date | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTz(value: Timezone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tz")(js.undefined)
        ret
    }
  }
  
}

