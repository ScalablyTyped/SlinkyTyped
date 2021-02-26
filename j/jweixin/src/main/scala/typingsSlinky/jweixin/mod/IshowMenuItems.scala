package typingsSlinky.jweixin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IshowMenuItems extends BaseParams {
  
  var menuList: typingsSlinky.jweixin.mod.menuList = js.native
}
object IshowMenuItems {
  
  @scala.inline
  def apply(menuList: menuList): IshowMenuItems = {
    val __obj = js.Dynamic.literal(menuList = menuList.asInstanceOf[js.Any])
    __obj.asInstanceOf[IshowMenuItems]
  }
  
  @scala.inline
  implicit class IshowMenuItemsMutableBuilder[Self <: IshowMenuItems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMenuList(value: menuList): Self = StObject.set(x, "menuList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuListVarargs(value: (menuBase | menuProtected | menuShare)*): Self = StObject.set(x, "menuList", js.Array(value :_*))
  }
}
