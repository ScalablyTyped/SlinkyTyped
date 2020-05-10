package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DayPartTargeting extends js.Object {
  var daysOfWeek: js.UndefOr[js.Array[String]] = js.native
  var hoursOfDay: js.UndefOr[js.Array[Double]] = js.native
  var userLocalTime: js.UndefOr[Boolean] = js.native
}

object DayPartTargeting {
  @scala.inline
  def apply(): DayPartTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayPartTargeting]
  }
  @scala.inline
  implicit class DayPartTargetingOps[Self <: DayPartTargeting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDaysOfWeek(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaysOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withHoursOfDay(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoursOfDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoursOfDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoursOfDay")(js.undefined)
        ret
    }
    @scala.inline
    def withUserLocalTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLocalTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserLocalTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLocalTime")(js.undefined)
        ret
    }
  }
  
}

