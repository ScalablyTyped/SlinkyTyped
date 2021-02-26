package typingsSlinky.reactNavigation.mod

import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashCOMPLETE_TRANSITION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationCompleteTransitionAction extends NavigationStackAction {
  
  var key: String = js.native
  
  var `type`: NavigationSlashCOMPLETE_TRANSITION = js.native
}
object NavigationCompleteTransitionAction {
  
  @scala.inline
  def apply(key: String, `type`: NavigationSlashCOMPLETE_TRANSITION): NavigationCompleteTransitionAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationCompleteTransitionAction]
  }
  
  @scala.inline
  implicit class NavigationCompleteTransitionActionMutableBuilder[Self <: NavigationCompleteTransitionAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NavigationSlashCOMPLETE_TRANSITION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
