package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HolidayCutoff extends js.Object {
  var deadlineDate: js.UndefOr[String] = js.native
  var deadlineHour: js.UndefOr[Double] = js.native
  var deadlineTimezone: js.UndefOr[String] = js.native
  var holidayId: js.UndefOr[String] = js.native
  var visibleFromDate: js.UndefOr[String] = js.native
}

object HolidayCutoff {
  @scala.inline
  def apply(): HolidayCutoff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HolidayCutoff]
  }
  @scala.inline
  implicit class HolidayCutoffOps[Self <: HolidayCutoff] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeadlineDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadlineDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeadlineDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadlineDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDeadlineHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadlineHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeadlineHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadlineHour")(js.undefined)
        ret
    }
    @scala.inline
    def withDeadlineTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadlineTimezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeadlineTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadlineTimezone")(js.undefined)
        ret
    }
    @scala.inline
    def withHolidayId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holidayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHolidayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holidayId")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleFromDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleFromDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleFromDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleFromDate")(js.undefined)
        ret
    }
  }
  
}

