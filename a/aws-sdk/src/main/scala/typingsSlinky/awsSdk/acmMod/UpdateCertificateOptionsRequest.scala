package typingsSlinky.awsSdk.acmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateCertificateOptionsRequest extends StObject {
  
  /**
    * ARN of the requested certificate to update. This must be of the form:  arn:aws:acm:us-east-1:account:certificate/12345678-1234-1234-1234-123456789012  
    */
  var CertificateArn: Arn = js.native
  
  /**
    * Use to update the options for your certificate. Currently, you can specify whether to add your certificate to a transparency log. Certificate transparency makes it possible to detect SSL/TLS certificates that have been mistakenly or maliciously issued. Certificates that have not been logged typically produce an error message in a browser. 
    */
  var Options: CertificateOptions = js.native
}
object UpdateCertificateOptionsRequest {
  
  @scala.inline
  def apply(CertificateArn: Arn, Options: CertificateOptions): UpdateCertificateOptionsRequest = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCertificateOptionsRequest]
  }
  
  @scala.inline
  implicit class UpdateCertificateOptionsRequestMutableBuilder[Self <: UpdateCertificateOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: Arn): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: CertificateOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
  }
}
