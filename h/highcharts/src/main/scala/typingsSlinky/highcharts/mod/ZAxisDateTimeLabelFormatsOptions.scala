package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZAxisDateTimeLabelFormatsOptions extends js.Object {
  var day: js.UndefOr[String | ZAxisDateTimeLabelFormatsDayOptions] = js.native
  var hour: js.UndefOr[String | ZAxisDateTimeLabelFormatsHourOptions] = js.native
  var millisecond: js.UndefOr[String | ZAxisDateTimeLabelFormatsMillisecondOptions] = js.native
  var minute: js.UndefOr[String | ZAxisDateTimeLabelFormatsMinuteOptions] = js.native
  var month: js.UndefOr[String | ZAxisDateTimeLabelFormatsMonthOptions] = js.native
  var second: js.UndefOr[String | ZAxisDateTimeLabelFormatsSecondOptions] = js.native
  var week: js.UndefOr[String | ZAxisDateTimeLabelFormatsWeekOptions] = js.native
  var year: js.UndefOr[String | ZAxisDateTimeLabelFormatsYearOptions] = js.native
}

object ZAxisDateTimeLabelFormatsOptions {
  @scala.inline
  def apply(): ZAxisDateTimeLabelFormatsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZAxisDateTimeLabelFormatsOptions]
  }
  @scala.inline
  implicit class ZAxisDateTimeLabelFormatsOptionsOps[Self <: ZAxisDateTimeLabelFormatsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDay(value: String | ZAxisDateTimeLabelFormatsDayOptions): Self = {
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
    def withHour(value: String | ZAxisDateTimeLabelFormatsHourOptions): Self = {
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
    def withMillisecond(value: String | ZAxisDateTimeLabelFormatsMillisecondOptions): Self = {
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
    def withMinute(value: String | ZAxisDateTimeLabelFormatsMinuteOptions): Self = {
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
    def withMonth(value: String | ZAxisDateTimeLabelFormatsMonthOptions): Self = {
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
    def withSecond(value: String | ZAxisDateTimeLabelFormatsSecondOptions): Self = {
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
    def withWeek(value: String | ZAxisDateTimeLabelFormatsWeekOptions): Self = {
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
    def withYear(value: String | ZAxisDateTimeLabelFormatsYearOptions): Self = {
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

