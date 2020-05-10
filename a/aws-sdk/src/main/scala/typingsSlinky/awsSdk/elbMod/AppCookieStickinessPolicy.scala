package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppCookieStickinessPolicy extends js.Object {
  /**
    * The name of the application cookie used for stickiness.
    */
  var CookieName: js.UndefOr[typingsSlinky.awsSdk.elbMod.CookieName] = js.native
  /**
    * The mnemonic name for the policy being created. The name must be unique within a set of policies for this load balancer.
    */
  var PolicyName: js.UndefOr[typingsSlinky.awsSdk.elbMod.PolicyName] = js.native
}

object AppCookieStickinessPolicy {
  @scala.inline
  def apply(): AppCookieStickinessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppCookieStickinessPolicy]
  }
  @scala.inline
  implicit class AppCookieStickinessPolicyOps[Self <: AppCookieStickinessPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookieName(value: CookieName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CookieName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CookieName")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyName(value: PolicyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyName")(js.undefined)
        ret
    }
  }
  
}

