package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockDeviceMapping extends js.Object {
  /**
    * The device name that is exposed to the instance, such as /dev/sdh. For the root device, you can use the explicit device name or you can set this parameter to ROOT_DEVICE and AWS OpsWorks Stacks will provide the correct device name.
    */
  var DeviceName: js.UndefOr[String] = js.native
  /**
    * An EBSBlockDevice that defines how to configure an Amazon EBS volume when the instance is launched.
    */
  var Ebs: js.UndefOr[EbsBlockDevice] = js.native
  /**
    * Suppresses the specified device included in the AMI's block device mapping.
    */
  var NoDevice: js.UndefOr[String] = js.native
  /**
    * The virtual device name. For more information, see BlockDeviceMapping.
    */
  var VirtualName: js.UndefOr[String] = js.native
}

object BlockDeviceMapping {
  @scala.inline
  def apply(): BlockDeviceMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockDeviceMapping]
  }
  @scala.inline
  implicit class BlockDeviceMappingOps[Self <: BlockDeviceMapping] (val x: Self) extends AnyVal {
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
    def withEbs(value: EbsBlockDevice): Self = {
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

