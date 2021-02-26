package typingsSlinky.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutPermissionPolicyRequest extends StObject {
  
  /**
    * The policy to attach to the specified RuleGroup.
    */
  var Policy: PolicyString = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the RuleGroup to which you want to attach the policy.
    */
  var ResourceArn: typingsSlinky.awsSdk.wafMod.ResourceArn = js.native
}
object PutPermissionPolicyRequest {
  
  @scala.inline
  def apply(Policy: PolicyString, ResourceArn: ResourceArn): PutPermissionPolicyRequest = {
    val __obj = js.Dynamic.literal(Policy = Policy.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPermissionPolicyRequest]
  }
  
  @scala.inline
  implicit class PutPermissionPolicyRequestMutableBuilder[Self <: PutPermissionPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: PolicyString): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
