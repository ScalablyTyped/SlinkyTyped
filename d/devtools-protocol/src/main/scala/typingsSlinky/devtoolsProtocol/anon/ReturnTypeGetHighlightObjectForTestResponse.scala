package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Overlay.GetHighlightObjectForTestRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Overlay.GetHighlightObjectForTestResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetHighlightObjectForTestResponse extends StObject {
  
  var paramsType: js.Array[GetHighlightObjectForTestRequest] = js.native
  
  var returnType: GetHighlightObjectForTestResponse = js.native
}
object ReturnTypeGetHighlightObjectForTestResponse {
  
  @scala.inline
  def apply(
    paramsType: js.Array[GetHighlightObjectForTestRequest],
    returnType: GetHighlightObjectForTestResponse
  ): ReturnTypeGetHighlightObjectForTestResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetHighlightObjectForTestResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetHighlightObjectForTestResponseMutableBuilder[Self <: ReturnTypeGetHighlightObjectForTestResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetHighlightObjectForTestRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetHighlightObjectForTestRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetHighlightObjectForTestResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
