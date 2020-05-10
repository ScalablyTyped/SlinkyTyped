package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockDeviceMapping extends js.Object {
  /**
    * The device name exposed to the EC2 instance (for example, /dev/sdh or xvdh). For more information, see Device Naming on Linux Instances in the Amazon EC2 User Guide for Linux Instances.
    */
  var DeviceName: XmlStringMaxLen255 = js.native
  /**
    * The information about the Amazon EBS volume.
    */
  var Ebs: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.Ebs] = js.native
  /**
    * Suppresses a device mapping. If this parameter is true for the root device, the instance might fail the EC2 health check. In that case, Amazon EC2 Auto Scaling launches a replacement instance.
    */
  var NoDevice: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.NoDevice] = js.native
  /**
    * The name of the virtual device (for example, ephemeral0).
    */
  var VirtualName: js.UndefOr[XmlStringMaxLen255] = js.native
}

object BlockDeviceMapping {
  @scala.inline
  def apply(DeviceName: XmlStringMaxLen255): BlockDeviceMapping = {
    val __obj = js.Dynamic.literal(DeviceName = DeviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockDeviceMapping]
  }
  @scala.inline
  implicit class BlockDeviceMappingOps[Self <: BlockDeviceMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceName(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEbs(value: Ebs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ebs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ebs")(js.undefined)
        ret
    }
    @scala.inline
    def withNoDevice(value: NoDevice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoDevice")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualName(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VirtualName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VirtualName")(js.undefined)
        ret
    }
  }
  
}

