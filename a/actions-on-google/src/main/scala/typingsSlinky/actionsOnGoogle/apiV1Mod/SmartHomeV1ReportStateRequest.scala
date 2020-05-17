package typingsSlinky.actionsOnGoogle.apiV1Mod

import typingsSlinky.actionsOnGoogle.anon.Devices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartHomeV1ReportStateRequest extends js.Object {
  var agentUserId: String = js.native
  var payload: Devices = js.native
  var requestId: String = js.native
}

object SmartHomeV1ReportStateRequest {
  @scala.inline
  def apply(agentUserId: String, payload: Devices, requestId: String): SmartHomeV1ReportStateRequest = {
    val __obj = js.Dynamic.literal(agentUserId = agentUserId.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ReportStateRequest]
  }
  @scala.inline
  implicit class SmartHomeV1ReportStateRequestOps[Self <: SmartHomeV1ReportStateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: Devices): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

