package typingsSlinky.reduxLittleRouter.mod

import typingsSlinky.reduxLittleRouter.AnonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceRoutesAction extends RouterActions {
  var payload: AnonOptions = js.native
  var `type`: /* "ROUTER_REPLACE_ROUTES" */ String = js.native
}

object ReplaceRoutesAction {
  @scala.inline
  def apply(payload: AnonOptions, `type`: /* "ROUTER_REPLACE_ROUTES" */ String): ReplaceRoutesAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceRoutesAction]
  }
  @scala.inline
  implicit class ReplaceRoutesActionOps[Self <: ReplaceRoutesAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayload(value: AnonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: /* "ROUTER_REPLACE_ROUTES" */ String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

