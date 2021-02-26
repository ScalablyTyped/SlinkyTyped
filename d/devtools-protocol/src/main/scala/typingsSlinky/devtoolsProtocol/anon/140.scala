package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Overlay.SetShowViewportSizeOnResizeRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `140` extends StObject {
  
  var paramsType: js.Array[SetShowViewportSizeOnResizeRequest] = js.native
  
  var returnType: Unit = js.native
}
object `140` {
  
  @scala.inline
  def apply(paramsType: js.Array[SetShowViewportSizeOnResizeRequest], returnType: Unit): `140` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`140`]
  }
  
  @scala.inline
  implicit class `140MutableBuilder`[Self <: `140`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetShowViewportSizeOnResizeRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetShowViewportSizeOnResizeRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
