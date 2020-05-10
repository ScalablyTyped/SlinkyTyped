package typingsSlinky.clndr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LengthOfTime extends js.Object {
  /**
    * Set to an integer if you want to render one or more days, otherwise
    * leave this null. Setting this to 14 would render a 2-week calendar.
    *
    */
  var days: js.UndefOr[Double | Null] = js.native
  /**
    * This is the amount of months or days that will move forward/back when
    * paging the calendar. With days=14 and interval=7, you would have a
    * 2-week calendar that pages forward and backward 1 week at a time.
    */
  var interval: js.UndefOr[Double] = js.native
  /**
    * Set to an integer if you want to render one or more months, otherwise
    * leave this null
    */
  var months: js.UndefOr[Double | Null] = js.native
}

object LengthOfTime {
  @scala.inline
  def apply(): LengthOfTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LengthOfTime]
  }
  @scala.inline
  implicit class LengthOfTimeOps[Self <: LengthOfTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(js.undefined)
        ret
    }
    @scala.inline
    def withDaysNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(null)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withMonths(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(null)
        ret
    }
  }
  
}

