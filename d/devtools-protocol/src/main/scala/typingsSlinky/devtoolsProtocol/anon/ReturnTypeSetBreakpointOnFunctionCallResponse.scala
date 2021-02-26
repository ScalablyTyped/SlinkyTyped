package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointOnFunctionCallRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointOnFunctionCallResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeSetBreakpointOnFunctionCallResponse extends StObject {
  
  var paramsType: js.Array[SetBreakpointOnFunctionCallRequest] = js.native
  
  var returnType: SetBreakpointOnFunctionCallResponse = js.native
}
object ReturnTypeSetBreakpointOnFunctionCallResponse {
  
  @scala.inline
  def apply(
    paramsType: js.Array[SetBreakpointOnFunctionCallRequest],
    returnType: SetBreakpointOnFunctionCallResponse
  ): ReturnTypeSetBreakpointOnFunctionCallResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetBreakpointOnFunctionCallResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeSetBreakpointOnFunctionCallResponseMutableBuilder[Self <: ReturnTypeSetBreakpointOnFunctionCallResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetBreakpointOnFunctionCallRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetBreakpointOnFunctionCallRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: SetBreakpointOnFunctionCallResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
