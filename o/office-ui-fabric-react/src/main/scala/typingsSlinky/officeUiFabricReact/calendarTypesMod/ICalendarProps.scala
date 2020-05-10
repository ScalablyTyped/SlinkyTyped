package typingsSlinky.officeUiFabricReact.calendarTypesMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.uifabricUtilities.baseComponentTypesMod.IBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarProps
  extends HTMLAttributes[HTMLElement]
     with IBaseProps[ICalendar] {
  /**
    * Allows all dates and buttons to be focused, including disabled ones
    * @defaultvalue false
    */
  var allFocusable: js.UndefOr[Boolean] = js.native
  /**
    * Whether the month view should automatically navigate to the next or previous date range
    * depending on the selected date. If this property is set to true and the currently displayed
    * month is March 2017, if the user clicks on a day outside the month, i.e., April 1st, the
    * picker will automatically navigate to the month of April.
    * @defaultvalue false
    */
  var autoNavigateOnSelection: js.UndefOr[Boolean] = js.native
  /**
    * The date range type indicating how  many days should be selected as the user
    * selects days
    * @defaultvalue DateRangeType.Day
    */
  var dateRangeType: js.UndefOr[typingsSlinky.officeUiFabricReact.dateValuesMod.DateRangeType] = js.native
  /**
    * Apply additional formating to dates, for example localized date formatting.
    */
  var dateTimeFormatter: js.UndefOr[ICalendarFormatDateCallbacks] = js.native
  /**
    * The first day of the week for your locale.
    * @defaultvalue DayOfWeek.Sunday
    */
  var firstDayOfWeek: js.UndefOr[typingsSlinky.officeUiFabricReact.dateValuesMod.DayOfWeek] = js.native
  /**
    * Defines when the first week of the year should start, FirstWeekOfYear.FirstDay,
    * FirstWeekOfYear.FirstFullWeek or FirstWeekOfYear.FirstFourDayWeek are the possible values
    * @defaultvalue FirstWeekOfYear.FirstDay
    */
  var firstWeekOfYear: js.UndefOr[typingsSlinky.officeUiFabricReact.dateValuesMod.FirstWeekOfYear] = js.native
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
    * Whether the day picker is shown beside the month picker or hidden.
    * @defaultvalue true
    */
  var isDayPickerVisible: js.UndefOr[Boolean] = js.native
  /**
    * Whether the month picker is shown beside the day picker or hidden.
    * @defaultvalue true
    */
  var isMonthPickerVisible: js.UndefOr[Boolean] = js.native
  /**
    * If set the Calendar will not allow navigation to or selection of a date later than this value.
    */
  var maxDate: js.UndefOr[js.Date] = js.native
  /**
    * If set the Calendar will not allow navigation to or selection of a date earlier than this value.
    */
  var minDate: js.UndefOr[js.Date] = js.native
  /**
    * Customize navigation icons using ICalendarIconStrings
    */
  var navigationIcons: js.UndefOr[ICalendarIconStrings] = js.native
  /**
    * Callback issued when calendar is closed
    */
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback issued when a date is selected
    * @param date - The date the user selected
    * @param selectedDateRangeArray - The resultant list of dates that are selected based on the date range type set
    * for the component.
    */
  var onSelectDate: js.UndefOr[
    js.Function2[/* date */ js.Date, /* selectedDateRangeArray */ js.UndefOr[js.Array[js.Date]], Unit]
  ] = js.native
  /**
    * If set the Calendar will not allow selection of dates in this array.
    */
  var restrictedDates: js.UndefOr[js.Array[js.Date]] = js.native
  /**
    * When clicking on "Today", select the date and close the calendar.
    * @defaultvalue false
    */
  var selectDateOnClick: js.UndefOr[Boolean] = js.native
  /**
    * This property has been removed at 0.80.0 in place of the `focus` method, to be removed \@ 1.0.0.
    * @deprecated Replaced with the `focus` method.
    */
  var shouldFocusOnMount: js.UndefOr[Boolean] = js.native
  /**
    * Whether the close button should be shown or not
    * @defaultvalue false
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
    * Whether the calendar should show 6 weeks by default.
    * @defaultvalue false
    */
  var showSixWeeksByDefault: js.UndefOr[Boolean] = js.native
  /**
    * Whether the calendar should show the week number (weeks 1 to 53) before each week row
    * @defaultvalue false
    */
  var showWeekNumbers: js.UndefOr[Boolean] = js.native
  /**
    * Localized strings to use in the Calendar
    */
  var strings: ICalendarStrings | Null = js.native
  /**
    * Value of today. If null, current time in client machine will be used.
    */
  var today: js.UndefOr[js.Date] = js.native
  /**
    * Default value of the Calendar, if any
    */
  var value: js.UndefOr[js.Date] = js.native
  /**
    * The days that are selectable when dateRangeType is WorkWeek.
    * If dateRangeType is not WorkWeek this property does nothing.
    * @defaultvalue [Monday,Tuesday,Wednesday,Thursday,Friday]
    */
  var workWeekDays: js.UndefOr[js.Array[typingsSlinky.officeUiFabricReact.dateValuesMod.DayOfWeek]] = js.native
  /**
    * Whether the year picker is enabled
    * @defaultvalue false
    */
  var yearPickerHidden: js.UndefOr[Boolean] = js.native
}

object ICalendarProps {
  @scala.inline
  def apply(): ICalendarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalendarProps]
  }
  @scala.inline
  implicit class ICalendarPropsOps[Self <: ICalendarProps] (val x: Self) extends AnyVal {
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
    def withAutoNavigateOnSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoNavigateOnSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoNavigateOnSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoNavigateOnSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withDateRangeType(value: typingsSlinky.officeUiFabricReact.dateValuesMod.DateRangeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRangeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateRangeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRangeType")(js.undefined)
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
    def withFirstDayOfWeek(value: typingsSlinky.officeUiFabricReact.dateValuesMod.DayOfWeek): Self = {
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
    def withFirstWeekOfYear(value: typingsSlinky.officeUiFabricReact.dateValuesMod.FirstWeekOfYear): Self = {
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
    def withIsDayPickerVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDayPickerVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDayPickerVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDayPickerVisible")(js.undefined)
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
    def withNavigationIcons(value: ICalendarIconStrings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationIcons")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDismiss(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectDate(value: (/* date */ js.Date, /* selectedDateRangeArray */ js.UndefOr[js.Array[js.Date]]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectDate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSelectDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectDate")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictedDates(value: js.Array[js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictedDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictedDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictedDates")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectDateOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectDateOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectDateOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectDateOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldFocusOnMount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFocusOnMount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldFocusOnMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFocusOnMount")(js.undefined)
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
    def withShowSixWeeksByDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSixWeeksByDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSixWeeksByDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSixWeeksByDefault")(js.undefined)
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
    def withStrings(value: ICalendarStrings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(null)
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
    @scala.inline
    def withWorkWeekDays(value: js.Array[typingsSlinky.officeUiFabricReact.dateValuesMod.DayOfWeek]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workWeekDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkWeekDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workWeekDays")(js.undefined)
        ret
    }
    @scala.inline
    def withYearPickerHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearPickerHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearPickerHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearPickerHidden")(js.undefined)
        ret
    }
  }
  
}

