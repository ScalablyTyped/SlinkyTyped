package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedshiftDestinationConfiguration extends js.Object {
  /**
    * The CloudWatch logging options for your delivery stream.
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
    * The user password.
    */
  var Password: typingsSlinky.awsSdk.firehoseMod.Password = js.native
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
  var S3BackupConfiguration: js.UndefOr[S3DestinationConfiguration] = js.native
  /**
    * The Amazon S3 backup mode.
    */
  var S3BackupMode: js.UndefOr[RedshiftS3BackupMode] = js.native
  /**
    * The configuration for the intermediate Amazon S3 location from which Amazon Redshift obtains data. Restrictions are described in the topic for CreateDeliveryStream. The compression formats SNAPPY or ZIP cannot be specified in RedshiftDestinationConfiguration.S3Configuration because the Amazon Redshift COPY operation that reads from the S3 bucket doesn't support these compression formats.
    */
  var S3Configuration: S3DestinationConfiguration = js.native
  /**
    * The name of the user.
    */
  var Username: typingsSlinky.awsSdk.firehoseMod.Username = js.native
}

object RedshiftDestinationConfiguration {
  @scala.inline
  def apply(
    ClusterJDBCURL: ClusterJDBCURL,
    CopyCommand: CopyCommand,
    Password: Password,
    RoleARN: RoleARN,
    S3Configuration: S3DestinationConfiguration,
    Username: Username
  ): RedshiftDestinationConfiguration = {
    val __obj = js.Dynamic.literal(ClusterJDBCURL = ClusterJDBCURL.asInstanceOf[js.Any], CopyCommand = CopyCommand.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any], S3Configuration = S3Configuration.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftDestinationConfiguration]
  }
  @scala.inline
  implicit class RedshiftDestinationConfigurationOps[Self <: RedshiftDestinationConfiguration] (val x: Self) extends AnyVal {
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
    def withPassword(value: Password): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleARN(value: RoleARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3Configuration(value: S3DestinationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Configuration")(value.asInstanceOf[js.Any])
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
    def withS3BackupConfiguration(value: S3DestinationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3BackupConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3BackupConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3BackupConfiguration")(js.undefined)
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

