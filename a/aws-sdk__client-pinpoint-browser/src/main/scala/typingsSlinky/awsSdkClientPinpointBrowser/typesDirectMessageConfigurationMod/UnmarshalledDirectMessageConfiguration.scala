package typingsSlinky.awsSdkClientPinpointBrowser.typesDirectMessageConfigurationMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesAdmmessageMod.UnmarshalledADMMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesApnsmessageMod.UnmarshalledAPNSMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesBaiduMessageMod.UnmarshalledBaiduMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesDefaultMessageMod.UnmarshalledDefaultMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesDefaultPushNotificationMessageMod.UnmarshalledDefaultPushNotificationMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesEmailMessageMod.UnmarshalledEmailMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesGcmmessageMod.UnmarshalledGCMMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesSmsmessageMod.UnmarshalledSMSMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class UnmarshalledDirectMessageConfigurationOps[Self <: UnmarshalledDirectMessageConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withADMMessage(value: UnmarshalledADMMessage): Self = {
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
    def withAPNSMessage(value: UnmarshalledAPNSMessage): Self = {
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
    def withBaiduMessage(value: UnmarshalledBaiduMessage): Self = {
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
    def withDefaultMessage(value: UnmarshalledDefaultMessage): Self = {
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
    def withDefaultPushNotificationMessage(value: UnmarshalledDefaultPushNotificationMessage): Self = {
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
    def withEmailMessage(value: UnmarshalledEmailMessage): Self = {
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
    def withGCMMessage(value: UnmarshalledGCMMessage): Self = {
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
    def withSMSMessage(value: UnmarshalledSMSMessage): Self = {
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

