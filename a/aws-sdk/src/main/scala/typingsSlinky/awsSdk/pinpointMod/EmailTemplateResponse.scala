package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailTemplateResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the message template.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * The date, in ISO 8601 format, when the message template was created.
    */
  var CreationDate: string = js.native
  /**
    * The JSON object that specifies the default values that are used for message variables in the message template. This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding value defines the default value for that variable.
    */
  var DefaultSubstitutions: js.UndefOr[string] = js.native
  /**
    * The message body, in HTML format, that's used in email messages that are based on the message template.
    */
  var HtmlPart: js.UndefOr[string] = js.native
  /**
    * The date, in ISO 8601 format, when the message template was last modified.
    */
  var LastModifiedDate: string = js.native
  /**
    * The unique identifier for the recommender model that's used by the message template.
    */
  var RecommenderId: js.UndefOr[string] = js.native
  /**
    * The subject line, or title, that's used in email messages that are based on the message template.
    */
  var Subject: js.UndefOr[string] = js.native
  /**
    * The custom description of the message template.
    */
  var TemplateDescription: js.UndefOr[string] = js.native
  /**
    * The name of the message template.
    */
  var TemplateName: string = js.native
  /**
    * The type of channel that the message template is designed for. For an email template, this value is EMAIL.
    */
  var TemplateType: typingsSlinky.awsSdk.pinpointMod.TemplateType = js.native
  /**
    * The message body, in plain text format, that's used in email messages that are based on the message template.
    */
  var TextPart: js.UndefOr[string] = js.native
  /**
    * The unique identifier, as an integer, for the active version of the message template, or the version of the template that you specified by using the version parameter in your request.
    */
  var Version: js.UndefOr[string] = js.native
  /**
    * A string-to-string map of key-value pairs that identifies the tags that are associated with the message template. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOfString] = js.native
}

object EmailTemplateResponse {
  @scala.inline
  def apply(CreationDate: string, LastModifiedDate: string, TemplateName: string, TemplateType: TemplateType): EmailTemplateResponse = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], LastModifiedDate = LastModifiedDate.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any], TemplateType = TemplateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailTemplateResponse]
  }
  @scala.inline
  implicit class EmailTemplateResponseOps[Self <: EmailTemplateResponse] (val x: Self) extends AnyVal {
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
    def withHtmlPart(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HtmlPart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlPart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HtmlPart")(js.undefined)
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
    def withSubject(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(js.undefined)
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
    def withTextPart(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextPart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextPart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextPart")(js.undefined)
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

