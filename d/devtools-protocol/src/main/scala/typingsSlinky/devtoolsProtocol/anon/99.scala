package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Input.DispatchMouseEventRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `99` extends StObject {
  
  var paramsType: js.Array[DispatchMouseEventRequest] = js.native
  
  var returnType: Unit = js.native
}
object `99` {
  
  @scala.inline
  def apply(paramsType: js.Array[DispatchMouseEventRequest], returnType: Unit): `99` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`99`]
  }
  
  @scala.inline
  implicit class `99MutableBuilder`[Self <: `99`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[DispatchMouseEventRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: DispatchMouseEventRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
