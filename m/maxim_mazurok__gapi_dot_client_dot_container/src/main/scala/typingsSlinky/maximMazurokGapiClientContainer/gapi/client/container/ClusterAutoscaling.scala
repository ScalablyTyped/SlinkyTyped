package typingsSlinky.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterAutoscaling extends StObject {
  
  /** The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool's nodes can be created by NAP. */
  var autoprovisioningLocations: js.UndefOr[js.Array[String]] = js.native
  
  /** AutoprovisioningNodePoolDefaults contains defaults for a node pool created by NAP. */
  var autoprovisioningNodePoolDefaults: js.UndefOr[AutoprovisioningNodePoolDefaults] = js.native
  
  /** Enables automatic node pool creation and deletion. */
  var enableNodeAutoprovisioning: js.UndefOr[Boolean] = js.native
  
  /** Contains global constraints regarding minimum and maximum amount of resources in the cluster. */
  var resourceLimits: js.UndefOr[js.Array[ResourceLimit]] = js.native
}
object ClusterAutoscaling {
  
  @scala.inline
  def apply(): ClusterAutoscaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterAutoscaling]
  }
  
  @scala.inline
  implicit class ClusterAutoscalingMutableBuilder[Self <: ClusterAutoscaling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoprovisioningLocations(value: js.Array[String]): Self = StObject.set(x, "autoprovisioningLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoprovisioningLocationsUndefined: Self = StObject.set(x, "autoprovisioningLocations", js.undefined)
    
    @scala.inline
    def setAutoprovisioningLocationsVarargs(value: String*): Self = StObject.set(x, "autoprovisioningLocations", js.Array(value :_*))
    
    @scala.inline
    def setAutoprovisioningNodePoolDefaults(value: AutoprovisioningNodePoolDefaults): Self = StObject.set(x, "autoprovisioningNodePoolDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoprovisioningNodePoolDefaultsUndefined: Self = StObject.set(x, "autoprovisioningNodePoolDefaults", js.undefined)
    
    @scala.inline
    def setEnableNodeAutoprovisioning(value: Boolean): Self = StObject.set(x, "enableNodeAutoprovisioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableNodeAutoprovisioningUndefined: Self = StObject.set(x, "enableNodeAutoprovisioning", js.undefined)
    
    @scala.inline
    def setResourceLimits(value: js.Array[ResourceLimit]): Self = StObject.set(x, "resourceLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceLimitsUndefined: Self = StObject.set(x, "resourceLimits", js.undefined)
    
    @scala.inline
    def setResourceLimitsVarargs(value: ResourceLimit*): Self = StObject.set(x, "resourceLimits", js.Array(value :_*))
  }
}
