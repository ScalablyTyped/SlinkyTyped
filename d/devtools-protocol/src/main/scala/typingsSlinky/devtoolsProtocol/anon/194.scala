package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Target.SendMessageToTargetRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `194` extends StObject {
  
  var paramsType: js.Array[SendMessageToTargetRequest] = js.native
  
  var returnType: Unit = js.native
}
object `194` {
  
  @scala.inline
  def apply(paramsType: js.Array[SendMessageToTargetRequest], returnType: Unit): `194` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`194`]
  }
  
  @scala.inline
  implicit class `194MutableBuilder`[Self <: `194`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SendMessageToTargetRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SendMessageToTargetRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
