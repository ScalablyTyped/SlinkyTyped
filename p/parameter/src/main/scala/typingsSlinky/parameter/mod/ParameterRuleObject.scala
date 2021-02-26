package typingsSlinky.parameter.mod

import typingsSlinky.parameter.parameterStrings.`object`
import typingsSlinky.parameter.parameterStrings.objectQuestionmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterRuleObject
  extends ParameterRuleBase
     with _ParameterRuleItem {
  
  var rule: js.UndefOr[ParameterRules] = js.native
  
  @JSName("type")
  var type_ParameterRuleObject: `object` | objectQuestionmark = js.native
}
object ParameterRuleObject {
  
  @scala.inline
  def apply(`type`: `object` | objectQuestionmark): ParameterRuleObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRuleObject]
  }
  
  @scala.inline
  implicit class ParameterRuleObjectMutableBuilder[Self <: ParameterRuleObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRule(value: ParameterRules): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    @scala.inline
    def setType(value: `object` | objectQuestionmark): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
