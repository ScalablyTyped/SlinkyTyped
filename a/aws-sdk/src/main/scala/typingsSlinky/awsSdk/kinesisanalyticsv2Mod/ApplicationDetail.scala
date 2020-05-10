package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationDetail extends js.Object {
  /**
    * The ARN of the application.
    */
  var ApplicationARN: ResourceARN = js.native
  /**
    * Provides details about the application's SQL or Java code and starting parameters.
    */
  var ApplicationConfigurationDescription: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationConfigurationDescription] = js.native
  /**
    * The description of the application.
    */
  var ApplicationDescription: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationDescription] = js.native
  /**
    * The name of the application.
    */
  var ApplicationName: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  /**
    * The status of the application.
    */
  var ApplicationStatus: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationStatus = js.native
  /**
    * Provides the current application version. Kinesis Data Analytics updates the ApplicationVersionId each time you update the application.
    */
  var ApplicationVersionId: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId = js.native
  /**
    * Describes the application Amazon CloudWatch logging options.
    */
  var CloudWatchLoggingOptionDescriptions: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.CloudWatchLoggingOptionDescriptions] = js.native
  /**
    * The current timestamp when the application was created.
    */
  var CreateTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The current timestamp when the application was last updated.
    */
  var LastUpdateTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The runtime environment for the application (SQL-1.0 or FLINK-1_6).
    */
  var RuntimeEnvironment: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.RuntimeEnvironment = js.native
  /**
    * Specifies the IAM role that the application uses to access external resources.
    */
  var ServiceExecutionRole: js.UndefOr[RoleARN] = js.native
}

object ApplicationDetail {
  @scala.inline
  def apply(
    ApplicationARN: ResourceARN,
    ApplicationName: ApplicationName,
    ApplicationStatus: ApplicationStatus,
    ApplicationVersionId: ApplicationVersionId,
    RuntimeEnvironment: RuntimeEnvironment
  ): ApplicationDetail = {
    val __obj = js.Dynamic.literal(ApplicationARN = ApplicationARN.asInstanceOf[js.Any], ApplicationName = ApplicationName.asInstanceOf[js.Any], ApplicationStatus = ApplicationStatus.asInstanceOf[js.Any], ApplicationVersionId = ApplicationVersionId.asInstanceOf[js.Any], RuntimeEnvironment = RuntimeEnvironment.asInstanceOf[js.Any])
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
    def withRuntimeEnvironment(value: RuntimeEnvironment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuntimeEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationConfigurationDescription(value: ApplicationConfigurationDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationConfigurationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationConfigurationDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationConfigurationDescription")(js.undefined)
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
    def withServiceExecutionRole(value: RoleARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceExecutionRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceExecutionRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceExecutionRole")(js.undefined)
        ret
    }
  }
  
}

