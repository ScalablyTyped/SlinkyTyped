package typingsSlinky.reactDashNavigation.reactDashNavigationMod

import typingsSlinky.reactDashNavigation.reactDashNavigationStrings.`Navigation/CLOSE_DRAWER`
import typingsSlinky.reactDashNavigation.reactDashNavigationStrings.`Navigation/OPEN_DRAWER`
import typingsSlinky.reactDashNavigation.reactDashNavigationStrings.`Navigation/TOGGLE_DRAWER`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "DrawerActions")
@js.native
object DrawerActions extends js.Object {
  val CLOSE_DRAWER: `Navigation/CLOSE_DRAWER` = js.native
  val OPEN_DRAWER: `Navigation/OPEN_DRAWER` = js.native
  val TOGGLE_DRAWER: `Navigation/TOGGLE_DRAWER` = js.native
  def closeDrawer(): NavigationCloseDrawerAction = js.native
  def openDrawer(): NavigationOpenDrawerAction = js.native
  def toggleDrawer(): NavigationToggleDrawerAction = js.native
}

