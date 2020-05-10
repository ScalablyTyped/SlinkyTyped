package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCommandInvocationResult extends js.Object {
  /**
    * CloudWatch Logs information where Systems Manager sent the command output.
    */
  var CloudWatchOutputConfig: js.UndefOr[typingsSlinky.awsSdk.ssmMod.CloudWatchOutputConfig] = js.native
  /**
    * The parent command ID of the invocation plugin.
    */
  var CommandId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.CommandId] = js.native
  /**
    * The comment text for the command.
    */
  var Comment: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Comment] = js.native
  /**
    * The name of the document that was run. For example, AWS-RunShellScript.
    */
  var DocumentName: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DocumentName] = js.native
  /**
    * The SSM document version used in the request.
    */
  var DocumentVersion: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DocumentVersion] = js.native
  /**
    * Duration since ExecutionStartDateTime.
    */
  var ExecutionElapsedTime: js.UndefOr[StringDateTime] = js.native
  /**
    * The date and time the plugin was finished running. Date and time are written in ISO 8601 format. For example, June 7, 2017 is represented as 2017-06-7. The following sample AWS CLI command uses the InvokedAfter filter.  aws ssm list-commands --filters key=InvokedAfter,value=2017-06-07T00:00:00Z  If the plugin has not started to run, the string is empty.
    */
  var ExecutionEndDateTime: js.UndefOr[StringDateTime] = js.native
  /**
    * The date and time the plugin started running. Date and time are written in ISO 8601 format. For example, June 7, 2017 is represented as 2017-06-7. The following sample AWS CLI command uses the InvokedBefore filter.  aws ssm list-commands --filters key=InvokedBefore,value=2017-06-07T00:00:00Z  If the plugin has not started to run, the string is empty.
    */
  var ExecutionStartDateTime: js.UndefOr[StringDateTime] = js.native
  /**
    * The ID of the managed instance targeted by the command. A managed instance can be an Amazon EC2 instance or an instance in your hybrid environment that is configured for Systems Manager.
    */
  var InstanceId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.InstanceId] = js.native
  /**
    * The name of the plugin for which you want detailed results. For example, aws:RunShellScript is a plugin.
    */
  var PluginName: js.UndefOr[CommandPluginName] = js.native
  /**
    * The error level response code for the plugin script. If the response code is -1, then the command has not started running on the instance, or it was not received by the instance.
    */
  var ResponseCode: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ResponseCode] = js.native
  /**
    * The first 8,000 characters written by the plugin to stderr. If the command has not finished running, then this string is empty.
    */
  var StandardErrorContent: js.UndefOr[typingsSlinky.awsSdk.ssmMod.StandardErrorContent] = js.native
  /**
    * The URL for the complete text written by the plugin to stderr. If the command has not finished running, then this string is empty.
    */
  var StandardErrorUrl: js.UndefOr[Url] = js.native
  /**
    * The first 24,000 characters written by the plugin to stdout. If the command has not finished running, if ExecutionStatus is neither Succeeded nor Failed, then this string is empty.
    */
  var StandardOutputContent: js.UndefOr[typingsSlinky.awsSdk.ssmMod.StandardOutputContent] = js.native
  /**
    * The URL for the complete text written by the plugin to stdout in Amazon S3. If an Amazon S3 bucket was not specified, then this string is empty.
    */
  var StandardOutputUrl: js.UndefOr[Url] = js.native
  /**
    * The status of this invocation plugin. This status can be different than StatusDetails.
    */
  var Status: js.UndefOr[CommandInvocationStatus] = js.native
  /**
    * A detailed status of the command execution for an invocation. StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see Understanding Command Statuses in the AWS Systems Manager User Guide. StatusDetails can be one of the following values:   Pending: The command has not been sent to the instance.   In Progress: The command has been sent to the instance but has not reached a terminal state.   Delayed: The system attempted to send the command to the target, but the target was not available. The instance might not be available because of network issues, the instance was stopped, etc. The system will try to deliver the command again.   Success: The command or plugin was run successfully. This is a terminal state.   Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired. Delivery timeouts do not count against the parent command's MaxErrors limit, but they do contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Execution Timed Out: The command started to run on the instance, but the execution was not complete before the timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal state.   Failed: The command wasn't run successfully on the instance. For a plugin, this indicates that the result code was not zero. For a command invocation, this indicates that the result code for one or more plugins was not zero. Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.   Canceled: The command was terminated before it was completed. This is a terminal state.   Undeliverable: The command can't be delivered to the instance. The instance might not exist or might not be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit and don't contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by the system. This is a terminal state.  
    */
  var StatusDetails: js.UndefOr[typingsSlinky.awsSdk.ssmMod.StatusDetails] = js.native
}

object GetCommandInvocationResult {
  @scala.inline
  def apply(): GetCommandInvocationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCommandInvocationResult]
  }
  @scala.inline
  implicit class GetCommandInvocationResultOps[Self <: GetCommandInvocationResult] (val x: Self) extends AnyVal {
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
    def withExecutionElapsedTime(value: StringDateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionElapsedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionElapsedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionElapsedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionEndDateTime(value: StringDateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionEndDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionEndDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionEndDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionStartDateTime(value: StringDateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionStartDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionStartDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionStartDateTime")(js.undefined)
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
    def withPluginName(value: CommandPluginName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PluginName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPluginName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PluginName")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseCode(value: ResponseCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseCode")(js.undefined)
        ret
    }
    @scala.inline
    def withStandardErrorContent(value: StandardErrorContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardErrorContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardErrorContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardErrorContent")(js.undefined)
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
    def withStandardOutputContent(value: StandardOutputContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardOutputContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardOutputContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardOutputContent")(js.undefined)
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
  }
  
}

