package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Emulation.SetVirtualTimePolicyRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Emulation.SetVirtualTimePolicyResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeSetVirtualTimePolicyResponse extends StObject {
  
  var paramsType: js.Array[SetVirtualTimePolicyRequest] = js.native
  
  var returnType: SetVirtualTimePolicyResponse = js.native
}
object ReturnTypeSetVirtualTimePolicyResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[SetVirtualTimePolicyRequest], returnType: SetVirtualTimePolicyResponse): ReturnTypeSetVirtualTimePolicyResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetVirtualTimePolicyResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeSetVirtualTimePolicyResponseMutableBuilder[Self <: ReturnTypeSetVirtualTimePolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetVirtualTimePolicyRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetVirtualTimePolicyRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: SetVirtualTimePolicyResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
