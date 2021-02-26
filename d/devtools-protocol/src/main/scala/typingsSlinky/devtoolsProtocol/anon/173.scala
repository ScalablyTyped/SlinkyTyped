package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.ServiceWorker.DispatchPeriodicSyncEventRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `173` extends StObject {
  
  var paramsType: js.Array[DispatchPeriodicSyncEventRequest] = js.native
  
  var returnType: Unit = js.native
}
object `173` {
  
  @scala.inline
  def apply(paramsType: js.Array[DispatchPeriodicSyncEventRequest], returnType: Unit): `173` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`173`]
  }
  
  @scala.inline
  implicit class `173MutableBuilder`[Self <: `173`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[DispatchPeriodicSyncEventRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: DispatchPeriodicSyncEventRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
