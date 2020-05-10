package typingsSlinky.reactJsonschemaForm

import typingsSlinky.reactJsonschemaForm.mod.AjvError
import typingsSlinky.reactJsonschemaForm.mod.ErrorSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonErrorSchema extends js.Object {
  var errorSchema: ErrorSchema = js.native
  var errors: js.Array[AjvError] = js.native
}

object AnonErrorSchema {
  @scala.inline
  def apply(errorSchema: ErrorSchema, errors: js.Array[AjvError]): AnonErrorSchema = {
    val __obj = js.Dynamic.literal(errorSchema = errorSchema.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorSchema]
  }
  @scala.inline
  implicit class AnonErrorSchemaOps[Self <: AnonErrorSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorSchema(value: ErrorSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrors(value: js.Array[AjvError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

