package typingsSlinky.reactRouterRedux.mod

import typingsSlinky.reactRouterRedux.LocationLocationStateprop
import typingsSlinky.reactRouterRedux.reactRouterReduxStrings.`@@routerSlashLOCATION_CHANGE`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationChangeAction extends js.Object {
  var payload: LocationLocationStateprop
  var `type`: `@@routerSlashLOCATION_CHANGE`
}

object LocationChangeAction {
  @scala.inline
  def apply(payload: LocationLocationStateprop, `type`: `@@routerSlashLOCATION_CHANGE`): LocationChangeAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationChangeAction]
  }
}

