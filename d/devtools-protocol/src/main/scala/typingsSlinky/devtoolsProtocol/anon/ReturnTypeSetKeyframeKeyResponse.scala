package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.SetKeyframeKeyRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.SetKeyframeKeyResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeSetKeyframeKeyResponse extends StObject {
  
  var paramsType: js.Array[SetKeyframeKeyRequest] = js.native
  
  var returnType: SetKeyframeKeyResponse = js.native
}
object ReturnTypeSetKeyframeKeyResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[SetKeyframeKeyRequest], returnType: SetKeyframeKeyResponse): ReturnTypeSetKeyframeKeyResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetKeyframeKeyResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeSetKeyframeKeyResponseMutableBuilder[Self <: ReturnTypeSetKeyframeKeyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetKeyframeKeyRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetKeyframeKeyRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: SetKeyframeKeyResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
