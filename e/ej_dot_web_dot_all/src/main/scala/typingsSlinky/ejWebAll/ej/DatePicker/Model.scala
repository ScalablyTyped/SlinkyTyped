package typingsSlinky.ejWebAll.ej.DatePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** allow or restrict the drill down to multiple levels of view (month/year/decade) in DatePicker calendar
    * @Default {true}
    */
  var allowDrillDown: js.UndefOr[Boolean] = js.native
  /** Used to allow or restrict the editing in DatePicker input field directly. By setting false to this API, You can only pick the date from DatePicker popup.
    * @Default {true}
    */
  var allowEdit: js.UndefOr[Boolean] = js.native
  /** Fires before closing the DatePicker popup.
    */
  var beforeClose: js.UndefOr[js.Function1[/* e */ BeforeCloseEventArgs, Unit]] = js.native
  /** Fires when each date is created in the DatePicker popup calendar.
    */
  var beforeDateCreate: js.UndefOr[js.Function1[/* e */ BeforeDateCreateEventArgs, Unit]] = js.native
  /** Fires before opening the DatePicker popup.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.native
  /** Disable the list of specified date value.
    * @Default {{}}
    */
  var blackoutDates: js.UndefOr[js.Any] = js.native
  /** Sets the specified text value to the today button in the DatePicker calendar.
    * @Default {Today}
    */
  var buttonText: js.UndefOr[String] = js.native
  /** Fires when the DatePicker input value is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  /** Fires when DatePicker popup is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.native
  /** Fires when the DatePicker is created successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Sets the root CSS class for DatePicker theme, which is used customize.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Formats the value of the DatePicker in to the specified date format. If this API is not specified, dateFormat will be set based on the current culture of DatePicker.
    * @Default {MM/dd/yyyy}
    */
  var dateFormat: js.UndefOr[String] = js.native
  /** Specifies the header format of days in DatePicker calendar. See below to get available Headers options
    * @Default {ej.DatePicker.Header.Short}
    */
  var dayHeaderFormat: js.UndefOr[String | Header] = js.native
  /** Specifies the navigation depth level in DatePicker calendar. This option is not applied when start level view option is lower than depth level view. See below to know available
    * levels in DatePicker Calendar
    */
  var depthLevel: js.UndefOr[String | Level] = js.native
  /** Fires when the DatePicker is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Allows to embed the DatePicker calendar in the page. Also associates DatePicker with div element instead of input.
    * @Default {false}
    */
  var displayInline: js.UndefOr[Boolean] = js.native
  /** Enables or disables the animation effect with DatePicker calendar.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** Sustain the entire widget model of DatePicker even after form post or browser refresh
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** Displays DatePicker calendar along with DatePicker input field in Right to Left direction.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Allows to enter valid or invalid date in input textbox and indicate as error if it is invalid value, when this API value is set to true. For false value, invalid date is not
    * allowed to input field and corrected to valid date automatically, even if invalid date is given.
    * @Default {false}
    */
  var enableStrictMode: js.UndefOr[Boolean] = js.native
  /** Enable or disable the DatePicker control.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Used  the required fields for special Dates in DatePicker in order to customize the special dates in a calendar.
    * @Default {null}
    */
  var fields: js.UndefOr[Fields] = js.native
  /** Fires when DatePicker input gets focus.
    */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, Unit]] = js.native
  /** Fires when DatePicker input loses the focus.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.native
  /** Specifies the header format to be displayed in the DatePicker calendar.
    * @Default {MMMM yyyy}
    */
  var headerFormat: js.UndefOr[String] = js.native
  /** Specifies the height of the DatePicker input text.
    * @Default {28px}
    */
  var height: js.UndefOr[String] = js.native
  /** HighlightSection is used to highlight currently selected date's month/week/workdays. See below to get available HighlightSection options
    * @Default {none}
    */
  var highlightSection: js.UndefOr[String | HighlightSection] = js.native
  /** Weekend  dates will be highlighted when this property is set to true.
    * @Default {false}
    */
  var highlightWeekend: js.UndefOr[Boolean] = js.native
  /** Specifies the HTML Attributes of the DatePicker.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** Change the DatePicker calendar and date format based on given culture.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Specifies the maximum date in the calendar that the user can select.
    * @Default {new Date(2099, 11, 31)}
    */
  var maxDate: js.UndefOr[String | js.Date] = js.native
  /** Specifies the minimum date in the calendar that the user can select.
    * @Default {new Date(1900, 00, 01)}
    */
  var minDate: js.UndefOr[String | js.Date] = js.native
  /** Fires when calender view navigates to month/year/decade/century.
    */
  var navigate: js.UndefOr[js.Function1[/* e */ NavigateEventArgs, Unit]] = js.native
  /** Fires when DatePicker popup is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
  /** Allows to toggles the read only state of the DatePicker. When the widget is readOnly, it doesn't allow your input.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** Fires when a date is selected from the DatePicker popup.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.native
  /** It allow to show/hide the disabled date ranges
    * @Default {true}
    */
  var showDisabledRange: js.UndefOr[Boolean] = js.native
  /** It allows to display footer in DatePicker calendar.
    * @Default {true}
    */
  var showFooter: js.UndefOr[Boolean] = js.native
  /** It allows to display/hides the other months days from the current month calendar in a DatePicker.
    * @Default {true}
    */
  var showOtherMonths: js.UndefOr[Boolean] = js.native
  /** Shows/hides the date icon button at right side of textbox, which is used to open or close the DatePicker calendar popup.
    * @Default {true}
    */
  var showPopupButton: js.UndefOr[Boolean] = js.native
  /** DatePicker input is displayed with rounded corner when this property is set to true.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  /** Used to show the tooltip when hovering on the days in the DatePicker calendar.
    * @Default {true}
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  /** Specifies the special dates in DatePicker.
    * @Default {null}
    */
  var specialDates: js.UndefOr[js.Any] = js.native
  /** Specifies the start day of the week in DatePicker calendar.
    * @Default {0}
    */
  var startDay: js.UndefOr[Double] = js.native
  /** Specifies the start level view in DatePicker calendar. See below available Levels
    * @Default {ej.DatePicker.Level.Month}
    */
  var startLevel: js.UndefOr[String | Level] = js.native
  /** Specifies the number of months to be navigate for one click of next and previous button in a DatePicker Calendar.
    * @Default {1}
    */
  var stepMonths: js.UndefOr[Double] = js.native
  /** Provides option to customize the tooltip format.
    * @Default {ddd MMM dd yyyy}
    */
  var tooltipFormat: js.UndefOr[String] = js.native
  /** Sets the jQuery validation support to DatePicker Date value. See validation
    * @Default {null}
    */
  var validationMessage: js.UndefOr[js.Any] = js.native
  /** Sets the jQuery validation custom rules to the DatePicker. see validation
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.native
  /** sets or returns the current value of DatePicker
    * @Default {null}
    */
  var value: js.UndefOr[String | js.Date] = js.native
  /** Specifies the water mark text to be displayed in input text.
    * @Default {Select date}
    */
  var watermarkText: js.UndefOr[String] = js.native
  /** Allows to embed  a new column with the calendar in the popup, which will display the week number of every week in a calendar year.
    * @Default {false}
    */
  var weekNumber: js.UndefOr[Boolean] = js.native
  /** Specifies the width of the DatePicker input text.
    * @Default {160px}
    */
  var width: js.UndefOr[String] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDrillDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDrillDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDrillDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDrillDown")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeClose(value: /* e */ BeforeCloseEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeClose")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDateCreate(value: /* e */ BeforeDateCreateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDateCreate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeDateCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDateCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withBlackoutDates(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackoutDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlackoutDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackoutDates")(js.undefined)
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
    def withChange(value: /* e */ ChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withClose(value: /* e */ CloseEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: /* e */ CreateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
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
    def withDayHeaderFormat(value: String | Header): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayHeaderFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayHeaderFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayHeaderFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDepthLevel(value: String | Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepthLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* e */ DestroyEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayInline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayInline")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePersistence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePersistence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableStrictMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableStrictMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableStrictMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableStrictMode")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: Fields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusIn(value: /* e */ FocusInEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFocusIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusIn")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusOut(value: /* e */ FocusOutEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFocusOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOut")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightSection(value: String | HighlightSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightSection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSection")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightWeekend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightWeekend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightWeekend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightWeekend")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttributes")(js.undefined)
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
    def withMaxDate(value: String | js.Date): Self = {
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
    def withMinDate(value: String | js.Date): Self = {
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
    def withNavigate(value: /* e */ NavigateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNavigate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigate")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: /* e */ OpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: /* e */ SelectEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDisabledRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDisabledRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDisabledRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDisabledRange")(js.undefined)
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
    def withShowPopupButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPopupButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPopupButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPopupButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRoundedCorner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoundedCorner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRoundedCorner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoundedCorner")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecialDates(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecialDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialDates")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDay")(js.undefined)
        ret
    }
    @scala.inline
    def withStartLevel(value: String | Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLevel")(js.undefined)
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
    def withTooltipFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationMessage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationRules(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withWatermarkText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watermarkText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatermarkText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watermarkText")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekNumber(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

