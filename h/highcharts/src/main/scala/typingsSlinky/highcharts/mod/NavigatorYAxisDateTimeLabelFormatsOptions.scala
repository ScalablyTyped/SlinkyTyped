package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorYAxisDateTimeLabelFormatsOptions extends js.Object {
  var day: js.UndefOr[String | NavigatorYAxisDateTimeLabelFormatsDayOptions] = js.native
  var hour: js.UndefOr[String | NavigatorYAxisDateTimeLabelFormatsHourOptions] = js.native
  var millisecond: js.UndefOr[String | NavigatorYAxisDateTimeLabelFormatsMillisecondOptions] = js.native
  var minute: js.UndefOr[String | NavigatorYAxisDateTimeLabelFormatsMinuteOptions] = js.native
  var month: js.UndefOr[String | NavigatorYAxisDateTimeLabelFormatsMonthOptions] = js.native
  var second: js.UndefOr[String | NavigatorYAxisDateTimeLabelFormatsSecondOptions] = js.native
  var week: js.UndefOr[String | NavigatorYAxisDateTimeLabelFormatsWeekOptions] = js.native
  var year: js.UndefOr[String | NavigatorYAxisDateTimeLabelFormatsYearOptions] = js.native
}

object NavigatorYAxisDateTimeLabelFormatsOptions {
  @scala.inline
  def apply(): NavigatorYAxisDateTimeLabelFormatsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorYAxisDateTimeLabelFormatsOptions]
  }
  @scala.inline
  implicit class NavigatorYAxisDateTimeLabelFormatsOptionsOps[Self <: NavigatorYAxisDateTimeLabelFormatsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDay(value: String | NavigatorYAxisDateTimeLabelFormatsDayOptions): Self = {
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
    def withHour(value: String | NavigatorYAxisDateTimeLabelFormatsHourOptions): Self = {
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
    def withMillisecond(value: String | NavigatorYAxisDateTimeLabelFormatsMillisecondOptions): Self = {
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
    def withMinute(value: String | NavigatorYAxisDateTimeLabelFormatsMinuteOptions): Self = {
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
    def withMonth(value: String | NavigatorYAxisDateTimeLabelFormatsMonthOptions): Self = {
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
    def withSecond(value: String | NavigatorYAxisDateTimeLabelFormatsSecondOptions): Self = {
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
    def withWeek(value: String | NavigatorYAxisDateTimeLabelFormatsWeekOptions): Self = {
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
    def withYear(value: String | NavigatorYAxisDateTimeLabelFormatsYearOptions): Self = {
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

