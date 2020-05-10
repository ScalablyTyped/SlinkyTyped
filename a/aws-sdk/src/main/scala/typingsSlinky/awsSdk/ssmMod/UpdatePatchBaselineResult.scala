package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePatchBaselineResult extends js.Object {
  /**
    * A set of rules used to include patches in the baseline.
    */
  var ApprovalRules: js.UndefOr[PatchRuleGroup] = js.native
  /**
    * A list of explicitly approved patches for the baseline.
    */
  var ApprovedPatches: js.UndefOr[PatchIdList] = js.native
  /**
    * The compliance severity level assigned to the patch baseline after the update completed.
    */
  var ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.native
  /**
    * Indicates whether the list of approved patches includes non-security updates that should be applied to the instances. The default value is 'false'. Applies to Linux instances only.
    */
  var ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the deleted patch baseline.
    */
  var BaselineId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.BaselineId] = js.native
  /**
    * The date when the patch baseline was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.native
  /**
    * A description of the Patch Baseline.
    */
  var Description: js.UndefOr[BaselineDescription] = js.native
  /**
    * A set of global filters used to exclude patches from the baseline.
    */
  var GlobalFilters: js.UndefOr[PatchFilterGroup] = js.native
  /**
    * The date when the patch baseline was last modified.
    */
  var ModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * The name of the patch baseline.
    */
  var Name: js.UndefOr[BaselineName] = js.native
  /**
    * The operating system rule used by the updated patch baseline.
    */
  var OperatingSystem: js.UndefOr[typingsSlinky.awsSdk.ssmMod.OperatingSystem] = js.native
  /**
    * A list of explicitly rejected patches for the baseline.
    */
  var RejectedPatches: js.UndefOr[PatchIdList] = js.native
  /**
    * The action specified to take on patches included in the RejectedPatches list. A patch can be allowed only if it is a dependency of another package, or blocked entirely along with packages that include it as a dependency.
    */
  var RejectedPatchesAction: js.UndefOr[PatchAction] = js.native
  /**
    * Information about the patches to use to update the instances, including target operating systems and source repositories. Applies to Linux instances only.
    */
  var Sources: js.UndefOr[PatchSourceList] = js.native
}

object UpdatePatchBaselineResult {
  @scala.inline
  def apply(): UpdatePatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePatchBaselineResult]
  }
  @scala.inline
  implicit class UpdatePatchBaselineResultOps[Self <: UpdatePatchBaselineResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withBaselineId(value: BaselineId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaselineId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaselineId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(js.undefined)
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
    def withModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifiedDate")(js.undefined)
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
    def withOperatingSystem(value: OperatingSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperatingSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperatingSystem")(js.undefined)
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

