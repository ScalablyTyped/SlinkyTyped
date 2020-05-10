package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VppLicensingType extends js.Object {
  // Whether the program supports the device licensing type.
  var supportsDeviceLicensing: js.UndefOr[Boolean] = js.native
  // Whether the program supports the user licensing type.
  var supportsUserLicensing: js.UndefOr[Boolean] = js.native
}

object VppLicensingType {
  @scala.inline
  def apply(): VppLicensingType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VppLicensingType]
  }
  @scala.inline
  implicit class VppLicensingTypeOps[Self <: VppLicensingType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSupportsDeviceLicensing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsDeviceLicensing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsDeviceLicensing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsDeviceLicensing")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsUserLicensing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsUserLicensing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsUserLicensing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsUserLicensing")(js.undefined)
        ret
    }
  }
  
}

