package typingsSlinky.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutRuleResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var RuleArn: js.UndefOr[typingsSlinky.awsSdk.eventbridgeMod.RuleArn] = js.native
}
object PutRuleResponse {
  
  @scala.inline
  def apply(): PutRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRuleResponse]
  }
  
  @scala.inline
  implicit class PutRuleResponseMutableBuilder[Self <: PutRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleArn(value: RuleArn): Self = StObject.set(x, "RuleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleArnUndefined: Self = StObject.set(x, "RuleArn", js.undefined)
  }
}
