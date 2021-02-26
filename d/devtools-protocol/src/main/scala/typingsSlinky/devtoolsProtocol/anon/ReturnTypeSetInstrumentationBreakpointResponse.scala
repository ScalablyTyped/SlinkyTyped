package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SetInstrumentationBreakpointRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SetInstrumentationBreakpointResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeSetInstrumentationBreakpointResponse extends StObject {
  
  var paramsType: js.Array[SetInstrumentationBreakpointRequest] = js.native
  
  var returnType: SetInstrumentationBreakpointResponse = js.native
}
object ReturnTypeSetInstrumentationBreakpointResponse {
  
  @scala.inline
  def apply(
    paramsType: js.Array[SetInstrumentationBreakpointRequest],
    returnType: SetInstrumentationBreakpointResponse
  ): ReturnTypeSetInstrumentationBreakpointResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetInstrumentationBreakpointResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeSetInstrumentationBreakpointResponseMutableBuilder[Self <: ReturnTypeSetInstrumentationBreakpointResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetInstrumentationBreakpointRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetInstrumentationBreakpointRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: SetInstrumentationBreakpointResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
