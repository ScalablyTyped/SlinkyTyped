package typingsSlinky.reactDashNavigation.reactDashNavigationMod

import typingsSlinky.reactDashNavigation.reactDashNavigationStrings.`Navigation/NAVIGATE`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationNavigateAction
  extends NavigationStackAction
     with NavigationNavigateActionPayload
     with NavigationTabAction {
  var `type`: `Navigation/NAVIGATE`
}

object NavigationNavigateAction {
  @scala.inline
  def apply(
    routeName: String,
    `type`: `Navigation/NAVIGATE`,
    action: NavigationNavigateAction = null,
    key: String = null,
    params: NavigationParams = null
  ): NavigationNavigateAction = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationNavigateAction]
  }
}

