package typingsSlinky.pulumiAws.appCookieStickinessPolicyMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppCookieStickinessPolicyArgs extends js.Object {
  /**
    * The application cookie whose lifetime the ELB's cookie should follow.
    */
  val cookieName: Input[String] = js.native
  /**
    * The load balancer port to which the policy
    * should be applied. This must be an active listener on the load
    * balancer.
    */
  val lbPort: Input[Double] = js.native
  /**
    * The name of load balancer to which the policy
    * should be attached.
    */
  val loadBalancer: Input[String] = js.native
  /**
    * The name of the stickiness policy.
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object AppCookieStickinessPolicyArgs {
  @scala.inline
  def apply(cookieName: Input[String], lbPort: Input[Double], loadBalancer: Input[String]): AppCookieStickinessPolicyArgs = {
    val __obj = js.Dynamic.literal(cookieName = cookieName.asInstanceOf[js.Any], lbPort = lbPort.asInstanceOf[js.Any], loadBalancer = loadBalancer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppCookieStickinessPolicyArgs]
  }
  @scala.inline
  implicit class AppCookieStickinessPolicyArgsOps[Self <: AppCookieStickinessPolicyArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookieName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLbPort(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lbPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadBalancer(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

