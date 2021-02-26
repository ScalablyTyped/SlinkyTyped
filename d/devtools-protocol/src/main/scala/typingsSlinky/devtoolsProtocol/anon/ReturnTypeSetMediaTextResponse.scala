package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.SetMediaTextRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.SetMediaTextResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeSetMediaTextResponse extends StObject {
  
  var paramsType: js.Array[SetMediaTextRequest] = js.native
  
  var returnType: SetMediaTextResponse = js.native
}
object ReturnTypeSetMediaTextResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[SetMediaTextRequest], returnType: SetMediaTextResponse): ReturnTypeSetMediaTextResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetMediaTextResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeSetMediaTextResponseMutableBuilder[Self <: ReturnTypeSetMediaTextResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetMediaTextRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetMediaTextRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: SetMediaTextResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
