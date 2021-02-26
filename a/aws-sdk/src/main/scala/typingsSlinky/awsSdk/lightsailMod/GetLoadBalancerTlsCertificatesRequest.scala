package typingsSlinky.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLoadBalancerTlsCertificatesRequest extends StObject {
  
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
  implicit class GetLoadBalancerTlsCertificatesRequestMutableBuilder[Self <: GetLoadBalancerTlsCertificatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancerName(value: ResourceName): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
  }
}
