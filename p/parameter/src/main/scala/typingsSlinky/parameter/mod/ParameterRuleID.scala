package typingsSlinky.parameter.mod

import typingsSlinky.parameter.parameterStrings.id
import typingsSlinky.parameter.parameterStrings.idQuestionmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterRuleID
  extends ParameterRuleBase
     with _ParameterRuleItem {
  
  var allowEmpty: js.UndefOr[Boolean] = js.native
  
  @JSName("type")
  var type_ParameterRuleID: id | idQuestionmark = js.native
}
object ParameterRuleID {
  
  @scala.inline
  def apply(`type`: id | idQuestionmark): ParameterRuleID = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRuleID]
  }
  
  @scala.inline
  implicit class ParameterRuleIDMutableBuilder[Self <: ParameterRuleID] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
    
    @scala.inline
    def setType(value: id | idQuestionmark): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
