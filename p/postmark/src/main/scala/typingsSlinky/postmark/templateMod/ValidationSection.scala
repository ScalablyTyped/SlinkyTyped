package typingsSlinky.postmark.templateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationSection extends js.Object {
  var ContentIsValid: Boolean = js.native
  var RenderedContent: String = js.native
  var ValidationErrors: js.Object = js.native
}

object ValidationSection {
  @scala.inline
  def apply(ContentIsValid: Boolean, RenderedContent: String, ValidationErrors: js.Object): ValidationSection = {
    val __obj = js.Dynamic.literal(ContentIsValid = ContentIsValid.asInstanceOf[js.Any], RenderedContent = RenderedContent.asInstanceOf[js.Any], ValidationErrors = ValidationErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationSection]
  }
  @scala.inline
  implicit class ValidationSectionOps[Self <: ValidationSection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentIsValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderedContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderedContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidationErrors(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationErrors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

