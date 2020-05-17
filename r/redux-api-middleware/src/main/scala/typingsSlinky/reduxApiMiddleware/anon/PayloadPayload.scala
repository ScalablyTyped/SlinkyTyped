package typingsSlinky.reduxApiMiddleware.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PayloadPayload[Payload] extends js.Object {
  var payload: Payload = js.native
}

object PayloadPayload {
  @scala.inline
  def apply[Payload](payload: Payload): PayloadPayload[Payload] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadPayload[Payload]]
  }
  @scala.inline
  implicit class PayloadPayloadOps[Self[payload] <: PayloadPayload[payload], Payload] (val x: Self[Payload]) extends AnyVal {
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

