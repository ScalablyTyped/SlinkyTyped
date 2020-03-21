package typingsSlinky.reactDates.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactDates.AnonDate
import typingsSlinky.reactDates.AnonFocused
import typingsSlinky.reactDates.AnonIsVisible
import typingsSlinky.reactDates.mod.AnchorDirectionShape
import typingsSlinky.reactDates.mod.CalendarInfoPositionShape
import typingsSlinky.reactDates.mod.DayOfWeekShape
import typingsSlinky.reactDates.mod.IconPositionShape
import typingsSlinky.reactDates.mod.OpenDirectionShape
import typingsSlinky.reactDates.mod.OrientationShape
import typingsSlinky.reactDates.mod.SingleDatePickerCls
import typingsSlinky.reactDates.mod.SingleDatePickerPhrases
import typingsSlinky.reactDates.mod.SingleDatePickerShape
import typingsSlinky.reactDates.mod.momentPropTypes.momentObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SingleDatePicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, SingleDatePickerCls] {
  @JSImport("react-dates", "SingleDatePicker")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, placeholder, readOnly, required */
  def apply(
    id: String,
    onDateChange: js.UndefOr[momentObj] => Unit,
    onFocusChange: AnonFocused => Unit,
    anchorDirection: AnchorDirectionShape = null,
    appendToBody: js.UndefOr[Boolean] = js.undefined,
    block: js.UndefOr[Boolean] = js.undefined,
    calendarInfoPosition: CalendarInfoPositionShape = null,
    customCloseIcon: String | ReactElement = null,
    customInputIcon: String | ReactElement = null,
    date: momentObj = null,
    dayAriaLabelFormat: String = null,
    daySize: Int | Double = null,
    disableScroll: js.UndefOr[Boolean] = js.undefined,
    displayFormat: String | js.Function0[String] = null,
    enableOutsideDays: js.UndefOr[Boolean] = js.undefined,
    firstDayOfWeek: DayOfWeekShape = null,
    focused: js.UndefOr[Boolean] = js.undefined,
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
    monthFormat: String = null,
    navNext: String | ReactElement = null,
    navPrev: String | ReactElement = null,
    noBorder: js.UndefOr[Boolean] = js.undefined,
    numberOfMonths: Int | Double = null,
    onClose: /* final */ AnonDate => Unit = null,
    onNextMonthClick: /* newCurrentMonth */ momentObj => Unit = null,
    onPrevMonthClick: /* newCurrentMonth */ momentObj => Unit = null,
    openDirection: OpenDirectionShape = null,
    orientation: OrientationShape = null,
    phrases: SingleDatePickerPhrases = null,
    regular: js.UndefOr[Boolean] = js.undefined,
    renderCalendarDay: /* day */ momentObj => String | ReactElement = null,
    renderCalendarInfo: () => String | ReactElement = null,
    renderDayContents: /* day */ momentObj => String | ReactElement = null,
    renderMonthElement: /* props */ AnonIsVisible => String | ReactElement = null,
    renderMonthText: /* day */ momentObj => String | ReactElement = null,
    reopenPickerOnClearDates: js.UndefOr[Boolean] = js.undefined,
    screenReaderInputMessage: String = null,
    showClearDate: js.UndefOr[Boolean] = js.undefined,
    showDefaultInputIcon: js.UndefOr[Boolean] = js.undefined,
    small: js.UndefOr[Boolean] = js.undefined,
    transitionDuration: Int | Double = null,
    verticalHeight: Int | Double = null,
    verticalSpacing: Int | Double = null,
    weekDayFormat: String = null,
    withFullScreenPortal: js.UndefOr[Boolean] = js.undefined,
    withPortal: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, SingleDatePickerCls] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onDateChange = js.Any.fromFunction1(onDateChange), onFocusChange = js.Any.fromFunction1(onFocusChange))
    if (anchorDirection != null) __obj.updateDynamic("anchorDirection")(anchorDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(appendToBody)) __obj.updateDynamic("appendToBody")(appendToBody.asInstanceOf[js.Any])
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (calendarInfoPosition != null) __obj.updateDynamic("calendarInfoPosition")(calendarInfoPosition.asInstanceOf[js.Any])
    if (customCloseIcon != null) __obj.updateDynamic("customCloseIcon")(customCloseIcon.asInstanceOf[js.Any])
    if (customInputIcon != null) __obj.updateDynamic("customInputIcon")(customInputIcon.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (dayAriaLabelFormat != null) __obj.updateDynamic("dayAriaLabelFormat")(dayAriaLabelFormat.asInstanceOf[js.Any])
    if (daySize != null) __obj.updateDynamic("daySize")(daySize.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScroll)) __obj.updateDynamic("disableScroll")(disableScroll.asInstanceOf[js.Any])
    if (displayFormat != null) __obj.updateDynamic("displayFormat")(displayFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(enableOutsideDays)) __obj.updateDynamic("enableOutsideDays")(enableOutsideDays.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
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
    if (!js.isUndefined(showClearDate)) __obj.updateDynamic("showClearDate")(showClearDate.asInstanceOf[js.Any])
    if (!js.isUndefined(showDefaultInputIcon)) __obj.updateDynamic("showDefaultInputIcon")(showDefaultInputIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (verticalHeight != null) __obj.updateDynamic("verticalHeight")(verticalHeight.asInstanceOf[js.Any])
    if (verticalSpacing != null) __obj.updateDynamic("verticalSpacing")(verticalSpacing.asInstanceOf[js.Any])
    if (weekDayFormat != null) __obj.updateDynamic("weekDayFormat")(weekDayFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(withFullScreenPortal)) __obj.updateDynamic("withFullScreenPortal")(withFullScreenPortal.asInstanceOf[js.Any])
    if (!js.isUndefined(withPortal)) __obj.updateDynamic("withPortal")(withPortal.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SingleDatePickerShape
}

