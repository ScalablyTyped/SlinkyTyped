package typingsSlinky.nobleMac.mod

import typingsSlinky.nobleMac.AnonData
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Advertisement extends js.Object {
  var localName: String = js.native
  var manufacturerData: Buffer = js.native
  var serviceData: AnonData = js.native
  var serviceUuids: js.Array[String] = js.native
  var txPowerLevel: Double = js.native
}

object Advertisement {
  @scala.inline
  def apply(
    localName: String,
    manufacturerData: Buffer,
    serviceData: AnonData,
    serviceUuids: js.Array[String],
    txPowerLevel: Double
  ): Advertisement = {
    val __obj = js.Dynamic.literal(localName = localName.asInstanceOf[js.Any], manufacturerData = manufacturerData.asInstanceOf[js.Any], serviceData = serviceData.asInstanceOf[js.Any], serviceUuids = serviceUuids.asInstanceOf[js.Any], txPowerLevel = txPowerLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Advertisement]
  }
  @scala.inline
  implicit class AdvertisementOps[Self <: Advertisement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManufacturerData(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturerData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceData(value: AnonData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceUuids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceUuids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTxPowerLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txPowerLevel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

