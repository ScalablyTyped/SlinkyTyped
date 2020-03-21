package typingsSlinky.reactDates.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactDates.AnonDate
import typingsSlinky.reactDates.AnonFocused
import typingsSlinky.reactDates.AnonIsVisible
import typingsSlinky.reactDates.mod.CalendarInfoPositionShape
import typingsSlinky.reactDates.mod.DayPickerSingleDateControllerCls
import typingsSlinky.reactDates.mod.DayPickerSingleDateControllerShape
import typingsSlinky.reactDates.mod.ScrollableOrientationShape
import typingsSlinky.reactDates.mod.SingleDatePickerPhrases
import typingsSlinky.reactDates.mod.momentPropTypes.momentObj
import typingsSlinky.reactDates.reactDatesNumbers.`0`
import typingsSlinky.reactDates.reactDatesNumbers.`1`
import typingsSlinky.reactDates.reactDatesNumbers.`2`
import typingsSlinky.reactDates.reactDatesNumbers.`3`
import typingsSlinky.reactDates.reactDatesNumbers.`4`
import typingsSlinky.reactDates.reactDatesNumbers.`5`
import typingsSlinky.reactDates.reactDatesNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DayPickerSingleDateController
  extends ExternalComponentWithAttributesWithRefType[tag.type, DayPickerSingleDateControllerCls] {
  @JSImport("react-dates", "DayPickerSingleDateController")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    focused: Boolean,
    onDateChange: js.UndefOr[momentObj] => Unit,
    onFocusChange: AnonFocused => Unit,
    calendarInfoPosition: CalendarInfoPositionShape = null,
    date: momentObj = null,
    dayAriaLabelFormat: String = null,
    daySize: Int | Double = null,
    enableOutsideDays: js.UndefOr[Boolean] = js.undefined,
    firstDayOfWeek: `0` | `1` | `2` | `3` | `4` | `5` | `6` = null,
    hideKeyboardShortcutsPanel: js.UndefOr[Boolean] = js.undefined,
    horizontalMonthPadding: Int | Double = null,
    initialVisibleMonth: () => momentObj = null,
    isDayBlocked: /* day */ js.Any => Boolean = null,
    isDayHighlighted: /* day */ js.Any => Boolean = null,
    isFocused: js.UndefOr[Boolean] = js.undefined,
    isOutsideRange: /* day */ js.Any => Boolean = null,
    isRTL: js.UndefOr[Boolean] = js.undefined,
    keepOpenOnDateSelect: js.UndefOr[Boolean] = js.undefined,
    monthFormat: String = null,
    navNext: String | ReactElement = null,
    navPrev: String | ReactElement = null,
    noBorder: js.UndefOr[Boolean] = js.undefined,
    numberOfMonths: Int | Double = null,
    onBlur: () => Unit = null,
    onClose: /* final */ AnonDate => Unit = null,
    onNextMonthClick: /* newCurrentMonth */ momentObj => Unit = null,
    onOutsideClick: /* e */ js.Any => Unit = null,
    onPrevMonthClick: /* newCurrentMonth */ momentObj => Unit = null,
    orientation: ScrollableOrientationShape = null,
    phrases: SingleDatePickerPhrases = null,
    renderCalendarDay: /* day */ momentObj => String | ReactElement = null,
    renderCalendarInfo: () => String | ReactElement = null,
    renderDayContents: /* day */ momentObj => String | ReactElement = null,
    renderMonthElement: /* props */ AnonIsVisible => String | ReactElement = null,
    renderMonthText: /* day */ momentObj => String | ReactElement = null,
    showKeyboardShortcuts: js.UndefOr[Boolean] = js.undefined,
    transitionDuration: Int | Double = null,
    verticalHeight: Int | Double = null,
    weekDayFormat: String = null,
    withPortal: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, DayPickerSingleDateControllerCls] = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], onDateChange = js.Any.fromFunction1(onDateChange), onFocusChange = js.Any.fromFunction1(onFocusChange))
    if (calendarInfoPosition != null) __obj.updateDynamic("calendarInfoPosition")(calendarInfoPosition.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (dayAriaLabelFormat != null) __obj.updateDynamic("dayAriaLabelFormat")(dayAriaLabelFormat.asInstanceOf[js.Any])
    if (daySize != null) __obj.updateDynamic("daySize")(daySize.asInstanceOf[js.Any])
    if (!js.isUndefined(enableOutsideDays)) __obj.updateDynamic("enableOutsideDays")(enableOutsideDays.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(hideKeyboardShortcutsPanel)) __obj.updateDynamic("hideKeyboardShortcutsPanel")(hideKeyboardShortcutsPanel.asInstanceOf[js.Any])
    if (horizontalMonthPadding != null) __obj.updateDynamic("horizontalMonthPadding")(horizontalMonthPadding.asInstanceOf[js.Any])
    if (initialVisibleMonth != null) __obj.updateDynamic("initialVisibleMonth")(js.Any.fromFunction0(initialVisibleMonth))
    if (isDayBlocked != null) __obj.updateDynamic("isDayBlocked")(js.Any.fromFunction1(isDayBlocked))
    if (isDayHighlighted != null) __obj.updateDynamic("isDayHighlighted")(js.Any.fromFunction1(isDayHighlighted))
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused.asInstanceOf[js.Any])
    if (isOutsideRange != null) __obj.updateDynamic("isOutsideRange")(js.Any.fromFunction1(isOutsideRange))
    if (!js.isUndefined(isRTL)) __obj.updateDynamic("isRTL")(isRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(keepOpenOnDateSelect)) __obj.updateDynamic("keepOpenOnDateSelect")(keepOpenOnDateSelect.asInstanceOf[js.Any])
    if (monthFormat != null) __obj.updateDynamic("monthFormat")(monthFormat.asInstanceOf[js.Any])
    if (navNext != null) __obj.updateDynamic("navNext")(navNext.asInstanceOf[js.Any])
    if (navPrev != null) __obj.updateDynamic("navPrev")(navPrev.asInstanceOf[js.Any])
    if (!js.isUndefined(noBorder)) __obj.updateDynamic("noBorder")(noBorder.asInstanceOf[js.Any])
    if (numberOfMonths != null) __obj.updateDynamic("numberOfMonths")(numberOfMonths.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onNextMonthClick != null) __obj.updateDynamic("onNextMonthClick")(js.Any.fromFunction1(onNextMonthClick))
    if (onOutsideClick != null) __obj.updateDynamic("onOutsideClick")(js.Any.fromFunction1(onOutsideClick))
    if (onPrevMonthClick != null) __obj.updateDynamic("onPrevMonthClick")(js.Any.fromFunction1(onPrevMonthClick))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (phrases != null) __obj.updateDynamic("phrases")(phrases.asInstanceOf[js.Any])
    if (renderCalendarDay != null) __obj.updateDynamic("renderCalendarDay")(js.Any.fromFunction1(renderCalendarDay))
    if (renderCalendarInfo != null) __obj.updateDynamic("renderCalendarInfo")(js.Any.fromFunction0(renderCalendarInfo))
    if (renderDayContents != null) __obj.updateDynamic("renderDayContents")(js.Any.fromFunction1(renderDayContents))
    if (renderMonthElement != null) __obj.updateDynamic("renderMonthElement")(js.Any.fromFunction1(renderMonthElement))
    if (renderMonthText != null) __obj.updateDynamic("renderMonthText")(js.Any.fromFunction1(renderMonthText))
    if (!js.isUndefined(showKeyboardShortcuts)) __obj.updateDynamic("showKeyboardShortcuts")(showKeyboardShortcuts.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (verticalHeight != null) __obj.updateDynamic("verticalHeight")(verticalHeight.asInstanceOf[js.Any])
    if (weekDayFormat != null) __obj.updateDynamic("weekDayFormat")(weekDayFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(withPortal)) __obj.updateDynamic("withPortal")(withPortal.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DayPickerSingleDateControllerShape
}

