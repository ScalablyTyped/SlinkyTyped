package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SetScriptSourceRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SetScriptSourceResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeSetScriptSourceResponse extends StObject {
  
  var paramsType: js.Array[SetScriptSourceRequest] = js.native
  
  var returnType: SetScriptSourceResponse = js.native
}
object ReturnTypeSetScriptSourceResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[SetScriptSourceRequest], returnType: SetScriptSourceResponse): ReturnTypeSetScriptSourceResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetScriptSourceResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeSetScriptSourceResponseMutableBuilder[Self <: ReturnTypeSetScriptSourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetScriptSourceRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetScriptSourceRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: SetScriptSourceResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
