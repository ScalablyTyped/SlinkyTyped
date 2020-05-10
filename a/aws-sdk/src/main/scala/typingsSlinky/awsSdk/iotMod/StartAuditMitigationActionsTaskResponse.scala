package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartAuditMitigationActionsTaskResponse extends js.Object {
  /**
    * The unique identifier for the audit mitigation task. This matches the taskId that you specified in the request.
    */
  var taskId: js.UndefOr[AuditMitigationActionsTaskId] = js.native
}

object StartAuditMitigationActionsTaskResponse {
  @scala.inline
  def apply(): StartAuditMitigationActionsTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartAuditMitigationActionsTaskResponse]
  }
  @scala.inline
  implicit class StartAuditMitigationActionsTaskResponseOps[Self <: StartAuditMitigationActionsTaskResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTaskId(value: AuditMitigationActionsTaskId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskId")(js.undefined)
        ret
    }
  }
  
}

