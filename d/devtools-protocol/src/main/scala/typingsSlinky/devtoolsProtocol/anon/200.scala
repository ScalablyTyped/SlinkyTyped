package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Tracing.RecordClockSyncMarkerRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `200` extends StObject {
  
  var paramsType: js.Array[RecordClockSyncMarkerRequest] = js.native
  
  var returnType: Unit = js.native
}
object `200` {
  
  @scala.inline
  def apply(paramsType: js.Array[RecordClockSyncMarkerRequest], returnType: Unit): `200` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200`]
  }
  
  @scala.inline
  implicit class `200MutableBuilder`[Self <: `200`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[RecordClockSyncMarkerRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: RecordClockSyncMarkerRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
