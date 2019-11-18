package typingsSlinky.antd.esMenuMenuItemMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.esLayoutSiderMod.SiderContextProps
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItem
  extends Component[MenuItemProps, js.Object, js.Any] {
  var menuItem: js.Any = js.native
  def onKeyDown(e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  def renderItem(hasSiderCollapsed: SiderContextProps): ReactElement = js.native
  def saveMenuItem(menuItem: this.type): Unit = js.native
}

