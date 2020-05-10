package typingsSlinky.pulumiAws.inputMod.opsworks

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceRootBlockDevice extends js.Object {
  var deleteOnTermination: js.UndefOr[Input[Boolean]] = js.native
  var iops: js.UndefOr[Input[Double]] = js.native
  var volumeSize: js.UndefOr[Input[Double]] = js.native
  var volumeType: js.UndefOr[Input[String]] = js.native
}

object InstanceRootBlockDevice {
  @scala.inline
  def apply(): InstanceRootBlockDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceRootBlockDevice]
  }
  @scala.inline
  implicit class InstanceRootBlockDeviceOps[Self <: InstanceRootBlockDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteOnTermination(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteOnTermination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteOnTermination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteOnTermination")(js.undefined)
        ret
    }
    @scala.inline
    def withIops(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iops")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeSize(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeType")(js.undefined)
        ret
    }
  }
  
}

