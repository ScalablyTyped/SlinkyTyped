package typingsSlinky.antd.menuItemMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.siderMod.SiderContextProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItem
  extends Component[MenuItemProps, js.Object, js.Any] {
  var menuItem: js.Any = js.native
  def onKeyDown(e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  def renderItem(hasSiderCollapsed: SiderContextProps): ReactElement = js.native
  def renderItemChildren(inlineCollapsed: Boolean): js.UndefOr[js.Object | Null] = js.native
  def saveMenuItem(menuItem: this.type): Unit = js.native
}

