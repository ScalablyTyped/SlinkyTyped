package typingsSlinky.parameter.mod

import typingsSlinky.parameter.parameterStrings.string
import typingsSlinky.parameter.parameterStrings.stringQuestionmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterRuleString
  extends ParameterRuleBase
     with _ParameterRuleItem {
  
  /**
    * Allow empty string, default to false. If rule.required set to false, allowEmpty will be set to true by default.
    * @alias ParameterRuleString.empty
    */
  var allowEmpty: js.UndefOr[Boolean] = js.native
  
  /**
    * Alias of allowEmpty
    */
  var empty: js.UndefOr[Boolean] = js.native
  
  var format: js.UndefOr[js.RegExp] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var trim: js.UndefOr[Boolean] = js.native
  
  @JSName("type")
  var type_ParameterRuleString: string | stringQuestionmark = js.native
}
object ParameterRuleString {
  
  @scala.inline
  def apply(`type`: string | stringQuestionmark): ParameterRuleString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRuleString]
  }
  
  @scala.inline
  implicit class ParameterRuleStringMutableBuilder[Self <: ParameterRuleString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
    
    @scala.inline
    def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    @scala.inline
    def setFormat(value: js.RegExp): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    
    @scala.inline
    def setType(value: string | stringQuestionmark): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
