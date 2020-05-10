package typingsSlinky.momentMini.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocaleSpecification
  extends // Allow anything: in general any property that is passed as locale spec is
// put in the locale object so it can be used by locale functions
/* x */ StringDictionary[js.Any] {
  var calendar: js.UndefOr[CalendarSpec] = js.native
  var invalidDate: js.UndefOr[String] = js.native
  var isPM: js.UndefOr[js.Function1[/* input */ String, Boolean]] = js.native
  var longDateFormat: js.UndefOr[LongDateFormatSpec] = js.native
  var meridiem: js.UndefOr[
    js.Function3[/* hour */ Double, /* minute */ Double, /* isLower */ Boolean, String]
  ] = js.native
  var meridiemParse: js.UndefOr[js.RegExp] = js.native
  var months: js.UndefOr[js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn] = js.native
  var monthsShort: js.UndefOr[js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn] = js.native
  var ordinal: js.UndefOr[js.Function1[/* n */ Double, String]] = js.native
  var ordinalParse: js.UndefOr[js.RegExp] = js.native
  var relativeTime: js.UndefOr[RelativeTimeSpec] = js.native
  var week: js.UndefOr[WeekSpec] = js.native
  var weekdays: js.UndefOr[js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn] = js.native
  var weekdaysMin: js.UndefOr[js.Array[String] | StandaloneFormatSpec | WeekdaySimpleFn] = js.native
  var weekdaysShort: js.UndefOr[js.Array[String] | StandaloneFormatSpec | WeekdaySimpleFn] = js.native
}

object LocaleSpecification {
  @scala.inline
  def apply(): LocaleSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleSpecification]
  }
  @scala.inline
  implicit class LocaleSpecificationOps[Self <: LocaleSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendar(value: CalendarSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidDate")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPM(value: /* input */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPM")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsPM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPM")(js.undefined)
        ret
    }
    @scala.inline
    def withLongDateFormat(value: LongDateFormatSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longDateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longDateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withMeridiem(value: (/* hour */ Double, /* minute */ Double, /* isLower */ Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridiem")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutMeridiem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridiem")(js.undefined)
        ret
    }
    @scala.inline
    def withMeridiemParse(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridiemParse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeridiemParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridiemParse")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthsFunction2(value: (/* momentToFormat */ Moment, /* format */ js.UndefOr[String]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMonths(value: js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn): Self = {
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
    def withMonthsShortFunction2(value: (/* momentToFormat */ Moment, /* format */ js.UndefOr[String]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthsShort")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMonthsShort(value: js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthsShort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthsShort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthsShort")(js.undefined)
        ret
    }
    @scala.inline
    def withOrdinal(value: /* n */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOrdinal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(js.undefined)
        ret
    }
    @scala.inline
    def withOrdinalParse(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordinalParse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrdinalParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordinalParse")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeTime(value: RelativeTimeSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeTime")(js.undefined)
        ret
    }
    @scala.inline
    def withWeek(value: WeekSpec): Self = {
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
    def withWeekdaysFunction2(value: (/* momentToFormat */ Moment, /* format */ js.UndefOr[String]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdays")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWeekdays(value: js.Array[String] | StandaloneFormatSpec | MonthWeekdayFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdays")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekdaysMinFunction1(value: /* momentToFormat */ Moment => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysMin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWeekdaysMin(value: js.Array[String] | StandaloneFormatSpec | WeekdaySimpleFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdaysMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysMin")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekdaysShortFunction1(value: /* momentToFormat */ Moment => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysShort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWeekdaysShort(value: js.Array[String] | StandaloneFormatSpec | WeekdaySimpleFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysShort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdaysShort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysShort")(js.undefined)
        ret
    }
  }
  
}

