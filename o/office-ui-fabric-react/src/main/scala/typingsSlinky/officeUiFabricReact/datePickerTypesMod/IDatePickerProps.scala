package typingsSlinky.officeUiFabricReact.datePickerTypesMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.calendarTypesMod.ICalendarFormatDateCallbacks
import typingsSlinky.officeUiFabricReact.calendarTypesMod.ICalendarProps
import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsSlinky.officeUiFabricReact.dateValuesMod.DayOfWeek
import typingsSlinky.officeUiFabricReact.dateValuesMod.FirstWeekOfYear
import typingsSlinky.officeUiFabricReact.textFieldTypesMod.ITextFieldProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.baseComponentTypesMod.IBaseProps
import typingsSlinky.uifabricUtilities.icomponentasMod.IComponentAs
import typingsSlinky.uifabricUtilities.icomponentasMod.IComponentAsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatePickerProps
  extends HTMLAttributes[HTMLElement]
     with IBaseProps[IDatePicker] {
  /**
    * Allows all elements to be focused, including disabled ones
    * @defaultvalue false
    */
  var allFocusable: js.UndefOr[Boolean] = js.native
  /**
    * Whether the DatePicker allows input a date string directly or not
    * @defaultvalue false
    */
  var allowTextInput: js.UndefOr[Boolean] = js.native
  /**
    * Aria Label for TextField of the DatePicker for screen reader users.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * Determines if DatePicker has a border.
    * @defaultvalue false
    */
  var borderless: js.UndefOr[Boolean] = js.native
  /**
    * Custom Calendar to be used for date picking
    */
  var calendarAs: js.UndefOr[IComponentAs[ICalendarProps]] = js.native
  /**
    * Pass calendar props to calendar component
    */
  var calendarProps: js.UndefOr[ICalendarProps] = js.native
  /**
    * Pass callout props to callout component
    */
  var calloutProps: js.UndefOr[ICalloutProps] = js.native
  /**
    * Apply additional formating to dates, for example localized date formatting.
    */
  var dateTimeFormatter: js.UndefOr[ICalendarFormatDateCallbacks] = js.native
  /**
    * Whether the DatePicker should open automatically when the control is focused
    * @defaultvalue false
    */
  var disableAutoFocus: js.UndefOr[Boolean] = js.native
  /**
    * Disabled state of the DatePicker.
    * @defaultvalue false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * The first day of the week for your locale.
    * @defaultvalue DayOfWeek.Sunday
    */
  var firstDayOfWeek: js.UndefOr[DayOfWeek] = js.native
  /**
    * Defines when the first week of the year should start, FirstWeekOfYear.FirstDay,
    * FirstWeekOfYear.FirstFullWeek or FirstWeekOfYear.FirstFourDayWeek are the possible values
    * @defaultvalue FirstWeekOfYear.FirstFullWeek
    */
  var firstWeekOfYear: js.UndefOr[FirstWeekOfYear] = js.native
  /**
    * Optional method to format the chosen date to a string to display in the DatePicker
    * @defaultvalue date.toString()
    */
  var formatDate: js.UndefOr[js.Function1[/* date */ js.UndefOr[js.Date], String]] = js.native
  /**
    * Whether the month picker should highlight the current month
    * @defaultvalue false
    */
  var highlightCurrentMonth: js.UndefOr[Boolean] = js.native
  /**
    * Whether the month picker should highlight the selected month
    * @defaultvalue false
    */
  var highlightSelectedMonth: js.UndefOr[Boolean] = js.native
  /**
    * The initially highlighted date in the calendar picker
    */
  var initialPickerDate: js.UndefOr[js.Date] = js.native
  /**
    * Whether the month picker is shown beside the day picker or hidden.
    * @defaultvalue true
    */
  var isMonthPickerVisible: js.UndefOr[Boolean] = js.native
  /**
    * Whether the DatePicker is a required field or not
    * @defaultvalue false
    */
  var isRequired: js.UndefOr[Boolean] = js.native
  /**
    * Label for the DatePicker
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The maximum allowable date.
    */
  var maxDate: js.UndefOr[js.Date] = js.native
  /**
    * The minimum allowable date.
    */
  var minDate: js.UndefOr[js.Date] = js.native
  /**
    * Callback that runs after DatePicker's menu (Calendar) is closed
    */
  var onAfterMenuDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback issued when a date is selected
    */
  var onSelectDate: js.UndefOr[js.Function1[/* date */ js.UndefOr[js.Date | Null], Unit]] = js.native
  /**
    * Optional method to parse the text input value to date, it is only useful when allowTextInput is set to true
    * @defaultvalue new Date(Date.parse(dateStr))
    */
  var parseDateFromString: js.UndefOr[js.Function1[/* dateStr */ String, js.Date | Null]] = js.native
  /**
    * Aria label for date picker popup for screen reader users.
    * @defaultvalue Calendar
    */
  var pickerAriaLabel: js.UndefOr[String] = js.native
  /**
    * Whether the CalendarDay close button should be shown or not.
    */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  /**
    * Whether the "Go to today" link should be shown or not
    */
  var showGoToToday: js.UndefOr[Boolean] = js.native
  /**
    * Show month picker on top of date picker when visible.
    * @defaultvalue false
    */
  var showMonthPickerAsOverlay: js.UndefOr[Boolean] = js.native
  /**
    * Whether the calendar should show the week number (weeks 1 to 53) before each week row
    * @defaultvalue false
    */
  var showWeekNumbers: js.UndefOr[Boolean] = js.native
  /**
    * Localized strings to use in the DatePicker
    */
  var strings: js.UndefOr[IDatePickerStrings] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDatePickerStyleProps, IDatePickerStyles]] = js.native
  /**
    * Pass textField props to textField component.
    * Prop name is "textField" for compatiblity with upcoming slots work.
    */
  var textField: js.UndefOr[ITextFieldProps] = js.native
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Value of today. If null, current time in client machine will be used.
    */
  var today: js.UndefOr[js.Date] = js.native
  /**
    * Whether or not the Textfield of the DatePicker is underlined.
    * @defaultvalue false
    */
  var underlined: js.UndefOr[Boolean] = js.native
  /**
    * Default value of the DatePicker, if any
    */
  var value: js.UndefOr[js.Date] = js.native
}

