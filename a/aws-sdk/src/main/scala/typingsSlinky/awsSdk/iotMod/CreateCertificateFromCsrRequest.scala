package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCertificateFromCsrRequest extends StObject {
  
  /**
    * The certificate signing request (CSR).
    */
  var certificateSigningRequest: CertificateSigningRequest = js.native
  
  /**
    * Specifies whether the certificate is active.
    */
  var setAsActive: js.UndefOr[SetAsActive] = js.native
}
object CreateCertificateFromCsrRequest {
  
  @scala.inline
  def apply(certificateSigningRequest: CertificateSigningRequest): CreateCertificateFromCsrRequest = {
    val __obj = js.Dynamic.literal(certificateSigningRequest = certificateSigningRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCertificateFromCsrRequest]
  }
  
  @scala.inline
  implicit class CreateCertificateFromCsrRequestMutableBuilder[Self <: CreateCertificateFromCsrRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateSigningRequest(value: CertificateSigningRequest): Self = StObject.set(x, "certificateSigningRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAsActive(value: SetAsActive): Self = StObject.set(x, "setAsActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAsActiveUndefined: Self = StObject.set(x, "setAsActive", js.undefined)
  }
}
