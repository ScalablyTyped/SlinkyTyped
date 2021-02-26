package typingsSlinky.reactNavigation.mod

import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashCLOSE_DRAWER
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashDRAWER_CLOSED
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashDRAWER_OPENED
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashOPEN_DRAWER
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashTOGGLE_DRAWER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNavigation.mod.NavigationDrawerOpenedAction
  - typingsSlinky.reactNavigation.mod.NavigationDrawerClosedAction
  - typingsSlinky.reactNavigation.mod.NavigationOpenDrawerAction
  - typingsSlinky.reactNavigation.mod.NavigationCloseDrawerAction
  - typingsSlinky.reactNavigation.mod.NavigationToggleDrawerAction
*/
trait NavigationDrawerAction extends _NavigationAction
object NavigationDrawerAction {
  
  @scala.inline
  def NavigationCloseDrawerAction(`type`: NavigationSlashCLOSE_DRAWER): typingsSlinky.reactNavigation.mod.NavigationCloseDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationCloseDrawerAction]
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
  def NavigationOpenDrawerAction(`type`: NavigationSlashOPEN_DRAWER): typingsSlinky.reactNavigation.mod.NavigationOpenDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationOpenDrawerAction]
  }
  
  @scala.inline
  def NavigationToggleDrawerAction(`type`: NavigationSlashTOGGLE_DRAWER): typingsSlinky.reactNavigation.mod.NavigationToggleDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationToggleDrawerAction]
  }
}
