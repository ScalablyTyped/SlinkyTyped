package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeChangeSetOutput extends js.Object {
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
    * The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and for the specified monitoring period afterwards.
    */
  var RollbackConfiguration: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.RollbackConfiguration] = js.native
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
  implicit class DescribeChangeSetOutputOps[Self <: DescribeChangeSetOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withChangeSetName(value: ChangeSetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSetName")(js.undefined)
        ret
    }
    @scala.inline
    def withChanges(value: Changes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Changes")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
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
    def withExecutionStatus(value: ExecutionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
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
    def withStackName(value: StackName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackName")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ChangeSetStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusReason(value: ChangeSetStatusReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusReason")(js.undefined)
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
  }
  
}

