package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Unique Device Identifier (UDI) Barcode string
  */
@js.native
trait DeviceUdi extends BackboneElement {
  /**
    * Contains extended information for property 'carrierAIDC'.
    */
  var _carrierAIDC: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'carrierHRF'.
    */
  var _carrierHRF: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'deviceIdentifier'.
    */
  var _deviceIdentifier: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'entryType'.
    */
  var _entryType: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'issuer'.
    */
  var _issuer: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'jurisdiction'.
    */
  var _jurisdiction: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * UDI Machine Readable Barcode String
    */
  var carrierAIDC: js.UndefOr[base64Binary] = js.native
  /**
    * UDI Human Readable Barcode String
    */
  var carrierHRF: js.UndefOr[String] = js.native
  /**
    * Mandatory fixed portion of UDI
    */
  var deviceIdentifier: js.UndefOr[String] = js.native
  /**
    * barcode | rfid | manual +
    */
  var entryType: js.UndefOr[code] = js.native
  /**
    * UDI Issuing Organization
    */
  var issuer: js.UndefOr[uri] = js.native
  /**
    * Regional UDI authority
    */
  var jurisdiction: js.UndefOr[uri] = js.native
  /**
    * Device Name as appears on UDI label
    */
  var name: js.UndefOr[String] = js.native
}

object DeviceUdi {
  @scala.inline
  def apply(): DeviceUdi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceUdi]
  }
  @scala.inline
  implicit class DeviceUdiOps[Self <: DeviceUdi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_carrierAIDC(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_carrierAIDC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_carrierAIDC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_carrierAIDC")(js.undefined)
        ret
    }
    @scala.inline
    def with_carrierHRF(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_carrierHRF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_carrierHRF: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_carrierHRF")(js.undefined)
        ret
    }
    @scala.inline
    def with_deviceIdentifier(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_deviceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_deviceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_deviceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def with_entryType(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_entryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_entryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_entryType")(js.undefined)
        ret
    }
    @scala.inline
    def with_issuer(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_issuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_issuer")(js.undefined)
        ret
    }
    @scala.inline
    def with_jurisdiction(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_jurisdiction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_jurisdiction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_jurisdiction")(js.undefined)
        ret
    }
    @scala.inline
    def with_name(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_name")(js.undefined)
        ret
    }
    @scala.inline
    def withCarrierAIDC(value: base64Binary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrierAIDC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarrierAIDC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrierAIDC")(js.undefined)
        ret
    }
    @scala.inline
    def withCarrierHRF(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrierHRF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarrierHRF: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrierHRF")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceIdentifier(value: String): Self = {
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
    def withEntryType(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryType")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuer(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(js.undefined)
        ret
    }
    @scala.inline
    def withJurisdiction(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jurisdiction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJurisdiction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jurisdiction")(js.undefined)
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

