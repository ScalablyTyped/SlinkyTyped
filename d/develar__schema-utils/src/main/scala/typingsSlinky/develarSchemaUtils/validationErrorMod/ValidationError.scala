package typingsSlinky.develarSchemaUtils.validationErrorMod

import typingsSlinky.develarSchemaUtils.anon.ErrorObjectchildrenArrayE
import typingsSlinky.jsonSchema.mod.JSONSchema4
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationError extends Error {
  
  /** @type {string} */
  var baseDataPath: String = js.native
  
  /** @type {Array<SchemaUtilErrorObject>} */
  var errors: js.Array[SchemaUtilErrorObject] = js.native
  
  /**
    * @param {Schema} schema
    * @param {Array<Object>} prevSchemas
    * @returns {string}
    */
  def formatSchema(schema: JSONSchema4): String = js.native
  def formatSchema(schema: JSONSchema4, prevSchemas: js.Array[js.Object]): String = js.native
  def formatSchema(schema: typingsSlinky.jsonSchema.mod.JSONSchema6): String = js.native
  def formatSchema(schema: typingsSlinky.jsonSchema.mod.JSONSchema6, prevSchemas: js.Array[js.Object]): String = js.native
  def formatSchema(schema: typingsSlinky.jsonSchema.mod.JSONSchema7): String = js.native
  def formatSchema(schema: typingsSlinky.jsonSchema.mod.JSONSchema7, prevSchemas: js.Array[js.Object]): String = js.native
  
  /**
    * @param {SchemaUtilErrorObject} error
    * @returns {string}
    */
  def formatValidationError(error: ErrorObjectchildrenArrayE): String = js.native
  
  /**
    * @param {Array<SchemaUtilErrorObject>} errors
    * @returns {string}
    */
  def formatValidationErrors(errors: js.Array[ErrorObjectchildrenArrayE]): String = js.native
  
  /**
    * @param {string} path
    * @returns {Schema}
    */
  def getSchemaPart(path: String): JSONSchema4 | typingsSlinky.jsonSchema.mod.JSONSchema6 | typingsSlinky.jsonSchema.mod.JSONSchema7 = js.native
  
  /**
    * @param {Schema=} schemaPart
    * @returns {string}
    */
  def getSchemaPartDescription(): String = js.native
  def getSchemaPartDescription(schemaPart: JSONSchema4): String = js.native
  def getSchemaPartDescription(schemaPart: typingsSlinky.jsonSchema.mod.JSONSchema6): String = js.native
  def getSchemaPartDescription(schemaPart: typingsSlinky.jsonSchema.mod.JSONSchema7): String = js.native
  
  /**
    * @param {Schema=} schemaPart
    * @param {(boolean | Array<string>)=} additionalPath
    * @param {boolean=} needDot
    * @returns {string}
    */
  def getSchemaPartText(): String = js.native
  def getSchemaPartText(schemaPart: js.UndefOr[scala.Nothing], additionalPath: js.UndefOr[scala.Nothing], needDot: Boolean): String = js.native
  def getSchemaPartText(schemaPart: js.UndefOr[scala.Nothing], additionalPath: js.Array[String]): String = js.native
  def getSchemaPartText(schemaPart: js.UndefOr[scala.Nothing], additionalPath: js.Array[String], needDot: Boolean): String = js.native
  def getSchemaPartText(schemaPart: js.UndefOr[scala.Nothing], additionalPath: Boolean): String = js.native
  def getSchemaPartText(schemaPart: js.UndefOr[scala.Nothing], additionalPath: Boolean, needDot: Boolean): String = js.native
  def getSchemaPartText(schemaPart: JSONSchema4): String = js.native
  def getSchemaPartText(schemaPart: JSONSchema4, additionalPath: js.UndefOr[scala.Nothing], needDot: Boolean): String = js.native
  def getSchemaPartText(schemaPart: JSONSchema4, additionalPath: js.Array[String]): String = js.native
  def getSchemaPartText(schemaPart: JSONSchema4, additionalPath: js.Array[String], needDot: Boolean): String = js.native
  def getSchemaPartText(schemaPart: JSONSchema4, additionalPath: Boolean): String = js.native
  def getSchemaPartText(schemaPart: JSONSchema4, additionalPath: Boolean, needDot: Boolean): String = js.native
  def getSchemaPartText(schemaPart: typingsSlinky.jsonSchema.mod.JSONSchema6): String = js.native
  def getSchemaPartText(
    schemaPart: typingsSlinky.jsonSchema.mod.JSONSchema6,
    additionalPath: js.UndefOr[scala.Nothing],
    needDot: Boolean
  ): String = js.native
  def getSchemaPartText(schemaPart: typingsSlinky.jsonSchema.mod.JSONSchema6, additionalPath: js.Array[String]): String = js.native
  def getSchemaPartText(
    schemaPart: typingsSlinky.jsonSchema.mod.JSONSchema6,
    additionalPath: js.Array[String],
    needDot: Boolean
  ): String = js.native
  def getSchemaPartText(schemaPart: typingsSlinky.jsonSchema.mod.JSONSchema6, additionalPath: Boolean): String = js.native
  def getSchemaPartText(schemaPart: typingsSlinky.jsonSchema.mod.JSONSchema6, additionalPath: Boolean, needDot: Boolean): String = js.native
  def getSchemaPartText(schemaPart: typingsSlinky.jsonSchema.mod.JSONSchema7): String = js.native
  def getSchemaPartText(
    schemaPart: typingsSlinky.jsonSchema.mod.JSONSchema7,
    additionalPath: js.UndefOr[scala.Nothing],
    needDot: Boolean
  ): String = js.native
  def getSchemaPartText(schemaPart: typingsSlinky.jsonSchema.mod.JSONSchema7, additionalPath: js.Array[String]): String = js.native
  def getSchemaPartText(
    schemaPart: typingsSlinky.jsonSchema.mod.JSONSchema7,
    additionalPath: js.Array[String],
    needDot: Boolean
  ): String = js.native
  def getSchemaPartText(schemaPart: typingsSlinky.jsonSchema.mod.JSONSchema7, additionalPath: Boolean): String = js.native
  def getSchemaPartText(schemaPart: typingsSlinky.jsonSchema.mod.JSONSchema7, additionalPath: Boolean, needDot: Boolean): String = js.native
  
  /** @type {string} */
  var headerName: String = js.native
  
  /** @type {PostFormatter | null} */
  var postFormatter: PostFormatter | Null = js.native
  
  /** @type {Schema} */
  var schema: Schema = js.native
}
