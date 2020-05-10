package typingsSlinky.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detailed information of a single MDM suspicious activity event.
  */
@js.native
trait SchemaSuspiciousActivitySecurityDetail extends js.Object {
  /**
    * Required. The device ID.
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * The model of the device.
    */
  var deviceModel: js.UndefOr[String] = js.native
  /**
    * The device property which was changed.
    */
  var deviceProperty: js.UndefOr[String] = js.native
  /**
    * The type of the device.
    */
  var deviceType: js.UndefOr[String] = js.native
  /**
    * Required for iOS, empty for others.
    */
  var iosVendorId: js.UndefOr[String] = js.native
  /**
    * The new value of the device property after the change.
    */
  var newValue: js.UndefOr[String] = js.native
  /**
    * The old value of the device property before the change.
    */
  var oldValue: js.UndefOr[String] = js.native
  /**
    * The device resource ID.
    */
  var resourceId: js.UndefOr[String] = js.native
  /**
    * The serial number of the device.
    */
  var serialNumber: js.UndefOr[String] = js.native
}

object SchemaSuspiciousActivitySecurityDetail {
  @scala.inline
  def apply(): SchemaSuspiciousActivitySecurityDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuspiciousActivitySecurityDetail]
  }
  @scala.inline
  implicit class SchemaSuspiciousActivitySecurityDetailOps[Self <: SchemaSuspiciousActivitySecurityDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceModel")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceType")(js.undefined)
        ret
    }
    @scala.inline
    def withIosVendorId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosVendorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosVendorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosVendorId")(js.undefined)
        ret
    }
    @scala.inline
    def withNewValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOldValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerialNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialNumber")(js.undefined)
        ret
    }
  }
  
}

