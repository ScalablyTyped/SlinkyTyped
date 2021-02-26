package typingsSlinky.reactDates.components

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactDates.mod.IconPositionShape
import typingsSlinky.reactDates.mod.OpenDirectionShape
import typingsSlinky.reactDates.mod.SingleDatePickerInputPhrases
import typingsSlinky.reactDates.mod.SingleDatePickerInputShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SingleDatePickerInput {
  
  @scala.inline
  def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SingleDatePickerInputShape]))
  }
  
  @JSImport("react-dates", "SingleDatePickerInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def block(value: Boolean): this.type = set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customCloseIcon(value: ReactElement): this.type = set("customCloseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customCloseIconReactElement(value: ReactElement): this.type = set("customCloseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customInputIcon(value: ReactElement): this.type = set("customInputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customInputIconReactElement(value: ReactElement): this.type = set("customInputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def displayValue(value: String): this.type = set("displayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focused(value: Boolean): this.type = set("focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputIconPosition(value: IconPositionShape): this.type = set("inputIconPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isFocused(value: Boolean): this.type = set("isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isRTL(value: Boolean): this.type = set("isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def noBorder(value: Boolean): this.type = set("noBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* dateString */ String => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClearDate(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onClearDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDownArrowDown(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): this.type = set("onKeyDownArrowDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDownQuestionMark(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): this.type = set("onKeyDownQuestionMark", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDownShiftTab(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): this.type = set("onKeyDownShiftTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDownTab(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): this.type = set("onKeyDownTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def openDirection(value: OpenDirectionShape): this.type = set("openDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def phrases(value: SingleDatePickerInputPhrases): this.type = set("phrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def regular(value: Boolean): this.type = set("regular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def screenReaderMessage(value: String): this.type = set("screenReaderMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showCaret(value: Boolean): this.type = set("showCaret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showClearDate(value: Boolean): this.type = set("showClearDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showDefaultInputIcon(value: Boolean): this.type = set("showDefaultInputIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def small(value: Boolean): this.type = set("small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def verticalSpacing(value: Double): this.type = set("verticalSpacing", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SingleDatePickerInputShape): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
