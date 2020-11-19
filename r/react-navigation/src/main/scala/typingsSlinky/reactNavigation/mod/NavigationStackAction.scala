package typingsSlinky.reactNavigation.mod

import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashBACK
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashCOMPLETE_TRANSITION
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashINIT
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashNAVIGATE
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashPOP
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashPOP_TO_TOP
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashPUSH
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashREPLACE
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashRESET
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashSET_PARAMS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNavigation.mod.NavigationInitAction
  - typingsSlinky.reactNavigation.mod.NavigationNavigateAction
  - typingsSlinky.reactNavigation.mod.NavigationBackAction
  - typingsSlinky.reactNavigation.mod.NavigationSetParamsAction
  - typingsSlinky.reactNavigation.mod.NavigationResetAction
  - typingsSlinky.reactNavigation.mod.NavigationReplaceAction
  - typingsSlinky.reactNavigation.mod.NavigationPopAction
  - typingsSlinky.reactNavigation.mod.NavigationPushAction
  - typingsSlinky.reactNavigation.mod.NavigationPopToTopAction
  - typingsSlinky.reactNavigation.mod.NavigationCompleteTransitionAction
*/
trait NavigationStackAction extends _NavigationAction
object NavigationStackAction {
  
  @scala.inline
  def NavigationCompleteTransitionAction(key: String, `type`: NavigationSlashCOMPLETE_TRANSITION): NavigationStackAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStackAction]
  }
  
  @scala.inline
  def NavigationBackAction(`type`: NavigationSlashBACK): NavigationStackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStackAction]
  }
  
  @scala.inline
  def NavigationPushAction(routeName: String, `type`: NavigationSlashPUSH): NavigationStackAction = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStackAction]
  }
  
  @scala.inline
  def NavigationPopToTopAction(`type`: NavigationSlashPOP_TO_TOP): NavigationStackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStackAction]
  }
  
  @scala.inline
  def NavigationInitAction(`type`: NavigationSlashINIT): NavigationStackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStackAction]
  }
  
  @scala.inline
  def NavigationResetAction(actions: js.Array[NavigationNavigateAction], index: Double, `type`: NavigationSlashRESET): NavigationStackAction = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStackAction]
  }
  
  @scala.inline
  def NavigationNavigateAction(routeName: String, `type`: NavigationSlashNAVIGATE): NavigationStackAction = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStackAction]
  }
  
  @scala.inline
  def NavigationPopAction(`type`: NavigationSlashPOP): NavigationStackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStackAction]
  }
  
  @scala.inline
  def NavigationReplaceAction(key: String, routeName: String, `type`: NavigationSlashREPLACE): NavigationStackAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStackAction]
  }
  
  @scala.inline
  def NavigationSetParamsAction(key: String, params: NavigationParams, `type`: NavigationSlashSET_PARAMS): NavigationStackAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStackAction]
  }
}
