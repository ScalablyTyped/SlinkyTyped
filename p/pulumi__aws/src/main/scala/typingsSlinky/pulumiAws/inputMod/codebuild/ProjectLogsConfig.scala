package typingsSlinky.pulumiAws.inputMod.codebuild

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectLogsConfig extends js.Object {
  /**
    * Configuration for the builds to store logs to CloudWatch
    */
  var cloudwatchLogs: js.UndefOr[Input[ProjectLogsConfigCloudwatchLogs]] = js.native
  /**
    * Configuration for the builds to store logs to S3.
    */
  var s3Logs: js.UndefOr[Input[ProjectLogsConfigS3Logs]] = js.native
}

object ProjectLogsConfig {
  @scala.inline
  def apply(): ProjectLogsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectLogsConfig]
  }
  @scala.inline
  implicit class ProjectLogsConfigOps[Self <: ProjectLogsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudwatchLogs(value: Input[ProjectLogsConfigCloudwatchLogs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchLogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudwatchLogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchLogs")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Logs(value: Input[ProjectLogsConfigS3Logs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Logs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Logs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Logs")(js.undefined)
        ret
    }
  }
  
}

