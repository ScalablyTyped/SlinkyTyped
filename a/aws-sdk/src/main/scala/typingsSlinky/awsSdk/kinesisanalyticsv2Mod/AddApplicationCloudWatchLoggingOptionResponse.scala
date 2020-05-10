package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddApplicationCloudWatchLoggingOptionResponse extends js.Object {
  /**
    * The application's ARN.
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The new version ID of the Kinesis Data Analytics application. Kinesis Data Analytics updates the ApplicationVersionId each time you change the CloudWatch logging options. 
    */
  var ApplicationVersionId: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId] = js.native
  /**
    * The descriptions of the current CloudWatch logging options for the Kinesis Data Analytics application.
    */
  var CloudWatchLoggingOptionDescriptions: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.CloudWatchLoggingOptionDescriptions] = js.native
}

object AddApplicationCloudWatchLoggingOptionResponse {
  @scala.inline
  def apply(): AddApplicationCloudWatchLoggingOptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddApplicationCloudWatchLoggingOptionResponse]
  }
  @scala.inline
  implicit class AddApplicationCloudWatchLoggingOptionResponseOps[Self <: AddApplicationCloudWatchLoggingOptionResponse] (val x: Self) extends AnyVal {
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

