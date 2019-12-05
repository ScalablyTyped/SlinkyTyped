package typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreDirectMessageConfigurationMod

import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreADMMessageMod._ADMMessage
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreAPNSMessageMod._APNSMessage
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreBaiduMessageMod._BaiduMessage
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreDefaultMessageMod._DefaultMessage
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreDefaultPushNotificationMessageMod._DefaultPushNotificationMessage
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEmailMessageMod._EmailMessage
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreGCMMessageMod._GCMMessage
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSMSMessageMod._SMSMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _DirectMessageConfiguration extends js.Object {
  /**
    * The message to ADM channels. Overrides the default push notification message.
    */
  var ADMMessage: js.UndefOr[_ADMMessage] = js.undefined
  /**
    * The message to APNS channels. Overrides the default push notification message.
    */
  var APNSMessage: js.UndefOr[_APNSMessage] = js.undefined
  /**
    * The message to Baidu GCM channels. Overrides the default push notification message.
    */
  var BaiduMessage: js.UndefOr[_BaiduMessage] = js.undefined
  /**
    * The default message for all channels.
    */
  var DefaultMessage: js.UndefOr[_DefaultMessage] = js.undefined
  /**
    * The default push notification message for all push channels.
    */
  var DefaultPushNotificationMessage: js.UndefOr[_DefaultPushNotificationMessage] = js.undefined
  /**
    * The message to Email channels. Overrides the default message.
    */
  var EmailMessage: js.UndefOr[_EmailMessage] = js.undefined
  /**
    * The message to GCM channels. Overrides the default push notification message.
    */
  var GCMMessage: js.UndefOr[_GCMMessage] = js.undefined
  /**
    * The message to SMS channels. Overrides the default message.
    */
  var SMSMessage: js.UndefOr[_SMSMessage] = js.undefined
}

object _DirectMessageConfiguration {
  @scala.inline
  def apply(
    ADMMessage: _ADMMessage = null,
    APNSMessage: _APNSMessage = null,
    BaiduMessage: _BaiduMessage = null,
    DefaultMessage: _DefaultMessage = null,
    DefaultPushNotificationMessage: _DefaultPushNotificationMessage = null,
    EmailMessage: _EmailMessage = null,
    GCMMessage: _GCMMessage = null,
    SMSMessage: _SMSMessage = null
  ): _DirectMessageConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ADMMessage != null) __obj.updateDynamic("ADMMessage")(ADMMessage.asInstanceOf[js.Any])
    if (APNSMessage != null) __obj.updateDynamic("APNSMessage")(APNSMessage.asInstanceOf[js.Any])
    if (BaiduMessage != null) __obj.updateDynamic("BaiduMessage")(BaiduMessage.asInstanceOf[js.Any])
    if (DefaultMessage != null) __obj.updateDynamic("DefaultMessage")(DefaultMessage.asInstanceOf[js.Any])
    if (DefaultPushNotificationMessage != null) __obj.updateDynamic("DefaultPushNotificationMessage")(DefaultPushNotificationMessage.asInstanceOf[js.Any])
    if (EmailMessage != null) __obj.updateDynamic("EmailMessage")(EmailMessage.asInstanceOf[js.Any])
    if (GCMMessage != null) __obj.updateDynamic("GCMMessage")(GCMMessage.asInstanceOf[js.Any])
    if (SMSMessage != null) __obj.updateDynamic("SMSMessage")(SMSMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[_DirectMessageConfiguration]
  }
}

