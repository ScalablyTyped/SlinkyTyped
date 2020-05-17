package typingsSlinky.rcMenu.menuMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.rcMenu.anon.ComponentClassSubPopupMen
import typingsSlinky.rcMenu.interfaceMod.MenuClickEventHandler
import typingsSlinky.rcMenu.interfaceMod.MiniStore
import typingsSlinky.rcMenu.interfaceMod.SelectInfo
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Menu
  extends Component[MenuProps, js.Object, js.Any] {
  var innerMenu: ComponentClassSubPopupMen = js.native
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

