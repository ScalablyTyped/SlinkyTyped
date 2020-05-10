package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotFleetRequestLaunchSpecificationEphemeralBlockDevice extends js.Object {
  var deviceName: String = js.native
  var virtualName: String = js.native
}

object SpotFleetRequestLaunchSpecificationEphemeralBlockDevice {
  @scala.inline
  def apply(deviceName: String, virtualName: String): SpotFleetRequestLaunchSpecificationEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice]
  }
  @scala.inline
  implicit class SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceOps[Self <: SpotFleetRequestLaunchSpecificationEphemeralBlockDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

