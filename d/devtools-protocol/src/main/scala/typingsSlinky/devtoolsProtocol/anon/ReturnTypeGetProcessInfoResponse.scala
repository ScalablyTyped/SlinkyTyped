package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.SystemInfo.GetProcessInfoResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetProcessInfoResponse extends StObject {
  
  var paramsType: js.Array[js.Any] = js.native
  
  var returnType: GetProcessInfoResponse = js.native
}
object ReturnTypeGetProcessInfoResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.Any], returnType: GetProcessInfoResponse): ReturnTypeGetProcessInfoResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetProcessInfoResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetProcessInfoResponseMutableBuilder[Self <: ReturnTypeGetProcessInfoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.Any*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetProcessInfoResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
