package typingsSlinky.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckCapacityRequest extends StObject {
  
  /**
    * An array of Rule that you're configuring to use in a rule group or web ACL. 
    */
  var Rules: typingsSlinky.awsSdk.wafv2Mod.Rules = js.native
  
  /**
    * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL API.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the Region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typingsSlinky.awsSdk.wafv2Mod.Scope = js.native
}
object CheckCapacityRequest {
  
  @scala.inline
  def apply(Rules: Rules, Scope: Scope): CheckCapacityRequest = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckCapacityRequest]
  }
  
  @scala.inline
  implicit class CheckCapacityRequestMutableBuilder[Self <: CheckCapacityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: Rules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
    
    @scala.inline
    def setScope(value: Scope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
  }
}
