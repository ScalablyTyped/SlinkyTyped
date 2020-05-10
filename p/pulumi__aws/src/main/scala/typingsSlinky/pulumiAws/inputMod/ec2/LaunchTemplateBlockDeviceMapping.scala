package typingsSlinky.pulumiAws.inputMod.ec2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateBlockDeviceMapping extends js.Object {
  /**
    * The name of the device to mount.
    */
  var deviceName: js.UndefOr[Input[String]] = js.native
  /**
    * Configure EBS volume properties.
    */
  var ebs: js.UndefOr[Input[LaunchTemplateBlockDeviceMappingEbs]] = js.native
  /**
    * Suppresses the specified device included in the AMI's block device mapping.
    */
  var noDevice: js.UndefOr[Input[String]] = js.native
  /**
    * The [Instance Store Device
    * Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames)
    * (e.g. `"ephemeral0"`).
    */
  var virtualName: js.UndefOr[Input[String]] = js.native
}

object LaunchTemplateBlockDeviceMapping {
  @scala.inline
  def apply(): LaunchTemplateBlockDeviceMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateBlockDeviceMapping]
  }
  @scala.inline
  implicit class LaunchTemplateBlockDeviceMappingOps[Self <: LaunchTemplateBlockDeviceMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withEbs(value: Input[LaunchTemplateBlockDeviceMappingEbs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebs")(js.undefined)
        ret
    }
    @scala.inline
    def withNoDevice(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDevice")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualName")(js.undefined)
        ret
    }
  }
  
}

