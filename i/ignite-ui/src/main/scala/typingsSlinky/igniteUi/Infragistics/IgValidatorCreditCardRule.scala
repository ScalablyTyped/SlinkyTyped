package typingsSlinky.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgValidatorCreditCardRule extends StObject {
  
  /**
    * Formats an error message using rule-specific values (usually from formatItems).
    *
    * @param message The unformatted error message the validator intends to display.
    */
  def formatMessage(message: String): String = js.native
  
  /**
    * Gets the error message type to get from locale settings (matching as "<type>Message>"). Returns the rule name by default.
    * Only used when there's no errorMessage option available through getRuleMessage.
    *
    * @param options
    */
  def getMessageType(options: js.Object): String = js.native
  
  /**
    * Gets an errorMessage from either the rule or field/global options.
    *
    * @param options
    */
  def getRuleMessage(options: js.Object): String = js.native
  
  /**
    * Based on ASP.NET CreditCardAttribute check,
    * https://github.com/Microsoft/referencesource/blob/master/System.ComponentModel.DataAnnotations/DataAnnotations/CreditCardAttribute.cs
    *    using Luhn algorithm https://en.wikipedia.org/wiki/Luhn_algorithm
    *
    * @param options
    * @param value
    */
  def isValid(options: js.Object, value: js.Object): Unit = js.native
  
  /**
    * Checks if rule should run on the current field and/or value.
    *
    * @param options Options for the validator, if fields are used this parameter is already populated with inherited ones.
    * @param value The stringified value to check.
    */
  def shouldRun(options: js.Object, value: String): Boolean = js.native
}
object IgValidatorCreditCardRule {
  
  @scala.inline
  def apply(
    formatMessage: String => String,
    getMessageType: js.Object => String,
    getRuleMessage: js.Object => String,
    isValid: (js.Object, js.Object) => Unit,
    shouldRun: (js.Object, String) => Boolean
  ): IgValidatorCreditCardRule = {
    val __obj = js.Dynamic.literal(formatMessage = js.Any.fromFunction1(formatMessage), getMessageType = js.Any.fromFunction1(getMessageType), getRuleMessage = js.Any.fromFunction1(getRuleMessage), isValid = js.Any.fromFunction2(isValid), shouldRun = js.Any.fromFunction2(shouldRun))
    __obj.asInstanceOf[IgValidatorCreditCardRule]
  }
  
  @scala.inline
  implicit class IgValidatorCreditCardRuleMutableBuilder[Self <: IgValidatorCreditCardRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormatMessage(value: String => String): Self = StObject.set(x, "formatMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMessageType(value: js.Object => String): Self = StObject.set(x, "getMessageType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRuleMessage(value: js.Object => String): Self = StObject.set(x, "getRuleMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsValid(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "isValid", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShouldRun(value: (js.Object, String) => Boolean): Self = StObject.set(x, "shouldRun", js.Any.fromFunction2(value))
  }
}
