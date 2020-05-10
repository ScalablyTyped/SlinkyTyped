package typingsSlinky.jqueryui.JQueryUI

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Datepicker //////////////////////////////////////////////////
@js.native
trait DatepickerOptions extends js.Object {
  /**
    * An input element that is to be updated with the selected date from the datepicker. Use the altFormat option to change the format of the date within this field. Leave as blank for no alternate field.
    */
  var altField: js.UndefOr[js.Any] = js.native
   // Selector, jQuery or Element
  /**
    * The dateFormat to be used for the altField option. This allows one date format to be shown to the user for selection purposes, while a different format is actually sent behind the scenes. For a full list of the possible formats see the formatDate function
    */
  var altFormat: js.UndefOr[String] = js.native
  /**
    * The text to display after each date field, e.g., to show the required format.
    */
  var appendText: js.UndefOr[String] = js.native
  /**
    * Set to true to automatically resize the input field to accommodate dates in the current dateFormat.
    */
  var autoSize: js.UndefOr[Boolean] = js.native
  /**
    * Set to true to automatically hide the datepicker.
    */
  var autohide: js.UndefOr[Boolean] = js.native
  /**
    * A function that takes an input field and current datepicker instance and returns an options object to update the datepicker with. It is called just before the datepicker is displayed.
    */
  var beforeShow: js.UndefOr[js.Function2[/* input */ Element, /* inst */ js.Any, DatepickerOptions]] = js.native
  /**
    * A function that takes a date as a parameter and must return an array with:
    * [0]: true/false indicating whether or not this date is selectable
    * [1]: a CSS class name to add to the date's cell or "" for the default presentation
    * [2]: an optional popup tooltip for this date
    * The function is called for each day in the datepicker before it is displayed.
    */
  var beforeShowDay: js.UndefOr[js.Function1[/* date */ js.Date, js.Array[_]]] = js.native
  /**
    * A URL of an image to use to display the datepicker when the showOn option is set to "button" or "both". If set, the buttonText option becomes the alt value and is not directly displayed.
    */
  var buttonImage: js.UndefOr[String] = js.native
  /**
    * Whether the button image should be rendered by itself instead of inside a button element. This option is only relevant if the buttonImage option has also been set.
    */
  var buttonImageOnly: js.UndefOr[Boolean] = js.native
  /**
    * The text to display on the trigger button. Use in conjunction with the showOn option set to "button" or "both".
    */
  var buttonText: js.UndefOr[String] = js.native
  /**
    * A function to calculate the week of the year for a given date. The default implementation uses the ISO 8601 definition: weeks start on a Monday; the first week of the year contains the first Thursday of the year.
    */
  var calculateWeek: js.UndefOr[js.Function1[/* date */ js.Date, String]] = js.native
  /**
    * Whether the month should be rendered as a dropdown instead of text.
    */
  var changeMonth: js.UndefOr[Boolean] = js.native
  /**
    * Whether the year should be rendered as a dropdown instead of text. Use the yearRange option to control which years are made available for selection.
    */
  var changeYear: js.UndefOr[Boolean] = js.native
  /**
    * The text to display for the close link. Use the showButtonPanel option to display this button.
    */
  var closeText: js.UndefOr[String] = js.native
  /**
    * When true, entry in the input field is constrained to those characters allowed by the current dateFormat option.
    */
  var constrainInput: js.UndefOr[Boolean] = js.native
  /**
    * The text to display for the current day link. Use the showButtonPanel option to display this button.
    */
  var currentText: js.UndefOr[String] = js.native
  /**
    * The format for parsed and displayed dates. For a full list of the possible formats see the formatDate function.
    */
  var dateFormat: js.UndefOr[String] = js.native
  /**
    * The list of long day names, starting from Sunday, for use as requested via the dateFormat option.
    */
  var dayNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * The list of minimised day names, starting from Sunday, for use as column headers within the datepicker.
    */
  var dayNamesMin: js.UndefOr[js.Array[String]] = js.native
  /**
    * The list of abbreviated day names, starting from Sunday, for use as requested via the dateFormat option.
    */
  var dayNamesShort: js.UndefOr[js.Array[String]] = js.native
  /**
    * Set the date to highlight on first opening if the field is blank. Specify either an actual date via a Date object or as a string in the current dateFormat, or a number of days from today (e.g. +7) or a string of values and periods ('y' for years, 'm' for months, 'w' for weeks, 'd' for days, e.g. '+1m +7d'), or null for today.
    * Multiple types supported:
    * Date: A date object containing the default date.
    * Number: A number of days from today. For example 2 represents two days from today and -1 represents yesterday.
    * String: A string in the format defined by the dateFormat option, or a relative date. Relative dates must contain value and period pairs; valid periods are "y" for years, "m" for months, "w" for weeks, and "d" for days. For example, "+1m +7d" represents one month and seven days from today.
    */
  var defaultDate: js.UndefOr[js.Any] = js.native
   // Date, number or string
  /**
    * Control the speed at which the datepicker appears, it may be a time in milliseconds or a string representing one of the three predefined speeds ("slow", "normal", "fast").
    */
  var duration: js.UndefOr[String] = js.native
  /**
    	    * Set to date to automatically enddate the datepicker.
    	    */
  var endDate: js.UndefOr[js.Date] = js.native
  /**
    * Set the first day of the week: Sunday is 0, Monday is 1, etc.
    */
  var firstDay: js.UndefOr[Double] = js.native
  /**
    * When true, the current day link moves to the currently selected date instead of today.
    */
  var gotoCurrent: js.UndefOr[Boolean] = js.native
  /**
    * Normally the previous and next links are disabled when not applicable (see the minDate and maxDate options). You can hide them altogether by setting this attribute to true.
    */
  var hideIfNoPrevNext: js.UndefOr[Boolean] = js.native
  /**
    * Whether the current language is drawn from right to left.
    */
  var isRTL: js.UndefOr[Boolean] = js.native
  /**
    * The maximum selectable date. When set to null, there is no maximum.
    * Multiple types supported:
    * Date: A date object containing the maximum date.
    * Number: A number of days from today. For example 2 represents two days from today and -1 represents yesterday.
    * String: A string in the format defined by the dateFormat option, or a relative date. Relative dates must contain value and period pairs; valid periods are "y" for years, "m" for months, "w" for weeks, and "d" for days. For example, "+1m +7d" represents one month and seven days from today.
    */
  var maxDate: js.UndefOr[js.Any] = js.native
   // Date, number or string
  /**
    * The minimum selectable date. When set to null, there is no minimum.
    * Multiple types supported:
    * Date: A date object containing the minimum date.
    * Number: A number of days from today. For example 2 represents two days from today and -1 represents yesterday.
    * String: A string in the format defined by the dateFormat option, or a relative date. Relative dates must contain value and period pairs; valid periods are "y" for years, "m" for months, "w" for weeks, and "d" for days. For example, "+1m +7d" represents one month and seven days from today.
    */
  var minDate: js.UndefOr[js.Any] = js.native
   // Date, number or string
  /**
    * The list of full month names, for use as requested via the dateFormat option.
    */
  var monthNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * The list of abbreviated month names, as used in the month header on each datepicker and as requested via the dateFormat option.
    */
  var monthNamesShort: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether the prevText and nextText options should be parsed as dates by the formatDate function, allowing them to display the target month names for example.
    */
  var navigationAsDateFormat: js.UndefOr[Boolean] = js.native
  /**
    * The text to display for the next month link. With the standard ThemeRoller styling, this value is replaced by an icon.
    */
  var nextText: js.UndefOr[String] = js.native
  /**
    * The number of months to show at once.
    * Multiple types supported:
    * Number: The number of months to display in a single row.
    * Array: An array defining the number of rows and columns to display.
    */
  var numberOfMonths: js.UndefOr[js.Any] = js.native
   // number or number[]
  /**
    * Called when the datepicker moves to a new month and/or year. The function receives the selected year, month (1-12), and the datepicker instance as parameters. this refers to the associated input field.
    */
  var onChangeMonthYear: js.UndefOr[js.Function3[/* year */ Double, /* month */ Double, /* inst */ js.Any, Unit]] = js.native
  /**
    * Called when the datepicker is closed, whether or not a date is selected. The function receives the selected date as text ("" if none) and the datepicker instance as parameters. this refers to the associated input field.
    */
  var onClose: js.UndefOr[js.Function2[/* dateText */ String, /* inst */ js.Any, Unit]] = js.native
  /**
    * Called when the datepicker is selected. The function receives the selected date as text and the datepicker instance as parameters. this refers to the associated input field.
    */
  var onSelect: js.UndefOr[js.Function2[/* dateText */ String, /* inst */ js.Any, Unit]] = js.native
  /**
    * The text to display for the previous month link. With the standard ThemeRoller styling, this value is replaced by an icon.
    */
  var prevText: js.UndefOr[String] = js.native
  /**
    * Whether days in other months shown before or after the current month are selectable. This only applies if the showOtherMonths option is set to true.
    */
  var selectOtherMonths: js.UndefOr[Boolean] = js.native
  /**
    * The cutoff year for determining the century for a date (used in conjunction with dateFormat 'y'). Any dates entered with a year value less than or equal to the cutoff year are considered to be in the current century, while those greater than it are deemed to be in the previous century.
    * Multiple types supported:
    * Number: A value between 0 and 99 indicating the cutoff year.
    * String: A relative number of years from the current year, e.g., "+3" or "-5".
    */
  var shortYearCutoff: js.UndefOr[js.Any] = js.native
   // number or string
  /**
    * The name of the animation used to show and hide the datepicker. Use "show" (the default), "slideDown", "fadeIn", any of the jQuery UI effects. Set to an empty string to disable animation.
    */
  var showAnim: js.UndefOr[String] = js.native
  /**
    * Whether to display a button pane underneath the calendar. The button pane contains two buttons, a Today button that links to the current day, and a Done button that closes the datepicker. The buttons' text can be customized using the currentText and closeText options respectively.
    */
  var showButtonPanel: js.UndefOr[Boolean] = js.native
  /**
    * When displaying multiple months via the numberOfMonths option, the showCurrentAtPos option defines which position to display the current month in.
    */
  var showCurrentAtPos: js.UndefOr[Double] = js.native
  /**
    * Whether to show the month after the year in the header.
    */
  var showMonthAfterYear: js.UndefOr[Boolean] = js.native
  /**
    * When the datepicker should appear. The datepicker can appear when the field receives focus ("focus"), when a button is clicked ("button"), or when either event occurs ("both").
    */
  var showOn: js.UndefOr[String] = js.native
  /**
    * If using one of the jQuery UI effects for the showAnim option, you can provide additional settings for that animation via this option.
    */
  var showOptions: js.UndefOr[js.Any] = js.native
   // TODO
  /**
    * Whether to display dates in other months (non-selectable) at the start or end of the current month. To make these days selectable use the selectOtherMonths option.
    */
  var showOtherMonths: js.UndefOr[Boolean] = js.native
  /**
    * When true, a column is added to show the week of the year. The calculateWeek option determines how the week of the year is calculated. You may also want to change the firstDay option.
    */
  var showWeek: js.UndefOr[Boolean] = js.native
  /**
    * Set how many months to move when clicking the previous/next links.
    */
  var stepMonths: js.UndefOr[Double] = js.native
  /**
    * The text to display for the week of the year column heading. Use the showWeek option to display this column.
    */
  var weekHeader: js.UndefOr[String] = js.native
  /**
    * The range of years displayed in the year drop-down: either relative to today's year ("-nn:+nn"), relative to the currently selected year ("c-nn:c+nn"), absolute ("nnnn:nnnn"), or combinations of these formats ("nnnn:-nn"). Note that this option only affects what appears in the drop-down, to restrict which dates may be selected use the minDate and/or maxDate options.
    */
  var yearRange: js.UndefOr[String] = js.native
  /**
    * Additional text to display after the year in the month headers.
    */
  var yearSuffix: js.UndefOr[String] = js.native
}

