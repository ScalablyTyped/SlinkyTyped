package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoadBalancerTlsCertificatesRequest extends js.Object {
  /**
    * The name of the load balancer you associated with your SSL/TLS certificate.
    */
  var loadBalancerName: ResourceName = js.native
}

object GetLoadBalancerTlsCertificatesRequest {
  @scala.inline
  def apply(loadBalancerName: ResourceName): GetLoadBalancerTlsCertificatesRequest = {
    val __obj = js.Dynamic.literal(loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoadBalancerTlsCertificatesRequest]
  }
  @scala.inline
  implicit class GetLoadBalancerTlsCertificatesRequestOps[Self <: GetLoadBalancerTlsCertificatesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadBalancerName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancerName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

