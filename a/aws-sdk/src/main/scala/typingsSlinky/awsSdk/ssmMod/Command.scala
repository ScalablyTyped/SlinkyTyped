package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Command extends js.Object {
  /**
    * CloudWatch Logs information where you want Systems Manager to send the command output.
    */
  var CloudWatchOutputConfig: js.UndefOr[typingsSlinky.awsSdk.ssmMod.CloudWatchOutputConfig] = js.native
  /**
    * A unique identifier for this command.
    */
  var CommandId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.CommandId] = js.native
  /**
    * User-specified information about the command, such as a brief description of what the command should do.
    */
  var Comment: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Comment] = js.native
  /**
    * The number of targets for which the command invocation reached a terminal state. Terminal states include the following: Success, Failed, Execution Timed Out, Delivery Timed Out, Canceled, Terminated, or Undeliverable.
    */
  var CompletedCount: js.UndefOr[typingsSlinky.awsSdk.ssmMod.CompletedCount] = js.native
  /**
    * The number of targets for which the status is Delivery Timed Out.
    */
  var DeliveryTimedOutCount: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DeliveryTimedOutCount] = js.native
  /**
    * The name of the document requested for execution.
    */
  var DocumentName: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DocumentName] = js.native
  /**
    * The SSM document version.
    */
  var DocumentVersion: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DocumentVersion] = js.native
  /**
    * The number of targets for which the status is Failed or Execution Timed Out.
    */
  var ErrorCount: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ErrorCount] = js.native
  /**
    * If this time is reached and the command has not already started running, it will not run. Calculated based on the ExpiresAfter user input provided as part of the SendCommand API.
    */
  var ExpiresAfter: js.UndefOr[js.Date] = js.native
  /**
    * The instance IDs against which this command was requested.
    */
  var InstanceIds: js.UndefOr[InstanceIdList] = js.native
  /**
    * The maximum number of instances that are allowed to run the command at the same time. You can specify a number of instances, such as 10, or a percentage of instances, such as 10%. The default value is 50. For more information about how to use MaxConcurrency, see Running Commands Using Systems Manager Run Command in the AWS Systems Manager User Guide.
    */
  var MaxConcurrency: js.UndefOr[typingsSlinky.awsSdk.ssmMod.MaxConcurrency] = js.native
  /**
    * The maximum number of errors allowed before the system stops sending the command to additional targets. You can specify a number of errors, such as 10, or a percentage or errors, such as 10%. The default value is 0. For more information about how to use MaxErrors, see Running Commands Using Systems Manager Run Command in the AWS Systems Manager User Guide.
    */
  var MaxErrors: js.UndefOr[typingsSlinky.awsSdk.ssmMod.MaxErrors] = js.native
  /**
    * Configurations for sending notifications about command status changes. 
    */
  var NotificationConfig: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NotificationConfig] = js.native
  /**
    * The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the command.
    */
  var OutputS3BucketName: js.UndefOr[S3BucketName] = js.native
  /**
    * The S3 directory path inside the bucket where the responses to the command executions should be stored. This was requested when issuing the command.
    */
  var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.native
  /**
    * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the Amazon S3 bucket region.
    */
  var OutputS3Region: js.UndefOr[S3Region] = js.native
  /**
    * The parameter values to be inserted in the document when running the command.
    */
  var Parameters: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Parameters] = js.native
  /**
    * The date and time the command was requested.
    */
  var RequestedDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The IAM service role that Run Command uses to act on your behalf when sending notifications about command status changes. 
    */
  var ServiceRole: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ServiceRole] = js.native
  /**
    * The status of the command.
    */
  var Status: js.UndefOr[CommandStatus] = js.native
  /**
    * A detailed status of the command execution. StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see Understanding Command Statuses in the AWS Systems Manager User Guide. StatusDetails can be one of the following values:   Pending: The command has not been sent to any instances.   In Progress: The command has been sent to at least one instance but has not reached a final state on all instances.   Success: The command successfully ran on all invocations. This is a terminal state.   Delivery Timed Out: The value of MaxErrors or more command invocations shows a status of Delivery Timed Out. This is a terminal state.   Execution Timed Out: The value of MaxErrors or more command invocations shows a status of Execution Timed Out. This is a terminal state.   Failed: The value of MaxErrors or more command invocations shows a status of Failed. This is a terminal state.   Incomplete: The command was attempted on all instances and one or more invocations does not have a value of Success but not enough invocations failed for the status to be Failed. This is a terminal state.   Canceled: The command was terminated before it was completed. This is a terminal state.   Rate Exceeded: The number of instances targeted by the command exceeded the account limit for pending invocations. The system has canceled the command before running it on any instance. This is a terminal state.  
    */
  var StatusDetails: js.UndefOr[typingsSlinky.awsSdk.ssmMod.StatusDetails] = js.native
  /**
    * The number of targets for the command.
    */
  var TargetCount: js.UndefOr[typingsSlinky.awsSdk.ssmMod.TargetCount] = js.native
  /**
    * An array of search criteria that targets instances using a Key,Value combination that you specify. Targets is required if you don't provide one or more instance IDs in the call.
    */
  var Targets: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Targets] = js.native
}

object Command {
  @scala.inline
  def apply(): Command = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Command]
  }
  @scala.inline
  implicit class CommandOps[Self <: Command] (val x: Self) extends AnyVal {
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
    def withCompletedCount(value: CompletedCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletedCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliveryTimedOutCount(value: DeliveryTimedOutCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryTimedOutCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryTimedOutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryTimedOutCount")(js.undefined)
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
    def withErrorCount(value: ErrorCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCount")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiresAfter(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpiresAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiresAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpiresAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceIds(value: InstanceIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceIds")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConcurrency(value: MaxConcurrency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxConcurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConcurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxConcurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxErrors(value: MaxErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxErrors")(js.undefined)
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
    def withOutputS3BucketName(value: S3BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputS3BucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputS3BucketName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputS3BucketName")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputS3KeyPrefix(value: S3KeyPrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputS3KeyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputS3KeyPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputS3KeyPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputS3Region(value: S3Region): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputS3Region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputS3Region: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputS3Region")(js.undefined)
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
    def withStatus(value: CommandStatus): Self = {
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
    def withTargetCount(value: TargetCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTargets(value: Targets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Targets")(js.undefined)
        ret
    }
  }
  
}

