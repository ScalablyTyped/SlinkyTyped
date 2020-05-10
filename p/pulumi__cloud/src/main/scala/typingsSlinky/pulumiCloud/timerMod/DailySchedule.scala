package typingsSlinky.pulumiCloud.timerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DailySchedule extends js.Object {
  /**
    * The hour, in UTC, that the timer should fire.
    */
  var hourUTC: js.UndefOr[Double] = js.native
  /**
    * The minute, in UTC, that the timer should fire.
    */
  var minuteUTC: js.UndefOr[Double] = js.native
}

object DailySchedule {
  @scala.inline
  def apply(): DailySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DailySchedule]
  }
  @scala.inline
  implicit class DailyScheduleOps[Self <: DailySchedule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHourUTC(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourUTC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourUTC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourUTC")(js.undefined)
        ret
    }
    @scala.inline
    def withMinuteUTC(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteUTC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinuteUTC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteUTC")(js.undefined)
        ret
    }
  }
  
}

