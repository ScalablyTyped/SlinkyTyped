package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachLoadBalancerTlsCertificateRequest extends js.Object {
  /**
    * The name of your SSL/TLS certificate.
    */
  var certificateName: ResourceName = js.native
  /**
    * The name of the load balancer to which you want to associate the SSL/TLS certificate.
    */
  var loadBalancerName: ResourceName = js.native
}

object AttachLoadBalancerTlsCertificateRequest {
  @scala.inline
  def apply(certificateName: ResourceName, loadBalancerName: ResourceName): AttachLoadBalancerTlsCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateName = certificateName.asInstanceOf[js.Any], loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachLoadBalancerTlsCertificateRequest]
  }
  @scala.inline
  implicit class AttachLoadBalancerTlsCertificateRequestOps[Self <: AttachLoadBalancerTlsCertificateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadBalancerName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancerName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

