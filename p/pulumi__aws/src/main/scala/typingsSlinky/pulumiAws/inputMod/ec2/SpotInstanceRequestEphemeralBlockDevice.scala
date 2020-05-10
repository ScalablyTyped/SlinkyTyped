package typingsSlinky.pulumiAws.inputMod.ec2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotInstanceRequestEphemeralBlockDevice extends js.Object {
  /**
    * The name of the block device to mount on the instance.
    */
  var deviceName: Input[String] = js.native
  /**
    * Suppresses the specified device included in the AMI's block device mapping.
    */
  var noDevice: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The [Instance Store Device
    * Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames)
    * (e.g. `"ephemeral0"`).
    */
  var virtualName: js.UndefOr[Input[String]] = js.native
}

object SpotInstanceRequestEphemeralBlockDevice {
  @scala.inline
  def apply(deviceName: Input[String]): SpotInstanceRequestEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotInstanceRequestEphemeralBlockDevice]
  }
  @scala.inline
  implicit class SpotInstanceRequestEphemeralBlockDeviceOps[Self <: SpotInstanceRequestEphemeralBlockDevice] (val x: Self) extends AnyVal {
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
    def withNoDevice(value: Input[Boolean]): Self = {
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

