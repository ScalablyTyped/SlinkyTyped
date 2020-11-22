package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelMessageSummary extends js.Object {
  
  /**
    * The content of the message summary.
    */
  var Content: js.UndefOr[typingsSlinky.awsSdk.chimeMod.Content] = js.native
  
  /**
    * The time at which the message summary was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.native
  
  var LastEditedTimestamp: js.UndefOr[js.Date] = js.native
  
  var LastUpdatedTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    * The ID of the message summary.
    */
  var MessageId: js.UndefOr[typingsSlinky.awsSdk.chimeMod.MessageId] = js.native
  
  /**
    * The metadata of the message summary.
    */
  var Metadata: js.UndefOr[typingsSlinky.awsSdk.chimeMod.Metadata] = js.native
  
  /**
    * Redacts the content of a message summary.
    */
  var Redacted: js.UndefOr[NonNullableBoolean] = js.native
  
  /**
    * The sender of the message summary.
    */
  var Sender: js.UndefOr[Identity] = js.native
  
  /**
    * The type of message summary.
    */
  var Type: js.UndefOr[ChannelMessageType] = js.native
}
object ChannelMessageSummary {
  
  @scala.inline
  def apply(): ChannelMessageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMessageSummary]
  }
  
  @scala.inline
  implicit class ChannelMessageSummaryOps[Self <: ChannelMessageSummary] (val x: Self) extends AnyVal {
    
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
    def setContent(value: Content): Self = this.set("Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("Content", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: js.Date): Self = this.set("CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setLastEditedTimestamp(value: js.Date): Self = this.set("LastEditedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastEditedTimestamp: Self = this.set("LastEditedTimestamp", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestamp(value: js.Date): Self = this.set("LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTimestamp: Self = this.set("LastUpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setMessageId(value: MessageId): Self = this.set("MessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageId: Self = this.set("MessageId", js.undefined)
    
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("Metadata", js.undefined)
    
    @scala.inline
    def setRedacted(value: NonNullableBoolean): Self = this.set("Redacted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedacted: Self = this.set("Redacted", js.undefined)
    
    @scala.inline
    def setSender(value: Identity): Self = this.set("Sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSender: Self = this.set("Sender", js.undefined)
    
    @scala.inline
    def setType(value: ChannelMessageType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
