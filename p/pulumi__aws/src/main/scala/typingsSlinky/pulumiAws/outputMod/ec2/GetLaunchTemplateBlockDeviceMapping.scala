package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchTemplateBlockDeviceMapping extends js.Object {
  var deviceName: String = js.native
  var ebs: js.Array[GetLaunchTemplateBlockDeviceMappingEb] = js.native
  var noDevice: String = js.native
  var virtualName: String = js.native
}

object GetLaunchTemplateBlockDeviceMapping {
  @scala.inline
  def apply(
    deviceName: String,
    ebs: js.Array[GetLaunchTemplateBlockDeviceMappingEb],
    noDevice: String,
    virtualName: String
  ): GetLaunchTemplateBlockDeviceMapping = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], ebs = ebs.asInstanceOf[js.Any], noDevice = noDevice.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateBlockDeviceMapping]
  }
  @scala.inline
  implicit class GetLaunchTemplateBlockDeviceMappingOps[Self <: GetLaunchTemplateBlockDeviceMapping] (val x: Self) extends AnyVal {
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
    def withEbs(value: js.Array[GetLaunchTemplateBlockDeviceMappingEb]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoDevice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDevice")(value.asInstanceOf[js.Any])
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

