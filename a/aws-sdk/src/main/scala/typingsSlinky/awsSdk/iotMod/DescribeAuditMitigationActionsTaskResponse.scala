package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAuditMitigationActionsTaskResponse extends js.Object {
  /**
    * Specifies the mitigation actions and their parameters that are applied as part of this task.
    */
  var actionsDefinition: js.UndefOr[MitigationActionList] = js.native
  /**
    * Specifies the mitigation actions that should be applied to specific audit checks.
    */
  var auditCheckToActionsMapping: js.UndefOr[AuditCheckToActionsMapping] = js.native
  /**
    * The date and time when the task was completed or canceled.
    */
  var endTime: js.UndefOr[js.Date] = js.native
  /**
    * The date and time when the task was started.
    */
  var startTime: js.UndefOr[js.Date] = js.native
  /**
    * Identifies the findings to which the mitigation actions are applied. This can be by audit checks, by audit task, or a set of findings.
    */
  var target: js.UndefOr[AuditMitigationActionsTaskTarget] = js.native
  /**
    * Aggregate counts of the results when the mitigation tasks were applied to the findings for this audit mitigation actions task.
    */
  var taskStatistics: js.UndefOr[AuditMitigationActionsTaskStatistics] = js.native
  /**
    * The current status of the task.
    */
  var taskStatus: js.UndefOr[AuditMitigationActionsTaskStatus] = js.native
}

object DescribeAuditMitigationActionsTaskResponse {
  @scala.inline
  def apply(): DescribeAuditMitigationActionsTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAuditMitigationActionsTaskResponse]
  }
  @scala.inline
  implicit class DescribeAuditMitigationActionsTaskResponseOps[Self <: DescribeAuditMitigationActionsTaskResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionsDefinition(value: MitigationActionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionsDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionsDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionsDefinition")(js.undefined)
        ret
    }
    @scala.inline
    def withAuditCheckToActionsMapping(value: AuditCheckToActionsMapping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditCheckToActionsMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuditCheckToActionsMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditCheckToActionsMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: AuditMitigationActionsTaskTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskStatistics(value: AuditMitigationActionsTaskStatistics): Self = {
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
    def withTaskStatus(value: AuditMitigationActionsTaskStatus): Self = {
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
  }
  
}

