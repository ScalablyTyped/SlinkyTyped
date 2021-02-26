package typingsSlinky.reactDataGrid.AdazzleReactDataGrid

import typingsSlinky.reactDataGrid.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionMenu extends StObject {
  
  var actions: js.Array[Callback] = js.native
  
  var icon: String = js.native
}
object ActionMenu {
  
  @scala.inline
  def apply(actions: js.Array[Callback], icon: String): ActionMenu = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMenu]
  }
  
  @scala.inline
  implicit class ActionMenuMutableBuilder[Self <: ActionMenu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[Callback]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: Callback*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
  }
}
