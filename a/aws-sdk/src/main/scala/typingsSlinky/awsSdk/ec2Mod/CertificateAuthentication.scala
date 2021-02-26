package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateAuthentication extends StObject {
  
  /**
    * The ARN of the client certificate. 
    */
  var ClientRootCertificateChain: js.UndefOr[String] = js.native
}
object CertificateAuthentication {
  
  @scala.inline
  def apply(): CertificateAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateAuthentication]
  }
  
  @scala.inline
  implicit class CertificateAuthenticationMutableBuilder[Self <: CertificateAuthentication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRootCertificateChain(value: String): Self = StObject.set(x, "ClientRootCertificateChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRootCertificateChainUndefined: Self = StObject.set(x, "ClientRootCertificateChain", js.undefined)
  }
}
