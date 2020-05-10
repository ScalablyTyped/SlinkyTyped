package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachPrincipalPolicyRequest extends js.Object {
  /**
    * The policy name.
    */
  var policyName: PolicyName = js.native
  /**
    * The principal, which can be a certificate ARN (as returned from the CreateCertificate operation) or an Amazon Cognito ID.
    */
  var principal: Principal = js.native
}

object AttachPrincipalPolicyRequest {
  @scala.inline
  def apply(policyName: PolicyName, principal: Principal): AttachPrincipalPolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any], principal = principal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachPrincipalPolicyRequest]
  }
  @scala.inline
  implicit class AttachPrincipalPolicyRequestOps[Self <: AttachPrincipalPolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyName(value: PolicyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrincipal(value: Principal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

