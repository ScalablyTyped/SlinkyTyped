package typingsSlinky.reduxApiMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPayload[Payload] extends js.Object {
  var payload: Payload = js.native
}

object AnonPayload {
  @scala.inline
  def apply[Payload](payload: Payload): AnonPayload[Payload] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPayload[Payload]]
  }
  @scala.inline
  implicit class AnonPayloadOps[Self[payload] <: AnonPayload[payload], Payload] (val x: Self[Payload]) extends AnyVal {
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

