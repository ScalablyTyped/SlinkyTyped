package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Animation.SetPlaybackRateRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `27` extends StObject {
  
  var paramsType: js.Array[SetPlaybackRateRequest] = js.native
  
  var returnType: Unit = js.native
}
object `27` {
  
  @scala.inline
  def apply(paramsType: js.Array[SetPlaybackRateRequest], returnType: Unit): `27` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`27`]
  }
  
  @scala.inline
  implicit class `27MutableBuilder`[Self <: `27`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetPlaybackRateRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetPlaybackRateRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
