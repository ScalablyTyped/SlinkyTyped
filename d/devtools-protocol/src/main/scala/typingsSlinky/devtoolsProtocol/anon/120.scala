package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Network.SetDataSizeLimitsForTestRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `120` extends StObject {
  
  var paramsType: js.Array[SetDataSizeLimitsForTestRequest] = js.native
  
  var returnType: Unit = js.native
}
object `120` {
  
  @scala.inline
  def apply(paramsType: js.Array[SetDataSizeLimitsForTestRequest], returnType: Unit): `120` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`120`]
  }
  
  @scala.inline
  implicit class `120MutableBuilder`[Self <: `120`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetDataSizeLimitsForTestRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetDataSizeLimitsForTestRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
