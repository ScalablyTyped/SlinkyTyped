package typingsSlinky.baseui.radioMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.ChangeEventHandler
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/radio", "StatefulContainer")
@js.native
class StatefulContainer ()
  extends Component[StatefulContainerProps, State, js.Any] {
  def onChange(e: ChangeEventHandler[HTMLInputElement]): Unit = js.native
  def stateReducer(`type`: String, e: SyntheticEvent[Event, HTMLInputElement]): Unit = js.native
}

