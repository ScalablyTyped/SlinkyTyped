package typingsSlinky.reactIntl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Intl.DateTimeFormatOptions & react-intl.react-intl.CustomFormatConfig & {  value  :string | number | std.Date | undefined} */
@js.native
trait DateTimeFormatOptionsCust extends js.Object {
  var day: js.UndefOr[String] = js.native
  var era: js.UndefOr[String] = js.native
  var format: js.UndefOr[String] = js.native
  var formatMatcher: js.UndefOr[String] = js.native
  var hour: js.UndefOr[String] = js.native
  var hour12: js.UndefOr[Boolean] = js.native
  var localeMatcher: js.UndefOr[String] = js.native
  var minute: js.UndefOr[String] = js.native
  var month: js.UndefOr[String] = js.native
  var second: js.UndefOr[String] = js.native
  var timeZone: js.UndefOr[String] = js.native
  var timeZoneName: js.UndefOr[String] = js.native
  var value: js.UndefOr[String | Double | js.Date] = js.native
  var weekday: js.UndefOr[String] = js.native
  var year: js.UndefOr[String] = js.native
}

object DateTimeFormatOptionsCust {
  @scala.inline
  def apply(): DateTimeFormatOptionsCust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeFormatOptionsCust]
  }
  @scala.inline
  implicit class DateTimeFormatOptionsCustOps[Self <: DateTimeFormatOptionsCust] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDay(value: String): Self = {
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
    def withEra(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("era")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("era")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatMatcher(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatMatcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatMatcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatMatcher")(js.undefined)
        ret
    }
    @scala.inline
    def withHour(value: String): Self = {
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
    def withHour12(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour12")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHour12: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour12")(js.undefined)
        ret
    }
    @scala.inline
    def withLocaleMatcher(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeMatcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocaleMatcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeMatcher")(js.undefined)
        ret
    }
    @scala.inline
    def withMinute(value: String): Self = {
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
    def withMonth(value: String): Self = {
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
    def withSecond(value: String): Self = {
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
    def withTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZoneName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZoneName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZoneName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZoneName")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String | Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekday(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekday")(js.undefined)
        ret
    }
    @scala.inline
    def withYear(value: String): Self = {
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

