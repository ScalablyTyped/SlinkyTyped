package typingsSlinky.breeze.global.breeze

import typingsSlinky.breeze.anon.Expression
import typingsSlinky.breeze.anon.MaxLength
import typingsSlinky.breeze.anon.MessageTemplate
import typingsSlinky.breeze.anon.MinLength
import typingsSlinky.breeze.breeze.ValidatorFunction
import org.scalablytyped.runtime.StObject
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
object Validator {
  
  @JSGlobal("breeze.Validator")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("breeze.Validator.bool")
  @js.native
  def bool(): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** integer between 0 and 255 inclusive */
  @JSGlobal("breeze.Validator.byte")
  @js.native
  def byte(): typingsSlinky.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.byte")
  @js.native
  def byte(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Returns a credit card number validator that performs a Luhn algorithm checksum test for plausability */
  @JSGlobal("breeze.Validator.creditCard")
  @js.native
  def creditCard(): typingsSlinky.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.creditCard")
  @js.native
  def creditCard(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  @JSGlobal("breeze.Validator.date")
  @js.native
  def date(): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Validators number, double, and single are all the same */
  @JSGlobal("breeze.Validator.double")
  @js.native
  def double(): typingsSlinky.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.double")
  @js.native
  def double(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Returns a ISO 8601 duration string Validator. */
  @JSGlobal("breeze.Validator.duration")
  @js.native
  def duration(): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Returns the email address validator */
  @JSGlobal("breeze.Validator.emailAddress")
  @js.native
  def emailAddress(): typingsSlinky.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.emailAddress")
  @js.native
  def emailAddress(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Creates a validator instance from a JSON object or an array of instances from an array of JSON objects. */
  @JSGlobal("breeze.Validator.fromJSON")
  @js.native
  def fromJSON(json: String): typingsSlinky.breeze.breeze.Validator = js.native
  
  @JSGlobal("breeze.Validator.guid")
  @js.native
  def guid(): typingsSlinky.breeze.breeze.Validator = js.native
  
  @JSGlobal("breeze.Validator.int16")
  @js.native
  def int16(): typingsSlinky.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.int16")
  @js.native
  def int16(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  @JSGlobal("breeze.Validator.int32")
  @js.native
  def int32(): typingsSlinky.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.int32")
  @js.native
  def int32(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  @JSGlobal("breeze.Validator.int64")
  @js.native
  def int64(): typingsSlinky.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.int64")
  @js.native
  def int64(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Same as int64 */
  @JSGlobal("breeze.Validator.integer")
  @js.native
  def integer(): typingsSlinky.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.integer")
  @js.native
  def integer(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Creates a regular expression validator with a fixed expression. */
  @JSGlobal("breeze.Validator.makeRegExpValidator")
  @js.native
  def makeRegExpValidator(validatorName: String, expression: js.RegExp, defaultMessage: String): typingsSlinky.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.makeRegExpValidator")
  @js.native
  def makeRegExpValidator(validatorName: String, expression: js.RegExp, defaultMessage: String, context: js.Any): typingsSlinky.breeze.breeze.Validator = js.native
  
  @JSGlobal("breeze.Validator.maxLength")
  @js.native
  def maxLength(context: MaxLength): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Map of standard error message templates keyed by validator name.*/
  @JSGlobal("breeze.Validator.messageTemplates")
  @js.native
  def messageTemplates: js.Any = js.native
  @scala.inline
  def messageTemplates_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messageTemplates")(x.asInstanceOf[js.Any])
  
  /** Always returns true */
  @JSGlobal("breeze.Validator.none")
  @js.native
  def none(): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Validators number, double, and single are all the same */
  @JSGlobal("breeze.Validator.number")
  @js.native
  def number(): typingsSlinky.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.number")
  @js.native
  def number(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Returns the phone validator, which handles prefix, country code, area code, and local number, with [-/. ] break characters. */
  @JSGlobal("breeze.Validator.phone")
  @js.native
  def phone(): typingsSlinky.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.phone")
  @js.native
  def phone(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Register a validator instance so that any deserialized metadata can reference it. */
  @JSGlobal("breeze.Validator.register")
  @js.native
  def register(validator: typingsSlinky.breeze.breeze.Validator): Unit = js.native
  
  /** Register a validator factory so that any deserialized metadata can reference it.  */
  @JSGlobal("breeze.Validator.registerFactory")
  @js.native
  def registerFactory(fn: js.Function0[this.type], name: String): Unit = js.native
  
  /** Returns a regular expression validator; the expression must be specified in the context parameter */
  @JSGlobal("breeze.Validator.regularExpression")
  @js.native
  def regularExpression(context: Expression): typingsSlinky.breeze.breeze.Validator = js.native
  
  @JSGlobal("breeze.Validator.required")
  @js.native
  def required(): typingsSlinky.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.required")
  @js.native
  def required(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Validators number, double, and single are all the same */
  @JSGlobal("breeze.Validator.single")
  @js.native
  def single(): typingsSlinky.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.single")
  @js.native
  def single(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  @JSGlobal("breeze.Validator.string")
  @js.native
  def string(): typingsSlinky.breeze.breeze.Validator = js.native
  
  @JSGlobal("breeze.Validator.stringLength")
  @js.native
  def stringLength(context: MinLength): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Returns the URL (protocol required) validator */
  @JSGlobal("breeze.Validator.url")
  @js.native
  def url(): typingsSlinky.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.url")
  @js.native
  def url(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
}
