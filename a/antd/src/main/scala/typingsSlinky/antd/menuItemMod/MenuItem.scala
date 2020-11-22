package typingsSlinky.antd.menuItemMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.siderMod.SiderContextProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItem
  extends Component[MenuItemProps, js.Object, js.Any] {
  
  def renderItem(hasSiderCollapsed: SiderContextProps): ReactElement = js.native
  
  def renderItemChildren(inlineCollapsed: Boolean): js.UndefOr[js.Object | Null] = js.native
}
