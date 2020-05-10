package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorXAxisDateTimeLabelFormatsOptions extends js.Object {
  var day: js.UndefOr[String | NavigatorXAxisDateTimeLabelFormatsDayOptions] = js.native
  var hour: js.UndefOr[String | NavigatorXAxisDateTimeLabelFormatsHourOptions] = js.native
  var millisecond: js.UndefOr[String | NavigatorXAxisDateTimeLabelFormatsMillisecondOptions] = js.native
  var minute: js.UndefOr[String | NavigatorXAxisDateTimeLabelFormatsMinuteOptions] = js.native
  var month: js.UndefOr[String | NavigatorXAxisDateTimeLabelFormatsMonthOptions] = js.native
  var second: js.UndefOr[String | NavigatorXAxisDateTimeLabelFormatsSecondOptions] = js.native
  var week: js.UndefOr[String | NavigatorXAxisDateTimeLabelFormatsWeekOptions] = js.native
  var year: js.UndefOr[String | NavigatorXAxisDateTimeLabelFormatsYearOptions] = js.native
}

object NavigatorXAxisDateTimeLabelFormatsOptions {
  @scala.inline
  def apply(): NavigatorXAxisDateTimeLabelFormatsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorXAxisDateTimeLabelFormatsOptions]
  }
  @scala.inline
  implicit class NavigatorXAxisDateTimeLabelFormatsOptionsOps[Self <: NavigatorXAxisDateTimeLabelFormatsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDay(value: String | NavigatorXAxisDateTimeLabelFormatsDayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(js.undefined)
        ret
    }
    @scala.inline
    def withHour(value: String | NavigatorXAxisDateTimeLabelFormatsHourOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(js.undefined)
        ret
    }
    @scala.inline
    def withMillisecond(value: String | NavigatorXAxisDateTimeLabelFormatsMillisecondOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMillisecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisecond")(js.undefined)
        ret
    }
    @scala.inline
    def withMinute(value: String | NavigatorXAxisDateTimeLabelFormatsMinuteOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute")(js.undefined)
        ret
    }
    @scala.inline
    def withMonth(value: String | NavigatorXAxisDateTimeLabelFormatsMonthOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(js.undefined)
        ret
    }
    @scala.inline
    def withSecond(value: String | NavigatorXAxisDateTimeLabelFormatsSecondOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(js.undefined)
        ret
    }
    @scala.inline
    def withWeek(value: String | NavigatorXAxisDateTimeLabelFormatsWeekOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week")(js.undefined)
        ret
    }
    @scala.inline
    def withYear(value: String | NavigatorXAxisDateTimeLabelFormatsYearOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(js.undefined)
        ret
    }
  }
  
}

