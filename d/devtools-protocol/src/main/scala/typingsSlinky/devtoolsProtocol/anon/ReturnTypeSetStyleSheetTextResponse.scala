package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.SetStyleSheetTextRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.SetStyleSheetTextResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeSetStyleSheetTextResponse extends StObject {
  
  var paramsType: js.Array[SetStyleSheetTextRequest] = js.native
  
  var returnType: SetStyleSheetTextResponse = js.native
}
object ReturnTypeSetStyleSheetTextResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[SetStyleSheetTextRequest], returnType: SetStyleSheetTextResponse): ReturnTypeSetStyleSheetTextResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetStyleSheetTextResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeSetStyleSheetTextResponseMutableBuilder[Self <: ReturnTypeSetStyleSheetTextResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetStyleSheetTextRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetStyleSheetTextRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: SetStyleSheetTextResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
