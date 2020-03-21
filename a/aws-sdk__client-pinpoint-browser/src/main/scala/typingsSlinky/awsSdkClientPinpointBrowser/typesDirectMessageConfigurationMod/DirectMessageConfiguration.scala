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

trait DirectMessageConfiguration extends js.Object {
  /**
    * The message to ADM channels. Overrides the default push notification message.
    */
  var ADMMessage: js.UndefOr[typingsSlinky.awsSdkClientPinpointBrowser.typesAdmmessageMod.ADMMessage] = js.undefined
  /**
    * The message to APNS channels. Overrides the default push notification message.
    */
  var APNSMessage: js.UndefOr[typingsSlinky.awsSdkClientPinpointBrowser.typesApnsmessageMod.APNSMessage] = js.undefined
  /**
    * The message to Baidu GCM channels. Overrides the default push notification message.
    */
  var BaiduMessage: js.UndefOr[typingsSlinky.awsSdkClientPinpointBrowser.typesBaiduMessageMod.BaiduMessage] = js.undefined
  /**
    * The default message for all channels.
    */
  var DefaultMessage: js.UndefOr[typingsSlinky.awsSdkClientPinpointBrowser.typesDefaultMessageMod.DefaultMessage] = js.undefined
  /**
    * The default push notification message for all push channels.
    */
  var DefaultPushNotificationMessage: js.UndefOr[
    typingsSlinky.awsSdkClientPinpointBrowser.typesDefaultPushNotificationMessageMod.DefaultPushNotificationMessage
  ] = js.undefined
  /**
    * The message to Email channels. Overrides the default message.
    */
  var EmailMessage: js.UndefOr[typingsSlinky.awsSdkClientPinpointBrowser.typesEmailMessageMod.EmailMessage] = js.undefined
  /**
    * The message to GCM channels. Overrides the default push notification message.
    */
  var GCMMessage: js.UndefOr[typingsSlinky.awsSdkClientPinpointBrowser.typesGcmmessageMod.GCMMessage] = js.undefined
  /**
    * The message to SMS channels. Overrides the default message.
    */
  var SMSMessage: js.UndefOr[typingsSlinky.awsSdkClientPinpointBrowser.typesSmsmessageMod.SMSMessage] = js.undefined
}

object DirectMessageConfiguration {
  @scala.inline
  def apply(
    ADMMessage: ADMMessage = null,
    APNSMessage: APNSMessage = null,
    BaiduMessage: BaiduMessage = null,
    DefaultMessage: DefaultMessage = null,
    DefaultPushNotificationMessage: DefaultPushNotificationMessage = null,
    EmailMessage: EmailMessage = null,
    GCMMessage: GCMMessage = null,
    SMSMessage: SMSMessage = null
  ): DirectMessageConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ADMMessage != null) __obj.updateDynamic("ADMMessage")(ADMMessage.asInstanceOf[js.Any])
    if (APNSMessage != null) __obj.updateDynamic("APNSMessage")(APNSMessage.asInstanceOf[js.Any])
    if (BaiduMessage != null) __obj.updateDynamic("BaiduMessage")(BaiduMessage.asInstanceOf[js.Any])
    if (DefaultMessage != null) __obj.updateDynamic("DefaultMessage")(DefaultMessage.asInstanceOf[js.Any])
    if (DefaultPushNotificationMessage != null) __obj.updateDynamic("DefaultPushNotificationMessage")(DefaultPushNotificationMessage.asInstanceOf[js.Any])
    if (EmailMessage != null) __obj.updateDynamic("EmailMessage")(EmailMessage.asInstanceOf[js.Any])
    if (GCMMessage != null) __obj.updateDynamic("GCMMessage")(GCMMessage.asInstanceOf[js.Any])
    if (SMSMessage != null) __obj.updateDynamic("SMSMessage")(SMSMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectMessageConfiguration]
  }
}

