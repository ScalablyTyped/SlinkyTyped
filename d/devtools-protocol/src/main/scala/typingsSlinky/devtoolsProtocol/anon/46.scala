package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Cast.SetSinkToUseRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `46` extends StObject {
  
  var paramsType: js.Array[SetSinkToUseRequest] = js.native
  
  var returnType: Unit = js.native
}
object `46` {
  
  @scala.inline
  def apply(paramsType: js.Array[SetSinkToUseRequest], returnType: Unit): `46` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`46`]
  }
  
  @scala.inline
  implicit class `46MutableBuilder`[Self <: `46`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetSinkToUseRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetSinkToUseRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
