package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchLogsConfig extends js.Object {
  /**
    *  The group name of the logs in Amazon CloudWatch Logs. For more information, see Working with Log Groups and Log Streams. 
    */
  var groupName: js.UndefOr[String] = js.native
  /**
    * The current status of the logs in Amazon CloudWatch Logs for a build project. Valid values are:    ENABLED: Amazon CloudWatch Logs are enabled for this build project.    DISABLED: Amazon CloudWatch Logs are not enabled for this build project.  
    */
  var status: LogsConfigStatusType = js.native
  /**
    *  The prefix of the stream name of the Amazon CloudWatch Logs. For more information, see Working with Log Groups and Log Streams. 
    */
  var streamName: js.UndefOr[String] = js.native
}

object CloudWatchLogsConfig {
  @scala.inline
  def apply(status: LogsConfigStatusType): CloudWatchLogsConfig = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLogsConfig]
  }
  @scala.inline
  implicit class CloudWatchLogsConfigOps[Self <: CloudWatchLogsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: LogsConfigStatusType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
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

