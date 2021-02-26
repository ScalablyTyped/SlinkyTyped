package typingsSlinky.reactMdMenu

import org.scalajs.dom.raw.HTMLLIElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdList.listItemMod.ListItemProps
import typingsSlinky.reactMdMenu.defaultMenuItemRendererMod._ValidMenuItem
import typingsSlinky.reactMdMenu.reactMdMenuStrings.button
import typingsSlinky.reactMdMenu.reactMdMenuStrings.menuitem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemMod {
  
  @JSImport("@react-md/menu/types/MenuItem", "MenuItem")
  @js.native
  val MenuItem: ForwardRefExoticComponent[MenuItemProps with RefAttributes[HTMLLIElement]] = js.native
  
  @js.native
  trait MenuItemProps
    extends ListItemProps
       with _ValidMenuItem {
    
    /**
      * The current role for the menu item. This will eventually be updated for
      * some of the other `menuitem*` widgets.
      */
    @JSName("role")
    var role_MenuItemProps: js.UndefOr[menuitem | button] = js.native
  }
  object MenuItemProps {
    
    @scala.inline
    def apply(): MenuItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemProps]
    }
    
    @scala.inline
    implicit class MenuItemPropsMutableBuilder[Self <: MenuItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRole(value: menuitem | button): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
}
