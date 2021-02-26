package typingsSlinky.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenancePolicy extends StObject {
  
  /** Output only. The time when the resource was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Optional. Description of what this policy is for. Create/Update methods return INVALID_ARGUMENT if the length is greater than 512. */
  var description: js.UndefOr[String] = js.native
  
  /** Optional. Resource labels to represent user provided metadata. Each label is a key-value pair, where both the key and the value are arbitrary strings provided by the user. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientManagedidentities.maximMazurokGapiClientManagedidentitiesStrings.MaintenancePolicy with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Required. MaintenancePolicy name using the form: `projects/{project_id}/locations/{location_id}/maintenancePolicies/{maintenance_policy_id}` where {project_id} refers to a GCP
    * consumer project ID, {location_id} refers to a GCP region/zone, {maintenance_policy_id} must be 1-63 characters long and match the regular expression
    * `[a-z0-9]([-a-z0-9]*[a-z0-9])?`.
    */
  var name: js.UndefOr[String] = js.native
  
  /** Optional. The state of the policy. */
  var state: js.UndefOr[String] = js.native
  
  /** Maintenance policy applicable to instance update. */
  var updatePolicy: js.UndefOr[UpdatePolicy] = js.native
  
  /** Output only. The time when the resource was updated. */
  var updateTime: js.UndefOr[String] = js.native
}
object MaintenancePolicy {
  
  @scala.inline
  def apply(): MaintenancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenancePolicy]
  }
  
  @scala.inline
  implicit class MaintenancePolicyMutableBuilder[Self <: MaintenancePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientManagedidentities.maximMazurokGapiClientManagedidentitiesStrings.MaintenancePolicy with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setUpdatePolicy(value: UpdatePolicy): Self = StObject.set(x, "updatePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatePolicyUndefined: Self = StObject.set(x, "updatePolicy", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
