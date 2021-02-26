package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DUPLICATE
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.OPT_OUT
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PERMANENT_FAILURE
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.SUCCESSFUL
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.TEMPORARY_FAILURE
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.THROTTLED
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.UNKNOWN_FAILURE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMessageResultMod {
  
  @js.native
  trait MessageResult extends StObject {
    
    /**
      * The delivery status of the message. Possible values:
      *
      * SUCCESS - The message was successfully delivered to the endpoint.
      *
      * TRANSIENT_FAILURE - A temporary error occurred. Amazon Pinpoint will attempt to deliver the message again later.
      *
      * FAILURE_PERMANENT - An error occurred when delivering the message to the endpoint. Amazon Pinpoint won't attempt to send the message again.
      *
      * TIMEOUT - The message couldn't be sent within the timeout period.
      *
      * QUIET_TIME - The local time for the endpoint was within the Quiet Hours for the campaign.
      *
      * DAILY_CAP - The endpoint has received the maximum number of messages it can receive within a 24-hour period.
      *
      * HOLDOUT - The endpoint was in a hold out treatment for the campaign.
      *
      * THROTTLED - Amazon Pinpoint throttled sending to this endpoint.
      *
      * EXPIRED - The endpoint address is expired.
      *
      * CAMPAIGN_CAP - The endpoint received the maximum number of messages allowed by the campaign.
      *
      * SERVICE_FAILURE - A service-level failure prevented Amazon Pinpoint from delivering the message.
      *
      * UNKNOWN - An unknown error occurred.
      */
    var DeliveryStatus: js.UndefOr[
        SUCCESSFUL | THROTTLED | TEMPORARY_FAILURE | PERMANENT_FAILURE | UNKNOWN_FAILURE | OPT_OUT | DUPLICATE | String
      ] = js.native
    
    /**
      * Unique message identifier associated with the message that was sent.
      */
    var MessageId: js.UndefOr[String] = js.native
    
    /**
      * Downstream service status code.
      */
    var StatusCode: js.UndefOr[Double] = js.native
    
    /**
      * Status message for message delivery.
      */
    var StatusMessage: js.UndefOr[String] = js.native
    
    /**
      * If token was updated as part of delivery. (This is GCM Specific)
      */
    var UpdatedToken: js.UndefOr[String] = js.native
  }
  object MessageResult {
    
    @scala.inline
    def apply(): MessageResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageResult]
    }
    
    @scala.inline
    implicit class MessageResultMutableBuilder[Self <: MessageResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeliveryStatus(
        value: SUCCESSFUL | THROTTLED | TEMPORARY_FAILURE | PERMANENT_FAILURE | UNKNOWN_FAILURE | OPT_OUT | DUPLICATE | String
      ): Self = StObject.set(x, "DeliveryStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeliveryStatusUndefined: Self = StObject.set(x, "DeliveryStatus", js.undefined)
      
      @scala.inline
      def setMessageId(value: String): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "StatusCode", js.undefined)
      
      @scala.inline
      def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
      
      @scala.inline
      def setUpdatedToken(value: String): Self = StObject.set(x, "UpdatedToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedTokenUndefined: Self = StObject.set(x, "UpdatedToken", js.undefined)
    }
  }
  
  type UnmarshalledMessageResult = MessageResult
}
