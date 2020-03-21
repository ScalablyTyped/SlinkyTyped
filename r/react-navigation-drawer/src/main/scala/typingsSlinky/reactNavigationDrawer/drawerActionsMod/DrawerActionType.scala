package typingsSlinky.reactNavigationDrawer.drawerActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.NavigationSlashOPEN_DRAWER
  - typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.NavigationSlashCLOSE_DRAWER
  - typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.NavigationSlashTOGGLE_DRAWER
*/
trait DrawerActionType extends js.Object

object DrawerActionType {
  @scala.inline
  def NavigationSlashCLOSE_DRAWER: typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.NavigationSlashCLOSE_DRAWER = this.cast("Navigation/CLOSE_DRAWER")
  @scala.inline
  def NavigationSlashOPEN_DRAWER: typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.NavigationSlashOPEN_DRAWER = this.cast("Navigation/OPEN_DRAWER")
  @scala.inline
  def NavigationSlashTOGGLE_DRAWER: typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.NavigationSlashTOGGLE_DRAWER = this.cast("Navigation/TOGGLE_DRAWER")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

