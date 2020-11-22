package typingsSlinky.rcMenu.menuMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTransitionEvent
import typingsSlinky.rcMenu.anon.ComponentClassSubPopupMen
import typingsSlinky.rcMenu.interfaceMod.MenuClickEventHandler
import typingsSlinky.rcMenu.interfaceMod.MenuMode
import typingsSlinky.rcMenu.interfaceMod.MiniStore
import typingsSlinky.rcMenu.interfaceMod.SelectInfo
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Menu
  extends Component[MenuProps, MenuState, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MMenu(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MMenu(prevProps: MenuProps): Unit = js.native
  
  def getInlineCollapsed(): Boolean = js.native
  
  def getRealMenuMode(): MenuMode = js.native
  
  var innerMenu: ComponentClassSubPopupMen = js.native
  
  var isRootMenu: Boolean = js.native
  
  var onClick: MenuClickEventHandler = js.native
  
  def onDeselect(selectInfo: SelectInfo): Unit = js.native
  
  def onKeyDown(e: SyntheticKeyboardEvent[HTMLElement], callback: js.Any): Unit = js.native
  
  def onMouseEnter(e: SyntheticMouseEvent[HTMLDivElement]): Unit = js.native
  
  def onOpenChange(event: js.Any): Unit = js.native
  
  def onSelect(selectInfo: SelectInfo): Unit = js.native
  
  def onTransitionEnd(e: SyntheticTransitionEvent[HTMLDivElement]): Unit = js.native
  
  var prevOpenKeys: js.Array[String] = js.native
  
  def restoreModeVerticalFromInline(): Unit = js.native
  
  def setInnerMenu(node: js.Any): Unit = js.native
  
  var store: MiniStore = js.native
  
  def updateMenuDisplay(): Unit = js.native
  
  def updateMiniStore(): Unit = js.native
}
