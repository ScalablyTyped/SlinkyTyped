package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTarget extends js.Object {
  /**
    * A description for the target.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.native
  /**
    * The name for the maintenance window target.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.native
  /**
    * A user-provided value that will be included in any CloudWatch events that are raised while running tasks for these targets in this maintenance window.
    */
  var OwnerInformation: js.UndefOr[typingsSlinky.awsSdk.ssmMod.OwnerInformation] = js.native
  /**
    * The type of target that is being registered with the maintenance window.
    */
  var ResourceType: js.UndefOr[MaintenanceWindowResourceType] = js.native
  /**
    * The targets, either instances or tags. Specify instances using the following format:  Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;  Tags are specified using the following format:  Key=&lt;tag name&gt;,Values=&lt;tag value&gt;.
    */
  var Targets: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Targets] = js.native
  /**
    * The ID of the maintenance window to register the target with.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.native
  /**
    * The ID of the target.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.native
}

object MaintenanceWindowTarget {
  @scala.inline
  def apply(): MaintenanceWindowTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTarget]
  }
  @scala.inline
  implicit class MaintenanceWindowTargetOps[Self <: MaintenanceWindowTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withResourceType(value: MaintenanceWindowResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(js.undefined)
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
    @scala.inline
    def withWindowId(value: MaintenanceWindowId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowId")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowTargetId(value: MaintenanceWindowTargetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowTargetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowTargetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowTargetId")(js.undefined)
        ret
    }
  }
  
}

