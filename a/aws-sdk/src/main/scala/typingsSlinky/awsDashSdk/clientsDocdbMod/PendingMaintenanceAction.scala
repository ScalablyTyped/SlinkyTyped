package typingsSlinky.awsDashSdk.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PendingMaintenanceAction extends js.Object {
  /**
    * The type of pending maintenance action that is available for the resource.
    */
  var Action: js.UndefOr[String] = js.native
  /**
    * The date of the maintenance window when the action is applied. The maintenance action is applied to the resource during its first maintenance window after this date. If this date is specified, any next-maintenance opt-in requests are ignored.
    */
  var AutoAppliedAfterDate: js.UndefOr[js.Date] = js.native
  /**
    * The effective date when the pending maintenance action is applied to the resource.
    */
  var CurrentApplyDate: js.UndefOr[js.Date] = js.native
  /**
    * A description providing more detail about the maintenance action.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The date when the maintenance action is automatically applied. The maintenance action is applied to the resource on this date regardless of the maintenance window for the resource. If this date is specified, any immediate opt-in requests are ignored.
    */
  var ForcedApplyDate: js.UndefOr[js.Date] = js.native
  /**
    * Indicates the type of opt-in request that has been received for the resource.
    */
  var OptInStatus: js.UndefOr[String] = js.native
}

object PendingMaintenanceAction {
  @scala.inline
  def apply(
    Action: String = null,
    AutoAppliedAfterDate: js.Date = null,
    CurrentApplyDate: js.Date = null,
    Description: String = null,
    ForcedApplyDate: js.Date = null,
    OptInStatus: String = null
  ): PendingMaintenanceAction = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (AutoAppliedAfterDate != null) __obj.updateDynamic("AutoAppliedAfterDate")(AutoAppliedAfterDate.asInstanceOf[js.Any])
    if (CurrentApplyDate != null) __obj.updateDynamic("CurrentApplyDate")(CurrentApplyDate.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ForcedApplyDate != null) __obj.updateDynamic("ForcedApplyDate")(ForcedApplyDate.asInstanceOf[js.Any])
    if (OptInStatus != null) __obj.updateDynamic("OptInStatus")(OptInStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PendingMaintenanceAction]
  }
}

