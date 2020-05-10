package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InferenceDeviceInfo extends js.Object {
  /**
    * The number of Inference accelerators for the instance type.
    */
  var Count: js.UndefOr[InferenceDeviceCount] = js.native
  /**
    * The manufacturer of the Inference accelerator.
    */
  var Manufacturer: js.UndefOr[InferenceDeviceManufacturerName] = js.native
  /**
    * The name of the Inference accelerator.
    */
  var Name: js.UndefOr[InferenceDeviceName] = js.native
}

object InferenceDeviceInfo {
  @scala.inline
  def apply(): InferenceDeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InferenceDeviceInfo]
  }
  @scala.inline
  implicit class InferenceDeviceInfoOps[Self <: InferenceDeviceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: InferenceDeviceCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(js.undefined)
        ret
    }
    @scala.inline
    def withManufacturer(value: InferenceDeviceManufacturerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Manufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManufacturer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Manufacturer")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: InferenceDeviceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

