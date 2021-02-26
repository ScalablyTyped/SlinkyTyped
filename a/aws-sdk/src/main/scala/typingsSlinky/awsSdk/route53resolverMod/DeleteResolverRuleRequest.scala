package typingsSlinky.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteResolverRuleRequest extends StObject {
  
  /**
    * The ID of the Resolver rule that you want to delete.
    */
  var ResolverRuleId: ResourceId = js.native
}
object DeleteResolverRuleRequest {
  
  @scala.inline
  def apply(ResolverRuleId: ResourceId): DeleteResolverRuleRequest = {
    val __obj = js.Dynamic.literal(ResolverRuleId = ResolverRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResolverRuleRequest]
  }
  
  @scala.inline
  implicit class DeleteResolverRuleRequestMutableBuilder[Self <: DeleteResolverRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolverRuleId(value: ResourceId): Self = StObject.set(x, "ResolverRuleId", value.asInstanceOf[js.Any])
  }
}
