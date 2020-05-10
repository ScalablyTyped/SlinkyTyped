package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InferenceAccelerator extends js.Object {
  /**
    * The Elastic Inference accelerator device name. The deviceName must also be referenced in a container definition as a ResourceRequirement.
    */
  var deviceName: String = js.native
  /**
    * The Elastic Inference accelerator type to use.
    */
  var deviceType: String = js.native
}

object InferenceAccelerator {
  @scala.inline
  def apply(deviceName: String, deviceType: String): InferenceAccelerator = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferenceAccelerator]
  }
  @scala.inline
  implicit class InferenceAcceleratorOps[Self <: InferenceAccelerator] (val x: Self) extends AnyVal {
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
    def withDeviceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

