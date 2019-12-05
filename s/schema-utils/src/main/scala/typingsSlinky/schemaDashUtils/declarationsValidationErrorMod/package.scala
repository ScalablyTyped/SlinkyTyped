package typingsSlinky.schemaDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object declarationsValidationErrorMod {
  import typingsSlinky.ajv.ajvMod.ErrorObject
  import typingsSlinky.jsonDashSchema.jsonDashSchemaMod.JSONSchema4
  import typingsSlinky.schemaDashUtils.Anon_Children

  type JSONSchema6 = typingsSlinky.jsonDashSchema.jsonDashSchemaMod.JSONSchema6
  type JSONSchema7 = typingsSlinky.jsonDashSchema.jsonDashSchemaMod.JSONSchema7
  type PostFormatter = js.Function2[/* formattedError */ String, /* error */ ErrorObject with Anon_Children, String]
  type SPECIFICITY = Double
  type Schema = JSONSchema4 | typingsSlinky.jsonDashSchema.jsonDashSchemaMod.JSONSchema6 | typingsSlinky.jsonDashSchema.jsonDashSchemaMod.JSONSchema7
  type SchemaUtilErrorObject = ErrorObject with Anon_Children
}
