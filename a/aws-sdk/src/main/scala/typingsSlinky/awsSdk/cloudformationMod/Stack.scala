package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stack extends js.Object {
  /**
    * The capabilities allowed in the stack.
    */
  var Capabilities: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Capabilities] = js.native
  /**
    * The unique ID of the change set.
    */
  var ChangeSetId: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ChangeSetId] = js.native
  /**
    * The time at which the stack was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * The time the stack was deleted.
    */
  var DeletionTime: js.UndefOr[js.Date] = js.native
  /**
    * A user-defined description associated with the stack.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Description] = js.native
  /**
    * Boolean to enable or disable rollback on stack creation failures:    true: disable rollback    false: enable rollback  
    */
  var DisableRollback: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.DisableRollback] = js.native
  /**
    * Information on whether a stack's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources.
    */
  var DriftInformation: js.UndefOr[StackDriftInformation] = js.native
  /**
    * Whether termination protection is enabled for the stack.  For nested stacks, termination protection is set on the root stack and cannot be changed directly on the nested stack. For more information, see Protecting a Stack From Being Deleted in the AWS CloudFormation User Guide.
    */
  var EnableTerminationProtection: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.EnableTerminationProtection] = js.native
  /**
    * The time the stack was last updated. This field will only be returned if the stack has been updated at least once.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.native
  /**
    * SNS topic ARNs to which stack related events are published.
    */
  var NotificationARNs: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.NotificationARNs] = js.native
  /**
    * A list of output structures.
    */
  var Outputs: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Outputs] = js.native
  /**
    * A list of Parameter structures.
    */
  var Parameters: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Parameters] = js.native
  /**
    * For nested stacks--stacks created as resources for another stack--the stack ID of the direct parent of this stack. For the first level of nested stacks, the root stack is also the parent stack. For more information, see Working with Nested Stacks in the AWS CloudFormation User Guide.
    */
  var ParentId: js.UndefOr[StackId] = js.native
  /**
    * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that is associated with the stack. During a stack operation, AWS CloudFormation uses this role's credentials to make calls on your behalf.
    */
  var RoleARN: js.UndefOr[RoleARN_] = js.native
  /**
    * The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and for the specified monitoring period afterwards.
    */
  var RollbackConfiguration: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.RollbackConfiguration] = js.native
  /**
    * For nested stacks--stacks created as resources for another stack--the stack ID of the top-level stack to which the nested stack ultimately belongs. For more information, see Working with Nested Stacks in the AWS CloudFormation User Guide.
    */
  var RootId: js.UndefOr[StackId] = js.native
  /**
    * Unique identifier of the stack.
    */
  var StackId: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackId] = js.native
  /**
    * The name associated with the stack.
    */
  var StackName: typingsSlinky.awsSdk.cloudformationMod.StackName = js.native
  /**
    * Current status of the stack.
    */
  var StackStatus: typingsSlinky.awsSdk.cloudformationMod.StackStatus = js.native
  /**
    * Success/failure message associated with the stack status.
    */
  var StackStatusReason: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackStatusReason] = js.native
  /**
    * A list of Tags that specify information about the stack.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Tags] = js.native
  /**
    * The amount of time within which stack creation should complete.
    */
  var TimeoutInMinutes: js.UndefOr[TimeoutMinutes] = js.native
}

object Stack {
  @scala.inline
  def apply(CreationTime: js.Date, StackName: StackName, StackStatus: StackStatus): Stack = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any], StackStatus = StackStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stack]
  }
  @scala.inline
  implicit class StackOps[Self <: Stack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackName(value: StackName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackStatus(value: StackStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapabilities(value: Capabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Capabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withChangeSetId(value: ChangeSetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSetId")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletionTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletionTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
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
    def withDisableRollback(value: DisableRollback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableRollback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableRollback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableRollback")(js.undefined)
        ret
    }
    @scala.inline
    def withDriftInformation(value: StackDriftInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DriftInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriftInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DriftInformation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTerminationProtection(value: EnableTerminationProtection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableTerminationProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTerminationProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableTerminationProtection")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationARNs(value: NotificationARNs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationARNs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationARNs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationARNs")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputs(value: Outputs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outputs")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: Parameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withParentId(value: StackId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentId")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleARN(value: RoleARN_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(js.undefined)
        ret
    }
    @scala.inline
    def withRollbackConfiguration(value: RollbackConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RollbackConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRollbackConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RollbackConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withRootId(value: StackId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootId")(js.undefined)
        ret
    }
    @scala.inline
    def withStackId(value: StackId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(js.undefined)
        ret
    }
    @scala.inline
    def withStackStatusReason(value: StackStatusReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackStatusReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackStatusReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackStatusReason")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
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
    @scala.inline
    def withTimeoutInMinutes(value: TimeoutMinutes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeoutInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutInMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeoutInMinutes")(js.undefined)
        ret
    }
  }
  
}

