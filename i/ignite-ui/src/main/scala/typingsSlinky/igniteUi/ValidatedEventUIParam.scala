package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidatedEventUIParam extends StObject {
  
  /**
    * Populated with options for the specific field in the collection or null.
    */
  var fieldOptions: js.UndefOr[js.Any] = js.native
  
  /**
    * Get the formatted message text, if any.
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    * Get all messages, if any. May be more than one if [executeAllRules](ui.igvalidator#options:executeAllRules) is enabled.
    */
  var messages: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Gets reference to the igValidator widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Deprecated. Populated with the name of the rule that failed validation, if any.
    */
  var rule: js.UndefOr[String] = js.native
  
  /**
    * Populated with the names of rule that failed validation, if any.
    */
  var rules: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Determine the outcome of the validation.
    */
  var valid: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets the current value in target.
    */
  var value: js.UndefOr[js.Any] = js.native
}
object ValidatedEventUIParam {
  
  @scala.inline
  def apply(): ValidatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidatedEventUIParam]
  }
  
  @scala.inline
  implicit class ValidatedEventUIParamMutableBuilder[Self <: ValidatedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldOptions(value: js.Any): Self = StObject.set(x, "fieldOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldOptionsUndefined: Self = StObject.set(x, "fieldOptions", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setMessages(value: js.Array[_]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: js.Any*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    @scala.inline
    def setRules(value: js.Array[_]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: js.Any*): Self = StObject.set(x, "rules", js.Array(value :_*))
    
    @scala.inline
    def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
