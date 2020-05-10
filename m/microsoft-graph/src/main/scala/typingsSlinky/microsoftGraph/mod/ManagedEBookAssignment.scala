package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedEBookAssignment extends Entity {
  // The install intent for eBook. Possible values are: available, required, uninstall, availableWithoutEnrollment.
  var installIntent: js.UndefOr[InstallIntent] = js.native
  // The assignment target for eBook.
  var target: js.UndefOr[DeviceAndAppManagementAssignmentTarget] = js.native
}

object ManagedEBookAssignment {
  @scala.inline
  def apply(): ManagedEBookAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedEBookAssignment]
  }
  @scala.inline
  implicit class ManagedEBookAssignmentOps[Self <: ManagedEBookAssignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstallIntent(value: InstallIntent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installIntent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallIntent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installIntent")(js.undefined)
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

