package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuditFinding extends js.Object {
  /**
    * The audit check that generated this result.
    */
  var checkName: js.UndefOr[AuditCheckName] = js.native
  /**
    * A unique identifier for this set of audit findings. This identifier is used to apply mitigation tasks to one or more sets of findings.
    */
  var findingId: js.UndefOr[FindingId] = js.native
  /**
    * The time the result (finding) was discovered.
    */
  var findingTime: js.UndefOr[js.Date] = js.native
  /**
    * The resource that was found to be noncompliant with the audit check.
    */
  var nonCompliantResource: js.UndefOr[NonCompliantResource] = js.native
  /**
    * The reason the resource was noncompliant.
    */
  var reasonForNonCompliance: js.UndefOr[ReasonForNonCompliance] = js.native
  /**
    * A code that indicates the reason that the resource was noncompliant.
    */
  var reasonForNonComplianceCode: js.UndefOr[ReasonForNonComplianceCode] = js.native
  /**
    * The list of related resources.
    */
  var relatedResources: js.UndefOr[RelatedResources] = js.native
  /**
    * The severity of the result (finding).
    */
  var severity: js.UndefOr[AuditFindingSeverity] = js.native
  /**
    * The ID of the audit that generated this result (finding).
    */
  var taskId: js.UndefOr[AuditTaskId] = js.native
  /**
    * The time the audit started.
    */
  var taskStartTime: js.UndefOr[js.Date] = js.native
}

object AuditFinding {
  @scala.inline
  def apply(): AuditFinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditFinding]
  }
  @scala.inline
  implicit class AuditFindingOps[Self <: AuditFinding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckName(value: AuditCheckName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkName")(js.undefined)
        ret
    }
    @scala.inline
    def withFindingId(value: FindingId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findingId")(js.undefined)
        ret
    }
    @scala.inline
    def withFindingTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findingTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindingTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findingTime")(js.undefined)
        ret
    }
    @scala.inline
    def withNonCompliantResource(value: NonCompliantResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonCompliantResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonCompliantResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonCompliantResource")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonForNonCompliance(value: ReasonForNonCompliance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonForNonCompliance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonForNonCompliance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonForNonCompliance")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonForNonComplianceCode(value: ReasonForNonComplianceCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonForNonComplianceCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonForNonComplianceCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonForNonComplianceCode")(js.undefined)
        ret
    }
    @scala.inline
    def withRelatedResources(value: RelatedResources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedResources")(js.undefined)
        ret
    }
    @scala.inline
    def withSeverity(value: AuditFindingSeverity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskId(value: AuditTaskId): Self = {
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
  }
  
}

