package typingsSlinky.pikadayTime.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PikadayOptions extends js.Object {
  /**
    * Optional numeric property to prevent calendar from auto-closing after date is selected.
    */
  var autoClose: js.UndefOr[Boolean] = js.native
  /**
    * Automatically show/hide the datepicker on field focus.
    * Default: true if field is set.
    */
  var bound: js.UndefOr[Boolean] = js.native
  /**
    * DOM node to render calendar into, see container example.
    * Default: undefined.
    */
  var container: js.UndefOr[HTMLElement] = js.native
  /**
    * The initial date to view when first opened.
    */
  var defaultDate: js.UndefOr[js.Date] = js.native
  /**
    * Callback function that gets passed a Date object for each day
    * in view. Should return true to disable selection of that day.
    */
  var disableDayFn: js.UndefOr[js.Function1[/* date */ js.Date, Boolean]] = js.native
  /**
    * Disallow selection of Saturdays and Sundays.
    */
  var disableWeekends: js.UndefOr[Boolean] = js.native
  /**
    * Bind the datepicker to a form field.
    */
  var field: js.UndefOr[HTMLElement] = js.native
  /**
    * First day of the week (0: Sunday, 1: Monday, etc).
    */
  var firstDay: js.UndefOr[Double] = js.native
  /**
    * The default output format for toString() and field value.
    * Requires Moment.js for custom formatting.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * Language defaults for month and weekday names.
    */
  var i18n: js.UndefOr[PikadayI18nConfig] = js.native
  /**
    * Optional numeric property to specify the increment step for hour.
    */
  var incrementHourBy: js.UndefOr[Double] = js.native
  /**
    * Optional numeric property to specify the increment step for minute.
    */
  var incrementMinuteBy: js.UndefOr[Double] = js.native
  /**
    * Optional numeric property to specify the increment step for second.
    */
  var incrementSecondBy: js.UndefOr[Double] = js.native
  /**
    * Reverse the calendar for right-to-left languages. Default: false.
    */
  var isRTL: js.UndefOr[Boolean] = js.native
  /**
    * When numberOfMonths is used, this will help you to choose where the
    * main calendar will be (default left, can be set to right). Only used
    * for the first display or when a selected date is not already visible.
    */
  var mainCalendar: js.UndefOr[String] = js.native
  /**
    * The latest date that can be selected (this should be a native
    * Date object - e.g. new Date() or moment().toDate()).
    */
  var maxDate: js.UndefOr[js.Date] = js.native
  /**
    * The earliest date that can be selected (this should be a native
    * Date object - e.g. new Date() or moment().toDate()).
    */
  var minDate: js.UndefOr[js.Date] = js.native
  /**
    * Number of visible calendars.
    */
  var numberOfMonths: js.UndefOr[Double] = js.native
  /**
    * Callback function for when the picker is hidden.
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback function for when the picker draws a new month.
    */
  var onDraw: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback function for when the picker becomes visible.
    */
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback function for when a date is selected.
    */
  var onSelect: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.native
  /**
    * Preferred position of the datepicker relative to the form field
    * (e.g. 'top right'). Automatic adjustment may occur to avoid
    * displaying outside the viewport. Default: 'bottom left'.
    */
  var position: js.UndefOr[String] = js.native
  /**
    * Can be set to false to not reposition the datepicker within the
    * viewport, forcing it to take the configured position. Default: true.
    */
  var reposition: js.UndefOr[Boolean] = js.native
  /**
    * Make the defaultDate the initial selected value.
    */
  var setDefaultDate: js.UndefOr[Boolean] = js.native
  /**
    * Render days of the calendar grid that fall in the next or previous months to the current month instead of rendering an empty table cell. Default: false.
    */
  var showDaysInNextAndPreviousMonths: js.UndefOr[Boolean] = js.native
  /**
    * Optional boolean property to specify whether to show minute controls with calendar or not.
    */
  var showMinutes: js.UndefOr[Boolean] = js.native
  /**
    * Render the month after the year in the title. Default: false.
    */
  var showMonthAfterYear: js.UndefOr[Boolean] = js.native
  /**
    * Optional boolean property to specify whether to show second controls with calendar or not.
    */
  var showSeconds: js.UndefOr[Boolean] = js.native
  /*--pikaday-time specific addition--*/
  /**
    * Optional boolean property to specify whether to show time controls with calendar or not.
    */
  var showTime: js.UndefOr[Boolean] = js.native
  /**
    * Show the ISO week number at the head of the row. Default: false.
    */
  var showWeekNumber: js.UndefOr[Boolean] = js.native
  /**
    * Define a class name that can be used as a hook for styling different
    * themes. Default: null.
    */
  var theme: js.UndefOr[String] = js.native
  /**
    * Optional string added to left of time select
    */
  var timeLabel: js.UndefOr[String] = js.native
  /**
    * Use a different element to trigger opening the datepicker.
    * Default: field element.
    */
  var trigger: js.UndefOr[HTMLElement] = js.native
  /**
    * Optional boolean property to specify whether to use 24 hours format or not.
    */
  var use24hour: js.UndefOr[Boolean] = js.native
  /**
    * Number of years either side (e.g. 10) or array of upper/lower range
    * (e.g. [1900, 2015]).
    */
  var yearRange: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * Additional text to append to the year in the title.
    */
  var yearSuffix: js.UndefOr[String] = js.native
}

object PikadayOptions {
  @scala.inline
  def apply(): PikadayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PikadayOptions]
  }
  @scala.inline
  implicit class PikadayOptionsOps[Self <: PikadayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(js.undefined)
        ret
    }
    @scala.inline
    def withBound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bound")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableDayFn(value: /* date */ js.Date => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDayFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDisableDayFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDayFn")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableWeekends(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWeekends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableWeekends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWeekends")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstDay(value: Double): Self = {
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
    def withI18n(value: PikadayI18nConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI18n: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(js.undefined)
        ret
    }
    @scala.inline
    def withIncrementHourBy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementHourBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncrementHourBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementHourBy")(js.undefined)
        ret
    }
    @scala.inline
    def withIncrementMinuteBy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementMinuteBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncrementMinuteBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementMinuteBy")(js.undefined)
        ret
    }
    @scala.inline
    def withIncrementSecondBy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementSecondBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncrementSecondBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementSecondBy")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withMainCalendar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainCalendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainCalendar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainCalendar")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDate(value: js.Date): Self = {
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
    def withMinDate(value: js.Date): Self = {
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
    def withNumberOfMonths(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfMonths")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDraw(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDraw")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDraw")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: /* date */ js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withReposition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReposition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reposition")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDefaultDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetDefaultDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultDate")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDaysInNextAndPreviousMonths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDaysInNextAndPreviousMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDaysInNextAndPreviousMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDaysInNextAndPreviousMonths")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMinutes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMonthAfterYear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMonthAfterYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMonthAfterYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMonthAfterYear")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSeconds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTime")(js.undefined)
        ret
    }
    @scala.inline
    def withShowWeekNumber(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeekNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowWeekNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeekNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withTrigger(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
    @scala.inline
    def withUse24hour(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use24hour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse24hour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use24hour")(js.undefined)
        ret
    }
    @scala.inline
    def withYearRange(value: Double | js.Array[Double]): Self = {
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
    def withYearSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearSuffix")(js.undefined)
        ret
    }
  }
  
}

