package typingsSlinky.antd.anon

import typingsSlinky.antd.menuContextMod.MenuContextProps
import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSubMenu extends StObject {
  
  /* static member */
  var contextType: Context[MenuContextProps] = js.native
  
  /* static member */
  var isSubMenu: Double = js.native
}
object TypeofSubMenu {
  
  @scala.inline
  def apply(contextType: Context[MenuContextProps], isSubMenu: Double): TypeofSubMenu = {
    val __obj = js.Dynamic.literal(contextType = contextType.asInstanceOf[js.Any], isSubMenu = isSubMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSubMenu]
  }
  
  @scala.inline
  implicit class TypeofSubMenuMutableBuilder[Self <: TypeofSubMenu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextType(value: Context[MenuContextProps]): Self = StObject.set(x, "contextType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSubMenu(value: Double): Self = StObject.set(x, "isSubMenu", value.asInstanceOf[js.Any])
  }
}
