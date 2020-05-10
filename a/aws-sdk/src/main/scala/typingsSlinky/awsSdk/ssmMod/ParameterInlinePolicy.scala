package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterInlinePolicy extends js.Object {
  /**
    * The status of the policy. Policies report the following statuses: Pending (the policy has not been enforced or applied yet), Finished (the policy was applied), Failed (the policy was not applied), or InProgress (the policy is being applied now). 
    */
  var PolicyStatus: js.UndefOr[String] = js.native
  /**
    * The JSON text of the policy.
    */
  var PolicyText: js.UndefOr[String] = js.native
  /**
    * The type of policy. Parameter Store supports the following policy types: Expiration, ExpirationNotification, and NoChangeNotification. 
    */
  var PolicyType: js.UndefOr[String] = js.native
}

object ParameterInlinePolicy {
  @scala.inline
  def apply(): ParameterInlinePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterInlinePolicy]
  }
  @scala.inline
  implicit class ParameterInlinePolicyOps[Self <: ParameterInlinePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyText")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyType(value: String): Self = {
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
  }
  
}

