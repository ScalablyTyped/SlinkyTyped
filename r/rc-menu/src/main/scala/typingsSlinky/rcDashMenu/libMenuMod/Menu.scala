package typingsSlinky.rcDashMenu.libMenuMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.rcDashMenu.Anon_GetWrappedInstance
import typingsSlinky.rcDashMenu.libInterfaceMod.MenuClickEventHandler
import typingsSlinky.rcDashMenu.libInterfaceMod.MiniStore
import typingsSlinky.rcDashMenu.libInterfaceMod.SelectInfo
import typingsSlinky.rcDashMenu.libSubPopupMenuMod.SubPopupMenuProps
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Menu
  extends Component[MenuProps, js.Object, js.Any] {
  var innerMenu: ReactComponentClass[SubPopupMenuProps] with Anon_GetWrappedInstance = js.native
  var isRootMenu: Boolean = js.native
  var onClick: MenuClickEventHandler = js.native
  var store: MiniStore = js.native
  @JSName("componentDidMount")
  def componentDidMount_MMenu(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MMenu(): Unit = js.native
  def getOpenTransitionName(): String = js.native
  def onDeselect(selectInfo: SelectInfo): Unit = js.native
  def onKeyDown(e: SyntheticKeyboardEvent[HTMLElement], callback: js.Any): Unit = js.native
  def onOpenChange(event: js.Any): Unit = js.native
  def onSelect(selectInfo: SelectInfo): Unit = js.native
  def setInnerMenu(node: js.Any): Unit = js.native
  def updateMiniStore(): Unit = js.native
}

