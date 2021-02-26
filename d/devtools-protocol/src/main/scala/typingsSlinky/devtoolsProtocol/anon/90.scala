package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Emulation.SetTimezoneOverrideRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `90` extends StObject {
  
  var paramsType: js.Array[SetTimezoneOverrideRequest] = js.native
  
  var returnType: Unit = js.native
}
object `90` {
  
  @scala.inline
  def apply(paramsType: js.Array[SetTimezoneOverrideRequest], returnType: Unit): `90` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`90`]
  }
  
  @scala.inline
  implicit class `90MutableBuilder`[Self <: `90`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetTimezoneOverrideRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetTimezoneOverrideRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
