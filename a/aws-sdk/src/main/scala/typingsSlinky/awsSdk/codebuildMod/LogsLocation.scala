package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogsLocation extends js.Object {
  /**
    *  Information about Amazon CloudWatch Logs for a build project. 
    */
  var cloudWatchLogs: js.UndefOr[CloudWatchLogsConfig] = js.native
  /**
    *  The ARN of Amazon CloudWatch Logs for a build project. Its format is arn:${Partition}:logs:${Region}:${Account}:log-group:${LogGroupName}:log-stream:${LogStreamName}. For more information, see Resources Defined by Amazon CloudWatch Logs. 
    */
  var cloudWatchLogsArn: js.UndefOr[String] = js.native
  /**
    * The URL to an individual build log in Amazon CloudWatch Logs.
    */
  var deepLink: js.UndefOr[String] = js.native
  /**
    * The name of the Amazon CloudWatch Logs group for the build logs.
    */
  var groupName: js.UndefOr[String] = js.native
  /**
    *  The URL to a build log in an S3 bucket. 
    */
  var s3DeepLink: js.UndefOr[String] = js.native
  /**
    *  Information about S3 logs for a build project. 
    */
  var s3Logs: js.UndefOr[S3LogsConfig] = js.native
  /**
    *  The ARN of S3 logs for a build project. Its format is arn:${Partition}:s3:::${BucketName}/${ObjectName}. For more information, see Resources Defined by Amazon S3. 
    */
  var s3LogsArn: js.UndefOr[String] = js.native
  /**
    * The name of the Amazon CloudWatch Logs stream for the build logs.
    */
  var streamName: js.UndefOr[String] = js.native
}

object LogsLocation {
  @scala.inline
  def apply(): LogsLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogsLocation]
  }
  @scala.inline
  implicit class LogsLocationOps[Self <: LogsLocation] (val x: Self) extends AnyVal {
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
    def withCloudWatchLogsArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudWatchLogsArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchLogsArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudWatchLogsArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDeepLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeepLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepLink")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupName")(js.undefined)
        ret
    }
    @scala.inline
    def withS3DeepLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3DeepLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3DeepLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3DeepLink")(js.undefined)
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
    @scala.inline
    def withS3LogsArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3LogsArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3LogsArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3LogsArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamName")(js.undefined)
        ret
    }
  }
  
}

