package typingsSlinky.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitializeClusterRequest extends StObject {
  
  /**
    * The identifier (ID) of the cluster that you are claiming. To find the cluster ID, use DescribeClusters.
    */
  var ClusterId: typingsSlinky.awsSdk.cloudhsmv2Mod.ClusterId = js.native
  
  /**
    * The cluster certificate issued (signed) by your issuing certificate authority (CA). The certificate must be in PEM format and can contain a maximum of 5000 characters.
    */
  var SignedCert: Cert = js.native
  
  /**
    * The issuing certificate of the issuing certificate authority (CA) that issued (signed) the cluster certificate. You must use a self-signed certificate. The certificate used to sign the HSM CSR must be directly available, and thus must be the root certificate. The certificate must be in PEM format and can contain a maximum of 5000 characters.
    */
  var TrustAnchor: Cert = js.native
}
object InitializeClusterRequest {
  
  @scala.inline
  def apply(ClusterId: ClusterId, SignedCert: Cert, TrustAnchor: Cert): InitializeClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any], SignedCert = SignedCert.asInstanceOf[js.Any], TrustAnchor = TrustAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializeClusterRequest]
  }
  
  @scala.inline
  implicit class InitializeClusterRequestMutableBuilder[Self <: InitializeClusterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedCert(value: Cert): Self = StObject.set(x, "SignedCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustAnchor(value: Cert): Self = StObject.set(x, "TrustAnchor", value.asInstanceOf[js.Any])
  }
}
