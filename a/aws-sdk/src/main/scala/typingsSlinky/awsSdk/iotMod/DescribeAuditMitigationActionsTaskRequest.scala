package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAuditMitigationActionsTaskRequest extends js.Object {
  /**
    * The unique identifier for the audit mitigation task.
    */
  var taskId: AuditMitigationActionsTaskId = js.native
}

object DescribeAuditMitigationActionsTaskRequest {
  @scala.inline
  def apply(taskId: AuditMitigationActionsTaskId): DescribeAuditMitigationActionsTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAuditMitigationActionsTaskRequest]
  }
  @scala.inline
  implicit class DescribeAuditMitigationActionsTaskRequestOps[Self <: DescribeAuditMitigationActionsTaskRequest] (val x: Self) extends AnyVal {
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
  }
  
}

