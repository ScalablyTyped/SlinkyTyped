package typingsSlinky.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined azure-sb.azure-sb.Azure.ServiceBus.IBrokerPropertiesResponse & std.Partial<azure-sb.azure-sb.Azure.ServiceBus.IBrokerProperties> */
@js.native
trait BrokerPropertiesResponse extends js.Object {
  var CorrelationId: js.UndefOr[String] = js.native
  val DeliveryCount: Double = js.native
  var Label: js.UndefOr[String] = js.native
  val LockToken: String = js.native
  val LockedUntil: DateString = js.native
  var MessageId: js.UndefOr[String] = js.native
  var PartitionKey: js.UndefOr[String] = js.native
  var ReplyTo: js.UndefOr[String] = js.native
  var ReplyToSessionId: js.UndefOr[String] = js.native
  var ScheduledEnqueueTimeUtc: js.UndefOr[String] = js.native
  val SequenceNumber: Double = js.native
  var SessionId: js.UndefOr[String] = js.native
  var TimeToLive: js.UndefOr[String] = js.native
  var To: js.UndefOr[String] = js.native
}

object BrokerPropertiesResponse {
  @scala.inline
  def apply(DeliveryCount: Double, LockToken: String, LockedUntil: DateString, SequenceNumber: Double): BrokerPropertiesResponse = {
    val __obj = js.Dynamic.literal(DeliveryCount = DeliveryCount.asInstanceOf[js.Any], LockToken = LockToken.asInstanceOf[js.Any], LockedUntil = LockedUntil.asInstanceOf[js.Any], SequenceNumber = SequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerPropertiesResponse]
  }
  @scala.inline
  implicit class BrokerPropertiesResponseOps[Self <: BrokerPropertiesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLockToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LockToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLockedUntil(value: DateString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LockedUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequenceNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SequenceNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCorrelationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CorrelationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorrelationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CorrelationId")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Label")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageId")(js.undefined)
        ret
    }
    @scala.inline
    def withPartitionKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartitionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartitionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withReplyTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplyTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplyTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplyTo")(js.undefined)
        ret
    }
    @scala.inline
    def withReplyToSessionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplyToSessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplyToSessionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplyToSessionId")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledEnqueueTimeUtc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledEnqueueTimeUtc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledEnqueueTimeUtc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledEnqueueTimeUtc")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionId")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeToLive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeToLive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeToLive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeToLive")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("To")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("To")(js.undefined)
        ret
    }
  }
  
}

