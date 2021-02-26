package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.SetStyleTextsRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.SetStyleTextsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeSetStyleTextsResponse extends StObject {
  
  var paramsType: js.Array[SetStyleTextsRequest] = js.native
  
  var returnType: SetStyleTextsResponse = js.native
}
object ReturnTypeSetStyleTextsResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[SetStyleTextsRequest], returnType: SetStyleTextsResponse): ReturnTypeSetStyleTextsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetStyleTextsResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeSetStyleTextsResponseMutableBuilder[Self <: ReturnTypeSetStyleTextsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetStyleTextsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetStyleTextsRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: SetStyleTextsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
