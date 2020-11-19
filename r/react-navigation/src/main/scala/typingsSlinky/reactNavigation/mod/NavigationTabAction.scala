package typingsSlinky.reactNavigation.mod

import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashBACK
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashINIT
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashNAVIGATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNavigation.mod.NavigationInitAction
  - typingsSlinky.reactNavigation.mod.NavigationNavigateAction
  - typingsSlinky.reactNavigation.mod.NavigationBackAction
*/
trait NavigationTabAction extends _NavigationAction
object NavigationTabAction {
  
  @scala.inline
  def NavigationInitAction(`type`: NavigationSlashINIT): NavigationTabAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationTabAction]
  }
  
  @scala.inline
  def NavigationNavigateAction(routeName: String, `type`: NavigationSlashNAVIGATE): NavigationTabAction = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationTabAction]
  }
  
  @scala.inline
  def NavigationBackAction(`type`: NavigationSlashBACK): NavigationTabAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationTabAction]
  }
}
