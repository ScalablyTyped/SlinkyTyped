package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectMessageConfiguration extends js.Object {
  /**
    * The default push notification message for the ADM (Amazon Device Messaging) channel. This message overrides the default push notification message (DefaultPushNotificationMessage).
    */
  var ADMMessage: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.ADMMessage] = js.native
  /**
    * The default push notification message for the APNs (Apple Push Notification service) channel. This message overrides the default push notification message (DefaultPushNotificationMessage).
    */
  var APNSMessage: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.APNSMessage] = js.native
  /**
    * The default push notification message for the Baidu (Baidu Cloud Push) channel. This message overrides the default push notification message (DefaultPushNotificationMessage).
    */
  var BaiduMessage: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.BaiduMessage] = js.native
  /**
    * The default message for all channels.
    */
  var DefaultMessage: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.DefaultMessage] = js.native
  /**
    * The default push notification message for all push notification channels.
    */
  var DefaultPushNotificationMessage: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.DefaultPushNotificationMessage] = js.native
  /**
    * The default message for the email channel. This message overrides the default message (DefaultMessage).
    */
  var EmailMessage: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.EmailMessage] = js.native
  /**
    * The default push notification message for the GCM channel, which is used to send notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message overrides the default push notification message (DefaultPushNotificationMessage).
    */
  var GCMMessage: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.GCMMessage] = js.native
  /**
    * The default message for the SMS channel. This message overrides the default message (DefaultMessage).
    */
  var SMSMessage: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.SMSMessage] = js.native
  /**
    * The default message for the voice channel. This message overrides the default message (DefaultMessage).
    */
  var VoiceMessage: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.VoiceMessage] = js.native
}

object DirectMessageConfiguration {
  @scala.inline
  def apply(): DirectMessageConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectMessageConfiguration]
  }
  @scala.inline
  implicit class DirectMessageConfigurationOps[Self <: DirectMessageConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withADMMessage(value: ADMMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ADMMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutADMMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ADMMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withAPNSMessage(value: APNSMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APNSMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAPNSMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APNSMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withBaiduMessage(value: BaiduMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaiduMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaiduMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaiduMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultMessage(value: DefaultMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPushNotificationMessage(value: DefaultPushNotificationMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultPushNotificationMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPushNotificationMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultPushNotificationMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailMessage(value: EmailMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withGCMMessage(value: GCMMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GCMMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGCMMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GCMMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withSMSMessage(value: SMSMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMSMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSMSMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMSMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withVoiceMessage(value: VoiceMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoiceMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceMessage")(js.undefined)
        ret
    }
  }
  
}

