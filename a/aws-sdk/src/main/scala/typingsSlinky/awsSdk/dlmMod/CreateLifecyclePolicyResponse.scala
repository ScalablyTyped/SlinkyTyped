package typingsSlinky.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLifecyclePolicyResponse extends js.Object {
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
  implicit class CreateLifecyclePolicyResponseOps[Self <: CreateLifecyclePolicyResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutPolicyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyId")(js.undefined)
        ret
    }
  }
  
}

