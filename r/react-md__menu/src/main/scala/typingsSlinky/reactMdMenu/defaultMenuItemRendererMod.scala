package typingsSlinky.reactMdMenu

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/menu/types/defaultMenuItemRenderer", JSImport.Namespace)
@js.native
object defaultMenuItemRendererMod extends js.Object {
  
  def default(item: ValidMenuItem, key: String): ReactElement = js.native
  
  trait _ValidMenuItem extends js.Object
  
  type MenuItemRenderer = js.Function2[/* item */ ValidMenuItem, /* key */ String, ReactElement]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.react.mod.ReactNode
    - typingsSlinky.reactMdMenu.menuItemMod.MenuItemProps
    - typingsSlinky.reactMdMenu.anon.MenuItemSeparatorPropsrol
  */
  type ValidMenuItem = _ValidMenuItem | ReactElement
}
