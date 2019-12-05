package typingsSlinky.schemaDashUtils.declarationsValidationErrorMod

import typingsSlinky.ajv.ajvMod.ErrorObject
import typingsSlinky.jsonDashSchema.jsonDashSchemaMod.JSONSchema4
import typingsSlinky.schemaDashUtils.Anon_Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schema-utils/declarations/ValidationError", JSImport.Default)
@js.native
class default protected () extends ValidationError {
  /**
    * @param {Array<SchemaUtilErrorObject>} errors
    * @param {Schema} schema
    * @param {ValidationErrorConfiguration} configuration
    */
  def this(errors: js.Array[ErrorObject with Anon_Children], schema: JSONSchema4) = this()
  def this(
    errors: js.Array[ErrorObject with Anon_Children],
    schema: typingsSlinky.jsonDashSchema.jsonDashSchemaMod.JSONSchema6
  ) = this()
  def this(
    errors: js.Array[ErrorObject with Anon_Children],
    schema: typingsSlinky.jsonDashSchema.jsonDashSchemaMod.JSONSchema7
  ) = this()
  def this(
    errors: js.Array[ErrorObject with Anon_Children],
    schema: JSONSchema4,
    configuration: typingsSlinky.schemaDashUtils.declarationsValidateMod.ValidationErrorConfiguration
  ) = this()
  def this(
    errors: js.Array[ErrorObject with Anon_Children],
    schema: typingsSlinky.jsonDashSchema.jsonDashSchemaMod.JSONSchema6,
    configuration: typingsSlinky.schemaDashUtils.declarationsValidateMod.ValidationErrorConfiguration
  ) = this()
  def this(
    errors: js.Array[ErrorObject with Anon_Children],
    schema: typingsSlinky.jsonDashSchema.jsonDashSchemaMod.JSONSchema7,
    configuration: typingsSlinky.schemaDashUtils.declarationsValidateMod.ValidationErrorConfiguration
  ) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

