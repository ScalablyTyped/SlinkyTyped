package typingsSlinky.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateDeviceWithPlacementRequest extends js.Object {
  /**
    * The ID of the physical device to be associated with the given placement in the project. Note that a mandatory 4 character prefix is required for all deviceId values.
    */
  var deviceId: DeviceId = js.native
  /**
    * The device template name to associate with the device ID.
    */
  var deviceTemplateName: DeviceTemplateName = js.native
  /**
    * The name of the placement in which to associate the device.
    */
  var placementName: PlacementName = js.native
  /**
    * The name of the project containing the placement in which to associate the device.
    */
  var projectName: ProjectName = js.native
}

object AssociateDeviceWithPlacementRequest {
  @scala.inline
  def apply(
    deviceId: DeviceId,
    deviceTemplateName: DeviceTemplateName,
    placementName: PlacementName,
    projectName: ProjectName
  ): AssociateDeviceWithPlacementRequest = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], deviceTemplateName = deviceTemplateName.asInstanceOf[js.Any], placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateDeviceWithPlacementRequest]
  }
  @scala.inline
  implicit class AssociateDeviceWithPlacementRequestOps[Self <: AssociateDeviceWithPlacementRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceId(value: DeviceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceTemplateName(value: DeviceTemplateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceTemplateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlacementName(value: PlacementName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectName(value: ProjectName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

