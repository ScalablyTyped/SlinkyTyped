package typingsSlinky.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationManagedZoneContext extends StObject {
  
  /** The post-operation ManagedZone resource. */
  var newValue: js.UndefOr[ManagedZone] = js.native
  
  /** The pre-operation ManagedZone resource. */
  var oldValue: js.UndefOr[ManagedZone] = js.native
}
object OperationManagedZoneContext {
  
  @scala.inline
  def apply(): OperationManagedZoneContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationManagedZoneContext]
  }
  
  @scala.inline
  implicit class OperationManagedZoneContextMutableBuilder[Self <: OperationManagedZoneContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewValue(value: ManagedZone): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    @scala.inline
    def setOldValue(value: ManagedZone): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
