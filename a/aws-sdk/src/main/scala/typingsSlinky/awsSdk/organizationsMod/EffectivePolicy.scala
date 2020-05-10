package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EffectivePolicy extends js.Object {
  /**
    * The time of the last update to this policy.
    */
  var LastUpdatedTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The text content of the policy.
    */
  var PolicyContent: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.PolicyContent] = js.native
  /**
    * The policy type.
    */
  var PolicyType: js.UndefOr[EffectivePolicyType] = js.native
  /**
    * The account ID of the policy target. 
    */
  var TargetId: js.UndefOr[PolicyTargetId] = js.native
}

object EffectivePolicy {
  @scala.inline
  def apply(): EffectivePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EffectivePolicy]
  }
  @scala.inline
  implicit class EffectivePolicyOps[Self <: EffectivePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastUpdatedTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyContent(value: PolicyContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyContent")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyType(value: EffectivePolicyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyType")(js.undefined)
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

