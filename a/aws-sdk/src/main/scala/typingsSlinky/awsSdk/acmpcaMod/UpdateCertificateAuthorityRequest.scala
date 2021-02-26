package typingsSlinky.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateCertificateAuthorityRequest extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the private CA that issued the certificate to be revoked. This must be of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
    */
  var CertificateAuthorityArn: Arn = js.native
  
  /**
    * Revocation information for your private CA.
    */
  var RevocationConfiguration: js.UndefOr[typingsSlinky.awsSdk.acmpcaMod.RevocationConfiguration] = js.native
  
  /**
    * Status of your private CA.
    */
  var Status: js.UndefOr[CertificateAuthorityStatus] = js.native
}
object UpdateCertificateAuthorityRequest {
  
  @scala.inline
  def apply(CertificateAuthorityArn: Arn): UpdateCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCertificateAuthorityRequest]
  }
  
  @scala.inline
  implicit class UpdateCertificateAuthorityRequestMutableBuilder[Self <: UpdateCertificateAuthorityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateAuthorityArn(value: Arn): Self = StObject.set(x, "CertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevocationConfiguration(value: RevocationConfiguration): Self = StObject.set(x, "RevocationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevocationConfigurationUndefined: Self = StObject.set(x, "RevocationConfiguration", js.undefined)
    
    @scala.inline
    def setStatus(value: CertificateAuthorityStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
