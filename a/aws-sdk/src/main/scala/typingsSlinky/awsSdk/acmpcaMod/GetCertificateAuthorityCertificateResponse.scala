package typingsSlinky.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCertificateAuthorityCertificateResponse extends StObject {
  
  /**
    * Base64-encoded certificate authority (CA) certificate.
    */
  var Certificate: js.UndefOr[CertificateBody] = js.native
  
  /**
    * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. If this is a root CA, the value will be null.
    */
  var CertificateChain: js.UndefOr[typingsSlinky.awsSdk.acmpcaMod.CertificateChain] = js.native
}
object GetCertificateAuthorityCertificateResponse {
  
  @scala.inline
  def apply(): GetCertificateAuthorityCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCertificateAuthorityCertificateResponse]
  }
  
  @scala.inline
  implicit class GetCertificateAuthorityCertificateResponseMutableBuilder[Self <: GetCertificateAuthorityCertificateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: CertificateBody): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateChain(value: CertificateChain): Self = StObject.set(x, "CertificateChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateChainUndefined: Self = StObject.set(x, "CertificateChain", js.undefined)
    
    @scala.inline
    def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
  }
}
