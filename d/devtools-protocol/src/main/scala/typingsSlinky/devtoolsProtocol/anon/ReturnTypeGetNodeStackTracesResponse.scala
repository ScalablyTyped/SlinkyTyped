package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetNodeStackTracesRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetNodeStackTracesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetNodeStackTracesResponse extends StObject {
  
  var paramsType: js.Array[GetNodeStackTracesRequest] = js.native
  
  var returnType: GetNodeStackTracesResponse = js.native
}
object ReturnTypeGetNodeStackTracesResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetNodeStackTracesRequest], returnType: GetNodeStackTracesResponse): ReturnTypeGetNodeStackTracesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetNodeStackTracesResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetNodeStackTracesResponseMutableBuilder[Self <: ReturnTypeGetNodeStackTracesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetNodeStackTracesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetNodeStackTracesRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetNodeStackTracesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
