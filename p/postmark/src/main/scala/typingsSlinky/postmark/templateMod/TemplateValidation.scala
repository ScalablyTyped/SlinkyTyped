package typingsSlinky.postmark.templateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateValidation extends js.Object {
  var AllContentIsValid: Boolean = js.native
  var HtmlBody: ValidationSection = js.native
  var Subject: ValidationSection = js.native
  var SuggestedTemplateModel: js.Object = js.native
  var TextBody: ValidationSection = js.native
}

object TemplateValidation {
  @scala.inline
  def apply(
    AllContentIsValid: Boolean,
    HtmlBody: ValidationSection,
    Subject: ValidationSection,
    SuggestedTemplateModel: js.Object,
    TextBody: ValidationSection
  ): TemplateValidation = {
    val __obj = js.Dynamic.literal(AllContentIsValid = AllContentIsValid.asInstanceOf[js.Any], HtmlBody = HtmlBody.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], SuggestedTemplateModel = SuggestedTemplateModel.asInstanceOf[js.Any], TextBody = TextBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateValidation]
  }
  @scala.inline
  implicit class TemplateValidationOps[Self <: TemplateValidation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllContentIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllContentIsValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtmlBody(value: ValidationSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HtmlBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: ValidationSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestedTemplateModel(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuggestedTemplateModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextBody(value: ValidationSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextBody")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

