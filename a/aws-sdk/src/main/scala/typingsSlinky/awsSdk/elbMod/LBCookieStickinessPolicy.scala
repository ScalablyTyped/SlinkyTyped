package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LBCookieStickinessPolicy extends js.Object {
  /**
    * The time period, in seconds, after which the cookie should be considered stale. If this parameter is not specified, the stickiness session lasts for the duration of the browser session.
    */
  var CookieExpirationPeriod: js.UndefOr[typingsSlinky.awsSdk.elbMod.CookieExpirationPeriod] = js.native
  /**
    * The name of the policy. This name must be unique within the set of policies for this load balancer.
    */
  var PolicyName: js.UndefOr[typingsSlinky.awsSdk.elbMod.PolicyName] = js.native
}

object LBCookieStickinessPolicy {
  @scala.inline
  def apply(): LBCookieStickinessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LBCookieStickinessPolicy]
  }
  @scala.inline
  implicit class LBCookieStickinessPolicyOps[Self <: LBCookieStickinessPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookieExpirationPeriod(value: CookieExpirationPeriod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CookieExpirationPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieExpirationPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CookieExpirationPeriod")(js.undefined)
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

