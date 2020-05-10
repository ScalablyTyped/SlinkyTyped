package typingsSlinky.pulumiAws.inputMod.ec2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmiCopyEphemeralBlockDevice extends js.Object {
  var deviceName: js.UndefOr[Input[String]] = js.native
  var virtualName: js.UndefOr[Input[String]] = js.native
}

object AmiCopyEphemeralBlockDevice {
  @scala.inline
  def apply(): AmiCopyEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmiCopyEphemeralBlockDevice]
  }
  @scala.inline
  implicit class AmiCopyEphemeralBlockDeviceOps[Self <: AmiCopyEphemeralBlockDevice] (val x: Self) extends AnyVal {
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

