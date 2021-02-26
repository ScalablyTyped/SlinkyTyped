package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.CopyToRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.CopyToResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeCopyToResponse extends StObject {
  
  var paramsType: js.Array[CopyToRequest] = js.native
  
  var returnType: CopyToResponse = js.native
}
object ReturnTypeCopyToResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[CopyToRequest], returnType: CopyToResponse): ReturnTypeCopyToResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCopyToResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeCopyToResponseMutableBuilder[Self <: ReturnTypeCopyToResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[CopyToRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: CopyToRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: CopyToResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
