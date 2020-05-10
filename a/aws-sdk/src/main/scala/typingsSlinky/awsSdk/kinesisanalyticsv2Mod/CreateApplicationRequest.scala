package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApplicationRequest extends js.Object {
  /**
    * Use this parameter to configure the application.
    */
  var ApplicationConfiguration: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationConfiguration] = js.native
  /**
    * A summary description of the application.
    */
  var ApplicationDescription: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationDescription] = js.native
  /**
    * The name of your application (for example, sample-app).
    */
  var ApplicationName: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  /**
    * Use this parameter to configure an Amazon CloudWatch log stream to monitor application configuration errors. 
    */
  var CloudWatchLoggingOptions: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.CloudWatchLoggingOptions] = js.native
  /**
    * The runtime environment for the application (SQL-1.0 or FLINK-1_6).
    */
  var RuntimeEnvironment: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.RuntimeEnvironment = js.native
  /**
    * The IAM role used by the application to access Kinesis data streams, Kinesis Data Firehose delivery streams, Amazon S3 objects, and other external resources.
    */
  var ServiceExecutionRole: RoleARN = js.native
  /**
    * A list of one or more tags to assign to the application. A tag is a key-value pair that identifies an application. Note that the maximum number of application tags includes system tags. The maximum number of user-defined application tags is 50. For more information, see Using Tagging.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.Tags] = js.native
}

object CreateApplicationRequest {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    RuntimeEnvironment: RuntimeEnvironment,
    ServiceExecutionRole: RoleARN
  ): CreateApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], RuntimeEnvironment = RuntimeEnvironment.asInstanceOf[js.Any], ServiceExecutionRole = ServiceExecutionRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationRequest]
  }
  @scala.inline
  implicit class CreateApplicationRequestOps[Self <: CreateApplicationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationName(value: ApplicationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuntimeEnvironment(value: RuntimeEnvironment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuntimeEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceExecutionRole(value: RoleARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceExecutionRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationConfiguration(value: ApplicationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationConfiguration")(js.undefined)
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
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

