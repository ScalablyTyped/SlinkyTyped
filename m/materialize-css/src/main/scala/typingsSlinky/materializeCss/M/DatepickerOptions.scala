package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.PartialInternationalizati
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatepickerOptions extends js.Object {
  /**
    * Automatically close picker when date is selected
    * @default false
    */
  var autoClose: Boolean = js.native
  /**
    * Specify a DOM element to render the calendar in, by default it will be placed before the input
    * @default null
    */
  var container: Element = js.native
  /**
    * The initial date to view when first opened.
    */
  var defaultDate: js.Date = js.native
  /**
    * Prevent selection of any date on the weekend.
    * @default false
    */
  var disableWeekends: Boolean = js.native
  /**
    * An array of string returned by `Date.toDateString()`, indicating there are events in the specified days.
    * @default []
    */
  var events: js.Array[String] = js.native
  /**
    * First day of week (0: Sunday, 1: Monday etc).
    * @default 0
    */
  var firstDay: Double = js.native
  /**
    * The date output format for the input field value.
    * @default 'mmm dd, yyyy'
    */
  var format: String = js.native
  /**
    * Internationalization options
    */
  var i18n: PartialInternationalizati = js.native
  /**
    * Changes Datepicker to RTL.
    * @default false
    */
  var isRTL: Boolean = js.native
  /**
    * The latest date that can be selected.
    */
  var maxDate: js.Date = js.native
  /**
    * The earliest date that can be selected.
    */
  var minDate: js.Date = js.native
  /**
    * Make the `defaultDate` the initial selected value
    * @default false
    */
  var setDefaultDate: Boolean = js.native
  /**
    * Show the clear button in the datepicker
    * @default false
    */
  var showClearBtn: Boolean = js.native
  /**
    * Render days of the calendar grid that fall in the next or previous month.
    * @default false
    */
  var showDaysInNextAndPreviousMonths: Boolean = js.native
  /**
    * Show month after year in Datepicker title.
    * @default false
    */
  var showMonthAfterYear: Boolean = js.native
  /**
    * Number of years either side, or array of upper/lower range.
    * @default 10
    */
  var yearRange: Double | js.Array[Double] = js.native
  /**
    * Custom function to disable certain days.
    */
  def disableDayFn(day: js.Date): Boolean = js.native
  /**
    * Callback function when Datepicker is closed
    */
  def onClose(): Unit = js.native
  /**
    * Callback function when Datepicker HTML is refreshed
    */
  def onDraw(): Unit = js.native
  /**
    * Callback function when Datepicker is opened
    */
  def onOpen(): Unit = js.native
  /**
    * Callback function when date is selected, first parameter is the newly selected date.
    */
  def onSelect(selectedDate: js.Date): Unit = js.native
  /**
    * Used to create date object from current input string.
    */
  def parse(value: String, format: String): js.Date = js.native
}

object DatepickerOptions {
  @scala.inline
  def apply(
    autoClose: Boolean,
    container: Element,
    defaultDate: js.Date,
    disableDayFn: js.Date => Boolean,
    disableWeekends: Boolean,
    events: js.Array[String],
    firstDay: Double,
    format: String,
    i18n: PartialInternationalizati,
    isRTL: Boolean,
    maxDate: js.Date,
    minDate: js.Date,
    onClose: () => Unit,
    onDraw: () => Unit,
    onOpen: () => Unit,
    onSelect: js.Date => Unit,
    parse: (String, String) => js.Date,
    setDefaultDate: Boolean,
    showClearBtn: Boolean,
    showDaysInNextAndPreviousMonths: Boolean,
    showMonthAfterYear: Boolean,
    yearRange: Double | js.Array[Double]
  ): DatepickerOptions = {
    val __obj = js.Dynamic.literal(autoClose = autoClose.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], defaultDate = defaultDate.asInstanceOf[js.Any], disableDayFn = js.Any.fromFunction1(disableDayFn), disableWeekends = disableWeekends.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], firstDay = firstDay.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), onDraw = js.Any.fromFunction0(onDraw), onOpen = js.Any.fromFunction0(onOpen), onSelect = js.Any.fromFunction1(onSelect), parse = js.Any.fromFunction2(parse), setDefaultDate = setDefaultDate.asInstanceOf[js.Any], showClearBtn = showClearBtn.asInstanceOf[js.Any], showDaysInNextAndPreviousMonths = showDaysInNextAndPreviousMonths.asInstanceOf[js.Any], showMonthAfterYear = showMonthAfterYear.asInstanceOf[js.Any], yearRange = yearRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatepickerOptions]
  }
  @scala.inline
  implicit class DatepickerOptionsOps[Self <: DatepickerOptions] (val x: Self) extends AnyVal {
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
    def withContainer(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableDayFn(value: js.Date => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDayFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisableWeekends(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWeekends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withI18n(value: PartialInternationalizati): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnDraw(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDraw")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnSelect(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParse(value: (String, String) => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetDefaultDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowClearBtn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClearBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowDaysInNextAndPreviousMonths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDaysInNextAndPreviousMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowMonthAfterYear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMonthAfterYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYearRange(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearRange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

