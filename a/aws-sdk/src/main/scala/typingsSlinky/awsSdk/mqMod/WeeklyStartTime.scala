package typingsSlinky.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeeklyStartTime extends js.Object {
  /**
    * Required. The day of the week.
    */
  var DayOfWeek: js.UndefOr[typingsSlinky.awsSdk.mqMod.DayOfWeek] = js.native
  /**
    * Required. The time, in 24-hour format.
    */
  var TimeOfDay: js.UndefOr[string] = js.native
  /**
    * The time zone, UTC by default, in either the Country/City format, or the UTC offset format.
    */
  var TimeZone: js.UndefOr[string] = js.native
}

object WeeklyStartTime {
  @scala.inline
  def apply(): WeeklyStartTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeeklyStartTime]
  }
  @scala.inline
  implicit class WeeklyStartTimeOps[Self <: WeeklyStartTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDayOfWeek(value: DayOfWeek): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DayOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeOfDay(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeOfDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeOfDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeOfDay")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZone(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeZone")(js.undefined)
        ret
    }
  }
  
}

