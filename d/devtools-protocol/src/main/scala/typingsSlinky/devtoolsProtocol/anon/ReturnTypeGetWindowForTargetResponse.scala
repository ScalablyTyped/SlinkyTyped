package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Browser.GetWindowForTargetRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Browser.GetWindowForTargetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetWindowForTargetResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[GetWindowForTargetRequest]] = js.native
  
  var returnType: GetWindowForTargetResponse = js.native
}
object ReturnTypeGetWindowForTargetResponse {
  
  @scala.inline
  def apply(
    paramsType: js.Array[js.UndefOr[GetWindowForTargetRequest]],
    returnType: GetWindowForTargetResponse
  ): ReturnTypeGetWindowForTargetResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetWindowForTargetResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetWindowForTargetResponseMutableBuilder[Self <: ReturnTypeGetWindowForTargetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[GetWindowForTargetRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[GetWindowForTargetRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetWindowForTargetResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
