package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.AwaitPromiseRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.AwaitPromiseResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeAwaitPromiseResponse extends StObject {
  
  var paramsType: js.Array[AwaitPromiseRequest] = js.native
  
  var returnType: AwaitPromiseResponse = js.native
}
object ReturnTypeAwaitPromiseResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[AwaitPromiseRequest], returnType: AwaitPromiseResponse): ReturnTypeAwaitPromiseResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeAwaitPromiseResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeAwaitPromiseResponseMutableBuilder[Self <: ReturnTypeAwaitPromiseResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[AwaitPromiseRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: AwaitPromiseRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: AwaitPromiseResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
