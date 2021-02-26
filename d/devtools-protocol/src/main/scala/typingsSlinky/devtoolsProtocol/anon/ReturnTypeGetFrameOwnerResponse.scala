package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetFrameOwnerRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetFrameOwnerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetFrameOwnerResponse extends StObject {
  
  var paramsType: js.Array[GetFrameOwnerRequest] = js.native
  
  var returnType: GetFrameOwnerResponse = js.native
}
object ReturnTypeGetFrameOwnerResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetFrameOwnerRequest], returnType: GetFrameOwnerResponse): ReturnTypeGetFrameOwnerResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetFrameOwnerResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetFrameOwnerResponseMutableBuilder[Self <: ReturnTypeGetFrameOwnerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetFrameOwnerRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetFrameOwnerRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetFrameOwnerResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
