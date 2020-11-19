package typingsSlinky.reactMdMenu.menuItemLinkMod

import typingsSlinky.reactMdList.listItemLinkMod.ListItemLinkProps
import typingsSlinky.reactMdMenu.reactMdMenuStrings.menuitem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItemLinkProps extends ListItemLinkProps {
  
  /**
    * The current role for the menu item. This will eventually be updated for
    * some of the other `menuitem*` widgets.
    */
  @JSName("role")
  var role_MenuItemLinkProps: js.UndefOr[menuitem] = js.native
}
object MenuItemLinkProps {
  
  @scala.inline
  def apply(): MenuItemLinkProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemLinkProps]
  }
  
  @scala.inline
  implicit class MenuItemLinkPropsOps[Self <: MenuItemLinkProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRole(value: menuitem): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
}
