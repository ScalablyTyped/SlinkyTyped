package typingsSlinky.rcMenu.menuItemMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLLIElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.rcMenu.AnonManualRef
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-menu/lib/MenuItem", "MenuItem")
@js.native
class MenuItem ()
  extends Component[MenuItemProps, js.Object, js.Any] {
  var node: HTMLLIElement = js.native
  var onClick: MouseEventHandler[HTMLElement] = js.native
  var onMouseEnter: MouseEventHandler[HTMLElement] = js.native
  var onMouseLeave: MouseEventHandler[HTMLElement] = js.native
  def callRef(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MMenuItem(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MMenuItem(prevProps: MenuItemProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MMenuItem(): Unit = js.native
  def getActiveClassName(): String = js.native
  def getDisabledClassName(): String = js.native
  def getPrefixCls(): String = js.native
  def getSelectedClassName(): String = js.native
  def onKeyDown(e: SyntheticKeyboardEvent[HTMLElement]): Boolean = js.native
  def saveNode(node: HTMLLIElement): Unit = js.native
}

/* static members */
@JSImport("rc-menu/lib/MenuItem", "MenuItem")
@js.native
object MenuItem extends js.Object {
  var defaultProps: AnonManualRef = js.native
  var isMenuItem: Boolean = js.native
}

