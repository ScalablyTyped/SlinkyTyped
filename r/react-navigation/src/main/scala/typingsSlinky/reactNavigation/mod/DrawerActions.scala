package typingsSlinky.reactNavigation.mod

import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashCLOSE_DRAWER
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashOPEN_DRAWER
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashTOGGLE_DRAWER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-navigation", "DrawerActions")
@js.native
object DrawerActions extends js.Object {
  
  val CLOSE_DRAWER: NavigationSlashCLOSE_DRAWER = js.native
  
  val OPEN_DRAWER: NavigationSlashOPEN_DRAWER = js.native
  
  val TOGGLE_DRAWER: NavigationSlashTOGGLE_DRAWER = js.native
  
  def closeDrawer(): NavigationCloseDrawerAction = js.native
  
  def openDrawer(): NavigationOpenDrawerAction = js.native
  
  def toggleDrawer(): NavigationToggleDrawerAction = js.native
}
