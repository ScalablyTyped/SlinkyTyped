package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.AddBindingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `22` extends StObject {
  
  var paramsType: js.Array[AddBindingRequest] = js.native
  
  var returnType: Unit = js.native
}
object `22` {
  
  @scala.inline
  def apply(paramsType: js.Array[AddBindingRequest], returnType: Unit): `22` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`22`]
  }
  
  @scala.inline
  implicit class `22MutableBuilder`[Self <: `22`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[AddBindingRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: AddBindingRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
