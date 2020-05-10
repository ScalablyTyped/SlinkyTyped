package typingsSlinky.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationDetail extends js.Object {
  /**
    * ARN of the application.
    */
  var ApplicationARN: ResourceARN = js.native
  /**
    * Returns the application code that you provided to perform data analysis on any of the in-application streams in your application.
    */
  var ApplicationCode: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.ApplicationCode] = js.native
  /**
    * Description of the application.
    */
  var ApplicationDescription: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.ApplicationDescription] = js.native
  /**
    * Name of the application.
    */
  var ApplicationName: typingsSlinky.awsSdk.kinesisanalyticsMod.ApplicationName = js.native
  /**
    * Status of the application.
    */
  var ApplicationStatus: typingsSlinky.awsSdk.kinesisanalyticsMod.ApplicationStatus = js.native
  /**
    * Provides the current application version.
    */
  var ApplicationVersionId: typingsSlinky.awsSdk.kinesisanalyticsMod.ApplicationVersionId = js.native
  /**
    * Describes the CloudWatch log streams that are configured to receive application messages. For more information about using CloudWatch log streams with Amazon Kinesis Analytics applications, see Working with Amazon CloudWatch Logs. 
    */
  var CloudWatchLoggingOptionDescriptions: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.CloudWatchLoggingOptionDescriptions] = js.native
  /**
    * Time stamp when the application version was created.
    */
  var CreateTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * Describes the application input configuration. For more information, see Configuring Application Input. 
    */
  var InputDescriptions: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.InputDescriptions] = js.native
  /**
    * Time stamp when the application was last updated.
    */
  var LastUpdateTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * Describes the application output configuration. For more information, see Configuring Application Output. 
    */
  var OutputDescriptions: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.OutputDescriptions] = js.native
  /**
    * Describes reference data sources configured for the application. For more information, see Configuring Application Input. 
    */
  var ReferenceDataSourceDescriptions: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsMod.ReferenceDataSourceDescriptions] = js.native
}

object ApplicationDetail {
  @scala.inline
  def apply(
    ApplicationARN: ResourceARN,
    ApplicationName: ApplicationName,
    ApplicationStatus: ApplicationStatus,
    ApplicationVersionId: ApplicationVersionId
  ): ApplicationDetail = {
    val __obj = js.Dynamic.literal(ApplicationARN = ApplicationARN.asInstanceOf[js.Any], ApplicationName = ApplicationName.asInstanceOf[js.Any], ApplicationStatus = ApplicationStatus.asInstanceOf[js.Any], ApplicationVersionId = ApplicationVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationDetail]
  }
  @scala.inline
  implicit class ApplicationDetailOps[Self <: ApplicationDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationARN(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationName(value: ApplicationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationStatus(value: ApplicationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationVersionId(value: ApplicationVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationCode(value: ApplicationCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationCode")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationDescription(value: ApplicationDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudWatchLoggingOptionDescriptions(value: CloudWatchLoggingOptionDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLoggingOptionDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchLoggingOptionDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLoggingOptionDescriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withInputDescriptions(value: InputDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputDescriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdateTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputDescriptions(value: OutputDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputDescriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceDataSourceDescriptions(value: ReferenceDataSourceDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferenceDataSourceDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceDataSourceDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferenceDataSourceDescriptions")(js.undefined)
        ret
    }
  }
  
}

