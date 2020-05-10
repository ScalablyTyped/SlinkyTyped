package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledInstancesBlockDeviceMapping extends js.Object {
  /**
    * The device name (for example, /dev/sdh or xvdh).
    */
  var DeviceName: js.UndefOr[String] = js.native
  /**
    * Parameters used to set up EBS volumes automatically when the instance is launched.
    */
  var Ebs: js.UndefOr[ScheduledInstancesEbs] = js.native
  /**
    * Suppresses the specified device included in the block device mapping of the AMI.
    */
  var NoDevice: js.UndefOr[String] = js.native
  /**
    * The virtual device name (ephemeralN). Instance store volumes are numbered starting from 0. An instance type with two available instance store volumes can specify mappings for ephemeral0 and ephemeral1. The number of available instance store volumes depends on the instance type. After you connect to the instance, you must mount the volume. Constraints: For M3 instances, you must specify instance store volumes in the block device mapping for the instance. When you launch an M3 instance, we ignore any instance store volumes specified in the block device mapping for the AMI.
    */
  var VirtualName: js.UndefOr[String] = js.native
}

object ScheduledInstancesBlockDeviceMapping {
  @scala.inline
  def apply(): ScheduledInstancesBlockDeviceMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstancesBlockDeviceMapping]
  }
  @scala.inline
  implicit class ScheduledInstancesBlockDeviceMappingOps[Self <: ScheduledInstancesBlockDeviceMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withEbs(value: ScheduledInstancesEbs): Self = {
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
    def withNoDevice(value: String): Self = {
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
    def withVirtualName(value: String): Self = {
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

