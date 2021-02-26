package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.WebAuthn.GetCredentialsRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.WebAuthn.GetCredentialsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetCredentialsResponse extends StObject {
  
  var paramsType: js.Array[GetCredentialsRequest] = js.native
  
  var returnType: GetCredentialsResponse = js.native
}
object ReturnTypeGetCredentialsResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetCredentialsRequest], returnType: GetCredentialsResponse): ReturnTypeGetCredentialsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetCredentialsResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetCredentialsResponseMutableBuilder[Self <: ReturnTypeGetCredentialsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetCredentialsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetCredentialsRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetCredentialsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
