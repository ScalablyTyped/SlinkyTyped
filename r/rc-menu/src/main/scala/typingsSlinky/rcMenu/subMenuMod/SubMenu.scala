package typingsSlinky.rcMenu.subMenuMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcMenu.anon.Item
import typingsSlinky.rcMenu.anon.Mode
import typingsSlinky.rcMenu.interfaceMod.MenuInfo
import typingsSlinky.rcMenu.interfaceMod.MenuMode
import typingsSlinky.rcMenu.interfaceMod.OpenEventHandler
import typingsSlinky.rcMenu.interfaceMod.SelectEventHandler
import typingsSlinky.rcMenu.menuItemMod.MenuItem
import typingsSlinky.rcMenu.subPopupMenuMod.SubPopupMenuProps
import typingsSlinky.rcTrigger.interfaceMod.MotionType
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-menu/es/SubMenu", "SubMenu")
@js.native
class SubMenu protected ()
  extends Component[SubMenuProps, js.Object, js.Any] {
  def this(props: SubMenuProps) = this()
  
  def addKeyPath(info: MenuInfo): Item = js.native
  
  def adjustWidth(): Unit = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MSubMenu(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSubMenu(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSubMenu(): Unit = js.native
  
  def getActiveClassName(): String = js.native
  
  def getBaseProps(): SubPopupMenuProps = js.native
  
  def getDisabledClassName(): String = js.native
  
  def getMotion(mode: MenuMode, visible: Boolean): MotionType = js.native
  
  def getOpenClassName(): String = js.native
  
  def getPrefixCls(): String = js.native
  
  def getSelectedClassName(): String = js.native
  
  var haveOpened: Boolean = js.native
  
  var haveRendered: Boolean = js.native
  
  var internalMenuId: String = js.native
  
  def isChildrenSelected(): Boolean = js.native
  
  def isOpen(): Boolean = js.native
  
  var isRootMenu: Boolean = js.native
  
  var menuInstance: MenuItem = js.native
  
  /**
    * Follow timeout should be `number`.
    * Current is only convert code into TS,
    * we not use `window.setTimeout` instead of `setTimeout`.
    */
  var minWidthTimeout: js.Any = js.native
  
  var mouseenterTimeout: js.Any = js.native
  
  var onDeselect: SelectEventHandler = js.native
  
  def onDestroy(key: String): Unit = js.native
  
  /**
    * note:
    *  This legacy code that `onKeyDown` is called by parent instead of dom self.
    *  which need return code to check if this event is handled
    */
  var onKeyDown: KeyboardEventHandler[HTMLElement] = js.native
  
  var onMouseEnter: MouseEventHandler[HTMLElement] = js.native
  
  var onMouseLeave: MouseEventHandler[HTMLElement] = js.native
  
  var onOpenChange: OpenEventHandler = js.native
  
  def onPopupVisibleChange(visible: Boolean): Unit = js.native
  
  var onSelect: SelectEventHandler = js.native
  
  def onSubMenuClick(info: MenuInfo): Unit = js.native
  
  def onTitleClick(e: SyntheticKeyboardEvent[HTMLElement]): Unit = js.native
  def onTitleClick(e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  
  var onTitleMouseEnter: MouseEventHandler[HTMLElement] = js.native
  
  var onTitleMouseLeave: MouseEventHandler[HTMLElement] = js.native
  
  def renderChildren(children: ReactElement): ReactElement = js.native
  
  def saveMenuInstance(c: MenuItem): Unit = js.native
  
  def saveSubMenuTitle(subMenuTitle: HTMLElement): Unit = js.native
  
  var subMenuTitle: HTMLElement = js.native
  
  def triggerOpenChange(open: Boolean): Unit = js.native
  def triggerOpenChange(open: Boolean, `type`: String): Unit = js.native
}
/* static members */
@JSImport("rc-menu/es/SubMenu", "SubMenu")
@js.native
object SubMenu extends js.Object {
  
  var defaultProps: Mode = js.native
}
