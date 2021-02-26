package typingsSlinky.awsSdk.dlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLifecyclePolicyResponse extends StObject {
  
  /**
    * The identifier of the lifecycle policy.
    */
  var PolicyId: js.UndefOr[typingsSlinky.awsSdk.dlmMod.PolicyId] = js.native
}
object CreateLifecyclePolicyResponse {
  
  @scala.inline
  def apply(): CreateLifecyclePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLifecyclePolicyResponse]
  }
  
  @scala.inline
  implicit class CreateLifecyclePolicyResponseMutableBuilder[Self <: CreateLifecyclePolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyIdUndefined: Self = StObject.set(x, "PolicyId", js.undefined)
  }
}
