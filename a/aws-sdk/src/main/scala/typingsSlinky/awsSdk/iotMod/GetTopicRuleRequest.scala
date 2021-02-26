package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTopicRuleRequest extends StObject {
  
  /**
    * The name of the rule.
    */
  var ruleName: RuleName = js.native
}
object GetTopicRuleRequest {
  
  @scala.inline
  def apply(ruleName: RuleName): GetTopicRuleRequest = {
    val __obj = js.Dynamic.literal(ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTopicRuleRequest]
  }
  
  @scala.inline
  implicit class GetTopicRuleRequestMutableBuilder[Self <: GetTopicRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleName(value: RuleName): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
  }
}
