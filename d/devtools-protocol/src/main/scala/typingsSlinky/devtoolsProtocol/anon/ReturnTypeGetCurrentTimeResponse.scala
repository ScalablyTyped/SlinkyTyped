package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Animation.GetCurrentTimeRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Animation.GetCurrentTimeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetCurrentTimeResponse extends StObject {
  
  var paramsType: js.Array[GetCurrentTimeRequest] = js.native
  
  var returnType: GetCurrentTimeResponse = js.native
}
object ReturnTypeGetCurrentTimeResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetCurrentTimeRequest], returnType: GetCurrentTimeResponse): ReturnTypeGetCurrentTimeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetCurrentTimeResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetCurrentTimeResponseMutableBuilder[Self <: ReturnTypeGetCurrentTimeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetCurrentTimeRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetCurrentTimeRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetCurrentTimeResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
