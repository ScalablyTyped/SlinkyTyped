package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetServerCertificateResponse extends StObject {
  
  /**
    * A structure containing details about the server certificate.
    */
  var ServerCertificate: typingsSlinky.awsSdk.iamMod.ServerCertificate = js.native
}
object GetServerCertificateResponse {
  
  @scala.inline
  def apply(ServerCertificate: ServerCertificate): GetServerCertificateResponse = {
    val __obj = js.Dynamic.literal(ServerCertificate = ServerCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServerCertificateResponse]
  }
  
  @scala.inline
  implicit class GetServerCertificateResponseMutableBuilder[Self <: GetServerCertificateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServerCertificate(value: ServerCertificate): Self = StObject.set(x, "ServerCertificate", value.asInstanceOf[js.Any])
  }
}
