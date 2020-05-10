package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerLogs extends js.Object {
  var CloudWatchLogs: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.CloudWatchLogs] = js.native
  var Firehose: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.Firehose] = js.native
  var S3: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.S3] = js.native
}

object BrokerLogs {
  @scala.inline
  def apply(): BrokerLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerLogs]
  }
  @scala.inline
  implicit class BrokerLogsOps[Self <: BrokerLogs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudWatchLogs(value: CloudWatchLogs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchLogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLogs")(js.undefined)
        ret
    }
    @scala.inline
    def withFirehose(value: Firehose): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Firehose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirehose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Firehose")(js.undefined)
        ret
    }
    @scala.inline
    def withS3(value: S3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3")(js.undefined)
        ret
    }
  }
  
}