object DatepickerOptions {
  @scala.inline
  def apply(): DatepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatepickerOptions]
  }
  @scala.inline
  implicit class DatepickerOptionsOps[Self <: DatepickerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltField(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altField")(js.undefined)
        ret
    }
    @scala.inline
    def withAltFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendText")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSize")(js.undefined)
        ret
    }
    @scala.inline
    def withAutohide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autohide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutohide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autohide")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeShow(value: (/* input */ Element, /* inst */ js.Any) => DatepickerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShow")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeShowDay(value: /* date */ js.Date => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShowDay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeShowDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShowDay")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonImage")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonImageOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonImageOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonImageOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonImageOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(js.undefined)
        ret
    }
    @scala.inline
    def withCalculateWeek(value: /* date */ js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateWeek")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCalculateWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withChangeMonth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withChangeYear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeYear")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeText")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrainInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrainInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainInput")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentText")(js.undefined)
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
    def withDayNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNames")(js.undefined)
        ret
    }
    @scala.inline
    def withDayNamesMin(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNamesMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayNamesMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNamesMin")(js.undefined)
        ret
    }
    @scala.inline
    def withDayNamesShort(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNamesShort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayNamesShort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNamesShort")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDate(value: js.Any): Self = {
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
    def withDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
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
    def withGotoCurrent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotoCurrent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGotoCurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotoCurrent")(js.undefined)
        ret
    }
    @scala.inline
    def withHideIfNoPrevNext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideIfNoPrevNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideIfNoPrevNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideIfNoPrevNext")(js.undefined)
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
    def withMonthNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNames")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthNamesShort(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNamesShort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthNamesShort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNamesShort")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationAsDateFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationAsDateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationAsDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationAsDateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withNextText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextText")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfMonths(value: js.Any): Self = {
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
    def withOnChangeMonthYear(value: (/* year */ Double, /* month */ Double, /* inst */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeMonthYear")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnChangeMonthYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeMonthYear")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: (/* dateText */ String, /* inst */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: (/* dateText */ String, /* inst */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevText")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectOtherMonths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOtherMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectOtherMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOtherMonths")(js.undefined)
        ret
    }
    @scala.inline
    def withShortYearCutoff(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortYearCutoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortYearCutoff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortYearCutoff")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAnim(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAnim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAnim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAnim")(js.undefined)
        ret
    }
    @scala.inline
    def withShowButtonPanel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showButtonPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowButtonPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showButtonPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCurrentAtPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCurrentAtPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCurrentAtPos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCurrentAtPos")(js.undefined)
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
    def withShowOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOn")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOtherMonths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOtherMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOtherMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOtherMonths")(js.undefined)
        ret
    }
    @scala.inline
    def withShowWeek(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withStepMonths(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepMonths")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withYearRange(value: String): Self = {
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

