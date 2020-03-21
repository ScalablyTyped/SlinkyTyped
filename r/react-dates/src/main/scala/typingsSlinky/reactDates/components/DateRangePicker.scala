package typingsSlinky.reactDates.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactDates.AnonEndDate
import typingsSlinky.reactDates.AnonIsVisible
import typingsSlinky.reactDates.AnonStartDate
import typingsSlinky.reactDates.mod.AnchorDirectionShape
import typingsSlinky.reactDates.mod.CalendarInfoPositionShape
import typingsSlinky.reactDates.mod.DateRangePickerCls
import typingsSlinky.reactDates.mod.DateRangePickerPhrases
import typingsSlinky.reactDates.mod.DateRangePickerShape
import typingsSlinky.reactDates.mod.DayOfWeekShape
import typingsSlinky.reactDates.mod.DisabledShape
import typingsSlinky.reactDates.mod.FocusedInputShape
import typingsSlinky.reactDates.mod.IconPositionShape
import typingsSlinky.reactDates.mod.OpenDirectionShape
import typingsSlinky.reactDates.mod.OrientationShape
import typingsSlinky.reactDates.mod.momentPropTypes.momentObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateRangePicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, DateRangePickerCls] {
  @JSImport("react-dates", "DateRangePicker")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: readOnly, required */
  def apply(
    endDateId: String,
    onDatesChange: AnonEndDate => Unit,
    onFocusChange: js.UndefOr[FocusedInputShape] => Unit,
    startDateId: String,
    anchorDirection: AnchorDirectionShape = null,
    appendToBody: js.UndefOr[Boolean] = js.undefined,
    block: js.UndefOr[Boolean] = js.undefined,
    calendarInfoPosition: CalendarInfoPositionShape = null,
    customArrowIcon: String | ReactElement = null,
    customCloseIcon: String | ReactElement = null,
    customInputIcon: String | ReactElement = null,
    dayAriaLabelFormat: String = null,
    daySize: Int | Double = null,
    disableScroll: js.UndefOr[Boolean] = js.undefined,
    disabled: DisabledShape = null,
    displayFormat: String | js.Function0[String] = null,
    enableOutsideDays: js.UndefOr[Boolean] = js.undefined,
    endDate: momentObj = null,
    endDatePlaceholderText: String = null,
    firstDayOfWeek: DayOfWeekShape = null,
    focusedInput: FocusedInputShape = null,
    hideKeyboardShortcutsPanel: js.UndefOr[Boolean] = js.undefined,
    horizontalMargin: Int | Double = null,
    horizontalMonthPadding: Int | Double = null,
    initialVisibleMonth: () => momentObj = null,
    inputIconPosition: IconPositionShape = null,
    isDayBlocked: /* day */ js.Any => Boolean = null,
    isDayHighlighted: /* day */ js.Any => Boolean = null,
    isOutsideRange: /* day */ js.Any => Boolean = null,
    isRTL: js.UndefOr[Boolean] = js.undefined,
    keepFocusOnInput: js.UndefOr[Boolean] = js.undefined,
    keepOpenOnDateSelect: js.UndefOr[Boolean] = js.undefined,
    maxDate: momentObj = null,
    minDate: momentObj = null,
    minimumNights: Int | Double = null,
    monthFormat: String = null,
    navNext: String | ReactElement = null,
    navPrev: String | ReactElement = null,
    noBorder: js.UndefOr[Boolean] = js.undefined,
    numberOfMonths: Int | Double = null,
    onClose: /* final */ AnonStartDate => Unit = null,
    onNextMonthClick: /* newCurrentMonth */ momentObj => Unit = null,
    onPrevMonthClick: /* newCurrentMonth */ momentObj => Unit = null,
    openDirection: OpenDirectionShape = null,
    orientation: OrientationShape = null,
    phrases: DateRangePickerPhrases = null,
    regular: js.UndefOr[Boolean] = js.undefined,
    renderCalendarDay: /* day */ momentObj => String | ReactElement = null,
    renderCalendarInfo: () => String | ReactElement = null,
    renderDayContents: /* day */ momentObj => String | ReactElement = null,
    renderMonthElement: /* props */ AnonIsVisible => String | ReactElement = null,
    renderMonthText: /* day */ momentObj => String | ReactElement = null,
    reopenPickerOnClearDates: js.UndefOr[Boolean] = js.undefined,
    screenReaderInputMessage: String = null,
    showClearDates: js.UndefOr[Boolean] = js.undefined,
    showDefaultInputIcon: js.UndefOr[Boolean] = js.undefined,
    small: js.UndefOr[Boolean] = js.undefined,
    startDate: momentObj = null,
    startDatePlaceholderText: String = null,
    transitionDuration: Int | Double = null,
    verticalHeight: Int | Double = null,
    verticalSpacing: Int | Double = null,
    weekDayFormat: String = null,
    withFullScreenPortal: js.UndefOr[Boolean] = js.undefined,
    withPortal: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, DateRangePickerCls] = {
    val __obj = js.Dynamic.literal(endDateId = endDateId.asInstanceOf[js.Any], onDatesChange = js.Any.fromFunction1(onDatesChange), onFocusChange = js.Any.fromFunction1(onFocusChange), startDateId = startDateId.asInstanceOf[js.Any])
    if (anchorDirection != null) __obj.updateDynamic("anchorDirection")(anchorDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(appendToBody)) __obj.updateDynamic("appendToBody")(appendToBody.asInstanceOf[js.Any])
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (calendarInfoPosition != null) __obj.updateDynamic("calendarInfoPosition")(calendarInfoPosition.asInstanceOf[js.Any])
    if (customArrowIcon != null) __obj.updateDynamic("customArrowIcon")(customArrowIcon.asInstanceOf[js.Any])
    if (customCloseIcon != null) __obj.updateDynamic("customCloseIcon")(customCloseIcon.asInstanceOf[js.Any])
    if (customInputIcon != null) __obj.updateDynamic("customInputIcon")(customInputIcon.asInstanceOf[js.Any])
    if (dayAriaLabelFormat != null) __obj.updateDynamic("dayAriaLabelFormat")(dayAriaLabelFormat.asInstanceOf[js.Any])
    if (daySize != null) __obj.updateDynamic("daySize")(daySize.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScroll)) __obj.updateDynamic("disableScroll")(disableScroll.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (displayFormat != null) __obj.updateDynamic("displayFormat")(displayFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(enableOutsideDays)) __obj.updateDynamic("enableOutsideDays")(enableOutsideDays.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (endDatePlaceholderText != null) __obj.updateDynamic("endDatePlaceholderText")(endDatePlaceholderText.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (focusedInput != null) __obj.updateDynamic("focusedInput")(focusedInput.asInstanceOf[js.Any])
    if (!js.isUndefined(hideKeyboardShortcutsPanel)) __obj.updateDynamic("hideKeyboardShortcutsPanel")(hideKeyboardShortcutsPanel.asInstanceOf[js.Any])
    if (horizontalMargin != null) __obj.updateDynamic("horizontalMargin")(horizontalMargin.asInstanceOf[js.Any])
    if (horizontalMonthPadding != null) __obj.updateDynamic("horizontalMonthPadding")(horizontalMonthPadding.asInstanceOf[js.Any])
    if (initialVisibleMonth != null) __obj.updateDynamic("initialVisibleMonth")(js.Any.fromFunction0(initialVisibleMonth))
    if (inputIconPosition != null) __obj.updateDynamic("inputIconPosition")(inputIconPosition.asInstanceOf[js.Any])
    if (isDayBlocked != null) __obj.updateDynamic("isDayBlocked")(js.Any.fromFunction1(isDayBlocked))
    if (isDayHighlighted != null) __obj.updateDynamic("isDayHighlighted")(js.Any.fromFunction1(isDayHighlighted))
    if (isOutsideRange != null) __obj.updateDynamic("isOutsideRange")(js.Any.fromFunction1(isOutsideRange))
    if (!js.isUndefined(isRTL)) __obj.updateDynamic("isRTL")(isRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(keepFocusOnInput)) __obj.updateDynamic("keepFocusOnInput")(keepFocusOnInput.asInstanceOf[js.Any])
    if (!js.isUndefined(keepOpenOnDateSelect)) __obj.updateDynamic("keepOpenOnDateSelect")(keepOpenOnDateSelect.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minimumNights != null) __obj.updateDynamic("minimumNights")(minimumNights.asInstanceOf[js.Any])
    if (monthFormat != null) __obj.updateDynamic("monthFormat")(monthFormat.asInstanceOf[js.Any])
    if (navNext != null) __obj.updateDynamic("navNext")(navNext.asInstanceOf[js.Any])
    if (navPrev != null) __obj.updateDynamic("navPrev")(navPrev.asInstanceOf[js.Any])
    if (!js.isUndefined(noBorder)) __obj.updateDynamic("noBorder")(noBorder.asInstanceOf[js.Any])
    if (numberOfMonths != null) __obj.updateDynamic("numberOfMonths")(numberOfMonths.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onNextMonthClick != null) __obj.updateDynamic("onNextMonthClick")(js.Any.fromFunction1(onNextMonthClick))
    if (onPrevMonthClick != null) __obj.updateDynamic("onPrevMonthClick")(js.Any.fromFunction1(onPrevMonthClick))
    if (openDirection != null) __obj.updateDynamic("openDirection")(openDirection.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (phrases != null) __obj.updateDynamic("phrases")(phrases.asInstanceOf[js.Any])
    if (!js.isUndefined(regular)) __obj.updateDynamic("regular")(regular.asInstanceOf[js.Any])
    if (renderCalendarDay != null) __obj.updateDynamic("renderCalendarDay")(js.Any.fromFunction1(renderCalendarDay))
    if (renderCalendarInfo != null) __obj.updateDynamic("renderCalendarInfo")(js.Any.fromFunction0(renderCalendarInfo))
    if (renderDayContents != null) __obj.updateDynamic("renderDayContents")(js.Any.fromFunction1(renderDayContents))
    if (renderMonthElement != null) __obj.updateDynamic("renderMonthElement")(js.Any.fromFunction1(renderMonthElement))
    if (renderMonthText != null) __obj.updateDynamic("renderMonthText")(js.Any.fromFunction1(renderMonthText))
    if (!js.isUndefined(reopenPickerOnClearDates)) __obj.updateDynamic("reopenPickerOnClearDates")(reopenPickerOnClearDates.asInstanceOf[js.Any])
    if (screenReaderInputMessage != null) __obj.updateDynamic("screenReaderInputMessage")(screenReaderInputMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(showClearDates)) __obj.updateDynamic("showClearDates")(showClearDates.asInstanceOf[js.Any])
    if (!js.isUndefined(showDefaultInputIcon)) __obj.updateDynamic("showDefaultInputIcon")(showDefaultInputIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (startDatePlaceholderText != null) __obj.updateDynamic("startDatePlaceholderText")(startDatePlaceholderText.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (verticalHeight != null) __obj.updateDynamic("verticalHeight")(verticalHeight.asInstanceOf[js.Any])
    if (verticalSpacing != null) __obj.updateDynamic("verticalSpacing")(verticalSpacing.asInstanceOf[js.Any])
    if (weekDayFormat != null) __obj.updateDynamic("weekDayFormat")(weekDayFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(withFullScreenPortal)) __obj.updateDynamic("withFullScreenPortal")(withFullScreenPortal.asInstanceOf[js.Any])
    if (!js.isUndefined(withPortal)) __obj.updateDynamic("withPortal")(withPortal.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DateRangePickerShape
}

