package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InferenceAcceleratorInfo extends js.Object {
  /**
    * Describes the Inference accelerators for the instance type.
    */
  var Accelerators: js.UndefOr[InferenceDeviceInfoList] = js.native
}

object InferenceAcceleratorInfo {
  @scala.inline
  def apply(): InferenceAcceleratorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InferenceAcceleratorInfo]
  }
  @scala.inline
  implicit class InferenceAcceleratorInfoOps[Self <: InferenceAcceleratorInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccelerators(value: InferenceDeviceInfoList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accelerators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccelerators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accelerators")(js.undefined)
        ret
    }
  }
  
}

