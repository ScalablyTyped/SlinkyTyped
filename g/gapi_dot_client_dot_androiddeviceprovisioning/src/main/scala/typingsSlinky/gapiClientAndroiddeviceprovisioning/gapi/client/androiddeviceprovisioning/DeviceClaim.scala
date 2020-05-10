package typingsSlinky.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceClaim extends js.Object {
  /** Owner ID. */
  var ownerCompanyId: js.UndefOr[String] = js.native
  /** Section type of the device claim. */
  var sectionType: js.UndefOr[String] = js.native
}

object DeviceClaim {
  @scala.inline
  def apply(): DeviceClaim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceClaim]
  }
  @scala.inline
  implicit class DeviceClaimOps[Self <: DeviceClaim] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwnerCompanyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerCompanyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerCompanyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerCompanyId")(js.undefined)
        ret
    }
    @scala.inline
    def withSectionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSectionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionType")(js.undefined)
        ret
    }
  }
  
}

