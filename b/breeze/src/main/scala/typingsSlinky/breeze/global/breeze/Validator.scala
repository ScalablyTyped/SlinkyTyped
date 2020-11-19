package typingsSlinky.breeze.global.breeze

import typingsSlinky.breeze.anon.Expression
import typingsSlinky.breeze.anon.MaxLength
import typingsSlinky.breeze.anon.MessageTemplate
import typingsSlinky.breeze.anon.MinLength
import typingsSlinky.breeze.breeze.ValidatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("breeze.Validator")
@js.native
class Validator protected ()
  extends typingsSlinky.breeze.breeze.Validator {
  def this(name: String, validatorFn: ValidatorFunction) = this()
  def this(name: String, validatorFn: ValidatorFunction, context: js.Any) = this()
}
/* static members */
@JSGlobal("breeze.Validator")
@js.native
object Validator extends js.Object {
  
  def bool(): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** integer between 0 and 255 inclusive */
  def byte(): typingsSlinky.breeze.breeze.Validator = js.native
  def byte(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Returns a credit card number validator that performs a Luhn algorithm checksum test for plausability */
  def creditCard(): typingsSlinky.breeze.breeze.Validator = js.native
  def creditCard(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  def date(): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Validators number, double, and single are all the same */
  def double(): typingsSlinky.breeze.breeze.Validator = js.native
  def double(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Returns a ISO 8601 duration string Validator. */
  def duration(): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Returns the email address validator */
  def emailAddress(): typingsSlinky.breeze.breeze.Validator = js.native
  def emailAddress(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Creates a validator instance from a JSON object or an array of instances from an array of JSON objects. */
  def fromJSON(json: String): typingsSlinky.breeze.breeze.Validator = js.native
  
  def guid(): typingsSlinky.breeze.breeze.Validator = js.native
  
  def int16(): typingsSlinky.breeze.breeze.Validator = js.native
  def int16(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  def int32(): typingsSlinky.breeze.breeze.Validator = js.native
  def int32(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  def int64(): typingsSlinky.breeze.breeze.Validator = js.native
  def int64(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Same as int64 */
  def integer(): typingsSlinky.breeze.breeze.Validator = js.native
  def integer(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Creates a regular expression validator with a fixed expression. */
  def makeRegExpValidator(validatorName: String, expression: js.RegExp, defaultMessage: String): typingsSlinky.breeze.breeze.Validator = js.native
  def makeRegExpValidator(validatorName: String, expression: js.RegExp, defaultMessage: String, context: js.Any): typingsSlinky.breeze.breeze.Validator = js.native
  
  def maxLength(context: MaxLength): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Map of standard error message templates keyed by validator name.*/
  var messageTemplates: js.Any = js.native
  
  /** Always returns true */
  def none(): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Validators number, double, and single are all the same */
  def number(): typingsSlinky.breeze.breeze.Validator = js.native
  def number(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Returns the phone validator, which handles prefix, country code, area code, and local number, with [-/. ] break characters. */
  def phone(): typingsSlinky.breeze.breeze.Validator = js.native
  def phone(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Register a validator instance so that any deserialized metadata can reference it. */
  def register(validator: typingsSlinky.breeze.breeze.Validator): Unit = js.native
  
  /** Register a validator factory so that any deserialized metadata can reference it.  */
  def registerFactory(fn: js.Function0[this.type], name: String): Unit = js.native
  
  /** Returns a regular expression validator; the expression must be specified in the context parameter */
  def regularExpression(context: Expression): typingsSlinky.breeze.breeze.Validator = js.native
  
  def required(): typingsSlinky.breeze.breeze.Validator = js.native
  def required(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Validators number, double, and single are all the same */
  def single(): typingsSlinky.breeze.breeze.Validator = js.native
  def single(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  def string(): typingsSlinky.breeze.breeze.Validator = js.native
  
  def stringLength(context: MinLength): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Returns the URL (protocol required) validator */
  def url(): typingsSlinky.breeze.breeze.Validator = js.native
  def url(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
}
