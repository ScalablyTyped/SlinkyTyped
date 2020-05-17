package typingsSlinky.baseui.datepickerMod

import typingsSlinky.baseui.anon.Date
import typingsSlinky.baseui.baseuiStrings.change_
import typingsSlinky.baseui.baseuiStrings.mouseLeave
import typingsSlinky.baseui.baseuiStrings.mouseOver
import typingsSlinky.baseui.baseuiStrings.moveDown
import typingsSlinky.baseui.baseuiStrings.moveLeft
import typingsSlinky.baseui.baseuiStrings.moveRight
import typingsSlinky.baseui.baseuiStrings.moveUp
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/datepicker", "StatefulContainer")
@js.native
class StatefulContainer ()
  extends Component[StatefulContainerProps[CalendarProps | DatepickerProps], ContainerState, js.Any] {
  @JSName("internalSetState")
  def internalSetState_change(`type`: change_, changes: ContainerState): Unit = js.native
  @JSName("internalSetState")
  def internalSetState_mouseLeave(`type`: mouseLeave, changes: ContainerState): Unit = js.native
  @JSName("internalSetState")
  def internalSetState_mouseOver(`type`: mouseOver, changes: ContainerState): Unit = js.native
  @JSName("internalSetState")
  def internalSetState_moveDown(`type`: moveDown, changes: ContainerState): Unit = js.native
  @JSName("internalSetState")
  def internalSetState_moveLeft(`type`: moveLeft, changes: ContainerState): Unit = js.native
  @JSName("internalSetState")
  def internalSetState_moveRight(`type`: moveRight, changes: ContainerState): Unit = js.native
  @JSName("internalSetState")
  def internalSetState_moveUp(`type`: moveUp, changes: ContainerState): Unit = js.native
  def onChange(data: Date): Unit = js.native
}

