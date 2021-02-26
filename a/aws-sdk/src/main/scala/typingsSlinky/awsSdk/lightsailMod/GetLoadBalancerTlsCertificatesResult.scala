package typingsSlinky.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLoadBalancerTlsCertificatesResult extends StObject {
  
  /**
    * An array of LoadBalancerTlsCertificate objects describing your SSL/TLS certificates.
    */
  var tlsCertificates: js.UndefOr[LoadBalancerTlsCertificateList] = js.native
}
object GetLoadBalancerTlsCertificatesResult {
  
  @scala.inline
  def apply(): GetLoadBalancerTlsCertificatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLoadBalancerTlsCertificatesResult]
  }
  
  @scala.inline
  implicit class GetLoadBalancerTlsCertificatesResultMutableBuilder[Self <: GetLoadBalancerTlsCertificatesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTlsCertificates(value: LoadBalancerTlsCertificateList): Self = StObject.set(x, "tlsCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsCertificatesUndefined: Self = StObject.set(x, "tlsCertificates", js.undefined)
    
    @scala.inline
    def setTlsCertificatesVarargs(value: LoadBalancerTlsCertificate*): Self = StObject.set(x, "tlsCertificates", js.Array(value :_*))
  }
}
