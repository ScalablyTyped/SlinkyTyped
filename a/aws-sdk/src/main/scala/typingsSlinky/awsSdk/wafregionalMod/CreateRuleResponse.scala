package typingsSlinky.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRuleResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the CreateRule request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.ChangeToken] = js.native
  
  /**
    * The Rule returned in the CreateRule response.
    */
  var Rule: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.Rule] = js.native
}
object CreateRuleResponse {
  
  @scala.inline
  def apply(): CreateRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRuleResponse]
  }
  
  @scala.inline
  implicit class CreateRuleResponseMutableBuilder[Self <: CreateRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
    
    @scala.inline
    def setRule(value: Rule): Self = StObject.set(x, "Rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "Rule", js.undefined)
  }
}
