package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Network.GetCertificateRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Network.GetCertificateResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetCertificateResponse extends StObject {
  
  var paramsType: js.Array[GetCertificateRequest] = js.native
  
  var returnType: GetCertificateResponse = js.native
}
object ReturnTypeGetCertificateResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetCertificateRequest], returnType: GetCertificateResponse): ReturnTypeGetCertificateResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetCertificateResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetCertificateResponseMutableBuilder[Self <: ReturnTypeGetCertificateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetCertificateRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetCertificateRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetCertificateResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
