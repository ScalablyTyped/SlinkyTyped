package typingsSlinky.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeChangeSetOutput extends StObject {
  
  /**
    * If you execute the change set, the list of capabilities that were explicitly acknowledged when the change set was created.
    */
  var Capabilities: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Capabilities] = js.native
  
  /**
    * The ARN of the change set.
    */
  var ChangeSetId: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ChangeSetId] = js.native
  
  /**
    * The name of the change set.
    */
  var ChangeSetName: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ChangeSetName] = js.native
  
  /**
    * A list of Change structures that describes the resources AWS CloudFormation changes if you execute the change set.
    */
  var Changes: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Changes] = js.native
  
  /**
    * The start time when the change set was created, in UTC.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * Information about the change set.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Description] = js.native
  
  /**
    * If the change set execution status is AVAILABLE, you can execute the change set. If you can’t execute the change set, the status indicates why. For example, a change set might be in an UNAVAILABLE state because AWS CloudFormation is still creating it or in an OBSOLETE state because the stack was already updated.
    */
  var ExecutionStatus: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ExecutionStatus] = js.native
  
  /**
    * Verifies if IncludeNestedStacks is set to True.
    */
  var IncludeNestedStacks: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.IncludeNestedStacks] = js.native
  
  /**
    * If the output exceeds 1 MB, a string that identifies the next page of changes. If there is no additional page, this value is null.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.NextToken] = js.native
  
  /**
    * The ARNs of the Amazon Simple Notification Service (Amazon SNS) topics that will be associated with the stack if you execute the change set.
    */
  var NotificationARNs: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.NotificationARNs] = js.native
  
  /**
    * A list of Parameter structures that describes the input parameters and their values used to create the change set. For more information, see the Parameter data type.
    */
  var Parameters: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Parameters] = js.native
  
  /**
    * Specifies the change set ID of the parent change set in the current nested change set hierarchy.
    */
  var ParentChangeSetId: js.UndefOr[ChangeSetId] = js.native
  
  /**
    * The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and for the specified monitoring period afterwards.
    */
  var RollbackConfiguration: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.RollbackConfiguration] = js.native
  
  /**
    * Specifies the change set ID of the root change set in the current nested change set hierarchy.
    */
  var RootChangeSetId: js.UndefOr[ChangeSetId] = js.native
  
  /**
    * The ARN of the stack that is associated with the change set.
    */
  var StackId: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackId] = js.native
  
  /**
    * The name of the stack that is associated with the change set.
    */
  var StackName: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackName] = js.native
  
  /**
    * The current status of the change set, such as CREATE_IN_PROGRESS, CREATE_COMPLETE, or FAILED.
    */
  var Status: js.UndefOr[ChangeSetStatus] = js.native
  
  /**
    * A description of the change set's status. For example, if your attempt to create a change set failed, AWS CloudFormation shows the error message.
    */
  var StatusReason: js.UndefOr[ChangeSetStatusReason] = js.native
  
  /**
    * If you execute the change set, the tags that will be associated with the stack.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Tags] = js.native
}
object DescribeChangeSetOutput {
  
  @scala.inline
  def apply(): DescribeChangeSetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeChangeSetOutput]
  }
  
  @scala.inline
  implicit class DescribeChangeSetOutputMutableBuilder[Self <: DescribeChangeSetOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilities(value: Capabilities): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesUndefined: Self = StObject.set(x, "Capabilities", js.undefined)
    
    @scala.inline
    def setCapabilitiesVarargs(value: Capability*): Self = StObject.set(x, "Capabilities", js.Array(value :_*))
    
    @scala.inline
    def setChangeSetId(value: ChangeSetId): Self = StObject.set(x, "ChangeSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSetIdUndefined: Self = StObject.set(x, "ChangeSetId", js.undefined)
    
    @scala.inline
    def setChangeSetName(value: ChangeSetName): Self = StObject.set(x, "ChangeSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSetNameUndefined: Self = StObject.set(x, "ChangeSetName", js.undefined)
    
    @scala.inline
    def setChanges(value: Changes): Self = StObject.set(x, "Changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesUndefined: Self = StObject.set(x, "Changes", js.undefined)
    
    @scala.inline
    def setChangesVarargs(value: Change*): Self = StObject.set(x, "Changes", js.Array(value :_*))
    
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
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setNotificationARNs(value: NotificationARNs): Self = StObject.set(x, "NotificationARNs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationARNsUndefined: Self = StObject.set(x, "NotificationARNs", js.undefined)
    
    @scala.inline
    def setNotificationARNsVarargs(value: NotificationARN*): Self = StObject.set(x, "NotificationARNs", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: Parameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "Parameters", js.Array(value :_*))
    
    @scala.inline
    def setParentChangeSetId(value: ChangeSetId): Self = StObject.set(x, "ParentChangeSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentChangeSetIdUndefined: Self = StObject.set(x, "ParentChangeSetId", js.undefined)
    
    @scala.inline
    def setRollbackConfiguration(value: RollbackConfiguration): Self = StObject.set(x, "RollbackConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollbackConfigurationUndefined: Self = StObject.set(x, "RollbackConfiguration", js.undefined)
    
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
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
