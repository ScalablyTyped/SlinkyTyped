package typingsSlinky.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCertificateAuthorityCsrRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that was returned when you called the CreateCertificateAuthority action. This must be of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
    */
  var CertificateAuthorityArn: Arn = js.native
}
object GetCertificateAuthorityCsrRequest {
  
  @scala.inline
  def apply(CertificateAuthorityArn: Arn): GetCertificateAuthorityCsrRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCertificateAuthorityCsrRequest]
  }
  
  @scala.inline
  implicit class GetCertificateAuthorityCsrRequestMutableBuilder[Self <: GetCertificateAuthorityCsrRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateAuthorityArn(value: Arn): Self = StObject.set(x, "CertificateAuthorityArn", value.asInstanceOf[js.Any])
  }
}
