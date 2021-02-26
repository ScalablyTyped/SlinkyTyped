package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Animation.SetTimingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `28` extends StObject {
  
  var paramsType: js.Array[SetTimingRequest] = js.native
  
  var returnType: Unit = js.native
}
object `28` {
  
  @scala.inline
  def apply(paramsType: js.Array[SetTimingRequest], returnType: Unit): `28` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`28`]
  }
  
  @scala.inline
  implicit class `28MutableBuilder`[Self <: `28`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetTimingRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetTimingRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
