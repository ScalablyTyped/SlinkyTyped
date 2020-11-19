package typingsSlinky.schemaUtils.validationErrorMod

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
    * @param {boolean} logic
    * @param {Array<Object>} prevSchemas
    * @returns {string}
    */
  def formatSchema(schema: Schema): String = js.native
  def formatSchema(schema: Schema, logic: js.UndefOr[scala.Nothing], prevSchemas: js.Array[js.Object]): String = js.native
  def formatSchema(schema: Schema, logic: Boolean): String = js.native
  def formatSchema(schema: Schema, logic: Boolean, prevSchemas: js.Array[js.Object]): String = js.native
  
  /**
    * @param {SchemaUtilErrorObject} error
    * @returns {string}
    */
  def formatValidationError(error: SchemaUtilErrorObject): String = js.native
  
  /**
    * @param {Array<SchemaUtilErrorObject>} errors
    * @returns {string}
    */
  def formatValidationErrors(errors: js.Array[SchemaUtilErrorObject]): String = js.native
  
  /**
    * @param {string} path
    * @returns {Schema}
    */
  def getSchemaPart(path: String): Schema = js.native
  
  /**
    * @param {Schema=} schemaPart
    * @returns {string}
    */
  def getSchemaPartDescription(): String = js.native
  def getSchemaPartDescription(schemaPart: Schema): String = js.native
  
  /**
    * @param {Schema=} schemaPart
    * @param {(boolean | Array<string>)=} additionalPath
    * @param {boolean=} needDot
    * @param {boolean=} logic
    * @returns {string}
    */
  def getSchemaPartText(): String = js.native
  def getSchemaPartText(
    schemaPart: js.UndefOr[Schema],
    additionalPath: js.UndefOr[scala.Nothing],
    needDot: js.UndefOr[scala.Nothing],
    logic: Boolean
  ): String = js.native
  def getSchemaPartText(schemaPart: js.UndefOr[Schema], additionalPath: js.UndefOr[scala.Nothing], needDot: Boolean): String = js.native
  def getSchemaPartText(
    schemaPart: js.UndefOr[Schema],
    additionalPath: js.UndefOr[scala.Nothing],
    needDot: Boolean,
    logic: Boolean
  ): String = js.native
  def getSchemaPartText(schemaPart: js.UndefOr[Schema], additionalPath: js.Array[String]): String = js.native
  def getSchemaPartText(
    schemaPart: js.UndefOr[Schema],
    additionalPath: js.Array[String],
    needDot: js.UndefOr[scala.Nothing],
    logic: Boolean
  ): String = js.native
  def getSchemaPartText(schemaPart: js.UndefOr[Schema], additionalPath: js.Array[String], needDot: Boolean): String = js.native
  def getSchemaPartText(schemaPart: js.UndefOr[Schema], additionalPath: js.Array[String], needDot: Boolean, logic: Boolean): String = js.native
  def getSchemaPartText(schemaPart: js.UndefOr[Schema], additionalPath: Boolean): String = js.native
  def getSchemaPartText(
    schemaPart: js.UndefOr[Schema],
    additionalPath: Boolean,
    needDot: js.UndefOr[scala.Nothing],
    logic: Boolean
  ): String = js.native
  def getSchemaPartText(schemaPart: js.UndefOr[Schema], additionalPath: Boolean, needDot: Boolean): String = js.native
  def getSchemaPartText(schemaPart: js.UndefOr[Schema], additionalPath: Boolean, needDot: Boolean, logic: Boolean): String = js.native
  def getSchemaPartText(schemaPart: Schema): String = js.native
  
  /** @type {string} */
  var headerName: String = js.native
  
  /** @type {PostFormatter | null} */
  var postFormatter: PostFormatter | Null = js.native
  
  /** @type {Schema} */
  var schema: Schema = js.native
}
