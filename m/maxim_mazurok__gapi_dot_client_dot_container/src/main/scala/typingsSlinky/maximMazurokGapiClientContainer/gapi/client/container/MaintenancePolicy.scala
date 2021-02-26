package typingsSlinky.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenancePolicy extends StObject {
  
  /**
    * A hash identifying the version of this policy, so that updates to fields of the policy won't accidentally undo intermediate changes (and so that users of the API unaware of some
    * fields won't accidentally remove other fields). Make a `get()` request to the cluster to get the current resource version and include it with requests to set the policy.
    */
  var resourceVersion: js.UndefOr[String] = js.native
  
  /** Specifies the maintenance window in which maintenance may be performed. */
  var window: js.UndefOr[MaintenanceWindow] = js.native
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
    def setResourceVersion(value: String): Self = StObject.set(x, "resourceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceVersionUndefined: Self = StObject.set(x, "resourceVersion", js.undefined)
    
    @scala.inline
    def setWindow(value: MaintenanceWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}
