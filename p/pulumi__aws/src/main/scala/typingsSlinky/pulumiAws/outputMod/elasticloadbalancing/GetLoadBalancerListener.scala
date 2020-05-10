package typingsSlinky.pulumiAws.outputMod.elasticloadbalancing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoadBalancerListener extends js.Object {
  var instancePort: Double = js.native
  var instanceProtocol: String = js.native
  var lbPort: Double = js.native
  var lbProtocol: String = js.native
  var sslCertificateId: String = js.native
}

object GetLoadBalancerListener {
  @scala.inline
  def apply(
    instancePort: Double,
    instanceProtocol: String,
    lbPort: Double,
    lbProtocol: String,
    sslCertificateId: String
  ): GetLoadBalancerListener = {
    val __obj = js.Dynamic.literal(instancePort = instancePort.asInstanceOf[js.Any], instanceProtocol = instanceProtocol.asInstanceOf[js.Any], lbPort = lbPort.asInstanceOf[js.Any], lbProtocol = lbProtocol.asInstanceOf[js.Any], sslCertificateId = sslCertificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoadBalancerListener]
  }
  @scala.inline
  implicit class GetLoadBalancerListenerOps[Self <: GetLoadBalancerListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstancePort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instancePort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLbPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lbPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLbProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lbProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSslCertificateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCertificateId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

