package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendCommandRequest extends js.Object {
  /**
    * Enables Systems Manager to send Run Command output to Amazon CloudWatch Logs. 
    */
  var CloudWatchOutputConfig: js.UndefOr[typingsSlinky.awsSdk.ssmMod.CloudWatchOutputConfig] = js.native
  /**
    * User-specified information about the command, such as a brief description of what the command should do.
    */
  var Comment: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Comment] = js.native
  /**
    * The Sha256 or Sha1 hash created by the system when the document was created.   Sha1 hashes have been deprecated. 
    */
  var DocumentHash: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DocumentHash] = js.native
  /**
    * Sha256 or Sha1.  Sha1 hashes have been deprecated. 
    */
  var DocumentHashType: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DocumentHashType] = js.native
  /**
    * Required. The name of the Systems Manager document to run. This can be a public document or a custom document.
    */
  var DocumentName: DocumentARN = js.native
  /**
    * The SSM document version to use in the request. You can specify $DEFAULT, $LATEST, or a specific version number. If you run commands by using the AWS CLI, then you must escape the first two options by using a backslash. If you specify a version number, then you don't need to use the backslash. For example: --document-version "\$DEFAULT" --document-version "\$LATEST" --document-version "3"
    */
  var DocumentVersion: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DocumentVersion] = js.native
  /**
    * The instance IDs where the command should run. You can specify a maximum of 50 IDs. If you prefer not to list individual instance IDs, you can instead send commands to a fleet of instances using the Targets parameter, which accepts EC2 tags. For more information about how to use targets, see Sending Commands to a Fleet in the AWS Systems Manager User Guide.
    */
  var InstanceIds: js.UndefOr[InstanceIdList] = js.native
  /**
    * (Optional) The maximum number of instances that are allowed to run the command at the same time. You can specify a number such as 10 or a percentage such as 10%. The default value is 50. For more information about how to use MaxConcurrency, see Using Concurrency Controls in the AWS Systems Manager User Guide.
    */
  var MaxConcurrency: js.UndefOr[typingsSlinky.awsSdk.ssmMod.MaxConcurrency] = js.native
  /**
    * The maximum number of errors allowed without the command failing. When the command fails one more time beyond the value of MaxErrors, the systems stops sending the command to additional targets. You can specify a number like 10 or a percentage like 10%. The default value is 0. For more information about how to use MaxErrors, see Using Error Controls in the AWS Systems Manager User Guide.
    */
  var MaxErrors: js.UndefOr[typingsSlinky.awsSdk.ssmMod.MaxErrors] = js.native
  /**
    * Configurations for sending notifications.
    */
  var NotificationConfig: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NotificationConfig] = js.native
  /**
    * The name of the S3 bucket where command execution responses should be stored.
    */
  var OutputS3BucketName: js.UndefOr[S3BucketName] = js.native
  /**
    * The directory structure within the S3 bucket where the responses should be stored.
    */
  var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.native
  /**
    * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the Amazon S3 bucket region.
    */
  var OutputS3Region: js.UndefOr[S3Region] = js.native
  /**
    * The required and optional parameters specified in the document being run.
    */
  var Parameters: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Parameters] = js.native
  /**
    * The ARN of the IAM service role to use to publish Amazon Simple Notification Service (Amazon SNS) notifications for Run Command commands.
    */
  var ServiceRoleArn: js.UndefOr[ServiceRole] = js.native
  /**
    * (Optional) An array of search criteria that targets instances using a Key,Value combination that you specify. Targets is required if you don't provide one or more instance IDs in the call. For more information about how to use targets, see Sending Commands to a Fleet in the AWS Systems Manager User Guide.
    */
  var Targets: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Targets] = js.native
  /**
    * If this time is reached and the command has not already started running, it will not run.
    */
  var TimeoutSeconds: js.UndefOr[typingsSlinky.awsSdk.ssmMod.TimeoutSeconds] = js.native
}

object SendCommandRequest {
  @scala.inline
  def apply(DocumentName: DocumentARN): SendCommandRequest = {
    val __obj = js.Dynamic.literal(DocumentName = DocumentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendCommandRequest]
  }
  @scala.inline
  implicit class SendCommandRequestOps[Self <: SendCommandRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentName(value: DocumentARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentName")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withDocumentHash(value: DocumentHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentHash")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentHashType(value: DocumentHashType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentHashType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentHashType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentHashType")(js.undefined)
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
    def withServiceRoleArn(value: ServiceRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceRoleArn")(js.undefined)
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
    @scala.inline
    def withTimeoutSeconds(value: TimeoutSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeoutSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeoutSeconds")(js.undefined)
        ret
    }
  }
  
}

