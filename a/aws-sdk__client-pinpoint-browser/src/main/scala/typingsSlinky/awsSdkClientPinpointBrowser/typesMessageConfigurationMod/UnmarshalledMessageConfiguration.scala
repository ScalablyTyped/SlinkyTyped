package typingsSlinky.awsSdkClientPinpointBrowser.typesMessageConfigurationMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignEmailMessageMod.UnmarshalledCampaignEmailMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesCampaignSmsMessageMod.UnmarshalledCampaignSmsMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesMessageMod.UnmarshalledMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class UnmarshalledMessageConfigurationOps[Self <: UnmarshalledMessageConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withADMMessage(value: UnmarshalledMessage): Self = {
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
    def withAPNSMessage(value: UnmarshalledMessage): Self = {
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
    def withBaiduMessage(value: UnmarshalledMessage): Self = {
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
    def withDefaultMessage(value: UnmarshalledMessage): Self = {
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
    def withEmailMessage(value: UnmarshalledCampaignEmailMessage): Self = {
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
    def withGCMMessage(value: UnmarshalledMessage): Self = {
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
    def withSMSMessage(value: UnmarshalledCampaignSmsMessage): Self = {
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

