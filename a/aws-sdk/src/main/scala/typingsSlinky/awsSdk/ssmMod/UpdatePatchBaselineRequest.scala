package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePatchBaselineRequest extends js.Object {
  /**
    * A set of rules used to include patches in the baseline.
    */
  var ApprovalRules: js.UndefOr[PatchRuleGroup] = js.native
  /**
    * A list of explicitly approved patches for the baseline. For information about accepted formats for lists of approved patches and rejected patches, see Package Name Formats for Approved and Rejected Patch Lists in the AWS Systems Manager User Guide.
    */
  var ApprovedPatches: js.UndefOr[PatchIdList] = js.native
  /**
    * Assigns a new compliance severity level to an existing patch baseline.
    */
  var ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.native
  /**
    * Indicates whether the list of approved patches includes non-security updates that should be applied to the instances. The default value is 'false'. Applies to Linux instances only.
    */
  var ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the patch baseline to update.
    */
  var BaselineId: typingsSlinky.awsSdk.ssmMod.BaselineId = js.native
  /**
    * A description of the patch baseline.
    */
  var Description: js.UndefOr[BaselineDescription] = js.native
  /**
    * A set of global filters used to include patches in the baseline.
    */
  var GlobalFilters: js.UndefOr[PatchFilterGroup] = js.native
  /**
    * The name of the patch baseline.
    */
  var Name: js.UndefOr[BaselineName] = js.native
  /**
    * A list of explicitly rejected patches for the baseline. For information about accepted formats for lists of approved patches and rejected patches, see Package Name Formats for Approved and Rejected Patch Lists in the AWS Systems Manager User Guide.
    */
  var RejectedPatches: js.UndefOr[PatchIdList] = js.native
  /**
    * The action for Patch Manager to take on patches included in the RejectedPackages list.    ALLOW_AS_DEPENDENCY: A package in the Rejected patches list is installed only if it is a dependency of another package. It is considered compliant with the patch baseline, and its status is reported as InstalledOther. This is the default action if no option is specified.    BLOCK: Packages in the RejectedPatches list, and packages that include them as dependencies, are not installed under any circumstances. If a package was installed before it was added to the Rejected patches list, it is considered non-compliant with the patch baseline, and its status is reported as InstalledRejected.  
    */
  var RejectedPatchesAction: js.UndefOr[PatchAction] = js.native
  /**
    * If True, then all fields that are required by the CreatePatchBaseline action are also required for this API request. Optional fields that are not specified are set to null.
    */
  var Replace: js.UndefOr[Boolean] = js.native
  /**
    * Information about the patches to use to update the instances, including target operating systems and source repositories. Applies to Linux instances only.
    */
  var Sources: js.UndefOr[PatchSourceList] = js.native
}

object UpdatePatchBaselineRequest {
  @scala.inline
  def apply(BaselineId: BaselineId): UpdatePatchBaselineRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePatchBaselineRequest]
  }
  @scala.inline
  implicit class UpdatePatchBaselineRequestOps[Self <: UpdatePatchBaselineRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaselineId(value: BaselineId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaselineId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApprovalRules(value: PatchRuleGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApprovalRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovalRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApprovalRules")(js.undefined)
        ret
    }
    @scala.inline
    def withApprovedPatches(value: PatchIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApprovedPatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovedPatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApprovedPatches")(js.undefined)
        ret
    }
    @scala.inline
    def withApprovedPatchesComplianceLevel(value: PatchComplianceLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApprovedPatchesComplianceLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovedPatchesComplianceLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApprovedPatchesComplianceLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withApprovedPatchesEnableNonSecurity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApprovedPatchesEnableNonSecurity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovedPatchesEnableNonSecurity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApprovedPatchesEnableNonSecurity")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: BaselineDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalFilters(value: PatchFilterGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: BaselineName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectedPatches(value: PatchIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RejectedPatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectedPatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RejectedPatches")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectedPatchesAction(value: PatchAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RejectedPatchesAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectedPatchesAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RejectedPatchesAction")(js.undefined)
        ret
    }
    @scala.inline
    def withReplace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Replace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Replace")(js.undefined)
        ret
    }
    @scala.inline
    def withSources(value: PatchSourceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sources")(js.undefined)
        ret
    }
  }
  
}

