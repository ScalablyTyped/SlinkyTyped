package typingsSlinky.expressDashValidator

import typingsSlinky.expressDashValidator.srcBaseMod.Location
import typingsSlinky.expressDashValidator.srcChainValidationDashChainMod.ValidationChain
import typingsSlinky.expressDashValidator.srcMiddlewaresSchemaMod.InternalParamSchema
import typingsSlinky.expressDashValidator.srcMiddlewaresSchemaMod.ParamSchema
import typingsSlinky.expressDashValidator.srcMiddlewaresSchemaMod.SanitizersSchema
import typingsSlinky.expressDashValidator.srcMiddlewaresSchemaMod.Schema
import typingsSlinky.expressDashValidator.srcMiddlewaresSchemaMod.ValidatorsSchema
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/middlewares/schema", JSImport.Namespace)
@js.native
object srcMiddlewaresSchemaMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.expressDashValidator.expressDashValidatorNumbers.`true`
    - typings.expressDashValidator.Anon_0Options[K]
  */
  trait SanitizerSchemaOptions[K /* <: String */] extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.expressDashValidator.expressDashValidatorNumbers.`true`
    - typings.expressDashValidator.Anon_0[K]
  */
  trait ValidatorSchemaOptions[K /* <: String */] extends js.Object
  
  def checkSchema(schema: Schema): js.Array[ValidationChain] = js.native
  def checkSchema(schema: Schema, defaultLocations: js.Array[Location]): js.Array[ValidationChain] = js.native
  type InternalParamSchema = ValidatorsSchema with SanitizersSchema
  type ParamSchema = InternalParamSchema with Anon_ErrorMessage
  type SanitizersSchema = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof express-validator.express-validator/src/chain/sanitizers.Sanitizers<any> ]:? express-validator.express-validator/src/middlewares/schema.SanitizerSchemaOptions<K>}
    */ typingsSlinky.expressDashValidator.expressDashValidatorStrings.SanitizersSchema with js.Any
  type Schema = Record[String, ParamSchema]
  type ValidationParamSchema = ParamSchema
  type ValidationSchema = Schema
  type ValidatorsSchema = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof express-validator.express-validator/src/chain/validators.Validators<any> ]:? express-validator.express-validator/src/middlewares/schema.ValidatorSchemaOptions<K>}
    */ typingsSlinky.expressDashValidator.expressDashValidatorStrings.ValidatorsSchema with js.Any
}

