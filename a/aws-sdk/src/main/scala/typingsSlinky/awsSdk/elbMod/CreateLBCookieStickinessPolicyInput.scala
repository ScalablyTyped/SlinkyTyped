package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLBCookieStickinessPolicyInput extends js.Object {
  /**
    * The time period, in seconds, after which the cookie should be considered stale. If you do not specify this parameter, the default value is 0, which indicates that the sticky session should last for the duration of the browser session.
    */
  var CookieExpirationPeriod: js.UndefOr[typingsSlinky.awsSdk.elbMod.CookieExpirationPeriod] = js.native
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
  /**
    * The name of the policy being created. Policy names must consist of alphanumeric characters and dashes (-). This name must be unique within the set of policies for this load balancer.
    */
  var PolicyName: typingsSlinky.awsSdk.elbMod.PolicyName = js.native
}

object CreateLBCookieStickinessPolicyInput {
  @scala.inline
  def apply(LoadBalancerName: AccessPointName, PolicyName: PolicyName): CreateLBCookieStickinessPolicyInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLBCookieStickinessPolicyInput]
  }
  @scala.inline
  implicit class CreateLBCookieStickinessPolicyInputOps[Self <: CreateLBCookieStickinessPolicyInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadBalancerName(value: AccessPointName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicyName(value: PolicyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyName")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

