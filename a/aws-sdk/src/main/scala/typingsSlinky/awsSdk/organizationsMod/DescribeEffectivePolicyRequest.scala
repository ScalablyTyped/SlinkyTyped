package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEffectivePolicyRequest extends js.Object {
  /**
    * The type of policy that you want information about.
    */
  var PolicyType: EffectivePolicyType = js.native
  /**
    * When you're signed in as the master account, specify the ID of the account that you want details about. Specifying an organization root or OU as the target is not supported. 
    */
  var TargetId: js.UndefOr[PolicyTargetId] = js.native
}

object DescribeEffectivePolicyRequest {
  @scala.inline
  def apply(PolicyType: EffectivePolicyType): DescribeEffectivePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyType = PolicyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEffectivePolicyRequest]
  }
  @scala.inline
  implicit class DescribeEffectivePolicyRequestOps[Self <: DescribeEffectivePolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyType(value: EffectivePolicyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetId(value: PolicyTargetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetId")(js.undefined)
        ret
    }
  }
  
}

