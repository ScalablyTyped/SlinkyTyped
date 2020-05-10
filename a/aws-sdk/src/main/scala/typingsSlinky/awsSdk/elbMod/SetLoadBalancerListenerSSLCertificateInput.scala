package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetLoadBalancerListenerSSLCertificateInput extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
  /**
    * The port that uses the specified SSL certificate.
    */
  var LoadBalancerPort: AccessPointPort = js.native
  /**
    * The Amazon Resource Name (ARN) of the SSL certificate.
    */
  var SSLCertificateId: typingsSlinky.awsSdk.elbMod.SSLCertificateId = js.native
}

object SetLoadBalancerListenerSSLCertificateInput {
  @scala.inline
  def apply(
    LoadBalancerName: AccessPointName,
    LoadBalancerPort: AccessPointPort,
    SSLCertificateId: SSLCertificateId
  ): SetLoadBalancerListenerSSLCertificateInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], LoadBalancerPort = LoadBalancerPort.asInstanceOf[js.Any], SSLCertificateId = SSLCertificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetLoadBalancerListenerSSLCertificateInput]
  }
  @scala.inline
  implicit class SetLoadBalancerListenerSSLCertificateInputOps[Self <: SetLoadBalancerListenerSSLCertificateInput] (val x: Self) extends AnyVal {
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
    def withLoadBalancerPort(value: AccessPointPort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSSLCertificateId(value: SSLCertificateId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSLCertificateId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

