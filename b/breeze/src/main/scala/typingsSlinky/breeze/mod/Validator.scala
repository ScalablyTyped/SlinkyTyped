package typingsSlinky.breeze.mod

import typingsSlinky.breeze.AnonExpression
import typingsSlinky.breeze.AnonMaxLength
import typingsSlinky.breeze.AnonMessageTemplate
import typingsSlinky.breeze.AnonMinLength
import typingsSlinky.breeze.breeze.ValidatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "Validator")
@js.native
class Validator protected ()
  extends typingsSlinky.breeze.breeze.Validator {
  def this(name: String, validatorFn: ValidatorFunction) = this()
  def this(name: String, validatorFn: ValidatorFunction, context: js.Any) = this()
}

/* static members */
@JSImport("breeze", "Validator")
@js.native
object Validator extends js.Object {
  /** Map of standard error message templates keyed by validator name.*/
  var messageTemplates: js.Any = js.native
  def bool(): typingsSlinky.breeze.breeze.Validator = js.native
  /** integer between 0 and 255 inclusive */
  def byte(): typingsSlinky.breeze.breeze.Validator = js.native
  def byte(context: AnonMessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  /** Returns a credit card number validator that performs a Luhn algorithm checksum test for plausability */
  def creditCard(): typingsSlinky.breeze.breeze.Validator = js.native
  def creditCard(context: AnonMessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  def date(): typingsSlinky.breeze.breeze.Validator = js.native
  /** Validators number, double, and single are all the same */
  def double(): typingsSlinky.breeze.breeze.Validator = js.native
  def double(context: AnonMessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  /** Returns a ISO 8601 duration string Validator. */
  def duration(): typingsSlinky.breeze.breeze.Validator = js.native
  /** Returns the email address validator */
  def emailAddress(): typingsSlinky.breeze.breeze.Validator = js.native
  def emailAddress(context: AnonMessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  /** Creates a validator instance from a JSON object or an array of instances from an array of JSON objects. */
  def fromJSON(json: String): typingsSlinky.breeze.breeze.Validator = js.native
  def guid(): typingsSlinky.breeze.breeze.Validator = js.native
  def int16(): typingsSlinky.breeze.breeze.Validator = js.native
  def int16(context: AnonMessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  def int32(): typingsSlinky.breeze.breeze.Validator = js.native
  def int32(context: AnonMessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  def int64(): typingsSlinky.breeze.breeze.Validator = js.native
  def int64(context: AnonMessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  /** Same as int64 */
  def integer(): typingsSlinky.breeze.breeze.Validator = js.native
  def integer(context: AnonMessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  /** Creates a regular expression validator with a fixed expression. */
  def makeRegExpValidator(validatorName: String, expression: js.RegExp, defaultMessage: String): typingsSlinky.breeze.breeze.Validator = js.native
  def makeRegExpValidator(validatorName: String, expression: js.RegExp, defaultMessage: String, context: js.Any): typingsSlinky.breeze.breeze.Validator = js.native
  def maxLength(context: AnonMaxLength): typingsSlinky.breeze.breeze.Validator = js.native
  /** Always returns true */
  def none(): typingsSlinky.breeze.breeze.Validator = js.native
  /** Validators number, double, and single are all the same */
  def number(): typingsSlinky.breeze.breeze.Validator = js.native
  def number(context: AnonMessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  /** Returns the phone validator, which handles prefix, country code, area code, and local number, with [-/. ] break characters. */
  def phone(): typingsSlinky.breeze.breeze.Validator = js.native
  def phone(context: AnonMessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  /** Register a validator instance so that any deserialized metadata can reference it. */
  def register(validator: typingsSlinky.breeze.breeze.Validator): Unit = js.native
  /** Register a validator factory so that any deserialized metadata can reference it.  */
  def registerFactory(fn: js.Function0[this.type], name: String): Unit = js.native
  /** Returns a regular expression validator; the expression must be specified in the context parameter */
  def regularExpression(context: AnonExpression): typingsSlinky.breeze.breeze.Validator = js.native
  def required(): typingsSlinky.breeze.breeze.Validator = js.native
  def required(context: AnonMessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  /** Validators number, double, and single are all the same */
  def single(): typingsSlinky.breeze.breeze.Validator = js.native
  def single(context: AnonMessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
  def string(): typingsSlinky.breeze.breeze.Validator = js.native
  def stringLength(context: AnonMinLength): typingsSlinky.breeze.breeze.Validator = js.native
  /** Returns the URL (protocol required) validator */
  def url(): typingsSlinky.breeze.breeze.Validator = js.native
  def url(context: AnonMessageTemplate): typingsSlinky.breeze.breeze.Validator = js.native
}

