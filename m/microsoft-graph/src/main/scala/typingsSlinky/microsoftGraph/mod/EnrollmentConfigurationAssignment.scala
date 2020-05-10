package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnrollmentConfigurationAssignment extends Entity {
  // Not yet documented
  var target: js.UndefOr[DeviceAndAppManagementAssignmentTarget] = js.native
}

object EnrollmentConfigurationAssignment {
  @scala.inline
  def apply(): EnrollmentConfigurationAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnrollmentConfigurationAssignment]
  }
  @scala.inline
  implicit class EnrollmentConfigurationAssignmentOps[Self <: EnrollmentConfigurationAssignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

