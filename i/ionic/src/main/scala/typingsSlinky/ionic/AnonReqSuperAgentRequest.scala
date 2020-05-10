package typingsSlinky.ionic

import typingsSlinky.ionic.httpMod.SuperAgentRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReqSuperAgentRequest extends js.Object {
  var req: SuperAgentRequest = js.native
}

object AnonReqSuperAgentRequest {
  @scala.inline
  def apply(req: SuperAgentRequest): AnonReqSuperAgentRequest = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReqSuperAgentRequest]
  }
  @scala.inline
  implicit class AnonReqSuperAgentRequestOps[Self <: AnonReqSuperAgentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReq(value: SuperAgentRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("req")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

