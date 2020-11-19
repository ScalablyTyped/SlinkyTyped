package typingsSlinky.rcMenu.menuItemMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLLIElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.rcMenu.anon.ManualRef
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-menu/es/MenuItem", "MenuItem")
@js.native
class MenuItem ()
  extends Component[MenuItemProps, js.Object, js.Any] {
  
  def callRef(): Unit = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MMenuItem(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MMenuItem(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MMenuItem(): Unit = js.native
  
  def getActiveClassName(): String = js.native
  
  def getDisabledClassName(): String = js.native
  
  def getPrefixCls(): String = js.native
  
  def getSelectedClassName(): String = js.native
  
  var node: HTMLLIElement = js.native
  
  var onClick: MouseEventHandler[HTMLElement] = js.native
  
  def onKeyDown(e: SyntheticKeyboardEvent[HTMLElement]): js.UndefOr[Boolean] = js.native
  
  var onMouseEnter: MouseEventHandler[HTMLElement] = js.native
  
  var onMouseLeave: MouseEventHandler[HTMLElement] = js.native
  
  def saveNode(node: HTMLLIElement): Unit = js.native
}
/* static members */
@JSImport("rc-menu/es/MenuItem", "MenuItem")
@js.native
object MenuItem extends js.Object {
  
  var defaultProps: ManualRef = js.native
  
  var isMenuItem: Boolean = js.native
}
