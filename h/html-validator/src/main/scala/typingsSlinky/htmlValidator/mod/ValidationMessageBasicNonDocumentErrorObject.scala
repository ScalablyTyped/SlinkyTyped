package typingsSlinky.htmlValidator.mod

import typingsSlinky.htmlValidator.htmlValidatorStrings.`non-document-error`
import typingsSlinky.htmlValidator.htmlValidatorStrings.internal
import typingsSlinky.htmlValidator.htmlValidatorStrings.io
import typingsSlinky.htmlValidator.htmlValidatorStrings.schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationMessageBasicNonDocumentErrorObject extends js.Object {
  var subType: js.UndefOr[internal | io | schema] = js.native
  var `type`: `non-document-error` = js.native
}

object ValidationMessageBasicNonDocumentErrorObject {
  @scala.inline
  def apply(`type`: `non-document-error`): ValidationMessageBasicNonDocumentErrorObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationMessageBasicNonDocumentErrorObject]
  }
  @scala.inline
  implicit class ValidationMessageBasicNonDocumentErrorObjectOps[Self <: ValidationMessageBasicNonDocumentErrorObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: `non-document-error`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubType(value: internal | io | schema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subType")(js.undefined)
        ret
    }
  }
  
}

