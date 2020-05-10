package typingsSlinky.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detailed information of a single MDM device compromised event.
  */
@js.native
trait SchemaDeviceCompromisedSecurityDetail extends js.Object {
  /**
    * The device compromised state. Possible values are
    * &quot;`Compromised`&quot; or &quot;`Not Compromised`&quot;.
    */
  var deviceCompromisedState: js.UndefOr[String] = js.native
  /**
    * Required. The device ID.
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * The model of the device.
    */
  var deviceModel: js.UndefOr[String] = js.native
  /**
    * The type of the device.
    */
  var deviceType: js.UndefOr[String] = js.native
  /**
    * Required for iOS, empty for others.
    */
  var iosVendorId: js.UndefOr[String] = js.native
  /**
    * The device resource ID.
    */
  var resourceId: js.UndefOr[String] = js.native
  /**
    * The serial number of the device.
    */
  var serialNumber: js.UndefOr[String] = js.native
}

object SchemaDeviceCompromisedSecurityDetail {
  @scala.inline
  def apply(): SchemaDeviceCompromisedSecurityDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceCompromisedSecurityDetail]
  }
  @scala.inline
  implicit class SchemaDeviceCompromisedSecurityDetailOps[Self <: SchemaDeviceCompromisedSecurityDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceCompromisedState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCompromisedState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceCompromisedState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCompromisedState")(js.undefined)
        ret
    }
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

