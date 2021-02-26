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
import org.scalablytyped.runtime.StObject
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
  def NavigationBackAction(`type`: NavigationSlashBACK): typingsSlinky.reactNavigation.mod.NavigationBackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationBackAction]
  }
  
  @scala.inline
  def NavigationCompleteTransitionAction(key: String, `type`: NavigationSlashCOMPLETE_TRANSITION): typingsSlinky.reactNavigation.mod.NavigationCompleteTransitionAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationCompleteTransitionAction]
  }
  
  @scala.inline
  def NavigationInitAction(`type`: NavigationSlashINIT): typingsSlinky.reactNavigation.mod.NavigationInitAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationInitAction]
  }
  
  @scala.inline
  def NavigationNavigateAction(routeName: String, `type`: NavigationSlashNAVIGATE): typingsSlinky.reactNavigation.mod.NavigationNavigateAction = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationNavigateAction]
  }
  
  @scala.inline
  def NavigationPopAction(`type`: NavigationSlashPOP): typingsSlinky.reactNavigation.mod.NavigationPopAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationPopAction]
  }
  
  @scala.inline
  def NavigationPopToTopAction(`type`: NavigationSlashPOP_TO_TOP): typingsSlinky.reactNavigation.mod.NavigationPopToTopAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationPopToTopAction]
  }
  
  @scala.inline
  def NavigationPushAction(routeName: String, `type`: NavigationSlashPUSH): typingsSlinky.reactNavigation.mod.NavigationPushAction = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationPushAction]
  }
  
  @scala.inline
  def NavigationReplaceAction(key: String, routeName: String, `type`: NavigationSlashREPLACE): typingsSlinky.reactNavigation.mod.NavigationReplaceAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationReplaceAction]
  }
  
  @scala.inline
  def NavigationResetAction(actions: js.Array[NavigationNavigateAction], index: Double, `type`: NavigationSlashRESET): typingsSlinky.reactNavigation.mod.NavigationResetAction = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationResetAction]
  }
  
  @scala.inline
  def NavigationSetParamsAction(key: String, params: NavigationParams, `type`: NavigationSlashSET_PARAMS): typingsSlinky.reactNavigation.mod.NavigationSetParamsAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationSetParamsAction]
  }
}
