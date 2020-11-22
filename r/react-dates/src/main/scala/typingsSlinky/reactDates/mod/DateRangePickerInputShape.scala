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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateRangePickerInputShape extends js.Object {
  
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
  implicit class DateRangePickerInputShapeOps[Self <: DateRangePickerInputShape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlock(value: Boolean): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    
    @scala.inline
    def setCustomArrowIconReactElement(value: ReactElement): Self = this.set("customArrowIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomArrowIcon(value: ReactElement): Self = this.set("customArrowIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomArrowIcon: Self = this.set("customArrowIcon", js.undefined)
    
    @scala.inline
    def setCustomCloseIconReactElement(value: ReactElement): Self = this.set("customCloseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomCloseIcon(value: ReactElement): Self = this.set("customCloseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomCloseIcon: Self = this.set("customCloseIcon", js.undefined)
    
    @scala.inline
    def setCustomInputIconReactElement(value: ReactElement): Self = this.set("customInputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomInputIcon(value: ReactElement): Self = this.set("customInputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomInputIcon: Self = this.set("customInputIcon", js.undefined)
    
    @scala.inline
    def setDisabled(value: DisabledShape): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
    @scala.inline
    def setEndDateAriaLabel(value: String): Self = this.set("endDateAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDateAriaLabel: Self = this.set("endDateAriaLabel", js.undefined)
    
    @scala.inline
    def setEndDateId(value: String): Self = this.set("endDateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDateId: Self = this.set("endDateId", js.undefined)
    
    @scala.inline
    def setEndDatePlaceholderText(value: String): Self = this.set("endDatePlaceholderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDatePlaceholderText: Self = this.set("endDatePlaceholderText", js.undefined)
    
    @scala.inline
    def setInputIconPosition(value: IconPositionShape): Self = this.set("inputIconPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputIconPosition: Self = this.set("inputIconPosition", js.undefined)
    
    @scala.inline
    def setIsEndDateFocused(value: Boolean): Self = this.set("isEndDateFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEndDateFocused: Self = this.set("isEndDateFocused", js.undefined)
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFocused: Self = this.set("isFocused", js.undefined)
    
    @scala.inline
    def setIsRTL(value: Boolean): Self = this.set("isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRTL: Self = this.set("isRTL", js.undefined)
    
    @scala.inline
    def setIsStartDateFocused(value: Boolean): Self = this.set("isStartDateFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsStartDateFocused: Self = this.set("isStartDateFocused", js.undefined)
    
    @scala.inline
    def setNoBorder(value: Boolean): Self = this.set("noBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoBorder: Self = this.set("noBorder", js.undefined)
    
    @scala.inline
    def setOnClearDates(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = this.set("onClearDates", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClearDates: Self = this.set("onClearDates", js.undefined)
    
    @scala.inline
    def setOnEndDateChange(value: /* dateString */ String => Unit): Self = this.set("onEndDateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEndDateChange: Self = this.set("onEndDateChange", js.undefined)
    
    @scala.inline
    def setOnEndDateFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = this.set("onEndDateFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEndDateFocus: Self = this.set("onEndDateFocus", js.undefined)
    
    @scala.inline
    def setOnEndDateTab(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): Self = this.set("onEndDateTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEndDateTab: Self = this.set("onEndDateTab", js.undefined)
    
    @scala.inline
    def setOnKeyDownArrowDown(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): Self = this.set("onKeyDownArrowDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDownArrowDown: Self = this.set("onKeyDownArrowDown", js.undefined)
    
    @scala.inline
    def setOnKeyDownQuestionMark(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): Self = this.set("onKeyDownQuestionMark", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDownQuestionMark: Self = this.set("onKeyDownQuestionMark", js.undefined)
    
    @scala.inline
    def setOnStartDateChange(value: /* dateString */ String => Unit): Self = this.set("onStartDateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStartDateChange: Self = this.set("onStartDateChange", js.undefined)
    
    @scala.inline
    def setOnStartDateFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = this.set("onStartDateFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStartDateFocus: Self = this.set("onStartDateFocus", js.undefined)
    
    @scala.inline
    def setOnStartDateShiftTab(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): Self = this.set("onStartDateShiftTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStartDateShiftTab: Self = this.set("onStartDateShiftTab", js.undefined)
    
    @scala.inline
    def setOpenDirection(value: OpenDirectionShape): Self = this.set("openDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenDirection: Self = this.set("openDirection", js.undefined)
    
    @scala.inline
    def setPhrases(value: DateRangePickerInputPhrases): Self = this.set("phrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhrases: Self = this.set("phrases", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setRegular(value: Boolean): Self = this.set("regular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegular: Self = this.set("regular", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setScreenReaderMessage(value: String): Self = this.set("screenReaderMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenReaderMessage: Self = this.set("screenReaderMessage", js.undefined)
    
    @scala.inline
    def setShowCaret(value: Boolean): Self = this.set("showCaret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCaret: Self = this.set("showCaret", js.undefined)
    
    @scala.inline
    def setShowClearDates(value: Boolean): Self = this.set("showClearDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowClearDates: Self = this.set("showClearDates", js.undefined)
    
    @scala.inline
    def setShowDefaultInputIcon(value: Boolean): Self = this.set("showDefaultInputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDefaultInputIcon: Self = this.set("showDefaultInputIcon", js.undefined)
    
    @scala.inline
    def setSmall(value: Boolean): Self = this.set("small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    
    @scala.inline
    def setStartDateAriaLabel(value: String): Self = this.set("startDateAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDateAriaLabel: Self = this.set("startDateAriaLabel", js.undefined)
    
    @scala.inline
    def setStartDateId(value: String): Self = this.set("startDateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDateId: Self = this.set("startDateId", js.undefined)
    
    @scala.inline
    def setStartDatePlaceholderText(value: String): Self = this.set("startDatePlaceholderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDatePlaceholderText: Self = this.set("startDatePlaceholderText", js.undefined)
    
    @scala.inline
    def setVerticalSpacing(value: Double): Self = this.set("verticalSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalSpacing: Self = this.set("verticalSpacing", js.undefined)
  }
}
