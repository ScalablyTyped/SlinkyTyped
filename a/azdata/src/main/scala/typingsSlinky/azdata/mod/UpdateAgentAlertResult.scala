package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAgentAlertResult extends ResultStatus {
  var alert: AgentJobStepInfo = js.native
}

object UpdateAgentAlertResult {
  @scala.inline
  def apply(alert: AgentJobStepInfo, errorMessage: String, success: Boolean): UpdateAgentAlertResult = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAgentAlertResult]
  }
  @scala.inline
  implicit class UpdateAgentAlertResultOps[Self <: UpdateAgentAlertResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlert(value: AgentJobStepInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

