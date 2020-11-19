package typingsSlinky.jsonschema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsonschema", "ValidatorResult")
@js.native
class ValidatorResult protected () extends js.Object {
  def this(instance: js.Any, schema: Schema, options: Options, ctx: SchemaContext) = this()
  
  def addError(detail: String): ValidationError = js.native
  def addError(detail: ErrorDetail): ValidationError = js.native
  
  var disableFormat: Boolean = js.native
  
  var errors: js.Array[ValidationError] = js.native
  
  var instance: js.Any = js.native
  
  var propertyPath: String = js.native
  
  var schema: Schema = js.native
  
  var throwError: Boolean = js.native
  
  var valid: Boolean = js.native
}
