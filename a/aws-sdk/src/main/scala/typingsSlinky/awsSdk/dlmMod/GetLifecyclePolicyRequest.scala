package typingsSlinky.awsSdk.dlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLifecyclePolicyRequest extends StObject {
  
  /**
    * The identifier of the lifecycle policy.
    */
  var PolicyId: typingsSlinky.awsSdk.dlmMod.PolicyId = js.native
}
object GetLifecyclePolicyRequest {
  
  @scala.inline
  def apply(PolicyId: PolicyId): GetLifecyclePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLifecyclePolicyRequest]
  }
  
  @scala.inline
  implicit class GetLifecyclePolicyRequestMutableBuilder[Self <: GetLifecyclePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
  }
}
