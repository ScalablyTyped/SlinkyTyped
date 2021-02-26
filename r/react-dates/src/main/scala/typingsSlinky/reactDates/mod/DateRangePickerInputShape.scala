package typingsSlinky.reactDates.mod

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateRangePickerInputShape extends StObject {
  
  var block: js.UndefOr[Boolean] = js.native
  
  var customArrowIcon: js.UndefOr[ReactElement] = js.native
  
  var customCloseIcon: js.UndefOr[ReactElement] = js.native
  
  var customInputIcon: js.UndefOr[ReactElement] = js.native
  
  var disabled: js.UndefOr[DisabledShape] = js.native
  
  var endDate: js.UndefOr[String] = js.native
  
  var endDateAriaLabel: js.UndefOr[String] = js.native
  
  var endDateId: js.UndefOr[String] = js.native
  
  var endDatePlaceholderText: js.UndefOr[String] = js.native
  
  var inputIconPosition: js.UndefOr[IconPositionShape] = js.native
  
  var isEndDateFocused: js.UndefOr[Boolean] = js.native
  
  // accessibility
  var isFocused: js.UndefOr[Boolean] = js.native
  
  var isRTL: js.UndefOr[Boolean] = js.native
  
  var isStartDateFocused: js.UndefOr[Boolean] = js.native
  
  var noBorder: js.UndefOr[Boolean] = js.native
  
  var onClearDates: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  
  var onEndDateChange: js.UndefOr[js.Function1[/* dateString */ String, Unit]] = js.native
  
  var onEndDateFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  
  var onEndDateTab: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  
  var onKeyDownArrowDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  
  var onKeyDownQuestionMark: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  
  var onStartDateChange: js.UndefOr[js.Function1[/* dateString */ String, Unit]] = js.native
  
  var onStartDateFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  
  var onStartDateShiftTab: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  
  var openDirection: js.UndefOr[OpenDirectionShape] = js.native
  
  // describes actual DOM focus
  // i18n
  var phrases: js.UndefOr[DateRangePickerInputPhrases] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var regular: js.UndefOr[Boolean] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var screenReaderMessage: js.UndefOr[String] = js.native
  
  var showCaret: js.UndefOr[Boolean] = js.native
  
  var showClearDates: js.UndefOr[Boolean] = js.native
  
  var showDefaultInputIcon: js.UndefOr[Boolean] = js.native
  
  var small: js.UndefOr[Boolean] = js.native
  
  var startDate: js.UndefOr[String] = js.native
  
  var startDateAriaLabel: js.UndefOr[String] = js.native
  
  var startDateId: js.UndefOr[String] = js.native
  
  var startDatePlaceholderText: js.UndefOr[String] = js.native
  
  var verticalSpacing: js.UndefOr[Double] = js.native
}
object DateRangePickerInputShape {
  
