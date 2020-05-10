package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMaintenanceWindowTargetRequest extends js.Object {
  /**
    * An optional description for the update.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.native
  /**
    * A name for the update.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.native
  /**
    * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this maintenance window.
    */
  var OwnerInformation: js.UndefOr[typingsSlinky.awsSdk.ssmMod.OwnerInformation] = js.native
  /**
    * If True, then all fields that are required by the RegisterTargetWithMaintenanceWindow action are also required for this API request. Optional fields that are not specified are set to null.
    */
  var Replace: js.UndefOr[Boolean] = js.native
  /**
    * The targets to add or replace.
    */
  var Targets: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Targets] = js.native
  /**
    * The maintenance window ID with which to modify the target.
    */
  var WindowId: MaintenanceWindowId = js.native
  /**
    * The target ID to modify.
    */
  var WindowTargetId: MaintenanceWindowTargetId = js.native
}

object UpdateMaintenanceWindowTargetRequest {
  @scala.inline
  def apply(WindowId: MaintenanceWindowId, WindowTargetId: MaintenanceWindowTargetId): UpdateMaintenanceWindowTargetRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any], WindowTargetId = WindowTargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMaintenanceWindowTargetRequest]
  }
  @scala.inline
  implicit class UpdateMaintenanceWindowTargetRequestOps[Self <: UpdateMaintenanceWindowTargetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWindowId(value: MaintenanceWindowId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowTargetId(value: MaintenanceWindowTargetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowTargetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: MaintenanceWindowDescription): Self = {
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
    def withName(value: MaintenanceWindowName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerInformation(value: OwnerInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerInformation")(js.undefined)
        ret
    }
    @scala.inline
    def withReplace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Replace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Replace")(js.undefined)
        ret
    }
    @scala.inline
    def withTargets(value: Targets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Targets")(js.undefined)
        ret
    }
  }
  
}

