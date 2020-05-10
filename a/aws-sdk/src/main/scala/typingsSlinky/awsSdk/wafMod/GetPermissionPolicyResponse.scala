package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPermissionPolicyResponse extends js.Object {
  /**
    * The IAM policy attached to the specified RuleGroup.
    */
  var Policy: js.UndefOr[PolicyString] = js.native
}

object GetPermissionPolicyResponse {
  @scala.inline
  def apply(): GetPermissionPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPermissionPolicyResponse]
  }
  @scala.inline
  implicit class GetPermissionPolicyResponseOps[Self <: GetPermissionPolicyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicy(value: PolicyString): Self = {
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

