package typingsSlinky.reactJsonschemaForm.schemaFieldMod

import typingsSlinky.jsonSchema.mod.JSONSchema6
import typingsSlinky.reactJsonschemaForm.anon.Definitions
import typingsSlinky.reactJsonschemaForm.mod.ErrorSchema
import typingsSlinky.reactJsonschemaForm.mod.IdSchema
import typingsSlinky.reactJsonschemaForm.mod.UiSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-jsonschema-form.react-jsonschema-form.FieldProps<T>, 'schema' | 'uiSchema' | 'idSchema' | 'formData' | 'errorSchema' | 'registry' | 'formContext'> */
@js.native
trait SchemaFieldProps[T] extends js.Object {
  var errorSchema: ErrorSchema = js.native
  var formContext: js.Any = js.native
  var formData: T = js.native
  var idSchema: IdSchema[_] = js.native
  var registry: Definitions = js.native
  var schema: JSONSchema6 = js.native
  var uiSchema: UiSchema = js.native
}

object SchemaFieldProps {
  @scala.inline
  def apply[T](
    errorSchema: ErrorSchema,
    formContext: js.Any,
    formData: T,
    idSchema: IdSchema[_],
    registry: Definitions,
    schema: JSONSchema6,
    uiSchema: UiSchema
  ): SchemaFieldProps[T] = {
    val __obj = js.Dynamic.literal(errorSchema = errorSchema.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], idSchema = idSchema.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFieldProps[T]]
  }
  @scala.inline
  implicit class SchemaFieldPropsOps[Self[t] <: SchemaFieldProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withErrorSchema(value: ErrorSchema): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormContext(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formContext")(value.asInstanceOf[js.Any])
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
    def withRegistry(value: Definitions): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(value.asInstanceOf[js.Any])
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
  }
  
}

