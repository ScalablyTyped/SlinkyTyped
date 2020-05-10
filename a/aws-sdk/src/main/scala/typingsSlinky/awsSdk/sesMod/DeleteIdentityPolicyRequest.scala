package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIdentityPolicyRequest extends js.Object {
  /**
    * The identity that is associated with the policy that you want to delete. You can specify the identity by using its name or by using its Amazon Resource Name (ARN). Examples: user@example.com, example.com, arn:aws:ses:us-east-1:123456789012:identity/example.com. To successfully call this API, you must own the identity.
    */
  var Identity: typingsSlinky.awsSdk.sesMod.Identity = js.native
  /**
    * The name of the policy to be deleted.
    */
  var PolicyName: typingsSlinky.awsSdk.sesMod.PolicyName = js.native
}

object DeleteIdentityPolicyRequest {
  @scala.inline
  def apply(Identity: Identity, PolicyName: PolicyName): DeleteIdentityPolicyRequest = {
    val __obj = js.Dynamic.literal(Identity = Identity.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIdentityPolicyRequest]
  }
  @scala.inline
  implicit class DeleteIdentityPolicyRequestOps[Self <: DeleteIdentityPolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentity(value: Identity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicyName(value: PolicyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

