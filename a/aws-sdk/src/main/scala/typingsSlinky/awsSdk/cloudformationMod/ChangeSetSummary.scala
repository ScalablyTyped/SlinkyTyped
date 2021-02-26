package typingsSlinky.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeSetSummary extends StObject {
  
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
  implicit class ChangeSetSummaryMutableBuilder[Self <: ChangeSetSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeSetId(value: ChangeSetId): Self = StObject.set(x, "ChangeSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSetIdUndefined: Self = StObject.set(x, "ChangeSetId", js.undefined)
    
    @scala.inline
    def setChangeSetName(value: ChangeSetName): Self = StObject.set(x, "ChangeSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSetNameUndefined: Self = StObject.set(x, "ChangeSetName", js.undefined)
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setExecutionStatus(value: ExecutionStatus): Self = StObject.set(x, "ExecutionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionStatusUndefined: Self = StObject.set(x, "ExecutionStatus", js.undefined)
    
    @scala.inline
    def setIncludeNestedStacks(value: IncludeNestedStacks): Self = StObject.set(x, "IncludeNestedStacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeNestedStacksUndefined: Self = StObject.set(x, "IncludeNestedStacks", js.undefined)
    
    @scala.inline
    def setParentChangeSetId(value: ChangeSetId): Self = StObject.set(x, "ParentChangeSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentChangeSetIdUndefined: Self = StObject.set(x, "ParentChangeSetId", js.undefined)
    
    @scala.inline
    def setRootChangeSetId(value: ChangeSetId): Self = StObject.set(x, "RootChangeSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootChangeSetIdUndefined: Self = StObject.set(x, "RootChangeSetId", js.undefined)
    
    @scala.inline
    def setStackId(value: StackId): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
    
    @scala.inline
    def setStackName(value: StackName): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackNameUndefined: Self = StObject.set(x, "StackName", js.undefined)
    
    @scala.inline
    def setStatus(value: ChangeSetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReason(value: ChangeSetStatusReason): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
