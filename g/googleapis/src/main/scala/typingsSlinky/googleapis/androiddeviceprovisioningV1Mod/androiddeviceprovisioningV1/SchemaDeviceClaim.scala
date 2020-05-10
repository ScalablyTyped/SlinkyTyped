package typingsSlinky.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A record of a device claimed by a reseller for a customer. Devices claimed
  * for zero-touch enrollment have a claim with the type
  * `SECTION_TYPE_ZERO_TOUCH`. To learn more, read [Claim devices for
  * customers](/zero-touch/guides/how-it-works#claim).
  */
@js.native
trait SchemaDeviceClaim extends js.Object {
  /**
    * The ID of the Customer that purchased the device.
    */
  var ownerCompanyId: js.UndefOr[String] = js.native
  /**
    * The ID of the reseller that claimed the device.
    */
  var resellerId: js.UndefOr[String] = js.native
  /**
    * Output only. The type of claim made on the device.
    */
  var sectionType: js.UndefOr[String] = js.native
}

object SchemaDeviceClaim {
  @scala.inline
  def apply(): SchemaDeviceClaim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceClaim]
  }
  @scala.inline
  implicit class SchemaDeviceClaimOps[Self <: SchemaDeviceClaim] (val x: Self) extends AnyVal {
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
    def withResellerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resellerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResellerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resellerId")(js.undefined)
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

