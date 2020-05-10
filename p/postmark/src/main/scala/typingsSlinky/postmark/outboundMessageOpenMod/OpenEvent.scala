package typingsSlinky.postmark.outboundMessageOpenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenEvent extends js.Object {
  var Client: ClientDetails = js.native
  var Geo: GeoLocation = js.native
  var MessageID: String = js.native
  var MessageStream: String = js.native
  var OS: ClientDetails = js.native
  var Platform: String = js.native
  var ReadSeconds: Double = js.native
  var ReceivedAt: String = js.native
  var Recipient: String = js.native
  var RecordType: String = js.native
  var Tag: String = js.native
  var UserAgent: String = js.native
}

object OpenEvent {
  @scala.inline
  def apply(
    Client: ClientDetails,
    Geo: GeoLocation,
    MessageID: String,
    MessageStream: String,
    OS: ClientDetails,
    Platform: String,
    ReadSeconds: Double,
    ReceivedAt: String,
    Recipient: String,
    RecordType: String,
    Tag: String,
    UserAgent: String
  ): OpenEvent = {
    val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any], Geo = Geo.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], OS = OS.asInstanceOf[js.Any], Platform = Platform.asInstanceOf[js.Any], ReadSeconds = ReadSeconds.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], RecordType = RecordType.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], UserAgent = UserAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenEvent]
  }
  @scala.inline
  implicit class OpenEventOps[Self <: OpenEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: ClientDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeo(value: GeoLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Geo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageStream(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOS(value: ClientDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceivedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReceivedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipient(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Recipient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserAgent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

