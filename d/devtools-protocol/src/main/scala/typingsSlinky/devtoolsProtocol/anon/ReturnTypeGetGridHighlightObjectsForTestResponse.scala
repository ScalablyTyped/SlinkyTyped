package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Overlay.GetGridHighlightObjectsForTestRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Overlay.GetGridHighlightObjectsForTestResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetGridHighlightObjectsForTestResponse extends StObject {
  
  var paramsType: js.Array[GetGridHighlightObjectsForTestRequest] = js.native
  
  var returnType: GetGridHighlightObjectsForTestResponse = js.native
}
object ReturnTypeGetGridHighlightObjectsForTestResponse {
  
  @scala.inline
  def apply(
    paramsType: js.Array[GetGridHighlightObjectsForTestRequest],
    returnType: GetGridHighlightObjectsForTestResponse
  ): ReturnTypeGetGridHighlightObjectsForTestResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetGridHighlightObjectsForTestResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetGridHighlightObjectsForTestResponseMutableBuilder[Self <: ReturnTypeGetGridHighlightObjectsForTestResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetGridHighlightObjectsForTestRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetGridHighlightObjectsForTestRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetGridHighlightObjectsForTestResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
