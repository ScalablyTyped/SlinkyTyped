package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Target.AttachToTargetRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Target.AttachToTargetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeAttachToTargetResponse extends StObject {
  
  var paramsType: js.Array[AttachToTargetRequest] = js.native
  
  var returnType: AttachToTargetResponse = js.native
}
object ReturnTypeAttachToTargetResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[AttachToTargetRequest], returnType: AttachToTargetResponse): ReturnTypeAttachToTargetResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeAttachToTargetResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeAttachToTargetResponseMutableBuilder[Self <: ReturnTypeAttachToTargetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[AttachToTargetRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: AttachToTargetRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: AttachToTargetResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
