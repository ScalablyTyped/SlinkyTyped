package typingsSlinky.reactDashNavigation.reactDashNavigationMod

import typingsSlinky.reactDashNavigation.reactDashNavigationStrings.NavigationSlashCLOSE_DRAWER
import typingsSlinky.reactDashNavigation.reactDashNavigationStrings.NavigationSlashOPEN_DRAWER
import typingsSlinky.reactDashNavigation.reactDashNavigationStrings.NavigationSlashTOGGLE_DRAWER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

