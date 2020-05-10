package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyPendingMaintenanceActionResponse extends js.Object {
  /**
    * The AWS DMS resource that the pending maintenance action will be applied to.
    */
  var ResourcePendingMaintenanceActions: js.UndefOr[typingsSlinky.awsSdk.dmsMod.ResourcePendingMaintenanceActions] = js.native
}

object ApplyPendingMaintenanceActionResponse {
  @scala.inline
  def apply(): ApplyPendingMaintenanceActionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyPendingMaintenanceActionResponse]
  }
  @scala.inline
  implicit class ApplyPendingMaintenanceActionResponseOps[Self <: ApplyPendingMaintenanceActionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourcePendingMaintenanceActions(value: ResourcePendingMaintenanceActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourcePendingMaintenanceActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourcePendingMaintenanceActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourcePendingMaintenanceActions")(js.undefined)
        ret
    }
  }
  
}

