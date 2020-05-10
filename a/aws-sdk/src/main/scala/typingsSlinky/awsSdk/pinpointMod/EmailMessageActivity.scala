package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailMessageActivity extends js.Object {
  /**
    * The "From" address to use for the message.
    */
  var MessageConfig: js.UndefOr[JourneyEmailMessage] = js.native
  /**
    * The unique identifier for the next activity to perform, after the message is sent.
    */
  var NextActivity: js.UndefOr[string] = js.native
  /**
    * The name of the email template to use for the message.
    */
  var TemplateName: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the version of the email template to use for the message. If specified, this value must match the identifier for an existing template version. To retrieve a list of versions and version identifiers for a template, use the Template Versions resource. If you don't specify a value for this property, Amazon Pinpoint uses the active version of the template. The active version is typically the version of a template that's been most recently reviewed and approved for use, depending on your workflow. It isn't necessarily the latest version of a template.
    */
  var TemplateVersion: js.UndefOr[string] = js.native
}

object EmailMessageActivity {
  @scala.inline
  def apply(): EmailMessageActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailMessageActivity]
  }
  @scala.inline
  implicit class EmailMessageActivityOps[Self <: EmailMessageActivity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageConfig(value: JourneyEmailMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withNextActivity(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextActivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextActivity")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateName")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateVersion(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateVersion")(js.undefined)
        ret
    }
  }
  
}

