package typingsSlinky.ionic.anon

import typingsSlinky.ionic.httpMod.SuperAgentRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReqSuperAgentRequest extends js.Object {
  var req: SuperAgentRequest = js.native
}

object ReqSuperAgentRequest {
  @scala.inline
  def apply(req: SuperAgentRequest): ReqSuperAgentRequest = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReqSuperAgentRequest]
  }
  @scala.inline
  implicit class ReqSuperAgentRequestOps[Self <: ReqSuperAgentRequest] (val x: Self) extends AnyVal {
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

