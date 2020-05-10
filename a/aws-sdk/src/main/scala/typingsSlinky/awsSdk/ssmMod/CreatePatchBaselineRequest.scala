package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePatchBaselineRequest extends js.Object {
  /**
    * A set of rules used to include patches in the baseline.
    */
  var ApprovalRules: js.UndefOr[PatchRuleGroup] = js.native
  /**
    * A list of explicitly approved patches for the baseline. For information about accepted formats for lists of approved patches and rejected patches, see Package Name Formats for Approved and Rejected Patch Lists in the AWS Systems Manager User Guide.
    */
  var ApprovedPatches: js.UndefOr[PatchIdList] = js.native
  /**
    * Defines the compliance level for approved patches. This means that if an approved patch is reported as missing, this is the severity of the compliance violation. The default value is UNSPECIFIED.
    */
  var ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.native
  /**
    * Indicates whether the list of approved patches includes non-security updates that should be applied to the instances. The default value is 'false'. Applies to Linux instances only.
    */
  var ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean] = js.native
  /**
    * User-provided idempotency token.
    */
  var ClientToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ClientToken] = js.native
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
  var Name: BaselineName = js.native
  /**
    * Defines the operating system the patch baseline applies to. The Default value is WINDOWS.
    */
  var OperatingSystem: js.UndefOr[typingsSlinky.awsSdk.ssmMod.OperatingSystem] = js.native
  /**
    * A list of explicitly rejected patches for the baseline. For information about accepted formats for lists of approved patches and rejected patches, see Package Name Formats for Approved and Rejected Patch Lists in the AWS Systems Manager User Guide.
    */
  var RejectedPatches: js.UndefOr[PatchIdList] = js.native
  /**
    * The action for Patch Manager to take on patches included in the RejectedPackages list.    ALLOW_AS_DEPENDENCY: A package in the Rejected patches list is installed only if it is a dependency of another package. It is considered compliant with the patch baseline, and its status is reported as InstalledOther. This is the default action if no option is specified.    BLOCK: Packages in the RejectedPatches list, and packages that include them as dependencies, are not installed under any circumstances. If a package was installed before it was added to the Rejected patches list, it is considered non-compliant with the patch baseline, and its status is reported as InstalledRejected.  
    */
  var RejectedPatchesAction: js.UndefOr[PatchAction] = js.native
  /**
    * Information about the patches to use to update the instances, including target operating systems and source repositories. Applies to Linux instances only.
    */
  var Sources: js.UndefOr[PatchSourceList] = js.native
  /**
    * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag a patch baseline to identify the severity level of patches it specifies and the operating system family it applies to. In this case, you could specify the following key name/value pairs:    Key=PatchSeverity,Value=Critical     Key=OS,Value=Windows     To add tags to an existing patch baseline, use the AddTagsToResource action. 
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreatePatchBaselineRequest {
  @scala.inline
  def apply(Name: BaselineName): CreatePatchBaselineRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePatchBaselineRequest]
  }
  @scala.inline
  implicit class CreatePatchBaselineRequestOps[Self <: CreatePatchBaselineRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: BaselineName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
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
    def withClientToken(value: ClientToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(js.undefined)
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
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

