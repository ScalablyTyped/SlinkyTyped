package typingsSlinky.pulumiAws.sslNegotiationPolicyMod

import typingsSlinky.pulumiAws.inputMod.elasticloadbalancing.SslNegotiationPolicyAttribute
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslNegotiationPolicyArgs extends js.Object {
  /**
    * An SSL Negotiation policy attribute. Each has two properties:
    */
  val attributes: js.UndefOr[Input[js.Array[Input[SslNegotiationPolicyAttribute]]]] = js.native
  /**
    * The load balancer port to which the policy
    * should be applied. This must be an active listener on the load
    * balancer.
    */
  val lbPort: Input[Double] = js.native
  /**
    * The load balancer to which the policy
    * should be attached.
    */
  val loadBalancer: Input[String] = js.native
  /**
    * The name of the attribute
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object SslNegotiationPolicyArgs {
  @scala.inline
  def apply(lbPort: Input[Double], loadBalancer: Input[String]): SslNegotiationPolicyArgs = {
    val __obj = js.Dynamic.literal(lbPort = lbPort.asInstanceOf[js.Any], loadBalancer = loadBalancer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SslNegotiationPolicyArgs]
  }
  @scala.inline
  implicit class SslNegotiationPolicyArgsOps[Self <: SslNegotiationPolicyArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

