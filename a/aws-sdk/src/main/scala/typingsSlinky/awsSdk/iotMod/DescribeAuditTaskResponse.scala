package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAuditTaskResponse extends js.Object {
  /**
    * Detailed information about each check performed during this audit.
    */
  var auditDetails: js.UndefOr[AuditDetails] = js.native
  /**
    * The name of the scheduled audit (only if the audit was a scheduled audit).
    */
  var scheduledAuditName: js.UndefOr[ScheduledAuditName] = js.native
  /**
    * The time the audit started.
    */
  var taskStartTime: js.UndefOr[js.Date] = js.native
  /**
    * Statistical information about the audit.
    */
  var taskStatistics: js.UndefOr[TaskStatistics] = js.native
  /**
    * The status of the audit: one of "IN_PROGRESS", "COMPLETED", "FAILED", or "CANCELED".
    */
  var taskStatus: js.UndefOr[AuditTaskStatus] = js.native
  /**
    * The type of audit: "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
    */
  var taskType: js.UndefOr[AuditTaskType] = js.native
}

object DescribeAuditTaskResponse {
  @scala.inline
  def apply(): DescribeAuditTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAuditTaskResponse]
  }
  @scala.inline
  implicit class DescribeAuditTaskResponseOps[Self <: DescribeAuditTaskResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuditDetails(value: AuditDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuditDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledAuditName(value: ScheduledAuditName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledAuditName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledAuditName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledAuditName")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskStatistics(value: TaskStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskStatistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskStatistics")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskStatus(value: AuditTaskStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskType(value: AuditTaskType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskType")(js.undefined)
        ret
    }
  }
  
}

