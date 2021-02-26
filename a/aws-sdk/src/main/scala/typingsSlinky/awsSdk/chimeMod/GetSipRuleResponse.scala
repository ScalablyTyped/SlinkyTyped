package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSipRuleResponse extends StObject {
  
  /**
    * The SIP rule details.
    */
  var SipRule: js.UndefOr[typingsSlinky.awsSdk.chimeMod.SipRule] = js.native
}
object GetSipRuleResponse {
  
  @scala.inline
  def apply(): GetSipRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSipRuleResponse]
  }
  
  @scala.inline
  implicit class GetSipRuleResponseMutableBuilder[Self <: GetSipRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSipRule(value: SipRule): Self = StObject.set(x, "SipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipRuleUndefined: Self = StObject.set(x, "SipRule", js.undefined)
  }
}
