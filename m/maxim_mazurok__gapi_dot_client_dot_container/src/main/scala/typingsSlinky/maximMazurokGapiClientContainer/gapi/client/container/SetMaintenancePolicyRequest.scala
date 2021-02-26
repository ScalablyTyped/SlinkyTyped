package typingsSlinky.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetMaintenancePolicyRequest extends StObject {
  
  /** Required. The name of the cluster to update. */
  var clusterId: js.UndefOr[String] = js.native
  
  /** Required. The maintenance policy to be set for the cluster. An empty field clears the existing maintenance policy. */
  var maintenancePolicy: js.UndefOr[MaintenancePolicy] = js.native
  
  /** The name (project, location, cluster id) of the cluster to set maintenance policy. Specified in the format `projects/∗/locations/∗/clusters/ *`. */
  var name: js.UndefOr[String] = js.native
  
  /** Required. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). */
  var projectId: js.UndefOr[String] = js.native
  
  /** Required. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. */
  var zone: js.UndefOr[String] = js.native
}
object SetMaintenancePolicyRequest {
  
  @scala.inline
  def apply(): SetMaintenancePolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetMaintenancePolicyRequest]
  }
  
  @scala.inline
  implicit class SetMaintenancePolicyRequestMutableBuilder[Self <: SetMaintenancePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    @scala.inline
    def setMaintenancePolicy(value: MaintenancePolicy): Self = StObject.set(x, "maintenancePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintenancePolicyUndefined: Self = StObject.set(x, "maintenancePolicy", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
