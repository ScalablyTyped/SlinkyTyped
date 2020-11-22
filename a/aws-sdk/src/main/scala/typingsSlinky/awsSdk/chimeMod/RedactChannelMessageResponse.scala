package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedactChannelMessageResponse extends js.Object {
  
  /**
    * The ARN of the channel containing the messages that you want to redact.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The ID of the message being redacted.
    */
  var MessageId: js.UndefOr[typingsSlinky.awsSdk.chimeMod.MessageId] = js.native
}
object RedactChannelMessageResponse {
  
  @scala.inline
  def apply(): RedactChannelMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedactChannelMessageResponse]
  }
  
  @scala.inline
  implicit class RedactChannelMessageResponseOps[Self <: RedactChannelMessageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = this.set("ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelArn: Self = this.set("ChannelArn", js.undefined)
    
    @scala.inline
    def setMessageId(value: MessageId): Self = this.set("MessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageId: Self = this.set("MessageId", js.undefined)
  }
}
