package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Target.ActivateTargetRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `190` extends StObject {
  
  var paramsType: js.Array[ActivateTargetRequest] = js.native
  
  var returnType: Unit = js.native
}
object `190` {
  
  @scala.inline
  def apply(paramsType: js.Array[ActivateTargetRequest], returnType: Unit): `190` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`190`]
  }
  
  @scala.inline
  implicit class `190MutableBuilder`[Self <: `190`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[ActivateTargetRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: ActivateTargetRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
