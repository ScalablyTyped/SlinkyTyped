package typingsSlinky.bootstrapV3Datetimepicker.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.bottom
import typingsSlinky.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.days
import typingsSlinky.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.decades
import typingsSlinky.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.default
import typingsSlinky.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.months
import typingsSlinky.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.top
import typingsSlinky.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.years
import typingsSlinky.bootstrapV3Datetimepicker.mod.global.JQuery
import typingsSlinky.moment.mod.Moment
import typingsSlinky.moment.mod.MomentBuiltinFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatetimepickerOptions extends js.Object {
  /**
  	 * If true, the picker will show on textbox focus and icon click when used in a button group
  	 * @default: false
  	 */
  var allowInputToggle: js.UndefOr[Boolean] = js.native
  /**
  	 * Shows the week of the year to the left of first day of the week.
  	 * @default: false
  	 */
  var calendarWeeks: js.UndefOr[Boolean] = js.native
  /**
  	 * Using a Bootstraps collapse to switch between date/time pickers.
  	 * @default: true
  	 */
  var collapse: js.UndefOr[Boolean] = js.native
  /**
  	 * Changes the heading of the datepicker when in "days" view.
  	 * @default: "MMMM YYYY"
  	 */
  var dayViewHeaderFormat: js.UndefOr[String] = js.native
  /**
  	 * Disables the section of days of the week, e.g. weekends.
  	 * Accepts: array of numbers from 0-6
  	 * @default: false
  	 */
  var daysOfWeekDisabled: js.UndefOr[js.Array[Double] | Boolean] = js.native
  /**
  	 * Will cause the date picker to stay open after a blur event.
  	 * @default: false
  	 */
  var debug: js.UndefOr[Boolean] = js.native
  /**
  	 * Sets the picker default date/time. Overrides useCurrent
  	 * @default: false
  	 */
  var defaultDate: js.UndefOr[Boolean | Moment | js.Date | String] = js.native
  /**
  	 * Disables selection of dates in the array, e.g. holidays
  	 * @default: false
  	 * IMPORTANT! The getter returns an Object NOT an Array, with keys being the dates, values being true.
  	 * eg disabledDates = ["2010-10-10"]; -> disabledDated will be { "2010-01-01": true }
  	 * https://github.com/Eonasdan/bootstrap-datetimepicker/issues/1499
  	 */
  var disabledDates: js.UndefOr[Boolean | (js.Array[Moment | js.Date | String]) | js.Any] = js.native
  /**
  	 * Will allow or disallow hour selections (much like disabledTimeIntervals) but will affect all days
  	 * @default: false
  	 * IMPORTANT! The getter returns an Object NOT an Array, with keys being the hours, values being true.
  	 * eg disabledHours = [0, 1]; -> disabledHours will be { "0": true, "1": true }
  	 * https://github.com/Eonasdan/bootstrap-datetimepicker/issues/1499
  	 */
  var disabledHours: js.UndefOr[Boolean | js.Array[Double] | js.Any] = js.native
  /**
  	 * Disables time selection between the given moments
  	 * eg: [[moment({ h: 0 }), moment({ h: 8 })], [moment({ h: 18 }), moment({ h: 24 })]]
  	 * @default: false
  	 */
  var disabledTimeIntervals: js.UndefOr[Boolean | js.Array[js.Array[Moment]]] = js.native
  /**
  	 * Disables selection of dates NOT in the array, e.g. holidays
  	 * @default: false
  	 * IMPORTANT! The getter returns an Object NOT an Array, with keys being the dates, values being true.
  	 * eg enabledDates = ["2010-10-10"]; -> enabledDated will be { "2010-01-01": true }
  	 * https://github.com/Eonasdan/bootstrap-datetimepicker/issues/1499
  	 */
  var enabledDates: js.UndefOr[Boolean | (js.Array[Moment | js.Date | String]) | js.Any] = js.native
  /**
  	 * Will allow or disallow hour selections (much like disabledTimeIntervals) but will affect all days
  	 * @default: false
  	 * IMPORTANT! The getter returns an Object NOT an Array, with keys being the hours, values being true.
  	 * eg enabledHours = [0, 1]; -> enabledHours will be { "0": true, "1": true }
  	 * https://github.com/Eonasdan/bootstrap-datetimepicker/issues/1499
  	 */
  var enabledHours: js.UndefOr[Boolean | js.Array[Double]] = js.native
  /**
  	 * Allows for several input formats to be valid. See: https://github.com/Eonasdan/bootstrap-datetimepicker/pull/666
  	 * @default: false
  	 */
  var extraFormats: js.UndefOr[Boolean | (js.Array[String | MomentBuiltinFormat])] = js.native
  /**
  	 * If false, the textbox will not be given focus when the picker is shown
  	 * @default: true
  	 */
  var focusOnShow: js.UndefOr[Boolean] = js.native
  /**
  	 * See momentjs' docs for valid formats. Format also dictates what components are shown, e.g. MM/dd/YYYY will not display the time picker.
  	 * @default: false
  	 */
  var format: js.UndefOr[Boolean | String | MomentBuiltinFormat] = js.native
  /** Change the default icons for the pickers functions. */
  var icons: js.UndefOr[Icons] = js.native
  /**
  	 * Allow date picker show event to fire even when the associated input element has the readonly="readonly"property.
  	 * @default: false
  	 */
  var ignoreReadonly: js.UndefOr[Boolean] = js.native
  /**
  	 * Will display the picker inline without the need of a input field. This will also hide borders and shadows.
  	 * @default: false
  	 */
  var `inline`: js.UndefOr[Boolean] = js.native
  /**
  	 * Will cause the date picker to not revert or overwrite invalid dates.
  	 * @default: false
  	 */
  var keepInvalid: js.UndefOr[Boolean] = js.native
  /**
  	 * Will cause the date picker to stay open after selecting a date if no time components are being used.
  	 * @default: false
  	 */
  var keepOpen: js.UndefOr[Boolean] = js.native
  /**
  	 * Allows for custom events to fire on keyboard press.
  	 * eg: keybinds: {
  	 * 		up: (widget) => console.log(widget),
  	 * 		"control up": (widget) => console.log(widget)
  	 * }
  	 * The widget parameter is false, if the datepicker is closed.
  	 */
  var keyBinds: js.UndefOr[StringDictionary[js.Function1[/* widget */ Boolean | JQuery, Unit]]] = js.native
  /**
  	 * See momentjs for valid locales. You must include moment-with-locales.js or a local js file.
  	 * @default: moment.locale()
  	 */
  var locale: js.UndefOr[String] = js.native
  /**
  	 * Prevents date/time selections after this date.
  	 * maxDate will override defaultDate and useCurrent if either of these settings are the same day since both options are invalid according to the rules you've selected.
  	 * @default: false
  	 */
  var maxDate: js.UndefOr[Boolean | Moment | js.Date | String] = js.native
  /**
  	 * Prevents date/time selections before this date.
  	 * minDate will override defaultDate and useCurrent if either of these settings are the same day since both options are invalid according to the rules you've selected.
  	 * @default: false
  	 */
  var minDate: js.UndefOr[Boolean | Moment | js.Date | String] = js.native
  /**
  	 * Allows custom input formatting For example: the user can enter "yesterday"" or "30 days ago".
  	 * {@link http://eonasdan.github.io/bootstrap-datetimepicker/Functions/#parseinputdate}
  	 */
  var parseInputDate: js.UndefOr[InputParser] = js.native
  /**
  	 * Show the "Clear" button in the icon toolbar.
  	 * Clicking the "Clear" button will set the calendar to null.
  	 * @default: false
  	 */
  var showClear: js.UndefOr[Boolean] = js.native
  /**
  	 * Show the "Close" button in the icon toolbar.
  	 * Clicking the "Close" button will call hide()
  	 * @default: false
  	 */
  var showClose: js.UndefOr[Boolean] = js.native
  /**
  	 * Show the "Today" button in the icon toolbar.
  	 * Clicking the "Today" button will set the calendar view and set the date to now.
  	 * @default: false
  	 */
  var showTodayButton: js.UndefOr[Boolean] = js.native
  /**
  	 * Shows the picker side by side when using the time and date together.
  	 * @default: false
  	 */
  var sideBySide: js.UndefOr[Boolean] = js.native
  /**
  	 * Number of minutes the up/down arrow's will move the minutes value in the time picker
  	 * @default: 1
  	 */
  var stepping: js.UndefOr[Double] = js.native
  /**
  	 * Timezone to use, if moment-timezone is loaded. If null or empty string, ignore timezones.
  	 * @default: ""
  	 */
  var timeZone: js.UndefOr[String | Null] = js.native
  /**
  	 * Changes the placement of the icon toolbar.
  	 * @default: "default"
  	 */
  var toolbarPlacement: js.UndefOr[default | top | bottom] = js.native
  /** This will change the tooltips over each icon to a custom string */
  var tooltips: js.UndefOr[Tooltips] = js.native
  /**
  	 * On show, will set the picker to the current date/time
  	 * @default: true
  	 */
  var useCurrent: js.UndefOr[Boolean] = js.native
  /**
  	 * Defines if moment should use strict date parsing when considering a date to be valid
  	 * @default: false
  	 */
  var useStrict: js.UndefOr[Boolean] = js.native
  /**
  	 * This will change the viewDate without changing or setting the selected date.
  	 * @default: false
  	 */
  var viewDate: js.UndefOr[Boolean | Moment | js.Date | String] = js.native
  /**
  	 * The default view to display when the picker is shown.
  	 * Note: To limit the picker to selecting, for instance the year and month, use format: MM/YYYY
  	 * @default: "days"
  	 */
  var viewMode: js.UndefOr[decades | years | months | days] = js.native
  /**
  	 * On picker show, places the widget at the identifier (string) or jQuery object if the element has css position: "relative"
  	 * @default: null
  	 */
  var widgetParent: js.UndefOr[String | JQuery | Null] = js.native
  var widgetPositioning: js.UndefOr[WidgetPositioningOptions] = js.native
}

