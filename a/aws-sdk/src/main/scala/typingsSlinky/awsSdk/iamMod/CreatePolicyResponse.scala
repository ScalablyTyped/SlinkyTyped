package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePolicyResponse extends js.Object {
  /**
    * A structure containing details about the new policy.
    */
  var Policy: js.UndefOr[typingsSlinky.awsSdk.iamMod.Policy] = js.native
}

object CreatePolicyResponse {
  @scala.inline
  def apply(): CreatePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePolicyResponse]
  }
  @scala.inline
  implicit class CreatePolicyResponseOps[Self <: CreatePolicyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicy(value: Policy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policy")(js.undefined)
        ret
    }
  }
  
}

