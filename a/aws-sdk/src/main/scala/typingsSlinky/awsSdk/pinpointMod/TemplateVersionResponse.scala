package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateVersionResponse extends js.Object {
  /**
    * The date, in ISO 8601 format, when the version of the message template was created.
    */
  var CreationDate: string = js.native
  /**
    * A JSON object that specifies the default values that are used for message variables in the version of the message template. This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding value defines the default value for that variable.
    */
  var DefaultSubstitutions: js.UndefOr[string] = js.native
  /**
    * The date, in ISO 8601 format, when the version of the message template was last modified.
    */
  var LastModifiedDate: string = js.native
  /**
    * The custom description of the version of the message template.
    */
  var TemplateDescription: js.UndefOr[string] = js.native
  /**
    * The name of the message template.
    */
  var TemplateName: string = js.native
  /**
    * The type of channel that the message template is designed for. Possible values are: EMAIL, PUSH, SMS, and VOICE.
    */
  var TemplateType: string = js.native
  /**
    * The unique identifier for the version of the message template. This value is an integer that Amazon Pinpoint automatically increments and assigns to each new version of a template.
    */
  var Version: js.UndefOr[string] = js.native
}

object TemplateVersionResponse {
  @scala.inline
  def apply(CreationDate: string, LastModifiedDate: string, TemplateName: string, TemplateType: string): TemplateVersionResponse = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], LastModifiedDate = LastModifiedDate.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any], TemplateType = TemplateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateVersionResponse]
  }
  @scala.inline
  implicit class TemplateVersionResponseOps[Self <: TemplateVersionResponse] (val x: Self) extends AnyVal {
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
    def withTemplateType(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateType")(value.asInstanceOf[js.Any])
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
  }
  
}

