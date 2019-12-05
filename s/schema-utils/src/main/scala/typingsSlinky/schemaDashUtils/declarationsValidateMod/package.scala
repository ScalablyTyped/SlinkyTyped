package typingsSlinky.schemaDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object declarationsValidateMod {
  import typingsSlinky.schemaDashUtils.Anon_Children

  type ErrorObject = typingsSlinky.ajv.ajvMod.ErrorObject
  type JSONSchema4 = typingsSlinky.jsonDashSchema.jsonDashSchemaMod.JSONSchema4
  type JSONSchema6 = typingsSlinky.jsonDashSchema.jsonDashSchemaMod.JSONSchema6
  type JSONSchema7 = typingsSlinky.jsonDashSchema.jsonDashSchemaMod.JSONSchema7
  type PostFormatter = js.Function2[
    /* formattedError */ String, 
    /* error */ typingsSlinky.ajv.ajvMod.ErrorObject with Anon_Children, 
    String
  ]
  type Schema = typingsSlinky.jsonDashSchema.jsonDashSchemaMod.JSONSchema4 | typingsSlinky.jsonDashSchema.jsonDashSchemaMod.JSONSchema6 | typingsSlinky.jsonDashSchema.jsonDashSchemaMod.JSONSchema7
  type SchemaUtilErrorObject = typingsSlinky.ajv.ajvMod.ErrorObject with Anon_Children
}
