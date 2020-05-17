package typingsSlinky.baseui.phoneInputMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import typingsSlinky.baseui.anon.ReadonlyState
import typingsSlinky.baseui.selectMod.OnChangeParams
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/phone-input", "StatefulPhoneInputContainer")
@js.native
class StatefulPhoneInputContainer ()
  extends Component[StatefulPhoneInputContainerProps, State, js.Any] {
  def internalSetState(`type`: StateChange, nextState: ReadonlyState): Unit = js.native
  def onCountryChange(event: OnChangeParams): Unit = js.native
  def onTextChange(event: SyntheticEvent[Event, HTMLInputElement]): Unit = js.native
}

