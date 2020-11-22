package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeSetSummary extends js.Object {
  
  /**
    * The ID of the change set.
    */
  var ChangeSetId: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ChangeSetId] = js.native
  
  /**
    * The name of the change set.
    */
  var ChangeSetName: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ChangeSetName] = js.native
  
  /**
    * The start time when the change set was created, in UTC.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * Descriptive information about the change set.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Description] = js.native
  
  /**
    * If the change set execution status is AVAILABLE, you can execute the change set. If you can’t execute the change set, the status indicates why. For example, a change set might be in an UNAVAILABLE state because AWS CloudFormation is still creating it or in an OBSOLETE state because the stack was already updated.
    */
  var ExecutionStatus: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ExecutionStatus] = js.native
  
  /**
    * Specifies the current setting of IncludeNestedStacks for the change set.
    */
  var IncludeNestedStacks: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.IncludeNestedStacks] = js.native
  
  /**
    * The parent change set ID.
    */
  var ParentChangeSetId: js.UndefOr[ChangeSetId] = js.native
  
  /**
    * The root change set ID.
    */
  var RootChangeSetId: js.UndefOr[ChangeSetId] = js.native
  
  /**
    * The ID of the stack with which the change set is associated.
    */
  var StackId: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackId] = js.native
  
  /**
    * The name of the stack with which the change set is associated.
    */
  var StackName: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackName] = js.native
  
  /**
    * The state of the change set, such as CREATE_IN_PROGRESS, CREATE_COMPLETE, or FAILED.
    */
  var Status: js.UndefOr[ChangeSetStatus] = js.native
  
  /**
    * A description of the change set's status. For example, if your change set is in the FAILED state, AWS CloudFormation shows the error message.
    */
  var StatusReason: js.UndefOr[ChangeSetStatusReason] = js.native
}
object ChangeSetSummary {
  
  @scala.inline
  def apply(): ChangeSetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeSetSummary]
  }
  
  @scala.inline
  implicit class ChangeSetSummaryOps[Self <: ChangeSetSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChangeSetId(value: ChangeSetId): Self = this.set("ChangeSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeSetId: Self = this.set("ChangeSetId", js.undefined)
    
    @scala.inline
    def setChangeSetName(value: ChangeSetName): Self = this.set("ChangeSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeSetName: Self = this.set("ChangeSetName", js.undefined)
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setExecutionStatus(value: ExecutionStatus): Self = this.set("ExecutionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionStatus: Self = this.set("ExecutionStatus", js.undefined)
    
    @scala.inline
    def setIncludeNestedStacks(value: IncludeNestedStacks): Self = this.set("IncludeNestedStacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeNestedStacks: Self = this.set("IncludeNestedStacks", js.undefined)
    
    @scala.inline
    def setParentChangeSetId(value: ChangeSetId): Self = this.set("ParentChangeSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentChangeSetId: Self = this.set("ParentChangeSetId", js.undefined)
    
    @scala.inline
    def setRootChangeSetId(value: ChangeSetId): Self = this.set("RootChangeSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootChangeSetId: Self = this.set("RootChangeSetId", js.undefined)
    
    @scala.inline
    def setStackId(value: StackId): Self = this.set("StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackId: Self = this.set("StackId", js.undefined)
    
    @scala.inline
    def setStackName(value: StackName): Self = this.set("StackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackName: Self = this.set("StackName", js.undefined)
    
    @scala.inline
    def setStatus(value: ChangeSetStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusReason(value: ChangeSetStatusReason): Self = this.set("StatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusReason: Self = this.set("StatusReason", js.undefined)
  }
}
