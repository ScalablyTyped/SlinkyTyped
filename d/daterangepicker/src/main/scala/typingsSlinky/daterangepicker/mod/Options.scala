package typingsSlinky.daterangepicker.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.daterangepicker.daterangepickerStrings.center
import typingsSlinky.daterangepicker.daterangepickerStrings.down
import typingsSlinky.daterangepicker.daterangepickerStrings.left
import typingsSlinky.daterangepicker.daterangepickerStrings.right
import typingsSlinky.daterangepicker.daterangepickerStrings.up
import typingsSlinky.moment.mod.Duration_
import typingsSlinky.moment.mod.MomentInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Normally, if you use the `ranges` option to specify pre-defined date ranges, calendars
    * for choosing a custom date range are not shown until the user clicks "Custom Range".
    * When this option is set to true, the calendars for choosing a custom date range are always shown instead.
    */
  var alwaysShowCalendars: js.UndefOr[Boolean] = js.native
  /**
    * CSS class string that will be added to the apply button
    */
  var applyButtonClasses: js.UndefOr[String] = js.native
  /**
    * Hide the apply and cancel buttons, and automatically apply a new date range as soon as two dates or a predefined range is selected.
    */
  var autoApply: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the date range picker should automatically update the value of an < input > element it's attached to at initialization and when the selected dates change.
    */
  var autoUpdateInput: js.UndefOr[Boolean] = js.native
  /**
    * CSS class names that will be added to all buttons in the picker
    */
  var buttonClasses: js.UndefOr[js.Array[String]] = js.native
  /**
    * CSS class string that will be added to the cancel button
    */
  var cancelButtonClasses: js.UndefOr[String] = js.native
  /**
    * Whether the picker appears below (default) or above the HTML element it's attached to
    */
  var drops: js.UndefOr[down | up] = js.native
  /**
    * The end of the initially selected date range
    */
  var endDate: js.UndefOr[DateOrString] = js.native
  /**
    * A function that is passed each date in the two calendars before they are displayed, and may return a string or array of CSS class names to apply to that date's calendar cell.
    */
  var isCustomDate: js.UndefOr[js.Function1[/* date */ DateOrString, js.UndefOr[String | js.Array[String]]]] = js.native
  /**
    * A function that is passed each date in the two calendars before they are displayed, and may return true or false to indicate whether that date should be available for selection or not.
    */
  var isInvalidDate: js.UndefOr[
    js.Function2[/* startDate */ DateOrString, /* endDate */ js.UndefOr[DateOrString], Boolean]
  ] = js.native
  /**
    * When enabled, the two calendars displayed will always be for two sequential months (i.e.
    * January and February), and both will be advanced when clicking the left or right arrows
    * above the calendars.When disabled, the two calendars can be individually advanced and
    * display any month/ year.
    */
  var linkedCalendars: js.UndefOr[Boolean] = js.native
  /**
    * Allows you to provide localized strings for buttons and labels, customize the date display format, and change the first day of week for the calendars.
    */
  var locale: js.UndefOr[Locale] = js.native
  /**
    * The latest date a user may select
    */
  var maxDate: js.UndefOr[DateOrString] = js.native
  /**
    * The maximum span between the selected start and end dates. Can have any property you can add to a moment object (i.e. days, months)
    */
  var maxSpan: js.UndefOr[MomentInput | Duration_] = js.native
  /**
    * The maximum year shown in the dropdowns when `showDropdowns` is set to true.
    */
  var maxYear: js.UndefOr[Double] = js.native
  /**
    * The earliest date a user may select
    */
  var minDate: js.UndefOr[DateOrString] = js.native
  /**
    * The minimum year shown in the dropdowns when `showDropdowns` is set to true.
    */
  var minYear: js.UndefOr[Double] = js.native
  /**
    * Whether the picker appears aligned to the left, to the right, or centered under the HTML element it's attached to
    */
  var opens: js.UndefOr[left | right | center] = js.native
  /**
    * jQuery selector of the parent element that the date range picker will be added to, if not provided this will be 'body'
    */
  var parentEl: js.UndefOr[String] = js.native
  /**
    * Set predefined date ranges the user can select from.Each key is the label for the range, and its value an array with two dates representing the bounds of the range.
    */
  var ranges: js.UndefOr[StringDictionary[js.Tuple2[DateOrString, DateOrString]]] = js.native
  /**
    * Whether to show the 'Custom Range' label or just pre-defined ranges
    */
  var showCustomRangeLabel: js.UndefOr[Boolean] = js.native
  /**
    * Show year and month select boxes above calendars to jump to a specific month and year
    */
  var showDropdowns: js.UndefOr[Boolean] = js.native
  /**
    * Show ISO week numbers at the start of each week on the calendars
    */
  var showISOWeekNumbers: js.UndefOr[Boolean] = js.native
  /**
    * Show localized week numbers at the start of each week on the calendars
    */
  var showWeekNumbers: js.UndefOr[Boolean] = js.native
  /**
    * Show only a single calendar to choose one date, instead of a range picker with two calendars; the start and end dates provided to your callback will be the same single date chosen.
    */
  var singleDatePicker: js.UndefOr[Boolean] = js.native
  /**
    * The start of the initially selected date range
    */
  var startDate: js.UndefOr[DateOrString] = js.native
  /**
    * Allow selection of dates with times, not just dates
    */
  var timePicker: js.UndefOr[Boolean] = js.native
  /**
    * Use 24- hour instead of 12- hour times, removing the AM/ PM selection.
    */
  var timePicker24Hour: js.UndefOr[Boolean] = js.native
  /**
    * Increment of the minutes selection list for times (i.e. 30 to allow only selection of times ending in 0 or 30)
    */
  var timePickerIncrement: js.UndefOr[Double] = js.native
  /**
    * Show seconds in the timePicker.
    */
  var timePickerSeconds: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysShowCalendars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowCalendars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysShowCalendars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowCalendars")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyButtonClasses(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyButtonClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyButtonClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyButtonClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoApply(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoApply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoApply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoApply")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoUpdateInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdateInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoUpdateInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdateInput")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonClasses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelButtonClasses(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelButtonClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withDrops(value: down | up): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drops")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndDate(value: DateOrString): Self = {
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
    def withIsCustomDate(value: /* date */ DateOrString => js.UndefOr[String | js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCustomDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsCustomDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCustomDate")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInvalidDate(value: (/* startDate */ DateOrString, /* endDate */ js.UndefOr[DateOrString]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInvalidDate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIsInvalidDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInvalidDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkedCalendars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedCalendars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkedCalendars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedCalendars")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDate(value: DateOrString): Self = {
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
    def withMaxSpanDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSpan(value: MomentInput | Duration_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxYear")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinDate(value: DateOrString): Self = {
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
    def withMinYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minYear")(js.undefined)
        ret
    }
    @scala.inline
    def withOpens(value: left | right | center): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opens")(js.undefined)
        ret
    }
    @scala.inline
    def withParentEl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentEl")(js.undefined)
        ret
    }
    @scala.inline
    def withRanges(value: StringDictionary[js.Tuple2[DateOrString, DateOrString]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCustomRangeLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCustomRangeLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCustomRangeLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCustomRangeLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDropdowns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDropdowns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDropdowns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDropdowns")(js.undefined)
        ret
    }
    @scala.inline
    def withShowISOWeekNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showISOWeekNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowISOWeekNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showISOWeekNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withShowWeekNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeekNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowWeekNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeekNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleDatePicker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleDatePicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleDatePicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleDatePicker")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDate(value: DateOrString): Self = {
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
    def withTimePicker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePicker")(js.undefined)
        ret
    }
    @scala.inline
    def withTimePicker24Hour(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePicker24Hour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePicker24Hour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePicker24Hour")(js.undefined)
        ret
    }
    @scala.inline
    def withTimePickerIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePickerIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePickerIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePickerIncrement")(js.undefined)
        ret
    }
    @scala.inline
    def withTimePickerSeconds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePickerSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePickerSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePickerSeconds")(js.undefined)
        ret
    }
  }
  
}

