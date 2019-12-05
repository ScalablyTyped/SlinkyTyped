package typingsSlinky.reactDashJsonschemaDashForm

import typingsSlinky.jsonDashSchema.jsonDashSchemaMod.JSONSchema6Definition
import typingsSlinky.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.AjvError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jsonschema-form/lib/validate", JSImport.Namespace)
@js.native
object libValidateMod extends js.Object {
  def default[T](formData: T, schema: JSONSchema6Definition): js.Array[AjvError] = js.native
}

