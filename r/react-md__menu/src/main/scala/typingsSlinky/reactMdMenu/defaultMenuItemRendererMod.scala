package typingsSlinky.reactMdMenu

import slinky.core.facade.ReactElement
import typingsSlinky.reactMdMenu.reactMdMenuStrings.separator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultMenuItemRendererMod {
  
  @JSImport("@react-md/menu/types/defaultMenuItemRenderer", "defaultMenuItemRenderer")
  @js.native
  def defaultMenuItemRenderer(item: ValidMenuItem, key: String): ReactElement = js.native
  
  type MenuItemRenderer = js.Function2[/* item */ ValidMenuItem, /* key */ String, ReactElement]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.react.mod.ReactNode
    - typingsSlinky.reactMdMenu.menuItemMod.MenuItemProps
    - typingsSlinky.reactMdMenu.anon.MenuItemSeparatorPropsrol
  */
  type ValidMenuItem = _ValidMenuItem | ReactElement
  
  trait _ValidMenuItem extends StObject
  object _ValidMenuItem {
    
    @scala.inline
    def MenuItemProps(): typingsSlinky.reactMdMenu.menuItemMod.MenuItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.reactMdMenu.menuItemMod.MenuItemProps]
    }
    
    @scala.inline
    def MenuItemSeparatorPropsrol(role: js.UndefOr[String] with separator): typingsSlinky.reactMdMenu.anon.MenuItemSeparatorPropsrol = {
      val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.reactMdMenu.anon.MenuItemSeparatorPropsrol]
    }
  }
}
