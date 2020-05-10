package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Template extends js.Object {
  /**
    * The HTML body of the email.
    */
  var HtmlPart: js.UndefOr[typingsSlinky.awsSdk.sesMod.HtmlPart] = js.native
  /**
    * The subject line of the email.
    */
  var SubjectPart: js.UndefOr[typingsSlinky.awsSdk.sesMod.SubjectPart] = js.native
  /**
    * The name of the template. You will refer to this name when you send email using the SendTemplatedEmail or SendBulkTemplatedEmail operations.
    */
  var TemplateName: typingsSlinky.awsSdk.sesMod.TemplateName = js.native
  /**
    * The email body that will be visible to recipients whose email clients do not display HTML.
    */
  var TextPart: js.UndefOr[typingsSlinky.awsSdk.sesMod.TextPart] = js.native
}

object Template {
  @scala.inline
  def apply(TemplateName: TemplateName): Template = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
  @scala.inline
  implicit class TemplateOps[Self <: Template] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTemplateName(value: TemplateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtmlPart(value: HtmlPart): Self = {
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
    def withSubjectPart(value: SubjectPart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubjectPart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubjectPart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubjectPart")(js.undefined)
        ret
    }
    @scala.inline
    def withTextPart(value: TextPart): Self = {
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
  }
  
}

