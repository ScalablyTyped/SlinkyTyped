package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetServerCertificateRequest extends StObject {
  
  /**
    * The name of the server certificate you want to retrieve information about. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var ServerCertificateName: serverCertificateNameType = js.native
}
object GetServerCertificateRequest {
  
  @scala.inline
  def apply(ServerCertificateName: serverCertificateNameType): GetServerCertificateRequest = {
    val __obj = js.Dynamic.literal(ServerCertificateName = ServerCertificateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServerCertificateRequest]
  }
  
  @scala.inline
  implicit class GetServerCertificateRequestMutableBuilder[Self <: GetServerCertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServerCertificateName(value: serverCertificateNameType): Self = StObject.set(x, "ServerCertificateName", value.asInstanceOf[js.Any])
  }
}
