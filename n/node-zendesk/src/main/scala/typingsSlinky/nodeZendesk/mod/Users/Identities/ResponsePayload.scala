package typingsSlinky.nodeZendesk.mod.Users.Identities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponsePayload extends js.Object {
  val identity: ResponseModel = js.native
}

object ResponsePayload {
  @scala.inline
  def apply(identity: ResponseModel): ResponsePayload = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsePayload]
  }
  @scala.inline
  implicit class ResponsePayloadOps[Self <: ResponsePayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentity(value: ResponseModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

