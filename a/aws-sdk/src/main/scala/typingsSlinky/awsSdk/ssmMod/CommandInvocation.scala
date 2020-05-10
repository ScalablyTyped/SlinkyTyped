package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandInvocation extends js.Object {
  /**
    * CloudWatch Logs information where you want Systems Manager to send the command output.
    */
  var CloudWatchOutputConfig: js.UndefOr[typingsSlinky.awsSdk.ssmMod.CloudWatchOutputConfig] = js.native
  /**
    * The command against which this invocation was requested.
    */
  var CommandId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.CommandId] = js.native
  var CommandPlugins: js.UndefOr[CommandPluginList] = js.native
  /**
    * User-specified information about the command, such as a brief description of what the command should do.
    */
  var Comment: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Comment] = js.native
  /**
    * The document name that was requested for execution.
    */
  var DocumentName: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DocumentName] = js.native
  /**
    * The SSM document version.
    */
  var DocumentVersion: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DocumentVersion] = js.native
  /**
    * The instance ID in which this invocation was requested.
    */
  var InstanceId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.InstanceId] = js.native
  /**
    * The name of the invocation target. For Amazon EC2 instances this is the value for the aws:Name tag. For on-premises instances, this is the name of the instance.
    */
  var InstanceName: js.UndefOr[InstanceTagName] = js.native
  /**
    * Configurations for sending notifications about command status changes on a per instance basis.
    */
  var NotificationConfig: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NotificationConfig] = js.native
  /**
    * The time and date the request was sent to this instance.
    */
  var RequestedDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The IAM service role that Run Command uses to act on your behalf when sending notifications about command status changes on a per instance basis.
    */
  var ServiceRole: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ServiceRole] = js.native
  /**
    * The URL to the plugin's StdErr file in Amazon S3, if the Amazon S3 bucket was defined for the parent command. For an invocation, StandardErrorUrl is populated if there is just one plugin defined for the command, and the Amazon S3 bucket was defined for the command.
    */
  var StandardErrorUrl: js.UndefOr[Url] = js.native
  /**
    * The URL to the plugin's StdOut file in Amazon S3, if the Amazon S3 bucket was defined for the parent command. For an invocation, StandardOutputUrl is populated if there is just one plugin defined for the command, and the Amazon S3 bucket was defined for the command.
    */
  var StandardOutputUrl: js.UndefOr[Url] = js.native
  /**
    * Whether or not the invocation succeeded, failed, or is pending.
    */
  var Status: js.UndefOr[CommandInvocationStatus] = js.native
  /**
    * A detailed status of the command execution for each invocation (each instance targeted by the command). StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see Understanding Command Statuses in the AWS Systems Manager User Guide. StatusDetails can be one of the following values:   Pending: The command has not been sent to the instance.   In Progress: The command has been sent to the instance but has not reached a terminal state.   Success: The execution of the command or plugin was successfully completed. This is a terminal state.   Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired. Delivery timeouts do not count against the parent command's MaxErrors limit, but they do contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Execution Timed Out: Command execution started on the instance, but the execution was not complete before the execution timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal state.   Failed: The command was not successful on the instance. For a plugin, this indicates that the result code was not zero. For a command invocation, this indicates that the result code for one or more plugins was not zero. Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.   Canceled: The command was terminated before it was completed. This is a terminal state.   Undeliverable: The command can't be delivered to the instance. The instance might not exist or might not be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit and don't contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by the system. This is a terminal state.  
    */
  var StatusDetails: js.UndefOr[typingsSlinky.awsSdk.ssmMod.StatusDetails] = js.native
  /**
    *  Gets the trace output sent by the agent. 
    */
  var TraceOutput: js.UndefOr[InvocationTraceOutput] = js.native
}

object CommandInvocation {
  @scala.inline
  def apply(): CommandInvocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandInvocation]
  }
  @scala.inline
  implicit class CommandInvocationOps[Self <: CommandInvocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudWatchOutputConfig(value: CloudWatchOutputConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchOutputConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchOutputConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchOutputConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withCommandId(value: CommandId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommandId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommandId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommandId")(js.undefined)
        ret
    }
    @scala.inline
    def withCommandPlugins(value: CommandPluginList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommandPlugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommandPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommandPlugins")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: Comment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comment")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentName(value: DocumentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentName")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentVersion(value: DocumentVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceName(value: InstanceTagName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceName")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationConfig(value: NotificationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestedDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceRole(value: ServiceRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceRole")(js.undefined)
        ret
    }
    @scala.inline
    def withStandardErrorUrl(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardErrorUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardErrorUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardErrorUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withStandardOutputUrl(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardOutputUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardOutputUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardOutputUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: CommandInvocationStatus): Self = {
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
    def withStatusDetails(value: StatusDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withTraceOutput(value: InvocationTraceOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TraceOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraceOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TraceOutput")(js.undefined)
        ret
    }
  }
  
}

