package typingsSlinky.chromeApps.chrome.bluetoothLowEnergy

import typingsSlinky.chromeApps.AnonData
import typingsSlinky.chromeApps.AnonUuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Advertisement extends js.Object {
  /** List of manufacturer specific data to be included in 'Manufacturer Specific Data' fields of the advertising data. */
  var manufacturerData: js.UndefOr[AnonData] = js.native
  /** List of service data to be included in 'Service Data' fields of the advertising data. */
  var serviceData: AnonUuid = js.native
  /** List of UUIDs to include in the 'Service UUIDs' field of the Advertising Data. These UUIDs can be of the 16bit, 32bit or 128 formats. */
  var serviceUuids: js.UndefOr[js.Array[String]] = js.native
  /** List of UUIDs to include in the 'Solicit UUIDs' field of the Advertising Data. These UUIDs can be of the 16bit, 32bit or 128 formats. */
  var solicitUuids: js.UndefOr[js.Array[String]] = js.native
  /** Type of advertisement. */
  var `type`: AdvertisementType = js.native
}

object Advertisement {
  @scala.inline
  def apply(serviceData: AnonUuid, `type`: AdvertisementType): Advertisement = {
    val __obj = js.Dynamic.literal(serviceData = serviceData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Advertisement]
  }
  @scala.inline
  implicit class AdvertisementOps[Self <: Advertisement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceData(value: AnonUuid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: AdvertisementType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManufacturerData(value: AnonData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturerData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManufacturerData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturerData")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceUuids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceUuids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceUuids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceUuids")(js.undefined)
        ret
    }
    @scala.inline
    def withSolicitUuids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solicitUuids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolicitUuids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solicitUuids")(js.undefined)
        ret
    }
  }
  
}

