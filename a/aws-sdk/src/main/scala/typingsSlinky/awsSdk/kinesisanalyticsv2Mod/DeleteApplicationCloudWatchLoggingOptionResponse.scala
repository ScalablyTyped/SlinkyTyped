package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApplicationCloudWatchLoggingOptionResponse extends js.Object {
  /**
    * The application's Amazon Resource Name (ARN).
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The version ID of the application. Kinesis Data Analytics updates the ApplicationVersionId each time you change the CloudWatch logging options.
    */
  var ApplicationVersionId: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId] = js.native
  /**
    * The descriptions of the remaining CloudWatch logging options for the application.
    */
  var CloudWatchLoggingOptionDescriptions: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.CloudWatchLoggingOptionDescriptions] = js.native
}

object DeleteApplicationCloudWatchLoggingOptionResponse {
  @scala.inline
  def apply(): DeleteApplicationCloudWatchLoggingOptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteApplicationCloudWatchLoggingOptionResponse]
  }
  @scala.inline
  implicit class DeleteApplicationCloudWatchLoggingOptionResponseOps[Self <: DeleteApplicationCloudWatchLoggingOptionResponse] (val x: Self) extends AnyVal {
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
    def withoutApplicationARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationARN")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationVersionId(value: ApplicationVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationVersionId")(js.undefined)
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
  }
  
}

