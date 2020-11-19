package typingsSlinky.postmark.outboundMessageOpenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClient(value: ClientDetails): Self = this.set("Client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeo(value: GeoLocation): Self = this.set("Geo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageID(value: String): Self = this.set("MessageID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageStream(value: String): Self = this.set("MessageStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOS(value: ClientDetails): Self = this.set("OS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadSeconds(value: Double): Self = this.set("ReadSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedAt(value: String): Self = this.set("ReceivedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient(value: String): Self = this.set("Recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordType(value: String): Self = this.set("RecordType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgent(value: String): Self = this.set("UserAgent", value.asInstanceOf[js.Any])
  }
}
