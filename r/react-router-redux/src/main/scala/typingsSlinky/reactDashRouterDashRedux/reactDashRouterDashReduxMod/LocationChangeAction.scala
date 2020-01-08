package typingsSlinky.reactDashRouterDashRedux.reactDashRouterDashReduxMod

import typingsSlinky.history.historyMod.Location
import typingsSlinky.history.historyMod.LocationState
import typingsSlinky.reactDashRouterDashRedux.Anon_Props
import typingsSlinky.reactDashRouterDashRedux.reactDashRouterDashReduxStrings.`@@routerSlashLOCATION_CHANGE`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationChangeAction extends js.Object {
  var payload: Location[LocationState] with Anon_Props
  var `type`: `@@routerSlashLOCATION_CHANGE`
}

object LocationChangeAction {
  @scala.inline
  def apply(payload: Location[LocationState] with Anon_Props, `type`: `@@routerSlashLOCATION_CHANGE`): LocationChangeAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationChangeAction]
  }
}

