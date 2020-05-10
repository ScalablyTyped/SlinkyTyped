package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuditMitigationActionsTaskTarget extends js.Object {
  /**
    * Specifies a filter in the form of an audit check and set of reason codes that identify the findings from the audit to which the audit mitigation actions task apply.
    */
  var auditCheckToReasonCodeFilter: js.UndefOr[AuditCheckToReasonCodeFilter] = js.native
  /**
    * If the task will apply a mitigation action to findings from a specific audit, this value uniquely identifies the audit.
    */
  var auditTaskId: js.UndefOr[AuditTaskId] = js.native
  /**
    * If the task will apply a mitigation action to one or more listed findings, this value uniquely identifies those findings.
    */
  var findingIds: js.UndefOr[FindingIds] = js.native
}

object AuditMitigationActionsTaskTarget {
  @scala.inline
  def apply(): AuditMitigationActionsTaskTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditMitigationActionsTaskTarget]
  }
  @scala.inline
  implicit class AuditMitigationActionsTaskTargetOps[Self <: AuditMitigationActionsTaskTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuditCheckToReasonCodeFilter(value: AuditCheckToReasonCodeFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditCheckToReasonCodeFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuditCheckToReasonCodeFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditCheckToReasonCodeFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withAuditTaskId(value: AuditTaskId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditTaskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuditTaskId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditTaskId")(js.undefined)
        ret
    }
    @scala.inline
    def withFindingIds(value: FindingIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findingIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindingIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findingIds")(js.undefined)
        ret
    }
  }
  
}

