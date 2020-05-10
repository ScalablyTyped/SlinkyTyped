package typingsSlinky.pulumiAws.getListenerMod

import typingsSlinky.pulumiAws.outputMod.alb.GetListenerDefaultAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetListenerResult extends js.Object {
  val arn: String = js.native
  val certificateArn: String = js.native
  val defaultActions: js.Array[GetListenerDefaultAction] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val loadBalancerArn: String = js.native
  val port: Double = js.native
  val protocol: String = js.native
  val sslPolicy: String = js.native
}

object GetListenerResult {
  @scala.inline
  def apply(
    arn: String,
    certificateArn: String,
    defaultActions: js.Array[GetListenerDefaultAction],
    id: String,
    loadBalancerArn: String,
    port: Double,
    protocol: String,
    sslPolicy: String
  ): GetListenerResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], certificateArn = certificateArn.asInstanceOf[js.Any], defaultActions = defaultActions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loadBalancerArn = loadBalancerArn.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], sslPolicy = sslPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetListenerResult]
  }
  @scala.inline
  implicit class GetListenerResultOps[Self <: GetListenerResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificateArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultActions(value: js.Array[GetListenerDefaultAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadBalancerArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancerArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSslPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslPolicy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

