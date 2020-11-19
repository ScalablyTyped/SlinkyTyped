package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApprovalRules(value: PatchRuleGroup): Self = this.set("ApprovalRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApprovalRules: Self = this.set("ApprovalRules", js.undefined)
    
    @scala.inline
    def setApprovedPatchesVarargs(value: PatchId*): Self = this.set("ApprovedPatches", js.Array(value :_*))
    
    @scala.inline
    def setApprovedPatches(value: PatchIdList): Self = this.set("ApprovedPatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApprovedPatches: Self = this.set("ApprovedPatches", js.undefined)
    
    @scala.inline
    def setApprovedPatchesComplianceLevel(value: PatchComplianceLevel): Self = this.set("ApprovedPatchesComplianceLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApprovedPatchesComplianceLevel: Self = this.set("ApprovedPatchesComplianceLevel", js.undefined)
    
    @scala.inline
    def setApprovedPatchesEnableNonSecurity(value: Boolean): Self = this.set("ApprovedPatchesEnableNonSecurity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApprovedPatchesEnableNonSecurity: Self = this.set("ApprovedPatchesEnableNonSecurity", js.undefined)
    
    @scala.inline
    def setBaselineId(value: BaselineId): Self = this.set("BaselineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaselineId: Self = this.set("BaselineId", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: js.Date): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("CreatedDate", js.undefined)
    
    @scala.inline
    def setDescription(value: BaselineDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setGlobalFilters(value: PatchFilterGroup): Self = this.set("GlobalFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalFilters: Self = this.set("GlobalFilters", js.undefined)
    
    @scala.inline
    def setModifiedDate(value: js.Date): Self = this.set("ModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedDate: Self = this.set("ModifiedDate", js.undefined)
    
    @scala.inline
    def setName(value: BaselineName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setOperatingSystem(value: OperatingSystem): Self = this.set("OperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatingSystem: Self = this.set("OperatingSystem", js.undefined)
    
    @scala.inline
    def setRejectedPatchesVarargs(value: PatchId*): Self = this.set("RejectedPatches", js.Array(value :_*))
    
    @scala.inline
    def setRejectedPatches(value: PatchIdList): Self = this.set("RejectedPatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectedPatches: Self = this.set("RejectedPatches", js.undefined)
    
    @scala.inline
    def setRejectedPatchesAction(value: PatchAction): Self = this.set("RejectedPatchesAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectedPatchesAction: Self = this.set("RejectedPatchesAction", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: PatchSource*): Self = this.set("Sources", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: PatchSourceList): Self = this.set("Sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSources: Self = this.set("Sources", js.undefined)
  }
}
