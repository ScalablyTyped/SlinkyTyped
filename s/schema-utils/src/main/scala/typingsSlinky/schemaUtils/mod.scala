package typingsSlinky.schemaUtils

import typingsSlinky.jsonSchema.mod.JSONSchema4
import typingsSlinky.jsonSchema.mod.JSONSchema6
import typingsSlinky.jsonSchema.mod.JSONSchema7
import typingsSlinky.schemaUtils.validateMod.ValidationErrorConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schema-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * @param {Schema} schema
    * @param {Array<object> | object} options
    * @param {ValidationErrorConfiguration=} configuration
    * @returns {void}
    */
  def apply(schema: JSONSchema4, options: js.Any): Unit = js.native
  def apply(schema: JSONSchema4, options: js.Any, configuration: ValidationErrorConfiguration): Unit = js.native
  def apply(schema: JSONSchema6, options: js.Any): Unit = js.native
  def apply(schema: JSONSchema6, options: js.Any, configuration: ValidationErrorConfiguration): Unit = js.native
  def apply(schema: JSONSchema7, options: js.Any): Unit = js.native
  def apply(schema: JSONSchema7, options: js.Any, configuration: ValidationErrorConfiguration): Unit = js.native
}

