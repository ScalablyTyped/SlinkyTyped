package typingsSlinky.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates hardware and product IDs to identify a manufactured device. To
  * understand requirements on identifier sets, read
  * [Identifiers](/zero-touch/guides/identifiers).
  */
@js.native
trait SchemaDeviceIdentifier extends js.Object {
  /**
    * The device’s IMEI number. Validated on input.
    */
  var imei: js.UndefOr[String] = js.native
  /**
    * The device manufacturer’s name. Matches the device&#39;s built-in value
    * returned from `android.os.Build.MANUFACTURER`. Allowed values are listed
    * in
    * [manufacturers](/zero-touch/resources/manufacturer-names#manufacturers-names).
    */
  var manufacturer: js.UndefOr[String] = js.native
  /**
    * The device’s MEID number.
    */
  var meid: js.UndefOr[String] = js.native
  /**
    * The device model&#39;s name. Matches the device&#39;s built-in value
    * returned from `android.os.Build.MODEL`. Allowed values are listed in
    * [models](/zero-touch/resources/manufacturer-names#model-names).
    */
  var model: js.UndefOr[String] = js.native
  /**
    * The manufacturer&#39;s serial number for the device. This value might not
    * be unique across different device models.
    */
  var serialNumber: js.UndefOr[String] = js.native
}

object SchemaDeviceIdentifier {
  @scala.inline
  def apply(): SchemaDeviceIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceIdentifier]
  }
  @scala.inline
  implicit class SchemaDeviceIdentifierOps[Self <: SchemaDeviceIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImei(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imei")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImei: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imei")(js.undefined)
        ret
    }
    @scala.inline
    def withManufacturer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManufacturer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(js.undefined)
        ret
    }
    @scala.inline
    def withMeid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meid")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
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

