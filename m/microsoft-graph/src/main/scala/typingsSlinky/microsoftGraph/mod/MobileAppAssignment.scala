package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileAppAssignment extends Entity {
  /**
    * The install intent defined by the admin. Possible values are: available, required, uninstall,
    * availableWithoutEnrollment.
    */
  var intent: js.UndefOr[InstallIntent] = js.native
  // The settings for target assignment defined by the admin.
  var settings: js.UndefOr[MobileAppAssignmentSettings] = js.native
  // The target group assignment defined by the admin.
  var target: js.UndefOr[DeviceAndAppManagementAssignmentTarget] = js.native
}

object MobileAppAssignment {
  @scala.inline
  def apply(): MobileAppAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileAppAssignment]
  }
  @scala.inline
  implicit class MobileAppAssignmentOps[Self <: MobileAppAssignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntent(value: InstallIntent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: MobileAppAssignmentSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: DeviceAndAppManagementAssignmentTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

