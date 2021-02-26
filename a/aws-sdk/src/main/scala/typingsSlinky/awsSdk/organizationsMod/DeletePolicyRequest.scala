package typingsSlinky.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePolicyRequest extends StObject {
  
  /**
    * The unique identifier (ID) of the policy that you want to delete. You can get the ID from the ListPolicies or ListPoliciesForTarget operations. The regex pattern for a policy ID string requires "p-" followed by from 8 to 128 lowercase or uppercase letters, digits, or the underscore character (_).
    */
  var PolicyId: typingsSlinky.awsSdk.organizationsMod.PolicyId = js.native
}
object DeletePolicyRequest {
  
  @scala.inline
  def apply(PolicyId: PolicyId): DeletePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePolicyRequest]
  }
  
  @scala.inline
  implicit class DeletePolicyRequestMutableBuilder[Self <: DeletePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
  }
}
