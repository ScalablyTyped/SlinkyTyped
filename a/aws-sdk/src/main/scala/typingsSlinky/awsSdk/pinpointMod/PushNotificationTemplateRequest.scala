package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushNotificationTemplateRequest extends js.Object {
  /**
    * The message template to use for the ADM (Amazon Device Messaging) channel. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var ADM: js.UndefOr[AndroidPushNotificationTemplate] = js.native
  /**
    * The message template to use for the APNs (Apple Push Notification service) channel. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var APNS: js.UndefOr[APNSPushNotificationTemplate] = js.native
  /**
    * The message template to use for the Baidu (Baidu Cloud Push) channel. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var Baidu: js.UndefOr[AndroidPushNotificationTemplate] = js.native
  /**
    * The default message template to use for push notification channels.
    */
  var Default: js.UndefOr[DefaultPushNotificationTemplate] = js.native
  /**
    * A JSON object that specifies the default values to use for message variables in the message template. This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding value defines the default value for that variable. When you create a message that's based on the template, you can override these defaults with message-specific and address-specific variables and values.
    */
  var DefaultSubstitutions: js.UndefOr[string] = js.native
  /**
    * The message template to use for the GCM channel, which is used to send notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var GCM: js.UndefOr[AndroidPushNotificationTemplate] = js.native
  /**
    * The unique identifier for the recommender model to use for the message template. Amazon Pinpoint uses this value to determine how to retrieve and process data from a recommender model when it sends messages that use the template, if the template contains message variables for recommendation data.
    */
  var RecommenderId: js.UndefOr[string] = js.native
  /**
    * A custom description of the message template.
    */
  var TemplateDescription: js.UndefOr[string] = js.native
  /**
    * A string-to-string map of key-value pairs that defines the tags to associate with the message template. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOfString] = js.native
}

object PushNotificationTemplateRequest {
  @scala.inline
  def apply(): PushNotificationTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushNotificationTemplateRequest]
  }
  @scala.inline
  implicit class PushNotificationTemplateRequestOps[Self <: PushNotificationTemplateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withADM(value: AndroidPushNotificationTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ADM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutADM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ADM")(js.undefined)
        ret
    }
    @scala.inline
    def withAPNS(value: APNSPushNotificationTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APNS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAPNS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APNS")(js.undefined)
        ret
    }
    @scala.inline
    def withBaidu(value: AndroidPushNotificationTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Baidu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaidu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Baidu")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault(value: DefaultPushNotificationTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Default")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSubstitutions(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultSubstitutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSubstitutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultSubstitutions")(js.undefined)
        ret
    }
    @scala.inline
    def withGCM(value: AndroidPushNotificationTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GCM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGCM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GCM")(js.undefined)
        ret
    }
    @scala.inline
    def withRecommenderId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecommenderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommenderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecommenderId")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateDescription(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: MapOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

