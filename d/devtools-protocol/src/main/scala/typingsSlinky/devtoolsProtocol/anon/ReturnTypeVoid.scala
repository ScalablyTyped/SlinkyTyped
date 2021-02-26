package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.PauseOnAsyncCallRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeVoid extends StObject {
  
  var paramsType: js.Array[PauseOnAsyncCallRequest] = js.native
  
  var returnType: Unit = js.native
}
object ReturnTypeVoid {
  
  @scala.inline
  def apply(paramsType: js.Array[PauseOnAsyncCallRequest], returnType: Unit): ReturnTypeVoid = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeVoid]
  }
  
  @scala.inline
  implicit class ReturnTypeVoidMutableBuilder[Self <: ReturnTypeVoid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[PauseOnAsyncCallRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: PauseOnAsyncCallRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
