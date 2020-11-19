package typingsSlinky.rcMenu.subPopupMenuMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.rcMenu.anon.Focusable
import typingsSlinky.rcMenu.interfaceMod.DestroyEventHandler
import typingsSlinky.rcMenu.interfaceMod.HoverEventHandler
import typingsSlinky.rcMenu.interfaceMod.MenuClickEventHandler
import typingsSlinky.rcMenu.interfaceMod.OpenEventHandler
import typingsSlinky.rcMenu.interfaceMod.SelectEventHandler
import typingsSlinky.rcMenu.menuItemMod.MenuItem
import typingsSlinky.rcMenu.menuItemMod.MenuItemProps
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-menu/es/SubPopupMenu", "SubPopupMenu")
@js.native
class SubPopupMenu protected ()
  extends Component[SubPopupMenuProps, js.Object, js.Any] {
  def this(props: SubPopupMenuProps) = this()
  
  @JSName("componentDidMount")
  def componentDidMount_MSubPopupMenu(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSubPopupMenu(prevProps: SubPopupMenuProps): Unit = js.native
  
  def getFlatInstanceArray(): js.Array[MenuItem] = js.native
  
  var instanceArray: js.Array[MenuItem] = js.native
  
  var onClick: MenuClickEventHandler = js.native
  
  var onDeselect: SelectEventHandler = js.native
  
  var onDestroy: DestroyEventHandler = js.native
  
  var onItemHover: HoverEventHandler = js.native
  
  /**
    * all keyboard events callbacks run from here at first
    *
    * note:
    *  This legacy code that `onKeyDown` is called by parent instead of dom self.
    *  which need return code to check if this event is handled
    */
  def onKeyDown(e: SyntheticKeyboardEvent[HTMLElement], callback: js.Function1[/* item */ MenuItem, Unit]): Double = js.native
  
  var onOpenChange: OpenEventHandler = js.native
  
  var onSelect: SelectEventHandler = js.native
  
  def renderCommonMenuItem(child: ReactElement, i: Double, extraProps: MenuItemProps): ReactElement = js.native
  
  def renderMenuItem(c: ReactElement, i: Double, subMenuKey: Key): ReactElement = js.native
  
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MSubPopupMenu(nextProps: SubPopupMenuProps): Boolean = js.native
  
  def step(direction: Double): MenuItem = js.native
}
/* static members */
@JSImport("rc-menu/es/SubPopupMenu", "SubPopupMenu")
@js.native
object SubPopupMenu extends js.Object {
  
  var defaultProps: Focusable = js.native
}
