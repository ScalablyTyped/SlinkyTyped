package typingsSlinky.reduxAction.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action[Payload] extends BaseAction {
  var payload: Payload = js.native
}

object Action {
  @scala.inline
  def apply[Payload](payload: Payload, `type`: String): Action[Payload] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action[Payload]]
  }
  @scala.inline
  implicit class ActionOps[Self[payload] <: Action[payload], Payload] (val x: Self[Payload]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Payload] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Payload]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Payload] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Payload] with Other]
    @scala.inline
    def withPayload(value: Payload): Self[Payload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

