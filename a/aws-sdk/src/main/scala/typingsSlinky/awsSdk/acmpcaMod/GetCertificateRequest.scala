package typingsSlinky.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCertificateRequest extends StObject {
  
  /**
    * The ARN of the issued certificate. The ARN contains the certificate serial number and must be in the following form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012/certificate/286535153982981100925020015808220737245  
    */
  var CertificateArn: Arn = js.native
  
  /**
    * The Amazon Resource Name (ARN) that was returned when you called CreateCertificateAuthority. This must be of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
    */
  var CertificateAuthorityArn: Arn = js.native
}
object GetCertificateRequest {
  
  @scala.inline
  def apply(CertificateArn: Arn, CertificateAuthorityArn: Arn): GetCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn.asInstanceOf[js.Any], CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCertificateRequest]
  }
  
  @scala.inline
  implicit class GetCertificateRequestMutableBuilder[Self <: GetCertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: Arn): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateAuthorityArn(value: Arn): Self = StObject.set(x, "CertificateAuthorityArn", value.asInstanceOf[js.Any])
  }
}
