package typingsSlinky.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetComplianceDetailRequest extends js.Object {
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
  implicit class GetComplianceDetailRequestOps[Self <: GetComplianceDetailRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMemberAccount(value: AWSAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicyId(value: PolicyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

