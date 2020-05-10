package typingsSlinky.pulumiAws.outputMod.elasticloadbalancing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerListener extends js.Object {
  /**
    * The port on the instance to route to
    */
  var instancePort: Double = js.native
  /**
    * The protocol to use to the instance. Valid
    * values are `HTTP`, `HTTPS`, `TCP`, or `SSL`
    */
  var instanceProtocol: String = js.native
  /**
    * The port to listen on for the load balancer
    */
  var lbPort: Double = js.native
  /**
    * The protocol to listen on. Valid values are `HTTP`,
    * `HTTPS`, `TCP`, or `SSL`
    */
  var lbProtocol: String = js.native
  /**
    * The ARN of an SSL certificate you have
    * uploaded to AWS IAM. **Note ECDSA-specific restrictions below.  Only valid when `lbProtocol` is either HTTPS or SSL**
    */
  var sslCertificateId: js.UndefOr[String] = js.native
}

object LoadBalancerListener {
  @scala.inline
  def apply(instancePort: Double, instanceProtocol: String, lbPort: Double, lbProtocol: String): LoadBalancerListener = {
    val __obj = js.Dynamic.literal(instancePort = instancePort.asInstanceOf[js.Any], instanceProtocol = instanceProtocol.asInstanceOf[js.Any], lbPort = lbPort.asInstanceOf[js.Any], lbProtocol = lbProtocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerListener]
  }
  @scala.inline
  implicit class LoadBalancerListenerOps[Self <: LoadBalancerListener] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutSslCertificateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCertificateId")(js.undefined)
        ret
    }
  }
  
}

