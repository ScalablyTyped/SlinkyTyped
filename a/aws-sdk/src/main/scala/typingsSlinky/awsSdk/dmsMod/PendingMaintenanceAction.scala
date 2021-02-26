package typingsSlinky.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PendingMaintenanceAction extends StObject {
  
  /**
    * The type of pending maintenance action that is available for the resource.
    */
  var Action: js.UndefOr[String] = js.native
  
  /**
    * The date of the maintenance window when the action is to be applied. The maintenance action is applied to the resource during its first maintenance window after this date. If this date is specified, any next-maintenance opt-in requests are ignored.
    */
  var AutoAppliedAfterDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The effective date when the pending maintenance action will be applied to the resource. This date takes into account opt-in requests received from the ApplyPendingMaintenanceAction API operation, and also the AutoAppliedAfterDate and ForcedApplyDate parameter values. This value is blank if an opt-in request has not been received and nothing has been specified for AutoAppliedAfterDate or ForcedApplyDate.
    */
  var CurrentApplyDate: js.UndefOr[js.Date] = js.native
  
  /**
    * A description providing more detail about the maintenance action.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The date when the maintenance action will be automatically applied. The maintenance action is applied to the resource on this date regardless of the maintenance window for the resource. If this date is specified, any immediate opt-in requests are ignored.
    */
  var ForcedApplyDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The type of opt-in request that has been received for the resource.
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
