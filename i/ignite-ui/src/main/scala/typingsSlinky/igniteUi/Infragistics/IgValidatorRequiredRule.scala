package typingsSlinky.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgValidatorRequiredRule extends StObject {
  
  /**
    * Formats an error message using rule-specific values (usually from formatItems).
    *
    * @param message The unformatted error message the validator intends to display.
    */
  def formatMessage(message: String): String = js.native
  
  def getMessageType(options: js.Object): Unit = js.native
  
  /**
    * Gets an errorMessage from either the rule or field/global options.
    *
    * @param options
    */
  def getRuleMessage(options: js.Object): String = js.native
  
  def isValid(options: js.Object, value: js.Object): Unit = js.native
  
  def shouldRun(options: js.Object): Unit = js.native
}
object IgValidatorRequiredRule {
  
  @scala.inline
  def apply(
    formatMessage: String => String,
    getMessageType: js.Object => Unit,
    getRuleMessage: js.Object => String,
    isValid: (js.Object, js.Object) => Unit,
    shouldRun: js.Object => Unit
  ): IgValidatorRequiredRule = {
    val __obj = js.Dynamic.literal(formatMessage = js.Any.fromFunction1(formatMessage), getMessageType = js.Any.fromFunction1(getMessageType), getRuleMessage = js.Any.fromFunction1(getRuleMessage), isValid = js.Any.fromFunction2(isValid), shouldRun = js.Any.fromFunction1(shouldRun))
    __obj.asInstanceOf[IgValidatorRequiredRule]
  }
  
  @scala.inline
  implicit class IgValidatorRequiredRuleMutableBuilder[Self <: IgValidatorRequiredRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormatMessage(value: String => String): Self = StObject.set(x, "formatMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMessageType(value: js.Object => Unit): Self = StObject.set(x, "getMessageType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRuleMessage(value: js.Object => String): Self = StObject.set(x, "getRuleMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsValid(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "isValid", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShouldRun(value: js.Object => Unit): Self = StObject.set(x, "shouldRun", js.Any.fromFunction1(value))
  }
}
