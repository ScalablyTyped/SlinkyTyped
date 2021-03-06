package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceGroupManagersUpdatePerInstanceConfigsReq extends StObject {
  
  /** The list of per-instance configs to insert or patch on this managed instance group. */
  var perInstanceConfigs: js.UndefOr[js.Array[PerInstanceConfig]] = js.native
}
object InstanceGroupManagersUpdatePerInstanceConfigsReq {
  
  @scala.inline
  def apply(): InstanceGroupManagersUpdatePerInstanceConfigsReq = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManagersUpdatePerInstanceConfigsReq]
  }
  
  @scala.inline
  implicit class InstanceGroupManagersUpdatePerInstanceConfigsReqMutableBuilder[Self <: InstanceGroupManagersUpdatePerInstanceConfigsReq] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPerInstanceConfigs(value: js.Array[PerInstanceConfig]): Self = StObject.set(x, "perInstanceConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerInstanceConfigsUndefined: Self = StObject.set(x, "perInstanceConfigs", js.undefined)
    
    @scala.inline
    def setPerInstanceConfigsVarargs(value: PerInstanceConfig*): Self = StObject.set(x, "perInstanceConfigs", js.Array(value :_*))
  }
}
