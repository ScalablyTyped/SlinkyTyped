package typingsSlinky.baseui.buttonGroupMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/button-group", "StatefulContainer")
@js.native
class StatefulContainer ()
  extends Component[StatefulButtonGroupProps, State, js.Any] {
  def changeState(nextState: State): Unit = js.native
  def onClick(event: SyntheticMouseEvent[HTMLButtonElement], index: Double): Unit = js.native
}

