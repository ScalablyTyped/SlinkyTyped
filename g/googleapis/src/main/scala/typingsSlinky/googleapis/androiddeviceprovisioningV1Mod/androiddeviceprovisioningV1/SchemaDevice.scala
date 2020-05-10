package typingsSlinky.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Android device registered for zero-touch enrollment.
  */
@js.native
trait SchemaDevice extends js.Object {
  /**
    * Output only. The provisioning claims for a device. Devices claimed for
    * zero-touch enrollment have a claim with the type
    * `SECTION_TYPE_ZERO_TOUCH`. Call `partners.devices.unclaim` or
    * `partners.devices.unclaimAsync` to remove the device from zero-touch
    * enrollment.
    */
  var claims: js.UndefOr[js.Array[SchemaDeviceClaim]] = js.native
  /**
    * Not available to resellers.
    */
  var configuration: js.UndefOr[String] = js.native
  /**
    * Output only. The ID of the device. Assigned by the server.
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * The hardware IDs that identify a manufactured device. To learn more, read
    * [Identifiers](/zero-touch/guides/identifiers).
    */
  var deviceIdentifier: js.UndefOr[SchemaDeviceIdentifier] = js.native
  /**
    * The metadata attached to the device. Structured as key-value pairs. To
    * learn more, read [Device metadata](/zero-touch/guides/metadata).
    */
  var deviceMetadata: js.UndefOr[SchemaDeviceMetadata] = js.native
  /**
    * Output only. The API resource name in the format
    * `partners/[PARTNER_ID]/devices/[DEVICE_ID]`. Assigned by the server.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaDevice {
  @scala.inline
  def apply(): SchemaDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDevice]
  }
  @scala.inline
  implicit class SchemaDeviceOps[Self <: SchemaDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClaims(value: js.Array[SchemaDeviceClaim]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claims")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaims: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claims")(js.undefined)
        ret
    }
    @scala.inline
    def withConfiguration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(js.undefined)
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
    def withDeviceIdentifier(value: SchemaDeviceIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceMetadata(value: SchemaDeviceMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

