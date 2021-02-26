package typingsSlinky.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuppressedDestinationAttributes extends StObject {
  
  /**
    * A unique identifier that's generated when an email address is added to the suppression list for your account.
    */
  var FeedbackId: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.FeedbackId] = js.native
  
  /**
    * The unique identifier of the email message that caused the email address to be added to the suppression list for your account.
    */
  var MessageId: js.UndefOr[OutboundMessageId] = js.native
}
object SuppressedDestinationAttributes {
  
  @scala.inline
  def apply(): SuppressedDestinationAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuppressedDestinationAttributes]
  }
  
  @scala.inline
  implicit class SuppressedDestinationAttributesMutableBuilder[Self <: SuppressedDestinationAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeedbackId(value: FeedbackId): Self = StObject.set(x, "FeedbackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackIdUndefined: Self = StObject.set(x, "FeedbackId", js.undefined)
    
    @scala.inline
    def setMessageId(value: OutboundMessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
  }
}
