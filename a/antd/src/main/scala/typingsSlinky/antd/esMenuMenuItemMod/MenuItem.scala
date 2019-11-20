package typingsSlinky.antd.esMenuMenuItemMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.esLayoutSiderMod.SiderContextProps
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItem
  extends Component[MenuItemProps, js.Object, js.Any] {
  var menuItem: js.Any = js.native
  def onKeyDown(e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  def renderItem(hasSiderCollapsed: SiderContextProps): Element = js.native
  def saveMenuItem(menuItem: this.type): Unit = js.native
}

