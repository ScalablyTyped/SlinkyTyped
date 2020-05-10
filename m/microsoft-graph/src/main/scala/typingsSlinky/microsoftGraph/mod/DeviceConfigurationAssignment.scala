package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceConfigurationAssignment extends Entity {
  // The assignment target for the device configuration.
  var target: js.UndefOr[DeviceAndAppManagementAssignmentTarget] = js.native
}

object DeviceConfigurationAssignment {
  @scala.inline
  def apply(): DeviceConfigurationAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceConfigurationAssignment]
  }
  @scala.inline
  implicit class DeviceConfigurationAssignmentOps[Self <: DeviceConfigurationAssignment] (val x: Self) extends AnyVal {
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

