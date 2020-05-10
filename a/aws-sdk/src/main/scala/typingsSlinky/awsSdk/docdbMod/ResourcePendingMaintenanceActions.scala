package typingsSlinky.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourcePendingMaintenanceActions extends js.Object {
  /**
    * A list that provides details about the pending maintenance actions for the resource.
    */
  var PendingMaintenanceActionDetails: js.UndefOr[typingsSlinky.awsSdk.docdbMod.PendingMaintenanceActionDetails] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource that has pending maintenance actions.
    */
  var ResourceIdentifier: js.UndefOr[String] = js.native
}

object ResourcePendingMaintenanceActions {
  @scala.inline
  def apply(): ResourcePendingMaintenanceActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePendingMaintenanceActions]
  }
  @scala.inline
  implicit class ResourcePendingMaintenanceActionsOps[Self <: ResourcePendingMaintenanceActions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPendingMaintenanceActionDetails(value: PendingMaintenanceActionDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PendingMaintenanceActionDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingMaintenanceActionDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PendingMaintenanceActionDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceIdentifier")(js.undefined)
        ret
    }
  }
  
}

