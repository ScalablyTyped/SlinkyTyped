package typingsSlinky.schemaUtils.validationErrorMod

import typingsSlinky.jsonSchema.mod.JSONSchema4
import typingsSlinky.schemaUtils.ErrorObjectchildrenArrayE
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
  def this(errors: js.Array[ErrorObjectchildrenArrayE], schema: JSONSchema4) = this()
  def this(errors: js.Array[ErrorObjectchildrenArrayE], schema: typingsSlinky.jsonSchema.mod.JSONSchema6) = this()
  def this(errors: js.Array[ErrorObjectchildrenArrayE], schema: typingsSlinky.jsonSchema.mod.JSONSchema7) = this()
  def this(
    errors: js.Array[ErrorObjectchildrenArrayE],
    schema: JSONSchema4,
    configuration: typingsSlinky.schemaUtils.validateMod.ValidationErrorConfiguration
  ) = this()
  def this(
    errors: js.Array[ErrorObjectchildrenArrayE],
    schema: typingsSlinky.jsonSchema.mod.JSONSchema6,
    configuration: typingsSlinky.schemaUtils.validateMod.ValidationErrorConfiguration
  ) = this()
  def this(
    errors: js.Array[ErrorObjectchildrenArrayE],
    schema: typingsSlinky.jsonSchema.mod.JSONSchema7,
    configuration: typingsSlinky.schemaUtils.validateMod.ValidationErrorConfiguration
  ) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

