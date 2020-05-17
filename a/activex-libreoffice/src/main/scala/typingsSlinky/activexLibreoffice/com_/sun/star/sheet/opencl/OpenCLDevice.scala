package typingsSlinky.activexLibreoffice.com_.sun.star.sheet.opencl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenCLDevice extends js.Object {
  /** The driver version as returned by OpenCL */
  var Driver: String = js.native
  /** The name of the device as returned by OpenCL */
  var Name: String = js.native
  /** The vendor of the device as returned by OpenCL */
  var Vendor: String = js.native
}

object OpenCLDevice {
  @scala.inline
  def apply(Driver: String, Name: String, Vendor: String): OpenCLDevice = {
    val __obj = js.Dynamic.literal(Driver = Driver.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Vendor = Vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCLDevice]
  }
  @scala.inline
  implicit class OpenCLDeviceOps[Self <: OpenCLDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDriver(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Driver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVendor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Vendor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

