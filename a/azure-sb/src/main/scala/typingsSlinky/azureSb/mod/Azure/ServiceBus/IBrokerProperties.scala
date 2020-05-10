package typingsSlinky.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBrokerProperties extends js.Object {
  var CorrelationId: String = js.native
  var Label: String = js.native
  var MessageId: String = js.native
  var PartitionKey: String = js.native
  var ReplyTo: String = js.native
  var ReplyToSessionId: String = js.native
  var ScheduledEnqueueTimeUtc: String = js.native
  var SessionId: String = js.native
  var TimeToLive: String = js.native
  var To: String = js.native
}

object IBrokerProperties {
  @scala.inline
  def apply(
    CorrelationId: String,
    Label: String,
    MessageId: String,
    PartitionKey: String,
    ReplyTo: String,
    ReplyToSessionId: String,
    ScheduledEnqueueTimeUtc: String,
    SessionId: String,
    TimeToLive: String,
    To: String
  ): IBrokerProperties = {
    val __obj = js.Dynamic.literal(CorrelationId = CorrelationId.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any], PartitionKey = PartitionKey.asInstanceOf[js.Any], ReplyTo = ReplyTo.asInstanceOf[js.Any], ReplyToSessionId = ReplyToSessionId.asInstanceOf[js.Any], ScheduledEnqueueTimeUtc = ScheduledEnqueueTimeUtc.asInstanceOf[js.Any], SessionId = SessionId.asInstanceOf[js.Any], TimeToLive = TimeToLive.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBrokerProperties]
  }
  @scala.inline
  implicit class IBrokerPropertiesOps[Self <: IBrokerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCorrelationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CorrelationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartitionKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartitionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplyTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplyTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplyToSessionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplyToSessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduledEnqueueTimeUtc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledEnqueueTimeUtc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeToLive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeToLive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("To")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

