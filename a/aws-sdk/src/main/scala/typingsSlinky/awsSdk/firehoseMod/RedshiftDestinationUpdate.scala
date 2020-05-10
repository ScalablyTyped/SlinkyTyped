package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedshiftDestinationUpdate extends js.Object {
  /**
    * The Amazon CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.CloudWatchLoggingOptions] = js.native
  /**
    * The database connection string.
    */
  var ClusterJDBCURL: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.ClusterJDBCURL] = js.native
  /**
    * The COPY command.
    */
  var CopyCommand: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.CopyCommand] = js.native
  /**
    * The user password.
    */
  var Password: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.Password] = js.native
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
  var RoleARN: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.RoleARN] = js.native
  /**
    * The Amazon S3 backup mode.
    */
  var S3BackupMode: js.UndefOr[RedshiftS3BackupMode] = js.native
  /**
    * The Amazon S3 destination for backup.
    */
  var S3BackupUpdate: js.UndefOr[S3DestinationUpdate] = js.native
  /**
    * The Amazon S3 destination. The compression formats SNAPPY or ZIP cannot be specified in RedshiftDestinationUpdate.S3Update because the Amazon Redshift COPY operation that reads from the S3 bucket doesn't support these compression formats.
    */
  var S3Update: js.UndefOr[S3DestinationUpdate] = js.native
  /**
    * The name of the user.
    */
  var Username: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.Username] = js.native
}

object RedshiftDestinationUpdate {
  @scala.inline
  def apply(): RedshiftDestinationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedshiftDestinationUpdate]
  }
  @scala.inline
  implicit class RedshiftDestinationUpdateOps[Self <: RedshiftDestinationUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withClusterJDBCURL(value: ClusterJDBCURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterJDBCURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterJDBCURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterJDBCURL")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyCommand(value: CopyCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyCommand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyCommand")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: Password): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(js.undefined)
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
    def withRoleARN(value: RoleARN): Self = {
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
    @scala.inline
    def withS3BackupUpdate(value: S3DestinationUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3BackupUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3BackupUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3BackupUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Update(value: S3DestinationUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Update: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Update")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: Username): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(js.undefined)
        ret
    }
  }
  
}