object IDatePickerProps {
  @scala.inline
  def apply(): IDatePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatePickerProps]
  }
  @scala.inline
  implicit class IDatePickerPropsOps[Self <: IDatePickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllFocusable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allFocusable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllFocusable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allFocusable")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowTextInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTextInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowTextInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTextInput")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderless")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendarAsFunctionComponent(value: ReactComponentClass[IComponentAsProps[ICalendarProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalendarAsComponentClass(value: ReactComponentClass[IComponentAsProps[ICalendarProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalendarAs(value: IComponentAs[ICalendarProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarAs")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendarProps(value: ICalendarProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarProps")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutProps(value: ICalloutProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutProps")(js.undefined)
        ret
    }
    @scala.inline
    def withDateTimeFormatter(value: ICalendarFormatDateCallbacks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateTimeFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAutoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAutoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstDayOfWeek(value: DayOfWeek): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstDayOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstWeekOfYear(value: FirstWeekOfYear): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstWeekOfYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstWeekOfYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstWeekOfYear")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatDate(value: /* date */ js.UndefOr[js.Date] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatDate")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightCurrentMonth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCurrentMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightCurrentMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCurrentMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightSelectedMonth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSelectedMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightSelectedMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSelectedMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialPickerDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPickerDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialPickerDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPickerDate")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMonthPickerVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMonthPickerVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMonthPickerVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMonthPickerVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
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
    def withOnAfterMenuDismiss(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterMenuDismiss")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAfterMenuDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterMenuDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectDate(value: /* date */ js.UndefOr[js.Date | Null] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectDate")(js.undefined)
        ret
    }
    @scala.inline
    def withParseDateFromString(value: /* dateStr */ String => js.Date | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseDateFromString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutParseDateFromString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseDateFromString")(js.undefined)
        ret
    }
    @scala.inline
    def withPickerAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPickerAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGoToToday(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGoToToday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGoToToday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGoToToday")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMonthPickerAsOverlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMonthPickerAsOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMonthPickerAsOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMonthPickerAsOverlay")(js.undefined)
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
    def withStrings(value: IDatePickerStrings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IDatePickerStyleProps => Partial[IDatePickerStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IDatePickerStyleProps, IDatePickerStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTextField(value: ITextFieldProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textField")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
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
    def withToday(value: js.Date): Self = {
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
    def withUnderlined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlined")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Date): Self = {
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
  }
  
}

