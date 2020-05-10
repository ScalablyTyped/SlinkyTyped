package typingsSlinky.pulumiAws.elbSslNegotiationPolicyMod

import typingsSlinky.pulumiAws.inputMod.elb.SslNegotiationPolicyAttribute
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslNegotiationPolicyState extends js.Object {
  /**
    * An SSL Negotiation policy attribute. Each has two properties:
    */
  val attributes: js.UndefOr[Input[js.Array[Input[SslNegotiationPolicyAttribute]]]] = js.native
  /**
    * The load balancer port to which the policy
    * should be applied. This must be an active listener on the load
    * balancer.
    */
  val lbPort: js.UndefOr[Input[Double]] = js.native
  /**
    * The load balancer to which the policy
    * should be attached.
    */
  val loadBalancer: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the attribute
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object SslNegotiationPolicyState {
  @scala.inline
  def apply(): SslNegotiationPolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslNegotiationPolicyState]
  }
  @scala.inline
  implicit class SslNegotiationPolicyStateOps[Self <: SslNegotiationPolicyState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: Input[js.Array[Input[SslNegotiationPolicyAttribute]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withLbPort(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lbPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLbPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lbPort")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadBalancer(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancer")(js.undefined)
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

