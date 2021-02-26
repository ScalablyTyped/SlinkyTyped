package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignEmailMessageMod.CampaignEmailMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignEmailMessageMod.UnmarshalledCampaignEmailMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignSmsMessageMod.CampaignSmsMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignSmsMessageMod.UnmarshalledCampaignSmsMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesMessageMod.Message
import typingsSlinky.awsSdkClientPinpointBrowser.typesMessageMod.UnmarshalledMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMessageConfigurationMod {
  
  @js.native
  trait MessageConfiguration extends StObject {
    
    /**
      * The message that the campaign delivers to ADM channels. Overrides the default message.
      */
    var ADMMessage: js.UndefOr[Message] = js.native
    
    /**
      * The message that the campaign delivers to APNS channels. Overrides the default message.
      */
    var APNSMessage: js.UndefOr[Message] = js.native
    
    /**
      * The message that the campaign delivers to Baidu channels. Overrides the default message.
      */
    var BaiduMessage: js.UndefOr[Message] = js.native
    
    /**
      * The default message for all channels.
      */
    var DefaultMessage: js.UndefOr[Message] = js.native
    
    /**
      * The email message configuration.
      */
    var EmailMessage: js.UndefOr[CampaignEmailMessage] = js.native
    
    /**
      * The message that the campaign delivers to GCM channels. Overrides the default message.
      */
    var GCMMessage: js.UndefOr[Message] = js.native
    
    /**
      * The SMS message configuration.
      */
    var SMSMessage: js.UndefOr[CampaignSmsMessage] = js.native
  }
  object MessageConfiguration {
    
    @scala.inline
    def apply(): MessageConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageConfiguration]
    }
    
    @scala.inline
    implicit class MessageConfigurationMutableBuilder[Self <: MessageConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setADMMessage(value: Message): Self = StObject.set(x, "ADMMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setADMMessageUndefined: Self = StObject.set(x, "ADMMessage", js.undefined)
      
      @scala.inline
      def setAPNSMessage(value: Message): Self = StObject.set(x, "APNSMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAPNSMessageUndefined: Self = StObject.set(x, "APNSMessage", js.undefined)
      
      @scala.inline
      def setBaiduMessage(value: Message): Self = StObject.set(x, "BaiduMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaiduMessageUndefined: Self = StObject.set(x, "BaiduMessage", js.undefined)
      
      @scala.inline
      def setDefaultMessage(value: Message): Self = StObject.set(x, "DefaultMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultMessageUndefined: Self = StObject.set(x, "DefaultMessage", js.undefined)
      
      @scala.inline
      def setEmailMessage(value: CampaignEmailMessage): Self = StObject.set(x, "EmailMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailMessageUndefined: Self = StObject.set(x, "EmailMessage", js.undefined)
      
      @scala.inline
      def setGCMMessage(value: Message): Self = StObject.set(x, "GCMMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGCMMessageUndefined: Self = StObject.set(x, "GCMMessage", js.undefined)
      
      @scala.inline
      def setSMSMessage(value: CampaignSmsMessage): Self = StObject.set(x, "SMSMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSMSMessageUndefined: Self = StObject.set(x, "SMSMessage", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledMessageConfiguration extends MessageConfiguration {
    
    /**
      * The message that the campaign delivers to ADM channels. Overrides the default message.
      */
    @JSName("ADMMessage")
    var ADMMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledMessage] = js.native
    
    /**
      * The message that the campaign delivers to APNS channels. Overrides the default message.
      */
    @JSName("APNSMessage")
    var APNSMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledMessage] = js.native
    
    /**
      * The message that the campaign delivers to Baidu channels. Overrides the default message.
      */
    @JSName("BaiduMessage")
    var BaiduMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledMessage] = js.native
    
    /**
      * The default message for all channels.
      */
    @JSName("DefaultMessage")
    var DefaultMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledMessage] = js.native
    
    /**
      * The email message configuration.
      */
    @JSName("EmailMessage")
    var EmailMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledCampaignEmailMessage] = js.native
    
    /**
      * The message that the campaign delivers to GCM channels. Overrides the default message.
      */
    @JSName("GCMMessage")
    var GCMMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledMessage] = js.native
    
    /**
      * The SMS message configuration.
      */
    @JSName("SMSMessage")
    var SMSMessage_UnmarshalledMessageConfiguration: js.UndefOr[UnmarshalledCampaignSmsMessage] = js.native
  }
  object UnmarshalledMessageConfiguration {
    
    @scala.inline
    def apply(): UnmarshalledMessageConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledMessageConfiguration]
    }
    
    @scala.inline
    implicit class UnmarshalledMessageConfigurationMutableBuilder[Self <: UnmarshalledMessageConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setADMMessage(value: UnmarshalledMessage): Self = StObject.set(x, "ADMMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setADMMessageUndefined: Self = StObject.set(x, "ADMMessage", js.undefined)
      
      @scala.inline
      def setAPNSMessage(value: UnmarshalledMessage): Self = StObject.set(x, "APNSMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAPNSMessageUndefined: Self = StObject.set(x, "APNSMessage", js.undefined)
      
      @scala.inline
      def setBaiduMessage(value: UnmarshalledMessage): Self = StObject.set(x, "BaiduMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaiduMessageUndefined: Self = StObject.set(x, "BaiduMessage", js.undefined)
      
      @scala.inline
      def setDefaultMessage(value: UnmarshalledMessage): Self = StObject.set(x, "DefaultMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultMessageUndefined: Self = StObject.set(x, "DefaultMessage", js.undefined)
      
      @scala.inline
      def setEmailMessage(value: UnmarshalledCampaignEmailMessage): Self = StObject.set(x, "EmailMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailMessageUndefined: Self = StObject.set(x, "EmailMessage", js.undefined)
      
      @scala.inline
      def setGCMMessage(value: UnmarshalledMessage): Self = StObject.set(x, "GCMMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGCMMessageUndefined: Self = StObject.set(x, "GCMMessage", js.undefined)
      
      @scala.inline
      def setSMSMessage(value: UnmarshalledCampaignSmsMessage): Self = StObject.set(x, "SMSMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSMSMessageUndefined: Self = StObject.set(x, "SMSMessage", js.undefined)
    }
  }
}
