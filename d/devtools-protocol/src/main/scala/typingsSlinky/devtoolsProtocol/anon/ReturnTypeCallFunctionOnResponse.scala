package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.CallFunctionOnRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.CallFunctionOnResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeCallFunctionOnResponse extends StObject {
  
  var paramsType: js.Array[CallFunctionOnRequest] = js.native
  
  var returnType: CallFunctionOnResponse = js.native
}
object ReturnTypeCallFunctionOnResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[CallFunctionOnRequest], returnType: CallFunctionOnResponse): ReturnTypeCallFunctionOnResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCallFunctionOnResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeCallFunctionOnResponseMutableBuilder[Self <: ReturnTypeCallFunctionOnResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[CallFunctionOnRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: CallFunctionOnRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: CallFunctionOnResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
