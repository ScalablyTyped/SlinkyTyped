package typingsSlinky.reactJsonschemaForm.mod

import typingsSlinky.jsonSchema.mod.JSONSchema6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChangeEvent[T] extends js.Object {
  var edit: Boolean = js.native
  var errorSchema: FormValidation = js.native
  var errors: js.Array[AjvError] = js.native
  var formData: T = js.native
  var idSchema: IdSchema[_] = js.native
  var schema: JSONSchema6 = js.native
  var status: js.UndefOr[String] = js.native
  var uiSchema: UiSchema = js.native
}

object IChangeEvent {
  @scala.inline
  def apply[T](
    edit: Boolean,
    errorSchema: FormValidation,
    errors: js.Array[AjvError],
    formData: T,
    idSchema: IdSchema[_],
    schema: JSONSchema6,
    uiSchema: UiSchema
  ): IChangeEvent[T] = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], errorSchema = errorSchema.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], idSchema = idSchema.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangeEvent[T]]
  }
  @scala.inline
  implicit class IChangeEventOps[Self[t] <: IChangeEvent[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withEdit(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorSchema(value: FormValidation): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrors(value: js.Array[AjvError]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormData(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdSchema(value: IdSchema[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: JSONSchema6): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUiSchema(value: UiSchema): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uiSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

