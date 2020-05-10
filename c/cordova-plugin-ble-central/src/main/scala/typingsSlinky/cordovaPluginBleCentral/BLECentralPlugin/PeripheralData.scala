package typingsSlinky.cordovaPluginBleCentral.BLECentralPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeripheralData extends js.Object {
  var advertising: js.typedarray.ArrayBuffer | js.Any = js.native
  var id: String = js.native
  var name: String = js.native
  var rssi: Double = js.native
}

object PeripheralData {
  @scala.inline
  def apply(advertising: js.typedarray.ArrayBuffer | js.Any, id: String, name: String, rssi: Double): PeripheralData = {
    val __obj = js.Dynamic.literal(advertising = advertising.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rssi = rssi.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeripheralData]
  }
  @scala.inline
  implicit class PeripheralDataOps[Self <: PeripheralData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvertisingArrayBuffer(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertising")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdvertising(value: js.typedarray.ArrayBuffer | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertising")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRssi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rssi")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

