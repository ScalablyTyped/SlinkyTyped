package typingsSlinky.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResolverRulePolicyResponse extends StObject {
  
  /**
    * Information about the Resolver rule policy that you specified in a GetResolverRulePolicy request.
    */
  var ResolverRulePolicy: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.ResolverRulePolicy] = js.native
}
object GetResolverRulePolicyResponse {
  
  @scala.inline
  def apply(): GetResolverRulePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverRulePolicyResponse]
  }
  
  @scala.inline
  implicit class GetResolverRulePolicyResponseMutableBuilder[Self <: GetResolverRulePolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolverRulePolicy(value: ResolverRulePolicy): Self = StObject.set(x, "ResolverRulePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverRulePolicyUndefined: Self = StObject.set(x, "ResolverRulePolicy", js.undefined)
  }
}
