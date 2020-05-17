package typingsSlinky.eonasdanBootstrapDatetimepicker.mod

import typingsSlinky.eonasdanBootstrapDatetimepicker.mod.global.JQuery
import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsBase extends js.Object {
  /**
    * If true, the picker will show on textbox focus and icon click when used in a button group
    * Default: false
    */
  var allowInputToggle: js.UndefOr[Boolean] = js.native
  /**
    * Shows the week of the year to the left of first day of the week.
    * Default: false
    */
  var calendarWeeks: js.UndefOr[Boolean] = js.native
  /**
    * Using a Bootstraps collapse to switch between date/time pickers.
    * Default: true
    */
  var collapse: js.UndefOr[Boolean] = js.native
  /**
    * Default: ".datepickerinput"
    */
  var datepickerInput: js.UndefOr[String] = js.native
  /**
    * Changes the heading of the datepicker when in "days" view.
    * Default: "MMMM YYYY"
    */
  var dayViewHeaderFormat: js.UndefOr[String] = js.native
  /**
    * Accepts: array of numbers from 0-6
    * Disables the section of days of the week, e.g. weekends.
    * Default: false
    */
  var daysOfWeekDisabled: js.UndefOr[js.Array[DayOfWeek] | Boolean] = js.native
  /**
    * Will cause the date picker to stay open after a blur event.
    * Default: false
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * Sets the picker default date/time. Overrides useCurrent
    * Default: false
    */
  var defaultDate: js.UndefOr[DateComparable | Boolean] = js.native
  /**
    * Disables time selection between the given moments.
    * For example:
    * [[moment({ h: 0 }), moment({ h: 8 })], [moment({ h: 18 }), moment({ h: 24 })]]
    * Default: false
    */
  var disabledTimeIntervals: js.UndefOr[Boolean | js.Array[FromTo]] = js.native
  /**
    * Allows for several input formats to be valid.
    * Default: false
    */
  var extraFormats: js.UndefOr[js.Array[String] | Boolean] = js.native
  /**
    * If false, the textbox will not be given focus when the picker is shown
    * Default: true
    */
  var focusOnShow: js.UndefOr[Boolean] = js.native
  /**
    * See momentjs' docs for valid formats. Format also dictates what components are shown, e.g. MM/dd/YYYY will not display the time picker.
    * Default: false
    */
  var format: js.UndefOr[String | Boolean] = js.native
  /**
    * Change the default icons for the pickers functions
    * Default: {
    *              time: "glyphicon glyphicon-time",
    *              date: "glyphicon glyphicon-calendar",
    *              up: "glyphicon glyphicon-chevron-up",
    *              down: "glyphicon glyphicon-chevron-down",
    *              previous: "glyphicon glyphicon-chevron-left",
    *              next: "glyphicon glyphicon-chevron-right",
    *              today: "glyphicon glyphicon-screenshot",
    *              clear: "glyphicon glyphicon-trash",
    *              close: "glyphicon glyphicon-remove"
    *          }
    */
  var icons: js.UndefOr[Icons] = js.native
  /**
    * Allow date picker show event to fire even when the associated input element has the readonly="readonly" property.
    * Default: false
    */
  var ignoreReadonly: js.UndefOr[Boolean] = js.native
  /**
    * Will display the picker inline without the need of a input field. This will also hide borders and shadows.
    * Default: false
    */
  var `inline`: js.UndefOr[Boolean] = js.native
  /**
    * Will cause the date picker to not revert or overwrite invalid dates.
    * Default: false
    */
  var keepInvalid: js.UndefOr[Boolean] = js.native
  /**
    * Will cause the date picker to stay open after selecting a date if no time components are being used.
    * Default: false
    */
  var keepOpen: js.UndefOr[Boolean] = js.native
  /**
    * Allows for custom events to fire on keyboard press.
    * For example:
    *                keybinds:
    *                {
    *                		up: (widget) => console.log(widget),
    *                		"control up": (widget) => console.log(widget)
    *                }
    * The widget parameter is false, if the datepicker is closed.
    * Default: {
    *          up: function (widget) {
    *              if (widget.find(".datepicker").is(":visible")) {
    *                  this.date(this.date().clone().subtract(7, "d"));
    *              } else {
    *                  this.date(this.date().clone().add(1, "m"));
    *              }
    *          },
    *          down: function (widget) {
    *              if (!widget) {
    *                  this.show();
    *              }
    *              else if (widget.find(".datepicker").is(":visible")) {
    *                  this.date(this.date().clone().add(7, "d"));
    *              } else {
    *                  this.date(this.date().clone().subtract(1, "m"));
    *              }
    *          },
    *          "control up": function (widget) {
    *              if (widget.find(".datepicker").is(":visible")) {
    *                  this.date(this.date().clone().subtract(1, "y"));
    *              } else {
    *                  this.date(this.date().clone().add(1, "h"));
    *              }
    *          },
    *          "control down": function (widget) {
    *              if (widget.find(".datepicker").is(":visible")) {
    *                  this.date(this.date().clone().add(1, "y"));
    *              } else {
    *                  this.date(this.date().clone().subtract(1, "h"));
    *              }
    *          },
    *          left: function (widget) {
    *              if (widget.find(".datepicker").is(":visible")) {
    *                  this.date(this.date().clone().subtract(1, "d"));
    *              }
    *          },
    *          right: function (widget) {
    *              if (widget.find(".datepicker").is(":visible")) {
    *                  this.date(this.date().clone().add(1, "d"));
    *              }
    *          },
    *          pageUp: function (widget) {
    *              if (widget.find(".datepicker").is(":visible")) {
    *                  this.date(this.date().clone().subtract(1, "M"));
    *              }
    *          },
    *          pageDown: function (widget) {
    *              if (widget.find(".datepicker").is(":visible")) {
    *                  this.date(this.date().clone().add(1, "M"));
    *              }
    *          },
    *          enter: function () {
    *              this.hide();
    *          },
    *          escape: function () {
    *              this.hide();
    *          },
    *          "control space": function (widget) {
    *              if (widget.find(".timepicker").is(":visible")) {
    *                  widget.find(".btn[data-action="togglePeriod"]").click();
    *              }
    *          },
    *          t: function () {
    *              this.date(moment());
    *          },
    *          "delete": function () {
    *              this.clear();
    *          }
    *       }
    */
  var keyBinds: js.UndefOr[KeyBinds] = js.native
  /**
    * See momentjs for valid locales.
    * You must include moment-with-locales.js or a local js file.
    * Default: moment.locale()
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * Prevents date/time selections after this date.
    * maxDate will override defaultDate and useCurrent if either of these settings are the same day since both options are invalid according to the rules you've selected.
    * Default: false
    */
  var maxDate: js.UndefOr[DateComparable | Boolean] = js.native
  /**
    * Prevents date/time selections before this date.
    * minDate will override defaultDate and useCurrent if either of these settings are the same day since both options are invalid according to the rules you've selected.
    * Default: false
    */
  var minDate: js.UndefOr[DateComparable | Boolean] = js.native
  /**
    * Allows custom input formatting.
    * For example:
    * The user can enter "yesterday" or "30 days ago".
    */
  var parseInputDate: js.UndefOr[ParseInputDateFunction] = js.native
  /**
    * Show the "Clear" button in the icon toolbar.
    * Clicking the "Clear" button will set the calendar to null.
    * Default: false
    */
  var showClear: js.UndefOr[Boolean] = js.native
  /**
    * Show the "Close" button in the icon toolbar.
    * Clicking the "Close" button will call hide()
    * Default: false
    */
  var showClose: js.UndefOr[Boolean] = js.native
  /**
    * Show the "Today" button in the icon toolbar.
    * Clicking the "Today" button will set the calendar view and set the date to now.
    * Default: false
    */
  var showTodayButton: js.UndefOr[Boolean] = js.native
  /**
    * Shows the picker side by side when using the time and date together.
    * Default: false
    */
  var sideBySide: js.UndefOr[Boolean] = js.native
  /**
    * Number of minutes the up/down arrow's will move the minutes value in the time picker.
    * Default: 1
    */
  var stepping: js.UndefOr[Double] = js.native
  /**
    * Default: "Etc/UTC"
    */
  var timeZone: js.UndefOr[String] = js.native
  /**
    * Changes the placement of the icon toolbar.
    * Default: "default"
    */
  var toolbarPlacement: js.UndefOr[ToolbarPlacement] = js.native
  /**
    * This will change the tooltips over each icon to a custom string
    * Default: {
    *              today: "Go to today",
    *              clear: "Clear selection",
    *              close: "Close the picker",
    *              selectMonth: "Select Month",
    *              prevMonth: "Previous Month",
    *              nextMonth: "Next Month",
    *              selectYear: "Select Year",
    *              prevYear: "Previous Year",
    *              nextYear: "Next Year",
    *              selectDecade: "Select Decade",
    *              prevDecade: "Previous Decade",
    *              nextDecade: "Next Decade",
    *              prevCentury: "Previous Century",
    *              nextCentury: "Next Century"
    *          }
    */
  var tooltips: js.UndefOr[Tooltips] = js.native
  /**
    * On show, will set the picker to the current date/time
    * Default: true
    */
  var useCurrent: js.UndefOr[Boolean | UseCurrent] = js.native
  /**
    * Defines if moment should use strict date parsing when considering a date to be valid
    * Default: false
    */
  var useStrict: js.UndefOr[Boolean] = js.native
  /**
    * This will change the viewDate without changing or setting the selected date.
    * Default: false
    */
  var viewDate: js.UndefOr[DateComparable | Boolean] = js.native
  /**
    * The default view to display when the picker is shown.
    * Note: To limit the picker to selecting, for instance the year and month, use format: MM/YYYY
    * Default: "days"
    */
  var viewMode: js.UndefOr[ViewMode] = js.native
  /**
    * On picker show, places the widget at the identifier (string) or jQuery object if the element has css position: "relative"
    * Default: null
    */
  var widgetParent: js.UndefOr[String | JQuery] = js.native
  /**
    * Accepts: object with the all or one of the parameters above
    * horizontal: 'auto', 'left', 'right'
    * vertical: 'auto', 'top', 'bottom'
    * Default: {
    *              horizontal: 'auto'
    *              vertical: 'auto'
    *          }
    */
  var widgetPositioning: js.UndefOr[WidgetPositioning] = js.native
}

