package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchStatus extends js.Object {
  /**
    * The date the patch was approved (or will be approved if the status is PENDING_APPROVAL).
    */
  var ApprovalDate: js.UndefOr[js.Date] = js.native
  /**
    * The compliance severity level for a patch.
    */
  var ComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.native
  /**
    * The approval status of a patch (APPROVED, PENDING_APPROVAL, EXPLICIT_APPROVED, EXPLICIT_REJECTED).
    */
  var DeploymentStatus: js.UndefOr[PatchDeploymentStatus] = js.native
}

object PatchStatus {
  @scala.inline
  def apply(): PatchStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchStatus]
  }
  @scala.inline
  implicit class PatchStatusOps[Self <: PatchStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprovalDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApprovalDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovalDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApprovalDate")(js.undefined)
        ret
    }
    @scala.inline
    def withComplianceLevel(value: PatchComplianceLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentStatus(value: PatchDeploymentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentStatus")(js.undefined)
        ret
    }
  }
  
}

