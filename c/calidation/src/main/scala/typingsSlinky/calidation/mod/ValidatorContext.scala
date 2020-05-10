package typingsSlinky.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatorContext extends js.Object {
  var errors: Errors = js.native
  var fields: Fields = js.native
  var isDirty: Boolean = js.native
}

object ValidatorContext {
  @scala.inline
  def apply(errors: Errors, fields: Fields, isDirty: Boolean): ValidatorContext = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], isDirty = isDirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorContext]
  }
  @scala.inline
  implicit class ValidatorContextOps[Self <: ValidatorContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: Errors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: Fields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirty")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

