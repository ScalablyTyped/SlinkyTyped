package typingsSlinky.reactJsonschemaForm

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jsonSchema.mod.JSONSchema6Definition
import typingsSlinky.reactJsonschemaForm.mod.AjvError
import typingsSlinky.reactJsonschemaForm.mod.FormValidation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jsonschema-form/lib/validate", JSImport.Namespace)
@js.native
object validateMod extends js.Object {
  def default[T](formData: T, schema: JSONSchema6Definition): AnonErrorSchema = js.native
  def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation]
  ): AnonErrorSchema = js.native
  def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation],
    transformErrors: js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]]
  ): AnonErrorSchema = js.native
  def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation],
    transformErrors: js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]],
    additionalMetaSchemas: js.UndefOr[scala.Nothing],
    customFormats: StringDictionary[String | js.RegExp | (js.Function1[/* data */ String, Boolean])]
  ): AnonErrorSchema = js.native
  def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation],
    transformErrors: js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]],
    additionalMetaSchemas: js.Array[js.Object]
  ): AnonErrorSchema = js.native
  def default[T](
    formData: T,
    schema: JSONSchema6Definition,
    customValidate: js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation],
    transformErrors: js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]],
    additionalMetaSchemas: js.Array[js.Object],
    customFormats: StringDictionary[String | js.RegExp | (js.Function1[/* data */ String, Boolean])]
  ): AnonErrorSchema = js.native
}

