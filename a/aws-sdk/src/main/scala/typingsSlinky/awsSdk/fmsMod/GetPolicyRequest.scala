package typingsSlinky.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolicyRequest extends js.Object {
  /**
    * The ID of the AWS Firewall Manager policy that you want the details for.
    */
  var PolicyId: typingsSlinky.awsSdk.fmsMod.PolicyId = js.native
}

object GetPolicyRequest {
  @scala.inline
  def apply(PolicyId: PolicyId): GetPolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyRequest]
  }
  @scala.inline
  implicit class GetPolicyRequestOps[Self <: GetPolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyId(value: PolicyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

