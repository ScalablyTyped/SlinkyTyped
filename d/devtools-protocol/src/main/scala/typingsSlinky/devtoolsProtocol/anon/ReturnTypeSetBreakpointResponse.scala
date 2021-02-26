package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeSetBreakpointResponse extends StObject {
  
  var paramsType: js.Array[SetBreakpointRequest] = js.native
  
  var returnType: SetBreakpointResponse = js.native
}
object ReturnTypeSetBreakpointResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[SetBreakpointRequest], returnType: SetBreakpointResponse): ReturnTypeSetBreakpointResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetBreakpointResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeSetBreakpointResponseMutableBuilder[Self <: ReturnTypeSetBreakpointResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetBreakpointRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetBreakpointRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: SetBreakpointResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
