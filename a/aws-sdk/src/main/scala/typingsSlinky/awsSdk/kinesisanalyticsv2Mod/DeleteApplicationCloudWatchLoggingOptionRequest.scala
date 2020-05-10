package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApplicationCloudWatchLoggingOptionRequest extends js.Object {
  /**
    * The application name.
    */
  var ApplicationName: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  /**
    * The CloudWatchLoggingOptionId of the Amazon CloudWatch logging option to delete. You can get the CloudWatchLoggingOptionId by using the DescribeApplication operation. 
    */
  var CloudWatchLoggingOptionId: Id = js.native
  /**
    * The version ID of the application. You can retrieve the application version ID using DescribeApplication.
    */
  var CurrentApplicationVersionId: ApplicationVersionId = js.native
}

object DeleteApplicationCloudWatchLoggingOptionRequest {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    CloudWatchLoggingOptionId: Id,
    CurrentApplicationVersionId: ApplicationVersionId
  ): DeleteApplicationCloudWatchLoggingOptionRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CloudWatchLoggingOptionId = CloudWatchLoggingOptionId.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationCloudWatchLoggingOptionRequest]
  }
  @scala.inline
  implicit class DeleteApplicationCloudWatchLoggingOptionRequestOps[Self <: DeleteApplicationCloudWatchLoggingOptionRequest] (val x: Self) extends AnyVal {
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
    def withCloudWatchLoggingOptionId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLoggingOptionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentApplicationVersionId(value: ApplicationVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentApplicationVersionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

