package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogsConfig extends js.Object {
  /**
    *  Information about Amazon CloudWatch Logs for a build project. Amazon CloudWatch Logs are enabled by default. 
    */
  var cloudWatchLogs: js.UndefOr[CloudWatchLogsConfig] = js.native
  /**
    *  Information about logs built to an S3 bucket for a build project. S3 logs are not enabled by default. 
    */
  var s3Logs: js.UndefOr[S3LogsConfig] = js.native
}

object LogsConfig {
  @scala.inline
  def apply(): LogsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogsConfig]
  }
  @scala.inline
  implicit class LogsConfigOps[Self <: LogsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudWatchLogs(value: CloudWatchLogsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudWatchLogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchLogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudWatchLogs")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Logs(value: S3LogsConfig): Self = {
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

