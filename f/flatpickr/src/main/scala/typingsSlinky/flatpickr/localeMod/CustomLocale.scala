package typingsSlinky.flatpickr.localeMod

import typingsSlinky.flatpickr.anon.Longhand
import typingsSlinky.flatpickr.anon.Shorthand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomLocale extends js.Object {
  var amPM: js.UndefOr[js.Tuple2[String, String]] = js.native
  var daysInMonth: js.UndefOr[
    js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double]
  ] = js.native
  var firstDayOfWeek: js.UndefOr[Double] = js.native
  var hourAriaLabel: js.UndefOr[String] = js.native
  var minuteAriaLabel: js.UndefOr[String] = js.native
  var months: Shorthand = js.native
  var ordinal: js.UndefOr[js.Function1[/* nth */ Double, String]] = js.native
  var rangeSeparator: js.UndefOr[String] = js.native
  var scrollTitle: js.UndefOr[String] = js.native
  var time_24hr: js.UndefOr[Boolean] = js.native
  var toggleTitle: js.UndefOr[String] = js.native
  var weekAbbreviation: js.UndefOr[String] = js.native
  var weekdays: Longhand = js.native
  var yearAriaLabel: js.UndefOr[String] = js.native
}

object CustomLocale {
  @scala.inline
  def apply(months: Shorthand, weekdays: Longhand): CustomLocale = {
    val __obj = js.Dynamic.literal(months = months.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLocale]
  }
  @scala.inline
  implicit class CustomLocaleOps[Self <: CustomLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMonths(value: Shorthand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekdays(value: Longhand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmPM(value: js.Tuple2[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amPM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmPM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amPM")(js.undefined)
        ret
    }
    @scala.inline
    def withDaysInMonth(
      value: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysInMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaysInMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysInMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstDayOfWeek(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstDayOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withHourAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withMinuteAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinuteAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withOrdinal(value: /* nth */ Double => String): Self = {
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
    def withRangeSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTime_24hr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_24hr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime_24hr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_24hr")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekAbbreviation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekAbbreviation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekAbbreviation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekAbbreviation")(js.undefined)
        ret
    }
    @scala.inline
    def withYearAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearAriaLabel")(js.undefined)
        ret
    }
  }
  
}