  @scala.inline
  def apply(): DateRangePickerInputShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRangePickerInputShape]
  }
  
  @scala.inline
  implicit class DateRangePickerInputShapeMutableBuilder[Self <: DateRangePickerInputShape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
    
    @scala.inline
    def setCustomArrowIcon(value: ReactElement): Self = StObject.set(x, "customArrowIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomArrowIconReactElement(value: ReactElement): Self = StObject.set(x, "customArrowIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomArrowIconUndefined: Self = StObject.set(x, "customArrowIcon", js.undefined)
    
    @scala.inline
    def setCustomCloseIcon(value: ReactElement): Self = StObject.set(x, "customCloseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomCloseIconReactElement(value: ReactElement): Self = StObject.set(x, "customCloseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomCloseIconUndefined: Self = StObject.set(x, "customCloseIcon", js.undefined)
    
    @scala.inline
    def setCustomInputIcon(value: ReactElement): Self = StObject.set(x, "customInputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomInputIconReactElement(value: ReactElement): Self = StObject.set(x, "customInputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomInputIconUndefined: Self = StObject.set(x, "customInputIcon", js.undefined)
    
    @scala.inline
    def setDisabled(value: DisabledShape): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateAriaLabel(value: String): Self = StObject.set(x, "endDateAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateAriaLabelUndefined: Self = StObject.set(x, "endDateAriaLabel", js.undefined)
    
    @scala.inline
    def setEndDateId(value: String): Self = StObject.set(x, "endDateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateIdUndefined: Self = StObject.set(x, "endDateId", js.undefined)
    
    @scala.inline
    def setEndDatePlaceholderText(value: String): Self = StObject.set(x, "endDatePlaceholderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDatePlaceholderTextUndefined: Self = StObject.set(x, "endDatePlaceholderText", js.undefined)
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setInputIconPosition(value: IconPositionShape): Self = StObject.set(x, "inputIconPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputIconPositionUndefined: Self = StObject.set(x, "inputIconPosition", js.undefined)
    
    @scala.inline
    def setIsEndDateFocused(value: Boolean): Self = StObject.set(x, "isEndDateFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEndDateFocusedUndefined: Self = StObject.set(x, "isEndDateFocused", js.undefined)
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
    
    @scala.inline
    def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
    
    @scala.inline
    def setIsStartDateFocused(value: Boolean): Self = StObject.set(x, "isStartDateFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStartDateFocusedUndefined: Self = StObject.set(x, "isStartDateFocused", js.undefined)
    
    @scala.inline
    def setNoBorder(value: Boolean): Self = StObject.set(x, "noBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoBorderUndefined: Self = StObject.set(x, "noBorder", js.undefined)
    
    @scala.inline
    def setOnClearDates(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onClearDates", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClearDatesUndefined: Self = StObject.set(x, "onClearDates", js.undefined)
    
    @scala.inline
    def setOnEndDateChange(value: /* dateString */ String => Unit): Self = StObject.set(x, "onEndDateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEndDateChangeUndefined: Self = StObject.set(x, "onEndDateChange", js.undefined)
    
    @scala.inline
    def setOnEndDateFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onEndDateFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEndDateFocusUndefined: Self = StObject.set(x, "onEndDateFocus", js.undefined)
    
    @scala.inline
    def setOnEndDateTab(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onEndDateTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEndDateTabUndefined: Self = StObject.set(x, "onEndDateTab", js.undefined)
    
    @scala.inline
    def setOnKeyDownArrowDown(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDownArrowDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDownArrowDownUndefined: Self = StObject.set(x, "onKeyDownArrowDown", js.undefined)
    
    @scala.inline
    def setOnKeyDownQuestionMark(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDownQuestionMark", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDownQuestionMarkUndefined: Self = StObject.set(x, "onKeyDownQuestionMark", js.undefined)
    
    @scala.inline
    def setOnStartDateChange(value: /* dateString */ String => Unit): Self = StObject.set(x, "onStartDateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStartDateChangeUndefined: Self = StObject.set(x, "onStartDateChange", js.undefined)
    
    @scala.inline
    def setOnStartDateFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onStartDateFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStartDateFocusUndefined: Self = StObject.set(x, "onStartDateFocus", js.undefined)
    
    @scala.inline
    def setOnStartDateShiftTab(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onStartDateShiftTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStartDateShiftTabUndefined: Self = StObject.set(x, "onStartDateShiftTab", js.undefined)
    
    @scala.inline
    def setOpenDirection(value: OpenDirectionShape): Self = StObject.set(x, "openDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenDirectionUndefined: Self = StObject.set(x, "openDirection", js.undefined)
    
    @scala.inline
    def setPhrases(value: DateRangePickerInputPhrases): Self = StObject.set(x, "phrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhrasesUndefined: Self = StObject.set(x, "phrases", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setRegular(value: Boolean): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegularUndefined: Self = StObject.set(x, "regular", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setScreenReaderMessage(value: String): Self = StObject.set(x, "screenReaderMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenReaderMessageUndefined: Self = StObject.set(x, "screenReaderMessage", js.undefined)
    
    @scala.inline
    def setShowCaret(value: Boolean): Self = StObject.set(x, "showCaret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCaretUndefined: Self = StObject.set(x, "showCaret", js.undefined)
    
    @scala.inline
    def setShowClearDates(value: Boolean): Self = StObject.set(x, "showClearDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowClearDatesUndefined: Self = StObject.set(x, "showClearDates", js.undefined)
    
    @scala.inline
    def setShowDefaultInputIcon(value: Boolean): Self = StObject.set(x, "showDefaultInputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDefaultInputIconUndefined: Self = StObject.set(x, "showDefaultInputIcon", js.undefined)
    
    @scala.inline
    def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateAriaLabel(value: String): Self = StObject.set(x, "startDateAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateAriaLabelUndefined: Self = StObject.set(x, "startDateAriaLabel", js.undefined)
    
    @scala.inline
    def setStartDateId(value: String): Self = StObject.set(x, "startDateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateIdUndefined: Self = StObject.set(x, "startDateId", js.undefined)
    
    @scala.inline
    def setStartDatePlaceholderText(value: String): Self = StObject.set(x, "startDatePlaceholderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDatePlaceholderTextUndefined: Self = StObject.set(x, "startDatePlaceholderText", js.undefined)
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setVerticalSpacing(value: Double): Self = StObject.set(x, "verticalSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalSpacingUndefined: Self = StObject.set(x, "verticalSpacing", js.undefined)
  }
}
