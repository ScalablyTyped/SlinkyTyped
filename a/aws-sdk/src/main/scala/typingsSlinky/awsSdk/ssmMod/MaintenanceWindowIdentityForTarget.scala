package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindowIdentityForTarget extends StObject {
  
  /**
    * The name of the maintenance window.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.native
  
  /**
    * The ID of the maintenance window.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.native
}
object MaintenanceWindowIdentityForTarget {
  
  @scala.inline
  def apply(): MaintenanceWindowIdentityForTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowIdentityForTarget]
  }
  
  @scala.inline
  implicit class MaintenanceWindowIdentityForTargetMutableBuilder[Self <: MaintenanceWindowIdentityForTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: MaintenanceWindowName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowIdUndefined: Self = StObject.set(x, "WindowId", js.undefined)
  }
}
