package typingsSlinky.awsSdkClientPinpointBrowser.typesDirectMessageConfigurationMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesAdmmessageMod.ADMMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesApnsmessageMod.APNSMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesBaiduMessageMod.BaiduMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesDefaultMessageMod.DefaultMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesDefaultPushNotificationMessageMod.DefaultPushNotificationMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesEmailMessageMod.EmailMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesGcmmessageMod.GCMMessage
import typingsSlinky.awsSdkClientPinpointBrowser.typesSmsmessageMod.SMSMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectMessageConfiguration extends js.Object {
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
  }
  
}

