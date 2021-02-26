package typingsSlinky.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRuleGroupResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the CreateRuleGroup request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typingsSlinky.awsSdk.wafMod.ChangeToken] = js.native
  
  /**
    * An empty RuleGroup.
    */
  var RuleGroup: js.UndefOr[typingsSlinky.awsSdk.wafMod.RuleGroup] = js.native
}
object CreateRuleGroupResponse {
  
  @scala.inline
  def apply(): CreateRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRuleGroupResponse]
  }
  
  @scala.inline
  implicit class CreateRuleGroupResponseMutableBuilder[Self <: CreateRuleGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
    
    @scala.inline
    def setRuleGroup(value: RuleGroup): Self = StObject.set(x, "RuleGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleGroupUndefined: Self = StObject.set(x, "RuleGroup", js.undefined)
  }
}
