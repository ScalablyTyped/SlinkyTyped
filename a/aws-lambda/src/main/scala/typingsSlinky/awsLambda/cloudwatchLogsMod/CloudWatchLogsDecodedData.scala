package typingsSlinky.awsLambda.cloudwatchLogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchLogsDecodedData extends js.Object {
  var logEvents: js.Array[CloudWatchLogsLogEvent] = js.native
  var logGroup: String = js.native
  var logStream: String = js.native
  var messageType: String = js.native
  var owner: String = js.native
  var subscriptionFilters: js.Array[String] = js.native
}

object CloudWatchLogsDecodedData {
  @scala.inline
  def apply(
    logEvents: js.Array[CloudWatchLogsLogEvent],
    logGroup: String,
    logStream: String,
    messageType: String,
    owner: String,
    subscriptionFilters: js.Array[String]
  ): CloudWatchLogsDecodedData = {
    val __obj = js.Dynamic.literal(logEvents = logEvents.asInstanceOf[js.Any], logGroup = logGroup.asInstanceOf[js.Any], logStream = logStream.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], subscriptionFilters = subscriptionFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLogsDecodedData]
  }
  @scala.inline
  implicit class CloudWatchLogsDecodedDataOps[Self <: CloudWatchLogsDecodedData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogEvents(value: js.Array[CloudWatchLogsLogEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogStream(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptionFilters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionFilters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

