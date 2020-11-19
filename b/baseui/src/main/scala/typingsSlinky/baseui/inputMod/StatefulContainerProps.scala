package typingsSlinky.baseui.inputMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.baseui.baseuiStrings.change_
import typingsSlinky.react.mod.FormEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatefulContainerProps extends js.Object {
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var initialState: js.UndefOr[State] = js.native
  
  var onChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  
  var stateReducer: js.UndefOr[js.Function3[change_, /* nextState */ State, /* currentState */ State, State]] = js.native
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
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setInitialState(value: State): Self = this.set("initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    
    @scala.inline
    def setOnChange(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setStateReducer(value: (change_, /* nextState */ State, /* currentState */ State) => State): Self = this.set("stateReducer", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteStateReducer: Self = this.set("stateReducer", js.undefined)
  }
}
