package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.NavigateRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.NavigateResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeNavigateResponse extends StObject {
  
  var paramsType: js.Array[NavigateRequest] = js.native
  
  var returnType: NavigateResponse = js.native
}
object ReturnTypeNavigateResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[NavigateRequest], returnType: NavigateResponse): ReturnTypeNavigateResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeNavigateResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeNavigateResponseMutableBuilder[Self <: ReturnTypeNavigateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[NavigateRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: NavigateRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: NavigateResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
