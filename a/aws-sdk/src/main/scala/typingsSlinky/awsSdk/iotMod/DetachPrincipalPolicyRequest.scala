package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetachPrincipalPolicyRequest extends StObject {
  
  /**
    * The name of the policy to detach.
    */
  var policyName: PolicyName = js.native
  
  /**
    * The principal. Valid principals are CertificateArn (arn:aws:iot:region:accountId:cert/certificateId), thingGroupArn (arn:aws:iot:region:accountId:thinggroup/groupName) and CognitoId (region:id).
    */
  var principal: Principal = js.native
}
object DetachPrincipalPolicyRequest {
  
  @scala.inline
  def apply(policyName: PolicyName, principal: Principal): DetachPrincipalPolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any], principal = principal.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachPrincipalPolicyRequest]
  }
  
  @scala.inline
  implicit class DetachPrincipalPolicyRequestMutableBuilder[Self <: DetachPrincipalPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipal(value: Principal): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
  }
}
