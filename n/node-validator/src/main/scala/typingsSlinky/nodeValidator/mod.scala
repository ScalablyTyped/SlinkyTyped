package typingsSlinky.nodeValidator

import typingsSlinky.nodeValidator.Validator.IsObjectValidator
import typingsSlinky.nodeValidator.Validator.Validatable
import typingsSlinky.nodeValidator.ValidatorOptions.IsDateOptions
import typingsSlinky.nodeValidator.ValidatorOptions.IsNumberOptions
import typingsSlinky.nodeValidator.ValidatorOptions.IsStringOptions
import typingsSlinky.nodeValidator.ValidatorOptions.Options
import typingsSlinky.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-validator", "bodyValidator")
  @js.native
  def bodyValidator(validator: Validatable): js.Any = js.native
  
  @JSImport("node-validator", "express")
  @js.native
  def express(validator: Validatable): js.Any = js.native
  
  @JSImport("node-validator", "expressParams")
  @js.native
  def expressParams(validator: Validatable): js.Any = js.native
  
  @JSImport("node-validator", "expressQuery")
  @js.native
  def expressQuery(validator: Validatable): js.Any = js.native
  
  @JSImport("node-validator", "isAnyObject")
  @js.native
  def isAnyObject(): IsObjectValidator = js.native
  
  @JSImport("node-validator", "isArray")
  @js.native
  def isArray(): Validatable = js.native
  @JSImport("node-validator", "isArray")
  @js.native
  def isArray(validator: js.UndefOr[scala.Nothing], options: Options): Validatable = js.native
  @JSImport("node-validator", "isArray")
  @js.native
  def isArray(validator: Validatable): Validatable = js.native
  @JSImport("node-validator", "isArray")
  @js.native
  def isArray(validator: Validatable, options: Options): Validatable = js.native
  
  @JSImport("node-validator", "isBoolean")
  @js.native
  def isBoolean(): Validatable = js.native
  
  @JSImport("node-validator", "isDate")
  @js.native
  def isDate(): Validatable = js.native
  @JSImport("node-validator", "isDate")
  @js.native
  def isDate(options: IsDateOptions): Validatable = js.native
  
  @JSImport("node-validator", "isInteger")
  @js.native
  def isInteger(): Validatable = js.native
  @JSImport("node-validator", "isInteger")
  @js.native
  def isInteger(options: IsNumberOptions): Validatable = js.native
  
  @JSImport("node-validator", "isIsoDate")
  @js.native
  def isIsoDate(): Validatable = js.native
  @JSImport("node-validator", "isIsoDate")
  @js.native
  def isIsoDate(options: IsDateOptions): Validatable = js.native
  
  @JSImport("node-validator", "isIsoDateTime")
  @js.native
  def isIsoDateTime(): Validatable = js.native
  @JSImport("node-validator", "isIsoDateTime")
  @js.native
  def isIsoDateTime(options: IsDateOptions): Validatable = js.native
  
  @JSImport("node-validator", "isNumber")
  @js.native
  def isNumber(): Validatable = js.native
  @JSImport("node-validator", "isNumber")
  @js.native
  def isNumber(options: IsNumberOptions): Validatable = js.native
  
  @JSImport("node-validator", "isObject")
  @js.native
  def isObject(): IsObjectValidator = js.native
  
  @JSImport("node-validator", "isString")
  @js.native
  def isString(): Validatable = js.native
  @JSImport("node-validator", "isString")
  @js.native
  def isString(options: IsStringOptions): Validatable = js.native
  
  @JSImport("node-validator", "isStringOrNull")
  @js.native
  def isStringOrNull(): Validatable = js.native
  @JSImport("node-validator", "isStringOrNull")
  @js.native
  def isStringOrNull(options: IsStringOptions): Validatable = js.native
  
  @JSImport("node-validator", "paramsValidator")
  @js.native
  def paramsValidator(validator: Validatable): js.Any = js.native
  
  @JSImport("node-validator", "queryValidator")
  @js.native
  def queryValidator(validator: Validatable): js.Any = js.native
  
  @JSImport("node-validator", "run")
  @js.native
  def run(
    validator: Validatable,
    value: js.Any,
    callback: js.Function2[/* errorCount */ Number, /* errors */ js.Array[_], Unit]
  ): Unit = js.native
}
