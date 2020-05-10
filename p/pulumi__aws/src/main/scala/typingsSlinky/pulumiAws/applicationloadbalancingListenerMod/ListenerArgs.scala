package typingsSlinky.pulumiAws.applicationloadbalancingListenerMod

import typingsSlinky.pulumiAws.inputMod.applicationloadbalancing.ListenerDefaultAction
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerArgs extends js.Object {
  /**
    * The ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the [`aws.lb.ListenerCertificate` resource](https://www.terraform.io/docs/providers/aws/r/lb_listener_certificate.html).
    */
  val certificateArn: js.UndefOr[Input[String]] = js.native
  /**
    * An Action block. Action blocks are documented below.
    */
  val defaultActions: Input[js.Array[Input[ListenerDefaultAction]]] = js.native
  /**
    * The ARN of the load balancer.
    */
  val loadBalancerArn: Input[String] = js.native
  /**
    * The port. Specify a value from `1` to `65535` or `#{port}`. Defaults to `#{port}`.
    */
  val port: Input[Double] = js.native
  /**
    * The protocol. Valid values are `HTTP`, `HTTPS`, or `#{protocol}`. Defaults to `#{protocol}`.
    */
  val protocol: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
    */
  val sslPolicy: js.UndefOr[Input[String]] = js.native
}

object ListenerArgs {
  @scala.inline
  def apply(
    defaultActions: Input[js.Array[Input[ListenerDefaultAction]]],
    loadBalancerArn: Input[String],
    port: Input[Double]
  ): ListenerArgs = {
    val __obj = js.Dynamic.literal(defaultActions = defaultActions.asInstanceOf[js.Any], loadBalancerArn = loadBalancerArn.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerArgs]
  }
  @scala.inline
  implicit class ListenerArgsOps[Self <: ListenerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultActions(value: Input[js.Array[Input[ListenerDefaultAction]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadBalancerArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancerArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificateArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateArn")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withSslPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslPolicy")(js.undefined)
        ret
    }
  }
  
}

