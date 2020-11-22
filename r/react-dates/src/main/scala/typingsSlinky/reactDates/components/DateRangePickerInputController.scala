package typingsSlinky.reactDates.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.moment.mod.Moment
import typingsSlinky.reactDates.anon.EndDate
import typingsSlinky.reactDates.mod.DateRangePickerInputControllerShape
import typingsSlinky.reactDates.mod.DateRangePickerInputPhrases
import typingsSlinky.reactDates.mod.DisabledShape
import typingsSlinky.reactDates.mod.FocusedInputShape
import typingsSlinky.reactDates.mod.IconPositionShape
import typingsSlinky.reactDates.mod.OpenDirectionShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DateRangePickerInputController {
  
  @JSImport("react-dates", "DateRangePickerInputController")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def block(value: Boolean): this.type = set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customArrowIconReactElement(value: ReactElement): this.type = set("customArrowIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customArrowIcon(value: ReactElement): this.type = set("customArrowIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customCloseIconReactElement(value: ReactElement): this.type = set("customCloseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customCloseIcon(value: ReactElement): this.type = set("customCloseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customInputIconReactElement(value: ReactElement): this.type = set("customInputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customInputIcon(value: ReactElement): this.type = set("customInputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: DisabledShape): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def displayFormatFunction0(value: () => String): this.type = set("displayFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def displayFormat(value: String | js.Function0[String]): this.type = set("displayFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def endDate(value: Moment): this.type = set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def endDateNull: this.type = set("endDate", null)
    
    @scala.inline
    def endDateAriaLabel(value: String): this.type = set("endDateAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def endDateId(value: String): this.type = set("endDateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def endDatePlaceholderText(value: String): this.type = set("endDatePlaceholderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputIconPosition(value: IconPositionShape): this.type = set("inputIconPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isEndDateFocused(value: Boolean): this.type = set("isEndDateFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isFocused(value: Boolean): this.type = set("isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isOutsideRange(value: /* day */ Moment => Boolean): this.type = set("isOutsideRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def isRTL(value: Boolean): this.type = set("isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isStartDateFocused(value: Boolean): this.type = set("isStartDateFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keepOpenOnDateSelect(value: Boolean): this.type = set("keepOpenOnDateSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minimumNights(value: Double): this.type = set("minimumNights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def noBorder(value: Boolean): this.type = set("noBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClose(value: /* final */ EndDate => Unit): this.type = set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDatesChange(value: /* arg */ EndDate => Unit): this.type = set("onDatesChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocusChange(value: /* arg */ FocusedInputShape | Null => Unit): this.type = set("onFocusChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDownArrowDown(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): this.type = set("onKeyDownArrowDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDownQuestionMark(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): this.type = set("onKeyDownQuestionMark", js.Any.fromFunction1(value))
    
    @scala.inline
    def openDirection(value: OpenDirectionShape): this.type = set("openDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def phrases(value: DateRangePickerInputPhrases): this.type = set("phrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def regular(value: Boolean): this.type = set("regular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def reopenPickerOnClearDates(value: Boolean): this.type = set("reopenPickerOnClearDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def screenReaderMessage(value: String): this.type = set("screenReaderMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showCaret(value: Boolean): this.type = set("showCaret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showClearDates(value: Boolean): this.type = set("showClearDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showDefaultInputIcon(value: Boolean): this.type = set("showDefaultInputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def small(value: Boolean): this.type = set("small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def startDate(value: Moment): this.type = set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def startDateNull: this.type = set("startDate", null)
    
    @scala.inline
    def startDateAriaLabel(value: String): this.type = set("startDateAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def startDateId(value: String): this.type = set("startDateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def startDatePlaceholderText(value: String): this.type = set("startDatePlaceholderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def verticalSpacing(value: Double): this.type = set("verticalSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def withFullScreenPortal(value: Boolean): this.type = set("withFullScreenPortal", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DateRangePickerInputControllerShape): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: DateRangePickerInputController.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
