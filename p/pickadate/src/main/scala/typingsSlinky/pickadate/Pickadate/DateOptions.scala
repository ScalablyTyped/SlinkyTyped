package typingsSlinky.pickadate.Pickadate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateOptions extends Options {
   // default 'Today'
  var close: js.UndefOr[String] = js.native
  /**
    * Disable a specific or arbitrary set of dates selectable on the
    * picker. Accepts an array of Date objects, arrays formatted as
    * [YEAR, MONTH, DATE], integers representing days of the week
    * (from 1 to 7), or objects with a range of dates. Switch to a
    * whitelist by setting `true` as the first item in the collection.
    * Enable dates that fall within a range of disabled dates by
    * adding an `inverted` parameter to the item within the collection.
    */
  var disable: js.UndefOr[js.Array[_]] = js.native
  /**
    * The first day of the week can be set to either Sunday or Monday.
    * True or 1 sets it as Monday and false or 0 as Sunday.
    */
  var firstDay: js.UndefOr[Boolean | Double] = js.native
  // Classes
  var klass: js.UndefOr[DateKlassOptions] = js.native
   // default 'Close'
  // Accessibility labels
  var labelMonthNext: js.UndefOr[String] = js.native
   // default 'Next month'
  var labelMonthPrev: js.UndefOr[String] = js.native
   // default 'Previous month'
  var labelMonthSelect: js.UndefOr[String] = js.native
   // default 'Select a month'
  var labelYearSelect: js.UndefOr[String] = js.native
  /**
    * Set the maximum selectable date on the picker.
    * Accepts the same values as the `min` property.
    */
  var max: js.UndefOr[MinOrMaxDateOption] = js.native
  /**
    * Set the minimum selectable date on the picker. Accepts a Date object,
    * array formatted as [YEAR, MONTH, DATE], a positive or negative integer
    * for a date relative to today, or a boolean (`true` sets it to today,
    * `false` removes any limit).
    */
  var min: js.UndefOr[MinOrMaxDateOption] = js.native
  // Strings and translations
  var monthsFull: js.UndefOr[js.Array[String]] = js.native
   // default 'January' through 'December'
  var monthsShort: js.UndefOr[js.Array[String]] = js.native
  /**
    * True enables the dropdown selector and false replaces it with text
    */
  var selectMonths: js.UndefOr[Boolean] = js.native
   //default 'Select a year'
  /**
    * True enables the dropdown selector and false replaces it with text.
    * You can also specify the number of years to show in the dropdown
    * using an even integer - half before and half after the year in focus.
    * If true the value will default to 10.
    */
  var selectYears: js.UndefOr[Boolean | Double] = js.native
   // default 'Sun' through 'Sat'
  var showMonthsShort: js.UndefOr[Boolean] = js.native
  var showWeekdaysFull: js.UndefOr[Boolean] = js.native
  // Buttons
  var today: js.UndefOr[String] = js.native
   // default 'Jan' through 'Dec'
  var weekdaysFull: js.UndefOr[js.Array[String]] = js.native
   // default 'Sunday' through 'Saturday'
  var weekdaysShort: js.UndefOr[js.Array[String]] = js.native
}

object DateOptions {
  @scala.inline
  def apply(): DateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateOptions]
  }
  @scala.inline
  implicit class DateOptionsOps[Self <: DateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstDay(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDay")(js.undefined)
        ret
    }
    @scala.inline
    def withKlass(value: DateKlassOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("klass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKlass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("klass")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelMonthNext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMonthNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelMonthNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMonthNext")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelMonthPrev(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMonthPrev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelMonthPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMonthPrev")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelMonthSelect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMonthSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelMonthSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMonthSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelYearSelect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelYearSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelYearSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelYearSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: MinOrMaxDateOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: MinOrMaxDateOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthsFull(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthsFull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthsFull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthsFull")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthsShort(value: js.Array[String]): Self = {
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
    def withSelectMonths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectMonths")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectYears(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectYears")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectYears: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectYears")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMonthsShort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMonthsShort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMonthsShort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMonthsShort")(js.undefined)
        ret
    }
    @scala.inline
    def withShowWeekdaysFull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeekdaysFull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowWeekdaysFull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeekdaysFull")(js.undefined)
        ret
    }
    @scala.inline
    def withToday(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("today")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("today")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekdaysFull(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysFull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdaysFull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysFull")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekdaysShort(value: js.Array[String]): Self = {
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

