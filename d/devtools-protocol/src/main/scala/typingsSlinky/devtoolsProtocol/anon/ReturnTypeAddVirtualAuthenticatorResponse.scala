package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.WebAuthn.AddVirtualAuthenticatorRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.WebAuthn.AddVirtualAuthenticatorResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeAddVirtualAuthenticatorResponse extends StObject {
  
  var paramsType: js.Array[AddVirtualAuthenticatorRequest] = js.native
  
  var returnType: AddVirtualAuthenticatorResponse = js.native
}
object ReturnTypeAddVirtualAuthenticatorResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[AddVirtualAuthenticatorRequest], returnType: AddVirtualAuthenticatorResponse): ReturnTypeAddVirtualAuthenticatorResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeAddVirtualAuthenticatorResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeAddVirtualAuthenticatorResponseMutableBuilder[Self <: ReturnTypeAddVirtualAuthenticatorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[AddVirtualAuthenticatorRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: AddVirtualAuthenticatorRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: AddVirtualAuthenticatorResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
