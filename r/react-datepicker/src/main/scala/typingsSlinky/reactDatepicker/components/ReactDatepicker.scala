package typingsSlinky.reactDatepicker.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.dateFns.mod.Locale
import typingsSlinky.popperJs.mod.Modifiers
import typingsSlinky.reactDatepicker.anon.ChangeMonth
import typingsSlinky.reactDatepicker.anon.Children
import typingsSlinky.reactDatepicker.anon.Code
import typingsSlinky.reactDatepicker.mod.HighlightDates
import typingsSlinky.reactDatepicker.mod.ReactDatePickerProps
import typingsSlinky.reactDatepicker.mod.default
import typingsSlinky.reactDatepicker.reactDatepickerStrings.scroll
import typingsSlinky.reactDatepicker.reactDatepickerStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactDatepicker {
  
  @JSImport("react-datepicker", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def adjustDateOnChange(value: Boolean): this.type = set("adjustDateOnChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowSameDay(value: Boolean): this.type = set("allowSameDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ariaLabelClose(value: String): this.type = set("ariaLabelClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def calendarClassName(value: String): this.type = set("calendarClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def calendarContainer(value: /* props */ Children => ReactElement): this.type = set("calendarContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def chooseDayAriaLabelPrefix(value: String): this.type = set("chooseDayAriaLabelPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clearButtonTitle(value: String): this.type = set("clearButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeOnScrollFunction1(value: /* e */ Event => Boolean): this.type = set("closeOnScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def closeOnScroll(value: Boolean | (js.Function1[/* e */ Event, Boolean])): this.type = set("closeOnScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customInputReactElement(value: ReactElement): this.type = set("customInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customInput(value: ReactElement): this.type = set("customInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customInputRef(value: String): this.type = set("customInputRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customTimeInputReactElement(value: ReactElement): this.type = set("customTimeInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customTimeInput(value: ReactElement): this.type = set("customTimeInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dateFormatVarargs(value: String*): this.type = set("dateFormat", js.Array(value :_*))
    
    @scala.inline
    def dateFormat(value: String | js.Array[String]): this.type = set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dateFormatCalendar(value: String): this.type = set("dateFormatCalendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dayClassName(value: /* date */ js.Date => String | Null): this.type = set("dayClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledDayAriaLabelPrefix(value: String): this.type = set("disabledDayAriaLabelPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledKeyboardNavigation(value: Boolean): this.type = set("disabledKeyboardNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropdownMode(value: scroll | select): this.type = set("dropdownMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableTabLoop(value: Boolean): this.type = set("enableTabLoop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def endDate(value: js.Date): this.type = set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def endDateNull: this.type = set("endDate", null)
    
    @scala.inline
    def excludeDatesVarargs(value: js.Date*): this.type = set("excludeDates", js.Array(value :_*))
    
    @scala.inline
    def excludeDates(value: js.Array[js.Date]): this.type = set("excludeDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def excludeScrollbar(value: Boolean): this.type = set("excludeScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def excludeTimesVarargs(value: js.Date*): this.type = set("excludeTimes", js.Array(value :_*))
    
    @scala.inline
    def excludeTimes(value: js.Array[js.Date]): this.type = set("excludeTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterDate(value: /* date */ js.Date => Boolean): this.type = set("filterDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def fixedHeight(value: Boolean): this.type = set("fixedHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusSelectedMonth(value: Boolean): this.type = set("focusSelectedMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def forceShowMonthNavigation(value: Boolean): this.type = set("forceShowMonthNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formatWeekDay(value: /* formattedDate */ String => String): this.type = set("formatWeekDay", js.Any.fromFunction1(value))
    
    @scala.inline
    def formatWeekNumber(value: /* date */ js.Date => String | Double): this.type = set("formatWeekNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def highlightDatesVarargs(value: (HighlightDates | js.Date)*): this.type = set("highlightDates", js.Array(value :_*))
    
    @scala.inline
    def highlightDates(value: js.Array[HighlightDates | js.Date]): this.type = set("highlightDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def includeDatesVarargs(value: js.Date*): this.type = set("includeDates", js.Array(value :_*))
    
    @scala.inline
    def includeDates(value: js.Array[js.Date]): this.type = set("includeDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def includeTimesVarargs(value: js.Date*): this.type = set("includeTimes", js.Array(value :_*))
    
    @scala.inline
    def includeTimes(value: js.Array[js.Date]): this.type = set("includeTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def injectTimesVarargs(value: js.Date*): this.type = set("injectTimes", js.Array(value :_*))
    
    @scala.inline
    def injectTimes(value: js.Array[js.Date]): this.type = set("injectTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isClearable(value: Boolean): this.type = set("isClearable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locale(value: String | Locale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDateNull: this.type = set("maxDate", null)
    
    @scala.inline
    def maxTime(value: js.Date): this.type = set("maxTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDateNull: this.type = set("minDate", null)
    
    @scala.inline
    def minTime(value: js.Date): this.type = set("minTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def monthClassName(value: /* date */ js.Date => String | Null): this.type = set("monthClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def monthsShown(value: Double): this.type = set("monthsShown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nextMonthButtonLabel(value: String): this.type = set("nextMonthButtonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nextYearButtonLabel(value: String): this.type = set("nextYearButtonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: /* event */ SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCalendarClose(value: () => Unit): this.type = set("onCalendarClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def onCalendarOpen(value: () => Unit): this.type = set("onCalendarOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def onChangeRaw(value: /* event */ SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onChangeRaw", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClickOutside(value: /* event */ SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClickOutside", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDayMouseEnter(value: /* date */ js.Date => Unit): this.type = set("onDayMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: /* event */ SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInputClick(value: () => Unit): this.type = set("onInputClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def onInputError(value: /* err */ Code => Unit): this.type = set("onInputError", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDown(value: /* event */ SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMonthChange(value: /* date */ js.Date => Unit): this.type = set("onMonthChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMonthMouseLeave(value: () => Unit): this.type = set("onMonthMouseLeave", js.Any.fromFunction0(value))
    
    @scala.inline
    def onSelect(value: (/* date */ js.Date, /* event */ js.UndefOr[SyntheticEvent[Event, _]]) => Unit): this.type = set("onSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def onWeekSelect(
      value: (/* firstDayOfWeek */ js.Date, /* weekNumber */ String | Double, /* event */ js.UndefOr[SyntheticEvent[Event, _]]) => Unit
    ): this.type = set("onWeekSelect", js.Any.fromFunction3(value))
    
    @scala.inline
    def onYearChange(value: /* date */ js.Date => Unit): this.type = set("onYearChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def openToDate(value: js.Date): this.type = set("openToDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def peekNextMonth(value: Boolean): this.type = set("peekNextMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholderText(value: String): this.type = set("placeholderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popperClassName(value: String): this.type = set("popperClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popperContainer(value: /* props */ Children => ReactElement): this.type = set("popperContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def popperModifiers(value: Modifiers): this.type = set("popperModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popperPlacement(value: String): this.type = set("popperPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popperProps(value: js.Object): this.type = set("popperProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def portalId(value: String): this.type = set("portalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def preventOpenOnFocus(value: Boolean): this.type = set("preventOpenOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def previousMonthButtonLabel(value: String): this.type = set("previousMonthButtonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def previousYearButtonLabel(value: String): this.type = set("previousYearButtonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderCustomHeader(value: /* params */ ChangeMonth => ReactElement): this.type = set("renderCustomHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderDayContents(value: (/* dayOfMonth */ Double, /* date */ js.UndefOr[js.Date]) => ReactElement): this.type = set("renderDayContents", js.Any.fromFunction2(value))
    
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollableMonthYearDropdown(value: Boolean): this.type = set("scrollableMonthYearDropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollableYearDropdown(value: Boolean): this.type = set("scrollableYearDropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selected(value: js.Date): this.type = set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedNull: this.type = set("selected", null)
    
    @scala.inline
    def selectsEnd(value: Boolean): this.type = set("selectsEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectsRange(value: Boolean): this.type = set("selectsRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectsStart(value: Boolean): this.type = set("selectsStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shouldCloseOnSelect(value: Boolean): this.type = set("shouldCloseOnSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showDisabledMonthNavigation(value: Boolean): this.type = set("showDisabledMonthNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showFullMonthYearPicker(value: Boolean): this.type = set("showFullMonthYearPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showMonthDropdown(value: Boolean): this.type = set("showMonthDropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showMonthYearDropdown(value: Boolean): this.type = set("showMonthYearDropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showMonthYearPicker(value: Boolean): this.type = set("showMonthYearPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showPopperArrow(value: Boolean): this.type = set("showPopperArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showPreviousMonths(value: Boolean): this.type = set("showPreviousMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showQuarterYearPicker(value: Boolean): this.type = set("showQuarterYearPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showTimeInput(value: Boolean): this.type = set("showTimeInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showTimeSelect(value: Boolean): this.type = set("showTimeSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showTimeSelectOnly(value: Boolean): this.type = set("showTimeSelectOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showTwoColumnMonthYearPicker(value: Boolean): this.type = set("showTwoColumnMonthYearPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showWeekNumbers(value: Boolean): this.type = set("showWeekNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showYearDropdown(value: Boolean): this.type = set("showYearDropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showYearPicker(value: Boolean): this.type = set("showYearPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def startDate(value: js.Date): this.type = set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def startDateNull: this.type = set("startDate", null)
    
    @scala.inline
    def startOpen(value: Boolean): this.type = set("startOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strictParsing(value: Boolean): this.type = set("strictParsing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def timeCaption(value: String): this.type = set("timeCaption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def timeClassName(value: /* date */ js.Date => String | Null): this.type = set("timeClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def timeFormat(value: String): this.type = set("timeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def timeInputLabel(value: String): this.type = set("timeInputLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def timeIntervals(value: Double): this.type = set("timeIntervals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def todayButtonReactElement(value: ReactElement): this.type = set("todayButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def todayButton(value: ReactElement): this.type = set("todayButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useShortMonthInDropdown(value: Boolean): this.type = set("useShortMonthInDropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useWeekdaysShort(value: Boolean): this.type = set("useWeekdaysShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def weekAriaLabelPrefix(value: String): this.type = set("weekAriaLabelPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def weekDayClassName(value: /* date */ js.Date => String | Null): this.type = set("weekDayClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def weekLabel(value: String): this.type = set("weekLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def withPortal(value: Boolean): this.type = set("withPortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapperClassName(value: String): this.type = set("wrapperClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yearDropdownItemNumber(value: Double): this.type = set("yearDropdownItemNumber", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactDatePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(onChange: (js.UndefOr[js.Date | Null], js.UndefOr[SyntheticEvent[Event, _]]) => Unit): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange))
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactDatePickerProps]))
  }
}
