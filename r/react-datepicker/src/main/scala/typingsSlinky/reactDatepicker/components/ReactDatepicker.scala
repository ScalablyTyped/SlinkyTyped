package typingsSlinky.reactDatepicker.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.input.tag
import typingsSlinky.dateFns.mod.Locale
import typingsSlinky.popperJs.mod.Modifiers
import typingsSlinky.reactDatepicker.AnonChangeMonth
import typingsSlinky.reactDatepicker.AnonChildren
import typingsSlinky.reactDatepicker.AnonCode
import typingsSlinky.reactDatepicker.mod.HighlightDates
import typingsSlinky.reactDatepicker.mod.ReactDatePickerProps
import typingsSlinky.reactDatepicker.mod.default
import typingsSlinky.reactDatepicker.reactDatepickerStrings.scroll
import typingsSlinky.reactDatepicker.reactDatepickerStrings.select
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDatepicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-datepicker", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoComplete, autoFocus, className, disabled, id, name, onBlur, onFocus, readOnly, required, tabIndex, title */
  def apply(
    onChange: (js.UndefOr[js.Date | Null], js.UndefOr[SyntheticEvent[Event_, _]]) => Unit,
    adjustDateOnChange: js.UndefOr[Boolean] = js.undefined,
    allowSameDay: js.UndefOr[Boolean] = js.undefined,
    ariaLabelledBy: String = null,
    calendarClassName: String = null,
    calendarContainer: /* props */ AnonChildren => TagMod[Any] = null,
    clearButtonTitle: String = null,
    customInput: TagMod[Any] = null,
    customInputRef: String = null,
    dateFormat: String | js.Array[String] = null,
    dateFormatCalendar: String = null,
    dayClassName: /* date */ js.Date => String | Null = null,
    disabledKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    dropdownMode: scroll | select = null,
    endDate: js.Date = null,
    excludeDates: js.Array[js.Date] = null,
    excludeTimes: js.Array[js.Date] = null,
    filterDate: /* date */ js.Date => Boolean = null,
    fixedHeight: js.UndefOr[Boolean] = js.undefined,
    forceShowMonthNavigation: js.UndefOr[Boolean] = js.undefined,
    formatWeekDay: /* formattedDate */ String => String = null,
    formatWeekNumber: /* date */ js.Date => String | Double = null,
    highlightDates: js.Array[HighlightDates | js.Date] = null,
    includeDates: js.Array[js.Date] = null,
    includeTimes: js.Array[js.Date] = null,
    injectTimes: js.Array[js.Date] = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    inlineFocusSelectedMonth: js.UndefOr[Boolean] = js.undefined,
    isClearable: js.UndefOr[Boolean] = js.undefined,
    locale: String | Locale = null,
    maxDate: js.Date = null,
    maxTime: js.Date = null,
    minDate: js.Date = null,
    minTime: js.Date = null,
    monthsShown: Int | Double = null,
    nextMonthButtonLabel: String = null,
    nextYearButtonLabel: String = null,
    onCalendarClose: () => Unit = null,
    onCalendarOpen: () => Unit = null,
    onChangeRaw: /* event */ SyntheticFocusEvent[HTMLInputElement] => Unit = null,
    onClickOutside: /* event */ SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onDayMouseEnter: /* date */ js.Date => Unit = null,
    onInputClick: () => Unit = null,
    onInputError: /* err */ AnonCode => Unit = null,
    onKeyDown: /* event */ SyntheticKeyboardEvent[HTMLDivElement] => Unit = null,
    onMonthChange: /* date */ js.Date => Unit = null,
    onMonthMouseLeave: () => Unit = null,
    onSelect: (/* date */ js.Date, /* event */ js.UndefOr[SyntheticEvent[Event_, _]]) => Unit = null,
    onWeekSelect: (/* firstDayOfWeek */ js.Date, /* weekNumber */ String | Double, /* event */ js.UndefOr[SyntheticEvent[Event_, _]]) => Unit = null,
    onYearChange: /* date */ js.Date => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    openToDate: js.Date = null,
    peekNextMonth: js.UndefOr[Boolean] = js.undefined,
    placeholderText: String = null,
    popperClassName: String = null,
    popperContainer: /* props */ AnonChildren => TagMod[Any] = null,
    popperModifiers: Modifiers = null,
    popperPlacement: String = null,
    popperProps: js.Object = null,
    preventOpenOnFocus: js.UndefOr[Boolean] = js.undefined,
    previousMonthButtonLabel: String = null,
    previousYearButtonLabel: String = null,
    renderCustomHeader: /* params */ AnonChangeMonth => TagMod[Any] = null,
    renderDayContents: (/* dayOfMonth */ Double, /* date */ js.UndefOr[js.Date]) => TagMod[Any] = null,
    scrollableMonthYearDropdown: js.UndefOr[Boolean] = js.undefined,
    scrollableYearDropdown: js.UndefOr[Boolean] = js.undefined,
    selected: js.Date = null,
    selectsEnd: js.UndefOr[Boolean] = js.undefined,
    selectsStart: js.UndefOr[Boolean] = js.undefined,
    shouldCloseOnSelect: js.UndefOr[Boolean] = js.undefined,
    showDisabledMonthNavigation: js.UndefOr[Boolean] = js.undefined,
    showMonthDropdown: js.UndefOr[Boolean] = js.undefined,
    showMonthYearDropdown: js.UndefOr[Boolean] = js.undefined,
    showMonthYearPicker: js.UndefOr[Boolean] = js.undefined,
    showPopperArrow: js.UndefOr[Boolean] = js.undefined,
    showPreviousMonths: js.UndefOr[Boolean] = js.undefined,
    showQuarterYearPicker: js.UndefOr[Boolean] = js.undefined,
    showTimeInput: js.UndefOr[Boolean] = js.undefined,
    showTimeSelect: js.UndefOr[Boolean] = js.undefined,
    showTimeSelectOnly: js.UndefOr[Boolean] = js.undefined,
    showWeekNumbers: js.UndefOr[Boolean] = js.undefined,
    showYearDropdown: js.UndefOr[Boolean] = js.undefined,
    startDate: js.Date = null,
    startOpen: js.UndefOr[Boolean] = js.undefined,
    strictParsing: js.UndefOr[Boolean] = js.undefined,
    timeCaption: String = null,
    timeFormat: String = null,
    timeInputLabel: String = null,
    timeIntervals: Int | Double = null,
    todayButton: TagMod[Any] = null,
    useShortMonthInDropdown: js.UndefOr[Boolean] = js.undefined,
    useWeekdaysShort: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    weekLabel: String = null,
    withPortal: js.UndefOr[Boolean] = js.undefined,
    wrapperClassName: String = null,
    yearDropdownItemNumber: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange))
    if (!js.isUndefined(adjustDateOnChange)) __obj.updateDynamic("adjustDateOnChange")(adjustDateOnChange.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSameDay)) __obj.updateDynamic("allowSameDay")(allowSameDay.asInstanceOf[js.Any])
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (calendarClassName != null) __obj.updateDynamic("calendarClassName")(calendarClassName.asInstanceOf[js.Any])
    if (calendarContainer != null) __obj.updateDynamic("calendarContainer")(js.Any.fromFunction1(calendarContainer))
    if (clearButtonTitle != null) __obj.updateDynamic("clearButtonTitle")(clearButtonTitle.asInstanceOf[js.Any])
    if (customInput != null) __obj.updateDynamic("customInput")(customInput.asInstanceOf[js.Any])
    if (customInputRef != null) __obj.updateDynamic("customInputRef")(customInputRef.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (dateFormatCalendar != null) __obj.updateDynamic("dateFormatCalendar")(dateFormatCalendar.asInstanceOf[js.Any])
    if (dayClassName != null) __obj.updateDynamic("dayClassName")(js.Any.fromFunction1(dayClassName))
    if (!js.isUndefined(disabledKeyboardNavigation)) __obj.updateDynamic("disabledKeyboardNavigation")(disabledKeyboardNavigation.asInstanceOf[js.Any])
    if (dropdownMode != null) __obj.updateDynamic("dropdownMode")(dropdownMode.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (excludeDates != null) __obj.updateDynamic("excludeDates")(excludeDates.asInstanceOf[js.Any])
    if (excludeTimes != null) __obj.updateDynamic("excludeTimes")(excludeTimes.asInstanceOf[js.Any])
    if (filterDate != null) __obj.updateDynamic("filterDate")(js.Any.fromFunction1(filterDate))
    if (!js.isUndefined(fixedHeight)) __obj.updateDynamic("fixedHeight")(fixedHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(forceShowMonthNavigation)) __obj.updateDynamic("forceShowMonthNavigation")(forceShowMonthNavigation.asInstanceOf[js.Any])
    if (formatWeekDay != null) __obj.updateDynamic("formatWeekDay")(js.Any.fromFunction1(formatWeekDay))
    if (formatWeekNumber != null) __obj.updateDynamic("formatWeekNumber")(js.Any.fromFunction1(formatWeekNumber))
    if (highlightDates != null) __obj.updateDynamic("highlightDates")(highlightDates.asInstanceOf[js.Any])
    if (includeDates != null) __obj.updateDynamic("includeDates")(includeDates.asInstanceOf[js.Any])
    if (includeTimes != null) __obj.updateDynamic("includeTimes")(includeTimes.asInstanceOf[js.Any])
    if (injectTimes != null) __obj.updateDynamic("injectTimes")(injectTimes.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineFocusSelectedMonth)) __obj.updateDynamic("inlineFocusSelectedMonth")(inlineFocusSelectedMonth.asInstanceOf[js.Any])
    if (!js.isUndefined(isClearable)) __obj.updateDynamic("isClearable")(isClearable.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (maxTime != null) __obj.updateDynamic("maxTime")(maxTime.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minTime != null) __obj.updateDynamic("minTime")(minTime.asInstanceOf[js.Any])
    if (monthsShown != null) __obj.updateDynamic("monthsShown")(monthsShown.asInstanceOf[js.Any])
    if (nextMonthButtonLabel != null) __obj.updateDynamic("nextMonthButtonLabel")(nextMonthButtonLabel.asInstanceOf[js.Any])
    if (nextYearButtonLabel != null) __obj.updateDynamic("nextYearButtonLabel")(nextYearButtonLabel.asInstanceOf[js.Any])
    if (onCalendarClose != null) __obj.updateDynamic("onCalendarClose")(js.Any.fromFunction0(onCalendarClose))
    if (onCalendarOpen != null) __obj.updateDynamic("onCalendarOpen")(js.Any.fromFunction0(onCalendarOpen))
    if (onChangeRaw != null) __obj.updateDynamic("onChangeRaw")(js.Any.fromFunction1(onChangeRaw))
    if (onClickOutside != null) __obj.updateDynamic("onClickOutside")(js.Any.fromFunction1(onClickOutside))
    if (onDayMouseEnter != null) __obj.updateDynamic("onDayMouseEnter")(js.Any.fromFunction1(onDayMouseEnter))
    if (onInputClick != null) __obj.updateDynamic("onInputClick")(js.Any.fromFunction0(onInputClick))
    if (onInputError != null) __obj.updateDynamic("onInputError")(js.Any.fromFunction1(onInputError))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(js.Any.fromFunction1(onMonthChange))
    if (onMonthMouseLeave != null) __obj.updateDynamic("onMonthMouseLeave")(js.Any.fromFunction0(onMonthMouseLeave))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (onWeekSelect != null) __obj.updateDynamic("onWeekSelect")(js.Any.fromFunction3(onWeekSelect))
    if (onYearChange != null) __obj.updateDynamic("onYearChange")(js.Any.fromFunction1(onYearChange))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (openToDate != null) __obj.updateDynamic("openToDate")(openToDate.asInstanceOf[js.Any])
    if (!js.isUndefined(peekNextMonth)) __obj.updateDynamic("peekNextMonth")(peekNextMonth.asInstanceOf[js.Any])
    if (placeholderText != null) __obj.updateDynamic("placeholderText")(placeholderText.asInstanceOf[js.Any])
    if (popperClassName != null) __obj.updateDynamic("popperClassName")(popperClassName.asInstanceOf[js.Any])
    if (popperContainer != null) __obj.updateDynamic("popperContainer")(js.Any.fromFunction1(popperContainer))
    if (popperModifiers != null) __obj.updateDynamic("popperModifiers")(popperModifiers.asInstanceOf[js.Any])
    if (popperPlacement != null) __obj.updateDynamic("popperPlacement")(popperPlacement.asInstanceOf[js.Any])
    if (popperProps != null) __obj.updateDynamic("popperProps")(popperProps.asInstanceOf[js.Any])
    if (!js.isUndefined(preventOpenOnFocus)) __obj.updateDynamic("preventOpenOnFocus")(preventOpenOnFocus.asInstanceOf[js.Any])
    if (previousMonthButtonLabel != null) __obj.updateDynamic("previousMonthButtonLabel")(previousMonthButtonLabel.asInstanceOf[js.Any])
    if (previousYearButtonLabel != null) __obj.updateDynamic("previousYearButtonLabel")(previousYearButtonLabel.asInstanceOf[js.Any])
    if (renderCustomHeader != null) __obj.updateDynamic("renderCustomHeader")(js.Any.fromFunction1(renderCustomHeader))
    if (renderDayContents != null) __obj.updateDynamic("renderDayContents")(js.Any.fromFunction2(renderDayContents))
    if (!js.isUndefined(scrollableMonthYearDropdown)) __obj.updateDynamic("scrollableMonthYearDropdown")(scrollableMonthYearDropdown.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollableYearDropdown)) __obj.updateDynamic("scrollableYearDropdown")(scrollableYearDropdown.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (!js.isUndefined(selectsEnd)) __obj.updateDynamic("selectsEnd")(selectsEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(selectsStart)) __obj.updateDynamic("selectsStart")(selectsStart.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldCloseOnSelect)) __obj.updateDynamic("shouldCloseOnSelect")(shouldCloseOnSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(showDisabledMonthNavigation)) __obj.updateDynamic("showDisabledMonthNavigation")(showDisabledMonthNavigation.asInstanceOf[js.Any])
    if (!js.isUndefined(showMonthDropdown)) __obj.updateDynamic("showMonthDropdown")(showMonthDropdown.asInstanceOf[js.Any])
    if (!js.isUndefined(showMonthYearDropdown)) __obj.updateDynamic("showMonthYearDropdown")(showMonthYearDropdown.asInstanceOf[js.Any])
    if (!js.isUndefined(showMonthYearPicker)) __obj.updateDynamic("showMonthYearPicker")(showMonthYearPicker.asInstanceOf[js.Any])
    if (!js.isUndefined(showPopperArrow)) __obj.updateDynamic("showPopperArrow")(showPopperArrow.asInstanceOf[js.Any])
    if (!js.isUndefined(showPreviousMonths)) __obj.updateDynamic("showPreviousMonths")(showPreviousMonths.asInstanceOf[js.Any])
    if (!js.isUndefined(showQuarterYearPicker)) __obj.updateDynamic("showQuarterYearPicker")(showQuarterYearPicker.asInstanceOf[js.Any])
    if (!js.isUndefined(showTimeInput)) __obj.updateDynamic("showTimeInput")(showTimeInput.asInstanceOf[js.Any])
    if (!js.isUndefined(showTimeSelect)) __obj.updateDynamic("showTimeSelect")(showTimeSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(showTimeSelectOnly)) __obj.updateDynamic("showTimeSelectOnly")(showTimeSelectOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekNumbers)) __obj.updateDynamic("showWeekNumbers")(showWeekNumbers.asInstanceOf[js.Any])
    if (!js.isUndefined(showYearDropdown)) __obj.updateDynamic("showYearDropdown")(showYearDropdown.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (!js.isUndefined(startOpen)) __obj.updateDynamic("startOpen")(startOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(strictParsing)) __obj.updateDynamic("strictParsing")(strictParsing.asInstanceOf[js.Any])
    if (timeCaption != null) __obj.updateDynamic("timeCaption")(timeCaption.asInstanceOf[js.Any])
    if (timeFormat != null) __obj.updateDynamic("timeFormat")(timeFormat.asInstanceOf[js.Any])
    if (timeInputLabel != null) __obj.updateDynamic("timeInputLabel")(timeInputLabel.asInstanceOf[js.Any])
    if (timeIntervals != null) __obj.updateDynamic("timeIntervals")(timeIntervals.asInstanceOf[js.Any])
    if (todayButton != null) __obj.updateDynamic("todayButton")(todayButton.asInstanceOf[js.Any])
    if (!js.isUndefined(useShortMonthInDropdown)) __obj.updateDynamic("useShortMonthInDropdown")(useShortMonthInDropdown.asInstanceOf[js.Any])
    if (!js.isUndefined(useWeekdaysShort)) __obj.updateDynamic("useWeekdaysShort")(useWeekdaysShort.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (weekLabel != null) __obj.updateDynamic("weekLabel")(weekLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(withPortal)) __obj.updateDynamic("withPortal")(withPortal.asInstanceOf[js.Any])
    if (wrapperClassName != null) __obj.updateDynamic("wrapperClassName")(wrapperClassName.asInstanceOf[js.Any])
    if (yearDropdownItemNumber != null) __obj.updateDynamic("yearDropdownItemNumber")(yearDropdownItemNumber.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReactDatePickerProps
}

