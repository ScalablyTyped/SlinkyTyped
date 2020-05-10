package typingsSlinky.bulmaCalendar.mod

import typingsSlinky.bulmaCalendar.AnonDate
import typingsSlinky.bulmaCalendar.bulmaCalendarStrings.`inline`
import typingsSlinky.bulmaCalendar.bulmaCalendarStrings.bottom
import typingsSlinky.bulmaCalendar.bulmaCalendarStrings.date
import typingsSlinky.bulmaCalendar.bulmaCalendarStrings.datetime
import typingsSlinky.bulmaCalendar.bulmaCalendarStrings.dialog
import typingsSlinky.bulmaCalendar.bulmaCalendarStrings.time
import typingsSlinky.bulmaCalendar.bulmaCalendarStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulmaCalendarOptions extends js.Object {
  /**
    * Possibility to select same date as start and end date in range mode
    *
    * @default true
    */
  var allowSameDayRange: js.UndefOr[Boolean] = js.native
  /**
    * Cancel button label
    *
    * @default 'Cancel'
    */
  var cancelLabel: js.UndefOr[String] = js.native
  /**
    * Clear button label
    *
    * @default 'Clear'
    */
  var clearLabel: js.UndefOr[String] = js.native
  /**
    * Close picker on overlay click (only for dialog display style)
    *
    * @default true
    */
  var closeOnOverlayClick: js.UndefOr[Boolean] = js.native
  /**
    * Automatically close the datePicker when date selected (or range date selected) - not available
    * for inline display style. If set to False then a validate button will be displayed into the
    * footer section.
    *
    * @default true
    */
  var closeOnSelect: js.UndefOr[Boolean] = js.native
  /**
    * Picker dominant color
    *
    * @default 'primary'
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Date format pattern
    *
    * @default 'MM/DD/YYYY'
    */
  var dateFormat: js.UndefOr[String] = js.native
  /**
    * List of disabled dates
    */
  var disabledDates: js.UndefOr[js.Array[_]] = js.native
  /**
    * List of disabled week days
    */
  var disabledWeekDays: js.UndefOr[String | js.Array[_]] = js.native
  /**
    * Display mode
    *
    * @default 'default'
    */
  var displayMode: js.UndefOr[typingsSlinky.bulmaCalendar.bulmaCalendarStrings.default | dialog | `inline`] = js.native
  /**
    * Enable/disable month switch
    *
    * @default true
    */
  var enableMonthSwitch: js.UndefOr[Boolean] = js.native
  /**
    * Enable/disable year switch
    *
    * @default true
    */
  var enableYearSwitch: js.UndefOr[Boolean] = js.native
  /**
    * Pre-selected end date
    */
  var endDate: js.UndefOr[js.Date] = js.native
  /**
    * Pre-selected end time
    */
  var endTime: js.UndefOr[js.Date] = js.native
  /**
    * Header block position
    *
    * @default 'top'
    */
  var headerPosition: js.UndefOr[top | bottom] = js.native
  var icons: js.UndefOr[AnonDate] = js.native
  /**
    * Range capability (start and end date/time selection
    *
    * @default false
    */
  var isRange: js.UndefOr[Boolean] = js.native
  /**
    * From label
    */
  var labelFrom: js.UndefOr[String] = js.native
  /**
    * To label
    */
  var labelTo: js.UndefOr[String] = js.native
  /**
    * Display lang (from language supported by date-fns)
    *
    * @default navigator.language.substring(0, 2) || "en"
    */
  var lang: js.UndefOr[String] = js.native
  /**
    * Maximum date allowed
    */
  var maxDate: js.UndefOr[js.Date] = js.native
  /**
    * Minimum date allowed
    */
  var minDate: js.UndefOr[js.Date] = js.native
  /**
    * Steps for minutes selector
    *
    * @default 5
    */
  var minuteSteps: js.UndefOr[Double] = js.native
  /**
    * Now button label
    *
    * @default 'Now'
    */
  var nowLabel: js.UndefOr[String] = js.native
  /**
    * Callback to trigger once picker initiated
    */
  var onReady: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * @default 'auto'
    */
  var position: js.UndefOr[String] = js.native
  /**
    * Show/Hide buttons
    *
    * @default true
    */
  var showButtons: js.UndefOr[Boolean] = js.native
  /**
    * Show/Hide Clear Button
    *
    * @default true
    */
  var showClearButton: js.UndefOr[Boolean] = js.native
  /**
    * Show/Hide footer block
    *
    * @default true
    */
  var showFooter: js.UndefOr[Boolean] = js.native
  /**
    * Show/Hide header block (with current selection)
    *
    * @default true
    */
  var showHeader: js.UndefOr[Boolean] = js.native
  /**
    * Show/Hide Today Button
    *
    * @default true
    */
  var showTodayButton: js.UndefOr[Boolean] = js.native
  /**
    * Pre-selected start date
    */
  var startDate: js.UndefOr[js.Date] = js.native
  /**
    * Pre-selected start time
    */
  var startTime: js.UndefOr[js.Date] = js.native
  /**
    * Time format pattern
    *
    * @default 'HH:mm'
    */
  var timeFormat: js.UndefOr[String] = js.native
  /**
    * Today button label
    *
    * @default 'Today'
    */
  var todayLabel: js.UndefOr[String] = js.native
  /**
    * Automatically open datepicker when click into input element
    *
    * @default true
    */
  var toggleOnInputClick: js.UndefOr[Boolean] = js.native
  /**
    * Component type
    *
    * @default 'datetime'
    */
  var `type`: js.UndefOr[date | time | datetime] = js.native
  /**
    * Validate button label
    *
    * @default 'Validate'
    */
  var validateLabel: js.UndefOr[String] = js.native
  /**
    * Default weekstart day number
    *
    * @default 0 // sunday
    */
  var weekStart: js.UndefOr[Double] = js.native
}

object BulmaCalendarOptions {
  @scala.inline
  def apply(): BulmaCalendarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulmaCalendarOptions]
  }
  @scala.inline
  implicit class BulmaCalendarOptionsOps[Self <: BulmaCalendarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowSameDayRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSameDayRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSameDayRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSameDayRange")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withClearLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnOverlayClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnOverlayClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnOverlayClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnOverlayClick")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledDates(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDates")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledWeekDays(value: String | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledWeekDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledWeekDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledWeekDays")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayMode(value: typingsSlinky.bulmaCalendar.bulmaCalendarStrings.default | dialog | `inline`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMode")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableMonthSwitch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMonthSwitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMonthSwitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMonthSwitch")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableYearSwitch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableYearSwitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableYearSwitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableYearSwitch")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderPosition(value: top | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: AnonDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRange")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTo")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
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
    def withMinuteSteps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinuteSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withNowLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nowLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNowLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nowLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReady(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.undefined)
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
    def withShowButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withShowClearButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClearButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowClearButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClearButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTodayButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTodayButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTodayButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTodayButton")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withTodayLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTodayLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleOnInputClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleOnInputClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleOnInputClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleOnInputClick")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: date | time | datetime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekStart")(js.undefined)
        ret
    }
  }
  
}

