package typingsSlinky.breeze.mod

import typingsSlinky.breeze.anon.Expression
import typingsSlinky.breeze.anon.MaxLength
import typingsSlinky.breeze.anon.MessageTemplate
import typingsSlinky.breeze.anon.MinLength
import typingsSlinky.breeze.breeze.ValidatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "Validator")
@js.native
class Validator protected ()
  extends typingsSlinky.breeze.breeze.Validator {
  def this(name: String, validatorFn: ValidatorFunction) = this()
  def this(name: String, validatorFn: ValidatorFunction, context: js.Any) = this()
}
/* static members */
object Validator {
  
  @JSImport("breeze", "Validator")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("breeze", "Validator.bool")
  @js.native
  def bool(): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** integer between 0 and 255 inclusive */
  @JSImport("breeze", "Validator.byte")
  @js.native
  def byte(): typingsSlinky.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.byte")
  @js.native
  def byte(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Returns a credit card number validator that performs a Luhn algorithm checksum test for plausability */
  @JSImport("breeze", "Validator.creditCard")
  @js.native
  def creditCard(): typingsSlinky.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.creditCard")
  @js.native
  def creditCard(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  @JSImport("breeze", "Validator.date")
  @js.native
  def date(): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Validators number, double, and single are all the same */
  @JSImport("breeze", "Validator.double")
  @js.native
  def double(): typingsSlinky.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.double")
  @js.native
  def double(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Returns a ISO 8601 duration string Validator. */
  @JSImport("breeze", "Validator.duration")
  @js.native
  def duration(): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Returns the email address validator */
  @JSImport("breeze", "Validator.emailAddress")
  @js.native
  def emailAddress(): typingsSlinky.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.emailAddress")
  @js.native
  def emailAddress(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Creates a validator instance from a JSON object or an array of instances from an array of JSON objects. */
  @JSImport("breeze", "Validator.fromJSON")
  @js.native
  def fromJSON(json: String): typingsSlinky.breeze.breeze.Validator = js.native
  
  @JSImport("breeze", "Validator.guid")
  @js.native
  def guid(): typingsSlinky.breeze.breeze.Validator = js.native
  
  @JSImport("breeze", "Validator.int16")
  @js.native
  def int16(): typingsSlinky.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.int16")
  @js.native
  def int16(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  @JSImport("breeze", "Validator.int32")
  @js.native
  def int32(): typingsSlinky.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.int32")
  @js.native
  def int32(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  @JSImport("breeze", "Validator.int64")
  @js.native
  def int64(): typingsSlinky.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.int64")
  @js.native
  def int64(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Same as int64 */
  @JSImport("breeze", "Validator.integer")
  @js.native
  def integer(): typingsSlinky.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.integer")
  @js.native
  def integer(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Creates a regular expression validator with a fixed expression. */
  @JSImport("breeze", "Validator.makeRegExpValidator")
  @js.native
  def makeRegExpValidator(validatorName: String, expression: js.RegExp, defaultMessage: String): typingsSlinky.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.makeRegExpValidator")
  @js.native
  def makeRegExpValidator(validatorName: String, expression: js.RegExp, defaultMessage: String, context: js.Any): typingsSlinky.breeze.breeze.Validator = js.native
  
  @JSImport("breeze", "Validator.maxLength")
  @js.native
  def maxLength(context: MaxLength): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Map of standard error message templates keyed by validator name.*/
  @JSImport("breeze", "Validator.messageTemplates")
  @js.native
  def messageTemplates: js.Any = js.native
  @scala.inline
  def messageTemplates_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messageTemplates")(x.asInstanceOf[js.Any])
  
  /** Always returns true */
  @JSImport("breeze", "Validator.none")
  @js.native
  def none(): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Validators number, double, and single are all the same */
  @JSImport("breeze", "Validator.number")
  @js.native
  def number(): typingsSlinky.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.number")
  @js.native
  def number(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Returns the phone validator, which handles prefix, country code, area code, and local number, with [-/. ] break characters. */
  @JSImport("breeze", "Validator.phone")
  @js.native
  def phone(): typingsSlinky.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.phone")
  @js.native
  def phone(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Register a validator instance so that any deserialized metadata can reference it. */
  @JSImport("breeze", "Validator.register")
  @js.native
  def register(validator: typingsSlinky.breeze.breeze.Validator): Unit = js.native
  
  /** Register a validator factory so that any deserialized metadata can reference it.  */
  @JSImport("breeze", "Validator.registerFactory")
  @js.native
  def registerFactory(fn: js.Function0[this.type], name: String): Unit = js.native
  
  /** Returns a regular expression validator; the expression must be specified in the context parameter */
  @JSImport("breeze", "Validator.regularExpression")
  @js.native
  def regularExpression(context: Expression): typingsSlinky.breeze.breeze.Validator = js.native
  
  @JSImport("breeze", "Validator.required")
  @js.native
  def required(): typingsSlinky.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.required")
  @js.native
  def required(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Validators number, double, and single are all the same */
  @JSImport("breeze", "Validator.single")
  @js.native
  def single(): typingsSlinky.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.single")
  @js.native
  def single(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  
  @JSImport("breeze", "Validator.string")
  @js.native
  def string(): typingsSlinky.breeze.breeze.Validator = js.native
  
  @JSImport("breeze", "Validator.stringLength")
  @js.native
  def stringLength(context: MinLength): typingsSlinky.breeze.breeze.Validator = js.native
  
  /** Returns the URL (protocol required) validator */
  @JSImport("breeze", "Validator.url")
  @js.native
  def url(): typingsSlinky.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.url")
  @js.native
  def url(context: MessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
}
