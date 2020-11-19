package typingsSlinky.antd.subMenuMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubMenu
  extends Component[SubMenuProps, js.Any, js.Any] {
  
  def onKeyDown(e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  
  def renderTitle(inlineCollapsed: Boolean): js.UndefOr[js.Object | Null] = js.native
  
  def saveSubMenu(subMenu: js.Any): Unit = js.native
  
  var subMenu: js.Any = js.native
}
