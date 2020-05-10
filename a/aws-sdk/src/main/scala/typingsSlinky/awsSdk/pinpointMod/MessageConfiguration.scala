package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageConfiguration extends js.Object {
  /**
    * The message that the campaign sends through the ADM (Amazon Device Messaging) channel. This message overrides the default message.
    */
  var ADMMessage: js.UndefOr[Message] = js.native
  /**
    * The message that the campaign sends through the APNs (Apple Push Notification service) channel. This message overrides the default message.
    */
  var APNSMessage: js.UndefOr[Message] = js.native
  /**
    * The message that the campaign sends through the Baidu (Baidu Cloud Push) channel. This message overrides the default message.
    */
  var BaiduMessage: js.UndefOr[Message] = js.native
  /**
    * The default message that the campaign sends through all the channels that are configured for the campaign.
    */
  var DefaultMessage: js.UndefOr[Message] = js.native
  /**
    * The message that the campaign sends through the email channel.
    */
  var EmailMessage: js.UndefOr[CampaignEmailMessage] = js.native
  /**
    * The message that the campaign sends through the GCM channel, which enables Amazon Pinpoint to send push notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message overrides the default message.
    */
  var GCMMessage: js.UndefOr[Message] = js.native
  /**
    * The message that the campaign sends through the SMS channel.
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
  implicit class MessageConfigurationOps[Self <: MessageConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withADMMessage(value: Message): Self = {
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
    def withAPNSMessage(value: Message): Self = {
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
    def withBaiduMessage(value: Message): Self = {
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
    def withDefaultMessage(value: Message): Self = {
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
    def withEmailMessage(value: CampaignEmailMessage): Self = {
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
    def withGCMMessage(value: Message): Self = {
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
    def withSMSMessage(value: CampaignSmsMessage): Self = {
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
  }
  
}

