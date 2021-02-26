package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PendingMaintenanceAction extends StObject {
  
  /**
    * The type of pending maintenance action that is available for the resource. Valid actions are system-update, db-upgrade, hardware-maintenance, and ca-certificate-rotation.
    */
  var Action: js.UndefOr[String] = js.native
  
  /**
    * The date of the maintenance window when the action is applied. The maintenance action is applied to the resource during its first maintenance window after this date.
    */
  var AutoAppliedAfterDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The effective date when the pending maintenance action is applied to the resource. This date takes into account opt-in requests received from the ApplyPendingMaintenanceAction API, the AutoAppliedAfterDate, and the ForcedApplyDate. This value is blank if an opt-in request has not been received and nothing has been specified as AutoAppliedAfterDate or ForcedApplyDate.
    */
  var CurrentApplyDate: js.UndefOr[js.Date] = js.native
  
  /**
    * A description providing more detail about the maintenance action.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The date when the maintenance action is automatically applied. On this date, the maintenance action is applied to the resource as soon as possible, regardless of the maintenance window for the resource. There might be a delay of one or more days from this date before the maintenance action is applied.
    */
  var ForcedApplyDate: js.UndefOr[js.Date] = js.native
  
  /**
    * Indicates the type of opt-in request that has been received for the resource.
    */
  var OptInStatus: js.UndefOr[String] = js.native
}
object PendingMaintenanceAction {
  
  @scala.inline
  def apply(): PendingMaintenanceAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingMaintenanceAction]
  }
  
  @scala.inline
  implicit class PendingMaintenanceActionMutableBuilder[Self <: PendingMaintenanceAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    @scala.inline
    def setAutoAppliedAfterDate(value: js.Date): Self = StObject.set(x, "AutoAppliedAfterDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAppliedAfterDateUndefined: Self = StObject.set(x, "AutoAppliedAfterDate", js.undefined)
    
    @scala.inline
    def setCurrentApplyDate(value: js.Date): Self = StObject.set(x, "CurrentApplyDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentApplyDateUndefined: Self = StObject.set(x, "CurrentApplyDate", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setForcedApplyDate(value: js.Date): Self = StObject.set(x, "ForcedApplyDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForcedApplyDateUndefined: Self = StObject.set(x, "ForcedApplyDate", js.undefined)
    
    @scala.inline
    def setOptInStatus(value: String): Self = StObject.set(x, "OptInStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptInStatusUndefined: Self = StObject.set(x, "OptInStatus", js.undefined)
  }
}
