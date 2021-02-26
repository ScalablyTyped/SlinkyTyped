package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCommandInvocationResult extends StObject {
  
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
    * The ID of the managed instance targeted by the command. A managed instance can be an EC2 instance or an instance in your hybrid environment that is configured for Systems Manager.
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
    * The URL for the complete text written by the plugin to stdout in Amazon S3. If an S3 bucket was not specified, then this string is empty.
    */
  var StandardOutputUrl: js.UndefOr[Url] = js.native
  
  /**
    * The status of this invocation plugin. This status can be different than StatusDetails.
    */
  var Status: js.UndefOr[CommandInvocationStatus] = js.native
  
  /**
    * A detailed status of the command execution for an invocation. StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see Understanding command statuses in the AWS Systems Manager User Guide. StatusDetails can be one of the following values:   Pending: The command has not been sent to the instance.   In Progress: The command has been sent to the instance but has not reached a terminal state.   Delayed: The system attempted to send the command to the target, but the target was not available. The instance might not be available because of network issues, because the instance was stopped, or for similar reasons. The system will try to send the command again.   Success: The command or plugin ran successfully. This is a terminal state.   Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired. Delivery timeouts do not count against the parent command's MaxErrors limit, but they do contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Execution Timed Out: The command started to run on the instance, but the execution was not complete before the timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal state.   Failed: The command wasn't run successfully on the instance. For a plugin, this indicates that the result code was not zero. For a command invocation, this indicates that the result code for one or more plugins was not zero. Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.   Canceled: The command was terminated before it was completed. This is a terminal state.   Undeliverable: The command can't be delivered to the instance. The instance might not exist or might not be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit and don't contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by the system. This is a terminal state.  
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
  implicit class GetCommandInvocationResultMutableBuilder[Self <: GetCommandInvocationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchOutputConfig(value: CloudWatchOutputConfig): Self = StObject.set(x, "CloudWatchOutputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchOutputConfigUndefined: Self = StObject.set(x, "CloudWatchOutputConfig", js.undefined)
    
    @scala.inline
    def setCommandId(value: CommandId): Self = StObject.set(x, "CommandId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandIdUndefined: Self = StObject.set(x, "CommandId", js.undefined)
    
    @scala.inline
    def setComment(value: Comment): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    @scala.inline
    def setDocumentName(value: DocumentName): Self = StObject.set(x, "DocumentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentNameUndefined: Self = StObject.set(x, "DocumentName", js.undefined)
    
    @scala.inline
    def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    @scala.inline
    def setExecutionElapsedTime(value: StringDateTime): Self = StObject.set(x, "ExecutionElapsedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionElapsedTimeUndefined: Self = StObject.set(x, "ExecutionElapsedTime", js.undefined)
    
    @scala.inline
    def setExecutionEndDateTime(value: StringDateTime): Self = StObject.set(x, "ExecutionEndDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionEndDateTimeUndefined: Self = StObject.set(x, "ExecutionEndDateTime", js.undefined)
    
    @scala.inline
    def setExecutionStartDateTime(value: StringDateTime): Self = StObject.set(x, "ExecutionStartDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionStartDateTimeUndefined: Self = StObject.set(x, "ExecutionStartDateTime", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setPluginName(value: CommandPluginName): Self = StObject.set(x, "PluginName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginNameUndefined: Self = StObject.set(x, "PluginName", js.undefined)
    
    @scala.inline
    def setResponseCode(value: ResponseCode): Self = StObject.set(x, "ResponseCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCodeUndefined: Self = StObject.set(x, "ResponseCode", js.undefined)
    
    @scala.inline
    def setStandardErrorContent(value: StandardErrorContent): Self = StObject.set(x, "StandardErrorContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardErrorContentUndefined: Self = StObject.set(x, "StandardErrorContent", js.undefined)
    
    @scala.inline
    def setStandardErrorUrl(value: Url): Self = StObject.set(x, "StandardErrorUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardErrorUrlUndefined: Self = StObject.set(x, "StandardErrorUrl", js.undefined)
    
    @scala.inline
    def setStandardOutputContent(value: StandardOutputContent): Self = StObject.set(x, "StandardOutputContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardOutputContentUndefined: Self = StObject.set(x, "StandardOutputContent", js.undefined)
    
    @scala.inline
    def setStandardOutputUrl(value: Url): Self = StObject.set(x, "StandardOutputUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardOutputUrlUndefined: Self = StObject.set(x, "StandardOutputUrl", js.undefined)
    
    @scala.inline
    def setStatus(value: CommandInvocationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDetails(value: StatusDetails): Self = StObject.set(x, "StatusDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDetailsUndefined: Self = StObject.set(x, "StatusDetails", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
