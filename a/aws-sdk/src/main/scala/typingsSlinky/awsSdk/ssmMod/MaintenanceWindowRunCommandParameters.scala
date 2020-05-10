package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowRunCommandParameters extends js.Object {
  var CloudWatchOutputConfig: js.UndefOr[typingsSlinky.awsSdk.ssmMod.CloudWatchOutputConfig] = js.native
  /**
    * Information about the commands to run.
    */
  var Comment: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Comment] = js.native
  /**
    * The SHA-256 or SHA-1 hash created by the system when the document was created. SHA-1 hashes have been deprecated.
    */
  var DocumentHash: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DocumentHash] = js.native
  /**
    * SHA-256 or SHA-1. SHA-1 hashes have been deprecated.
    */
  var DocumentHashType: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DocumentHashType] = js.native
  /**
    * The SSM document version to use in the request. You can specify $DEFAULT, $LATEST, or a specific version number. If you run commands by using the AWS CLI, then you must escape the first two options by using a backslash. If you specify a version number, then you don't need to use the backslash. For example: --document-version "\$DEFAULT" --document-version "\$LATEST" --document-version "3"
    */
  var DocumentVersion: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DocumentVersion] = js.native
  /**
    * Configurations for sending notifications about command status changes on a per-instance basis.
    */
  var NotificationConfig: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NotificationConfig] = js.native
  /**
    * The name of the Amazon S3 bucket.
    */
  var OutputS3BucketName: js.UndefOr[S3BucketName] = js.native
  /**
    * The Amazon S3 bucket subfolder.
    */
  var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.native
  /**
    * The parameters for the RUN_COMMAND task execution.
    */
  var Parameters: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Parameters] = js.native
  /**
    * The ARN of the IAM service role to use to publish Amazon Simple Notification Service (Amazon SNS) notifications for maintenance window Run Command tasks.
    */
  var ServiceRoleArn: js.UndefOr[ServiceRole] = js.native
  /**
    * If this time is reached and the command has not already started running, it doesn't run.
    */
  var TimeoutSeconds: js.UndefOr[typingsSlinky.awsSdk.ssmMod.TimeoutSeconds] = js.native
}

object MaintenanceWindowRunCommandParameters {
  @scala.inline
  def apply(): MaintenanceWindowRunCommandParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowRunCommandParameters]
  }
  @scala.inline
  implicit class MaintenanceWindowRunCommandParametersOps[Self <: MaintenanceWindowRunCommandParameters] (val x: Self) extends AnyVal {
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

