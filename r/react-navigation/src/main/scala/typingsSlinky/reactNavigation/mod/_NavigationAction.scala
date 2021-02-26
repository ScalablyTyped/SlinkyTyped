package typingsSlinky.reactNavigation.mod

import typingsSlinky.reactNavigation.reactNavigationStrings.CHILD_ACTION
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashBACK
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashCLOSE_DRAWER
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashCOMPLETE_TRANSITION
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashDRAWER_CLOSED
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashDRAWER_OPENED
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashINIT
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashNAVIGATE
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashOPEN_DRAWER
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashPOP
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashPOP_TO_TOP
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashPUSH
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashREPLACE
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashRESET
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashSET_PARAMS
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashTOGGLE_DRAWER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _NavigationAction extends StObject
object _NavigationAction {
  
  @scala.inline
  def NavigationBackAction(`type`: NavigationSlashBACK): typingsSlinky.reactNavigation.mod.NavigationBackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationBackAction]
  }
  
  @scala.inline
  def NavigationCloseDrawerAction(`type`: NavigationSlashCLOSE_DRAWER): typingsSlinky.reactNavigation.mod.NavigationCloseDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationCloseDrawerAction]
  }
  
  @scala.inline
  def NavigationCompleteTransitionAction(key: String, `type`: NavigationSlashCOMPLETE_TRANSITION): typingsSlinky.reactNavigation.mod.NavigationCompleteTransitionAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationCompleteTransitionAction]
  }
  
  @scala.inline
  def NavigationDrawerClosedAction(`type`: NavigationSlashDRAWER_CLOSED): typingsSlinky.reactNavigation.mod.NavigationDrawerClosedAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationDrawerClosedAction]
  }
  
  @scala.inline
  def NavigationDrawerOpenedAction(`type`: NavigationSlashDRAWER_OPENED): typingsSlinky.reactNavigation.mod.NavigationDrawerOpenedAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationDrawerOpenedAction]
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
  def NavigationOpenDrawerAction(`type`: NavigationSlashOPEN_DRAWER): typingsSlinky.reactNavigation.mod.NavigationOpenDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationOpenDrawerAction]
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
  
  @scala.inline
  def NavigationToggleDrawerAction(`type`: NavigationSlashTOGGLE_DRAWER): typingsSlinky.reactNavigation.mod.NavigationToggleDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationToggleDrawerAction]
  }
  
  @scala.inline
  def Type(`type`: CHILD_ACTION): typingsSlinky.reactNavigation.anon.Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNavigation.anon.Type]
  }
}
