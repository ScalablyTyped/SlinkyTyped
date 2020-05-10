package typingsSlinky.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatepickerConfig extends js.Object {
  /**
    * Defines an optional expression to add classes based on passing an object with date and current mode properties.
    *
    * @default null
    */
  var customClass: js.UndefOr[DatepickerCallback[String]] = js.native
  /**
    * Defines an optional expression to disable visible options based on passing an object with date and current mode properties.
    *
    * @default null
    */
  var dateDisabled: js.UndefOr[DatepickerCallback[Boolean]] = js.native
  /**
    * Current mode of the datepicker (day|month|year). Can be used to initialize datepicker to specific mode.
    *
    * @default 'day'
    */
  var datepickerMode: js.UndefOr[DatepickerMode] = js.native
  /**
    * Format of day in month.
    *
    * @default 'dd'
    */
  var formatDay: js.UndefOr[String] = js.native
  /**
    * Format of day in week header.
    *
    * @default 'EEE'
    */
  var formatDayHeader: js.UndefOr[String] = js.native
  /**
    * Format of title when selecting day.
    *
    * @default 'MMM yyyy'
    */
  var formatDayTitle: js.UndefOr[String] = js.native
  /**
    * Format of month in year.
    *
    * @default 'MMM'
    */
  var formatMonth: js.UndefOr[String] = js.native
  /**
    * Format of title when selecting month.
    *
    * @default 'yyyy'
    */
  var formatMonthTitle: js.UndefOr[String] = js.native
  /**
    * Format of year in year range.
    *
    * @default 'yyyy'
    */
  var formatYear: js.UndefOr[String] = js.native
  /**
    * Defines the initial date, when no model value is specified.
    *
    * @default null
    */
  var initDate: js.UndefOr[js.Any] = js.native
  /**
    * Defines the maximum available date.
    *
    * @default null
    */
  var maxDate: js.UndefOr[js.Any] = js.native
  /**
    * Set an upper limit for mode.
    *
    * @default 'year'
    */
  var maxMode: js.UndefOr[String] = js.native
  /**
    * Defines the minimum available date.
    *
    * @default null
    */
  var minDate: js.UndefOr[js.Any] = js.native
  /**
    * Set a lower limit for mode.
    *
    * @default 'day'
    */
  var minMode: js.UndefOr[String] = js.native
  /**
    * The number of columns displayed in month selection.
    *
    * @default 3
    */
  var monthColumns: js.UndefOr[Double] = js.native
  /**
    * All supported angular ngModelOptions plus some
    *
    * @default {}
    */
  var ngModelOptions: js.UndefOr[IDropdownConfigNgOptions] = js.native
  /**
    * An option to disable or enable shortcut's event propagation
    *
    * @default false
    */
  var shortcutPropagation: js.UndefOr[Boolean] = js.native
  /**
    * Whether to display week numbers.
    *
    * @default true
    */
  var showWeeks: js.UndefOr[Boolean] = js.native
  /**
    * Starting day of the week from 0-6 where 0=Sunday and 6=Saturday.
    *
    * @default 0
    */
  var startingDay: js.UndefOr[Double] = js.native
  /**
    * The number of columns displayed in year selection.
    *
    * @default 5
    */
  var yearColumns: js.UndefOr[Double] = js.native
  /**
    * Number of years displayed in year selection.
    *
    * @default 20
    */
  var yearRange: js.UndefOr[Double] = js.native
  /**
    * The number of rows displayed in year selection
    *
    * @default 4
    */
  var yearRows: js.UndefOr[Double] = js.native
}

object IDatepickerConfig {
  @scala.inline
  def apply(): IDatepickerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatepickerConfig]
  }
  @scala.inline
  implicit class IDatepickerConfigOps[Self <: IDatepickerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomClass(value: /* args */ IDatepickerCellArgs => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDateDisabled(value: /* args */ IDatepickerCellArgs => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateDisabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDateDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDatepickerMode(value: DatepickerMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datepickerMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatepickerMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datepickerMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatDay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatDay")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatDayHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatDayHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatDayHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatDayHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatDayTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatDayTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatDayTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatDayTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatMonth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatMonthTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatMonthTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatMonthTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatMonthTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatYear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatYear")(js.undefined)
        ret
    }
    @scala.inline
    def withInitDate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMode")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minMode")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withNgModelOptions(value: IDropdownConfigNgOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngModelOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNgModelOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngModelOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withShortcutPropagation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcutPropagation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortcutPropagation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcutPropagation")(js.undefined)
        ret
    }
    @scala.inline
    def withShowWeeks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeeks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowWeeks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeeks")(js.undefined)
        ret
    }
    @scala.inline
    def withStartingDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartingDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingDay")(js.undefined)
        ret
    }
    @scala.inline
    def withYearColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withYearRange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearRange")(js.undefined)
        ret
    }
    @scala.inline
    def withYearRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearRows")(js.undefined)
        ret
    }
  }
  
}

