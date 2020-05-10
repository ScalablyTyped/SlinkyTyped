package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushNotificationTemplateResponse extends js.Object {
  /**
    * The message template that's used for the ADM (Amazon Device Messaging) channel. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var ADM: js.UndefOr[AndroidPushNotificationTemplate] = js.native
  /**
    * The message template that's used for the APNs (Apple Push Notification service) channel. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var APNS: js.UndefOr[APNSPushNotificationTemplate] = js.native
  /**
    * The Amazon Resource Name (ARN) of the message template.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * The message template that's used for the Baidu (Baidu Cloud Push) channel. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var Baidu: js.UndefOr[AndroidPushNotificationTemplate] = js.native
  /**
    * The date, in ISO 8601 format, when the message template was created.
    */
  var CreationDate: string = js.native
  /**
    * The default message template that's used for push notification channels.
    */
  var Default: js.UndefOr[DefaultPushNotificationTemplate] = js.native
  /**
    * The JSON object that specifies the default values that are used for message variables in the message template. This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding value defines the default value for that variable.
    */
  var DefaultSubstitutions: js.UndefOr[string] = js.native
  /**
    * The message template that's used for the GCM channel, which is used to send notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var GCM: js.UndefOr[AndroidPushNotificationTemplate] = js.native
  /**
    * The date, in ISO 8601 format, when the message template was last modified.
    */
  var LastModifiedDate: string = js.native
  /**
    * The unique identifier for the recommender model that's used by the message template.
    */
  var RecommenderId: js.UndefOr[string] = js.native
  /**
    * The custom description of the message template.
    */
  var TemplateDescription: js.UndefOr[string] = js.native
  /**
    * The name of the message template.
    */
  var TemplateName: string = js.native
  /**
    * The type of channel that the message template is designed for. For a push notification template, this value is PUSH.
    */
  var TemplateType: typingsSlinky.awsSdk.pinpointMod.TemplateType = js.native
  /**
    * The unique identifier, as an integer, for the active version of the message template, or the version of the template that you specified by using the version parameter in your request.
    */
  var Version: js.UndefOr[string] = js.native
  /**
    * A string-to-string map of key-value pairs that identifies the tags that are associated with the message template. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOfString] = js.native
}

object PushNotificationTemplateResponse {
  @scala.inline
  def apply(CreationDate: string, LastModifiedDate: string, TemplateName: string, TemplateType: TemplateType): PushNotificationTemplateResponse = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], LastModifiedDate = LastModifiedDate.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any], TemplateType = TemplateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNotificationTemplateResponse]
  }
  @scala.inline
  implicit class PushNotificationTemplateResponseOps[Self <: PushNotificationTemplateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateType(value: TemplateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateType")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
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
    def withVersion(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(js.undefined)
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