object OptionsBase {
  @scala.inline
  def apply(): OptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsBase]
  }
  @scala.inline
  implicit class OptionsBaseOps[Self <: OptionsBase] (val x: Self) extends AnyVal {
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
    def withDatepickerInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datepickerInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatepickerInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datepickerInput")(js.undefined)
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
    def withDaysOfWeekDisabled(value: js.Array[DayOfWeek] | Boolean): Self = {
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
    def withDefaultDate(value: DateComparable | Boolean): Self = {
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
    def withDisabledTimeIntervals(value: Boolean | js.Array[FromTo]): Self = {
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
    def withExtraFormats(value: js.Array[String] | Boolean): Self = {
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
    def withFormat(value: String | Boolean): Self = {
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
    def withKeyBinds(value: KeyBinds): Self = {
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
    def withMaxDate(value: DateComparable | Boolean): Self = {
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
    def withMinDate(value: DateComparable | Boolean): Self = {
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
    def withParseInputDate(value: /* inputDate */ String => Moment): Self = {
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
    def withToolbarPlacement(value: ToolbarPlacement): Self = {
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
    def withUseCurrent(value: Boolean | UseCurrent): Self = {
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
    def withViewDate(value: DateComparable | Boolean): Self = {
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
    def withViewMode(value: ViewMode): Self = {
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
    def withWidgetPositioning(value: WidgetPositioning): Self = {
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

