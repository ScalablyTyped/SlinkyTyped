package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedshiftDestinationDescription extends js.Object {
  /**
    * The Amazon CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.CloudWatchLoggingOptions] = js.native
  /**
    * The database connection string.
    */
  var ClusterJDBCURL: typingsSlinky.awsSdk.firehoseMod.ClusterJDBCURL = js.native
  /**
    * The COPY command.
    */
  var CopyCommand: typingsSlinky.awsSdk.firehoseMod.CopyCommand = js.native
  /**
    * The data processing configuration.
    */
  var ProcessingConfiguration: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.ProcessingConfiguration] = js.native
  /**
    * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon Redshift. Default value is 3600 (60 minutes).
    */
  var RetryOptions: js.UndefOr[RedshiftRetryOptions] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var RoleARN: typingsSlinky.awsSdk.firehoseMod.RoleARN = js.native
  /**
    * The configuration for backup in Amazon S3.
    */
  var S3BackupDescription: js.UndefOr[S3DestinationDescription] = js.native
  /**
    * The Amazon S3 backup mode.
    */
  var S3BackupMode: js.UndefOr[RedshiftS3BackupMode] = js.native
  /**
    * The Amazon S3 destination.
    */
  var S3DestinationDescription: typingsSlinky.awsSdk.firehoseMod.S3DestinationDescription = js.native
  /**
    * The name of the user.
    */
  var Username: typingsSlinky.awsSdk.firehoseMod.Username = js.native
}

object RedshiftDestinationDescription {
  @scala.inline
  def apply(
    ClusterJDBCURL: ClusterJDBCURL,
    CopyCommand: CopyCommand,
    RoleARN: RoleARN,
    S3DestinationDescription: S3DestinationDescription,
    Username: Username
  ): RedshiftDestinationDescription = {
    val __obj = js.Dynamic.literal(ClusterJDBCURL = ClusterJDBCURL.asInstanceOf[js.Any], CopyCommand = CopyCommand.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any], S3DestinationDescription = S3DestinationDescription.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftDestinationDescription]
  }
  @scala.inline
  implicit class RedshiftDestinationDescriptionOps[Self <: RedshiftDestinationDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterJDBCURL(value: ClusterJDBCURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterJDBCURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyCommand(value: CopyCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyCommand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleARN(value: RoleARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3DestinationDescription(value: S3DestinationDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3DestinationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: Username): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLoggingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchLoggingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLoggingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingConfiguration(value: ProcessingConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryOptions(value: RedshiftRetryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetryOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetryOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withS3BackupDescription(value: S3DestinationDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3BackupDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3BackupDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3BackupDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withS3BackupMode(value: RedshiftS3BackupMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3BackupMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3BackupMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3BackupMode")(js.undefined)
        ret
    }
  }
  
}

