package typingsSlinky.baseui.checkboxMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.FormEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatefulContainerProps extends js.Object {
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var initialState: js.UndefOr[CheckboxState] = js.native
  
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  
  var onChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var overrides: js.UndefOr[CheckboxOverrides] = js.native
  
  var stateReducer: js.UndefOr[StateReducer] = js.native
}
object StatefulContainerProps {
  
  @scala.inline
  def apply(): StatefulContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulContainerProps]
  }
  
  @scala.inline
  implicit class StatefulContainerPropsOps[Self <: StatefulContainerProps] (val x: Self) extends AnyVal {
    
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
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setInitialState(value: CheckboxState): Self = this.set("initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    
    @scala.inline
    def setOnBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: SyntheticMouseEvent[HTMLInputElement] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: SyntheticMouseEvent[HTMLInputElement] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setOverrides(value: CheckboxOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setStateReducer(
      value: (/* stateType */ String, /* nextState */ CheckboxState, /* currentState */ CheckboxState, /* event */ SyntheticEvent[Event, HTMLInputElement]) => CheckboxState
    ): Self = this.set("stateReducer", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteStateReducer: Self = this.set("stateReducer", js.undefined)
  }
}
