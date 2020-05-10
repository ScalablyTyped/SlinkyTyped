package typingsSlinky.cordovaPluginBleCentral.BLECentralPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeripheralDataExtended extends PeripheralData {
  var characteristics: js.Array[PeripheralCharacteristic] = js.native
  var services: js.Array[String] = js.native
}

object PeripheralDataExtended {
  @scala.inline
  def apply(
    advertising: js.typedarray.ArrayBuffer | js.Any,
    characteristics: js.Array[PeripheralCharacteristic],
    id: String,
    name: String,
    rssi: Double,
    services: js.Array[String]
  ): PeripheralDataExtended = {
    val __obj = js.Dynamic.literal(advertising = advertising.asInstanceOf[js.Any], characteristics = characteristics.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rssi = rssi.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeripheralDataExtended]
  }
  @scala.inline
  implicit class PeripheralDataExtendedOps[Self <: PeripheralDataExtended] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharacteristics(value: js.Array[PeripheralCharacteristic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characteristics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServices(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

