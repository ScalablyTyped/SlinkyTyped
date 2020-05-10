package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeeklyAutoScalingSchedule extends js.Object {
  /**
    * The schedule for Friday.
    */
  var Friday: js.UndefOr[DailyAutoScalingSchedule] = js.native
  /**
    * The schedule for Monday.
    */
  var Monday: js.UndefOr[DailyAutoScalingSchedule] = js.native
  /**
    * The schedule for Saturday.
    */
  var Saturday: js.UndefOr[DailyAutoScalingSchedule] = js.native
  /**
    * The schedule for Sunday.
    */
  var Sunday: js.UndefOr[DailyAutoScalingSchedule] = js.native
  /**
    * The schedule for Thursday.
    */
  var Thursday: js.UndefOr[DailyAutoScalingSchedule] = js.native
  /**
    * The schedule for Tuesday.
    */
  var Tuesday: js.UndefOr[DailyAutoScalingSchedule] = js.native
  /**
    * The schedule for Wednesday.
    */
  var Wednesday: js.UndefOr[DailyAutoScalingSchedule] = js.native
}

object WeeklyAutoScalingSchedule {
  @scala.inline
  def apply(): WeeklyAutoScalingSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeeklyAutoScalingSchedule]
  }
  @scala.inline
  implicit class WeeklyAutoScalingScheduleOps[Self <: WeeklyAutoScalingSchedule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFriday(value: DailyAutoScalingSchedule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Friday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFriday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Friday")(js.undefined)
        ret
    }
    @scala.inline
    def withMonday(value: DailyAutoScalingSchedule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Monday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Monday")(js.undefined)
        ret
    }
    @scala.inline
    def withSaturday(value: DailyAutoScalingSchedule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Saturday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaturday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Saturday")(js.undefined)
        ret
    }
    @scala.inline
    def withSunday(value: DailyAutoScalingSchedule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sunday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSunday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sunday")(js.undefined)
        ret
    }
    @scala.inline
    def withThursday(value: DailyAutoScalingSchedule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Thursday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThursday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Thursday")(js.undefined)
        ret
    }
    @scala.inline
    def withTuesday(value: DailyAutoScalingSchedule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tuesday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTuesday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tuesday")(js.undefined)
        ret
    }
    @scala.inline
    def withWednesday(value: DailyAutoScalingSchedule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Wednesday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWednesday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Wednesday")(js.undefined)
        ret
    }
  }
  
}

