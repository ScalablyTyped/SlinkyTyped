package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.BackgroundService.ClearEventsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `32` extends StObject {
  
  var paramsType: js.Array[ClearEventsRequest] = js.native
  
  var returnType: Unit = js.native
}
object `32` {
  
  @scala.inline
  def apply(paramsType: js.Array[ClearEventsRequest], returnType: Unit): `32` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`32`]
  }
  
  @scala.inline
  implicit class `32MutableBuilder`[Self <: `32`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[ClearEventsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: ClearEventsRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
