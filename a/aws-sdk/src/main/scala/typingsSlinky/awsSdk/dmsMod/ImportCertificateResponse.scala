package typingsSlinky.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportCertificateResponse extends StObject {
  
  /**
    * The certificate to be uploaded.
    */
  var Certificate: js.UndefOr[typingsSlinky.awsSdk.dmsMod.Certificate] = js.native
}
object ImportCertificateResponse {
  
  @scala.inline
  def apply(): ImportCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportCertificateResponse]
  }
  
  @scala.inline
  implicit class ImportCertificateResponseMutableBuilder[Self <: ImportCertificateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: Certificate): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
  }
}
