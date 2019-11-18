package typingsSlinky.reactDashNavigation.reactDashNavigationMod

import typingsSlinky.reactDashNavigation.reactDashNavigationStrings.`Navigation/TOGGLE_DRAWER`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationToggleDrawerAction extends NavigationDrawerAction {
  var key: js.UndefOr[String] = js.undefined
  var `type`: `Navigation/TOGGLE_DRAWER`
}

object NavigationToggleDrawerAction {
  @scala.inline
  def apply(`type`: `Navigation/TOGGLE_DRAWER`, key: String = null): NavigationToggleDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationToggleDrawerAction]
  }
}

