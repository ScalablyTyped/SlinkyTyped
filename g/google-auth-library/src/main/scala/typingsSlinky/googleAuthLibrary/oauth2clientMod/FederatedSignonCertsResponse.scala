package typingsSlinky.googleAuthLibrary.oauth2clientMod

import typingsSlinky.gaxios.commonMod.GaxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FederatedSignonCertsResponse extends StObject {
  
  var certs: Certificates = js.native
  
  var format: CertificateFormat = js.native
  
  var res: js.UndefOr[GaxiosResponse[Unit] | Null] = js.native
}
object FederatedSignonCertsResponse {
  
  @scala.inline
  def apply(certs: Certificates, format: CertificateFormat): FederatedSignonCertsResponse = {
    val __obj = js.Dynamic.literal(certs = certs.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[FederatedSignonCertsResponse]
  }
  
  @scala.inline
  implicit class FederatedSignonCertsResponseMutableBuilder[Self <: FederatedSignonCertsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCerts(value: Certificates): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: CertificateFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRes(value: GaxiosResponse[Unit]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResNull: Self = StObject.set(x, "res", null)
    
    @scala.inline
    def setResUndefined: Self = StObject.set(x, "res", js.undefined)
  }
}
