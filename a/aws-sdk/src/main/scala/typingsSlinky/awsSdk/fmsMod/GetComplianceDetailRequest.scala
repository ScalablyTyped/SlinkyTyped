package typingsSlinky.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetComplianceDetailRequest extends StObject {
  
  /**
    * The AWS account that owns the resources that you want to get the details for.
    */
  var MemberAccount: AWSAccountId = js.native
  
  /**
    * The ID of the policy that you want to get the details for. PolicyId is returned by PutPolicy and by ListPolicies.
    */
  var PolicyId: typingsSlinky.awsSdk.fmsMod.PolicyId = js.native
}
object GetComplianceDetailRequest {
  
  @scala.inline
  def apply(MemberAccount: AWSAccountId, PolicyId: PolicyId): GetComplianceDetailRequest = {
    val __obj = js.Dynamic.literal(MemberAccount = MemberAccount.asInstanceOf[js.Any], PolicyId = PolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComplianceDetailRequest]
  }
  
  @scala.inline
  implicit class GetComplianceDetailRequestMutableBuilder[Self <: GetComplianceDetailRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemberAccount(value: AWSAccountId): Self = StObject.set(x, "MemberAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
  }
}
