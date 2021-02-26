package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.PushNodeByPathToFrontendRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.PushNodeByPathToFrontendResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypePushNodeByPathToFrontendResponse extends StObject {
  
  var paramsType: js.Array[PushNodeByPathToFrontendRequest] = js.native
  
  var returnType: PushNodeByPathToFrontendResponse = js.native
}
object ReturnTypePushNodeByPathToFrontendResponse {
  
  @scala.inline
  def apply(
    paramsType: js.Array[PushNodeByPathToFrontendRequest],
    returnType: PushNodeByPathToFrontendResponse
  ): ReturnTypePushNodeByPathToFrontendResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypePushNodeByPathToFrontendResponse]
  }
  
  @scala.inline
  implicit class ReturnTypePushNodeByPathToFrontendResponseMutableBuilder[Self <: ReturnTypePushNodeByPathToFrontendResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[PushNodeByPathToFrontendRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: PushNodeByPathToFrontendRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: PushNodeByPathToFrontendResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
