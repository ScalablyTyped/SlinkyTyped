package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Policies extends js.Object {
  /**
    * The stickiness policies created using CreateAppCookieStickinessPolicy.
    */
  var AppCookieStickinessPolicies: js.UndefOr[typingsSlinky.awsSdk.elbMod.AppCookieStickinessPolicies] = js.native
  /**
    * The stickiness policies created using CreateLBCookieStickinessPolicy.
    */
  var LBCookieStickinessPolicies: js.UndefOr[typingsSlinky.awsSdk.elbMod.LBCookieStickinessPolicies] = js.native
  /**
    * The policies other than the stickiness policies.
    */
  var OtherPolicies: js.UndefOr[PolicyNames] = js.native
}

object Policies {
  @scala.inline
  def apply(): Policies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Policies]
  }
  @scala.inline
  implicit class PoliciesOps[Self <: Policies] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppCookieStickinessPolicies(value: AppCookieStickinessPolicies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppCookieStickinessPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppCookieStickinessPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppCookieStickinessPolicies")(js.undefined)
        ret
    }
    @scala.inline
    def withLBCookieStickinessPolicies(value: LBCookieStickinessPolicies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LBCookieStickinessPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLBCookieStickinessPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LBCookieStickinessPolicies")(js.undefined)
        ret
    }
    @scala.inline
    def withOtherPolicies(value: PolicyNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OtherPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtherPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OtherPolicies")(js.undefined)
        ret
    }
  }
  
}