object DatetimepickerOptions {
  @scala.inline
  def apply(): DatetimepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatetimepickerOptions]
  }
  @scala.inline
  implicit class DatetimepickerOptionsOps[Self <: DatetimepickerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowInputToggle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInputToggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowInputToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInputToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendarWeeks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarWeeks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarWeeks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarWeeks")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.undefined)
        ret
    }
    @scala.inline
    def withDayViewHeaderFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayViewHeaderFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayViewHeaderFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayViewHeaderFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDaysOfWeekDisabled(value: js.Array[Double] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOfWeekDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaysOfWeekDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOfWeekDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultDate(value: Boolean | Moment | js.Date | String): Self = {
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
    def withDisabledDates(value: Boolean | (js.Array[Moment | js.Date | String]) | js.Any): Self = {
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
    def withDisabledHours(value: Boolean | js.Array[Double] | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledHours")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledTimeIntervals(value: Boolean | js.Array[js.Array[Moment]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledTimeIntervals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledTimeIntervals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledTimeIntervals")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledDates(value: Boolean | (js.Array[Moment | js.Date | String]) | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledDates")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledHours(value: Boolean | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledHours")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraFormats(value: Boolean | (js.Array[String | MomentBuiltinFormat])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusOnShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnShow")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: Boolean | String | MomentBuiltinFormat): Self = {
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
    def withIcons(value: Icons): Self = {
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
    def withIgnoreReadonly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreReadonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreReadonly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreReadonly")(js.undefined)
        ret
    }
    @scala.inline
    def withInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepInvalid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepInvalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepInvalid")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyBinds(value: StringDictionary[js.Function1[/* widget */ Boolean | JQuery, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyBinds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyBinds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyBinds")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
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
    def withMaxDate(value: Boolean | Moment | js.Date | String): Self = {
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
    def withMinDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinDate(value: Boolean | Moment | js.Date | String): Self = {
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
    def withParseInputDate(value: /* input */ String | js.Date | Moment => Moment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseInputDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutParseInputDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseInputDate")(js.undefined)
        ret
    }
    @scala.inline
    def withShowClear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClear")(js.undefined)
        ret
    }
    @scala.inline
    def withShowClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClose")(js.undefined)
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
    def withSideBySide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideBySide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSideBySide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideBySide")(js.undefined)
        ret
    }
    @scala.inline
    def withStepping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepping")(js.undefined)
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
    def withTimeZoneNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(null)
        ret
    }
    @scala.inline
    def withToolbarPlacement(value: default | top | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltips(value: Tooltips): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltips")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCurrent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCurrent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCurrent")(js.undefined)
        ret
    }
    @scala.inline
    def withUseStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStrict")(js.undefined)
        ret
    }
    @scala.inline
    def withViewDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewDate(value: Boolean | Moment | js.Date | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewDate")(js.undefined)
        ret
    }
    @scala.inline
    def withViewMode(value: decades | years | months | days): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMode")(js.undefined)
        ret
    }
    @scala.inline
    def withWidgetParent(value: String | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgetParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidgetParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgetParent")(js.undefined)
        ret
    }
    @scala.inline
    def withWidgetParentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgetParent")(null)
        ret
    }
    @scala.inline
    def withWidgetPositioning(value: WidgetPositioningOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgetPositioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidgetPositioning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgetPositioning")(js.undefined)
        ret
    }
  }
  
}

