package typingsSlinky.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceDescriptor extends js.Object {
  /**
    * Specifies the ETSI white space device category. Valid values are the strings master and slave. This field is case-insensitive. Consult the ETSI
    * documentation for details about the device types.
    */
  var etsiEnDeviceCategory: js.UndefOr[String] = js.native
  /**
    * Specifies the ETSI white space device emissions class. The values are represented by numeric strings, such as 1, 2, etc. Consult the ETSI documentation
    * for details about the device types.
    */
  var etsiEnDeviceEmissionsClass: js.UndefOr[String] = js.native
  /**
    * Specifies the ETSI white space device type. Valid values are single-letter strings, such as A, B, etc. Consult the ETSI documentation for details about
    * the device types.
    */
  var etsiEnDeviceType: js.UndefOr[String] = js.native
  /**
    * Specifies the ETSI white space device technology identifier. The string value must not exceed 64 characters in length. Consult the ETSI documentation
    * for details about the device types.
    */
  var etsiEnTechnologyId: js.UndefOr[String] = js.native
  /**
    * Specifies the device's FCC certification identifier. The value is an identifier string whose length should not exceed 32 characters. Note that, in
    * practice, a valid FCC ID may be limited to 19 characters.
    */
  var fccId: js.UndefOr[String] = js.native
  /** Specifies the TV Band White Space device type, as defined by the FCC. Valid values are FIXED, MODE_1, MODE_2. */
  var fccTvbdDeviceType: js.UndefOr[String] = js.native
  /**
    * The manufacturer's ID may be required by the regulatory domain. This should represent the name of the device manufacturer, should be consistent across
    * all devices from the same manufacturer, and should be distinct from that of other manufacturers. The string value must not exceed 64 characters in
    * length.
    */
  var manufacturerId: js.UndefOr[String] = js.native
  /** The device's model ID may be required by the regulatory domain. The string value must not exceed 64 characters in length. */
  var modelId: js.UndefOr[String] = js.native
  /**
    * The list of identifiers for rulesets supported by the device. A database may require that the device provide this list before servicing the device
    * requests. If the database does not support any of the rulesets specified in the list, the database may refuse to service the device requests. If
    * present, the list must contain at least one entry.
    *
    * For information about the valid requests, see section 9.2 of the PAWS specification. Currently, FccTvBandWhiteSpace-2010 is the only supported ruleset.
    */
  var rulesetIds: js.UndefOr[js.Array[String]] = js.native
  /** The manufacturer's device serial number; required by the applicable regulatory domain. The length of the value must not exceed 64 characters. */
  var serialNumber: js.UndefOr[String] = js.native
}

object DeviceDescriptor {
  @scala.inline
  def apply(): DeviceDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceDescriptor]
  }
  @scala.inline
  implicit class DeviceDescriptorOps[Self <: DeviceDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEtsiEnDeviceCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etsiEnDeviceCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtsiEnDeviceCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etsiEnDeviceCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withEtsiEnDeviceEmissionsClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etsiEnDeviceEmissionsClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtsiEnDeviceEmissionsClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etsiEnDeviceEmissionsClass")(js.undefined)
        ret
    }
    @scala.inline
    def withEtsiEnDeviceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etsiEnDeviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtsiEnDeviceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etsiEnDeviceType")(js.undefined)
        ret
    }
    @scala.inline
    def withEtsiEnTechnologyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etsiEnTechnologyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtsiEnTechnologyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etsiEnTechnologyId")(js.undefined)
        ret
    }
    @scala.inline
    def withFccId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fccId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFccId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fccId")(js.undefined)
        ret
    }
    @scala.inline
    def withFccTvbdDeviceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fccTvbdDeviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFccTvbdDeviceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fccTvbdDeviceType")(js.undefined)
        ret
    }
    @scala.inline
    def withManufacturerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManufacturerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturerId")(js.undefined)
        ret
    }
    @scala.inline
    def withModelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelId")(js.undefined)
        ret
    }
    @scala.inline
    def withRulesetIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRulesetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesetIds")(js.undefined)
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

