package typingsSlinky.awsSdk.docdbMod

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
  def apply(): PendingMaintenanceAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingMaintenanceAction]
  }
  @scala.inline
  implicit class PendingMaintenanceActionOps[Self <: PendingMaintenanceAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoAppliedAfterDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoAppliedAfterDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAppliedAfterDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoAppliedAfterDate")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentApplyDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentApplyDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentApplyDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentApplyDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withForcedApplyDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForcedApplyDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForcedApplyDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForcedApplyDate")(js.undefined)
        ret
    }
    @scala.inline
    def withOptInStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptInStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptInStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptInStatus")(js.undefined)
        ret
    }
  }
  
}

