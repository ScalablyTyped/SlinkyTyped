package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.typesAdmmessageMod.ADMMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesAdmmessageMod.UnmarshalledADMMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesApnsmessageMod.APNSMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesApnsmessageMod.UnmarshalledAPNSMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesBaiduMessageMod.BaiduMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesBaiduMessageMod.UnmarshalledBaiduMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesDefaultMessageMod.DefaultMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesDefaultMessageMod.UnmarshalledDefaultMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesDefaultPushNotificationMessageMod.DefaultPushNotificationMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesDefaultPushNotificationMessageMod.UnmarshalledDefaultPushNotificationMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesEmailMessageMod.EmailMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesEmailMessageMod.UnmarshalledEmailMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesGcmmessageMod.GCMMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesGcmmessageMod.UnmarshalledGCMMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesSmsmessageMod.SMSMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesSmsmessageMod.UnmarshalledSMSMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDirectMessageConfigurationMod {
  
  @js.native
  trait DirectMessageConfiguration extends StObject {
    
    /**
      * The message to ADM channels. Overrides the default push notification message.
      */
    var ADMMessage: js.UndefOr[typingsSlinky.awsSdkClientPinpointBrowser.typesAdmmessageMod.ADMMessage] = js.native
    
    /**
      * The message to APNS channels. Overrides the default push notification message.
      */
    var APNSMessage: js.UndefOr[typingsSlinky.awsSdkClientPinpointBrowser.typesApnsmessageMod.APNSMessage] = js.native
    
    /**
      * The message to Baidu GCM channels. Overrides the default push notification message.
      */
    var BaiduMessage: js.UndefOr[typingsSlinky.awsSdkClientPinpointBrowser.typesBaiduMessageMod.BaiduMessage] = js.native
    
    /**
      * The default message for all channels.
      */
    var DefaultMessage: js.UndefOr[typingsSlinky.awsSdkClientPinpointBrowser.typesDefaultMessageMod.DefaultMessage] = js.native
    
    /**
      * The default push notification message for all push channels.
      */
    var DefaultPushNotificationMessage: js.UndefOr[
        typingsSlinky.awsSdkClientPinpointBrowser.typesDefaultPushNotificationMessageMod.DefaultPushNotificationMessage
      ] = js.native
    
    /**
      * The message to Email channels. Overrides the default message.
      */
    var EmailMessage: js.UndefOr[typingsSlinky.awsSdkClientPinpointBrowser.typesEmailMessageMod.EmailMessage] = js.native
    
    /**
      * The message to GCM channels. Overrides the default push notification message.
      */
    var GCMMessage: js.UndefOr[typingsSlinky.awsSdkClientPinpointBrowser.typesGcmmessageMod.GCMMessage] = js.native
    
    /**
      * The message to SMS channels. Overrides the default message.
      */
    var SMSMessage: js.UndefOr[typingsSlinky.awsSdkClientPinpointBrowser.typesSmsmessageMod.SMSMessage] = js.native
  }
  object DirectMessageConfiguration {
    
    @scala.inline
    def apply(): DirectMessageConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectMessageConfiguration]
    }
    
    @scala.inline
    implicit class DirectMessageConfigurationMutableBuilder[Self <: DirectMessageConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setADMMessage(value: ADMMessage): Self = StObject.set(x, "ADMMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setADMMessageUndefined: Self = StObject.set(x, "ADMMessage", js.undefined)
      
      @scala.inline
      def setAPNSMessage(value: APNSMessage): Self = StObject.set(x, "APNSMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAPNSMessageUndefined: Self = StObject.set(x, "APNSMessage", js.undefined)
      
      @scala.inline
      def setBaiduMessage(value: BaiduMessage): Self = StObject.set(x, "BaiduMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaiduMessageUndefined: Self = StObject.set(x, "BaiduMessage", js.undefined)
      
      @scala.inline
      def setDefaultMessage(value: DefaultMessage): Self = StObject.set(x, "DefaultMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultMessageUndefined: Self = StObject.set(x, "DefaultMessage", js.undefined)
      
      @scala.inline
      def setDefaultPushNotificationMessage(value: DefaultPushNotificationMessage): Self = StObject.set(x, "DefaultPushNotificationMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPushNotificationMessageUndefined: Self = StObject.set(x, "DefaultPushNotificationMessage", js.undefined)
      
      @scala.inline
      def setEmailMessage(value: EmailMessage): Self = StObject.set(x, "EmailMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailMessageUndefined: Self = StObject.set(x, "EmailMessage", js.undefined)
      
      @scala.inline
      def setGCMMessage(value: GCMMessage): Self = StObject.set(x, "GCMMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGCMMessageUndefined: Self = StObject.set(x, "GCMMessage", js.undefined)
      
      @scala.inline
      def setSMSMessage(value: SMSMessage): Self = StObject.set(x, "SMSMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSMSMessageUndefined: Self = StObject.set(x, "SMSMessage", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledDirectMessageConfiguration extends DirectMessageConfiguration {
    
    /**
      * The message to ADM channels. Overrides the default push notification message.
      */
    @JSName("ADMMessage")
    var ADMMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledADMMessage] = js.native
    
    /**
      * The message to APNS channels. Overrides the default push notification message.
      */
    @JSName("APNSMessage")
    var APNSMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledAPNSMessage] = js.native
    
    /**
      * The message to Baidu GCM channels. Overrides the default push notification message.
      */
    @JSName("BaiduMessage")
    var BaiduMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledBaiduMessage] = js.native
    
    /**
      * The default message for all channels.
      */
    @JSName("DefaultMessage")
    var DefaultMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledDefaultMessage] = js.native
    
    /**
      * The default push notification message for all push channels.
      */
    @JSName("DefaultPushNotificationMessage")
    var DefaultPushNotificationMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledDefaultPushNotificationMessage] = js.native
    
    /**
      * The message to Email channels. Overrides the default message.
      */
    @JSName("EmailMessage")
    var EmailMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledEmailMessage] = js.native
    
    /**
      * The message to GCM channels. Overrides the default push notification message.
      */
    @JSName("GCMMessage")
    var GCMMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledGCMMessage] = js.native
    
    /**
      * The message to SMS channels. Overrides the default message.
      */
    @JSName("SMSMessage")
    var SMSMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledSMSMessage] = js.native
  }
  object UnmarshalledDirectMessageConfiguration {
    
    @scala.inline
    def apply(): UnmarshalledDirectMessageConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledDirectMessageConfiguration]
    }
    
    @scala.inline
    implicit class UnmarshalledDirectMessageConfigurationMutableBuilder[Self <: UnmarshalledDirectMessageConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setADMMessage(value: UnmarshalledADMMessage): Self = StObject.set(x, "ADMMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setADMMessageUndefined: Self = StObject.set(x, "ADMMessage", js.undefined)
      
      @scala.inline
      def setAPNSMessage(value: UnmarshalledAPNSMessage): Self = StObject.set(x, "APNSMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAPNSMessageUndefined: Self = StObject.set(x, "APNSMessage", js.undefined)
      
      @scala.inline
      def setBaiduMessage(value: UnmarshalledBaiduMessage): Self = StObject.set(x, "BaiduMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaiduMessageUndefined: Self = StObject.set(x, "BaiduMessage", js.undefined)
      
      @scala.inline
      def setDefaultMessage(value: UnmarshalledDefaultMessage): Self = StObject.set(x, "DefaultMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultMessageUndefined: Self = StObject.set(x, "DefaultMessage", js.undefined)
      
      @scala.inline
      def setDefaultPushNotificationMessage(value: UnmarshalledDefaultPushNotificationMessage): Self = StObject.set(x, "DefaultPushNotificationMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPushNotificationMessageUndefined: Self = StObject.set(x, "DefaultPushNotificationMessage", js.undefined)
      
      @scala.inline
      def setEmailMessage(value: UnmarshalledEmailMessage): Self = StObject.set(x, "EmailMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailMessageUndefined: Self = StObject.set(x, "EmailMessage", js.undefined)
      
      @scala.inline
      def setGCMMessage(value: UnmarshalledGCMMessage): Self = StObject.set(x, "GCMMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGCMMessageUndefined: Self = StObject.set(x, "GCMMessage", js.undefined)
      
      @scala.inline
      def setSMSMessage(value: UnmarshalledSMSMessage): Self = StObject.set(x, "SMSMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSMSMessageUndefined: Self = StObject.set(x, "SMSMessage", js.undefined)
    }
  }
}
