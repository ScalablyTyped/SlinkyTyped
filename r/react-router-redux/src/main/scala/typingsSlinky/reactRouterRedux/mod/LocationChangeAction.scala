package typingsSlinky.reactRouterRedux.mod

import typingsSlinky.reactRouterRedux.anon.LocationLocationStateprop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationChangeAction extends js.Object {
  var payload: LocationLocationStateprop = js.native
  var `type`: /* "@@router/LOCATION_CHANGE" */ String = js.native
}

object LocationChangeAction {
  @scala.inline
  def apply(payload: LocationLocationStateprop, `type`: /* "@@router/LOCATION_CHANGE" */ String): LocationChangeAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationChangeAction]
  }
  @scala.inline
  implicit class LocationChangeActionOps[Self <: LocationChangeAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayload(value: LocationLocationStateprop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: /* "@@router/LOCATION_CHANGE" */ String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

