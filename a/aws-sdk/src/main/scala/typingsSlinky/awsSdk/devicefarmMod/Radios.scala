package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Radios extends js.Object {
  /**
    * True if Bluetooth is enabled at the beginning of the test. Otherwise, false.
    */
  var bluetooth: js.UndefOr[Boolean] = js.native
  /**
    * True if GPS is enabled at the beginning of the test. Otherwise, false.
    */
  var gps: js.UndefOr[Boolean] = js.native
  /**
    * True if NFC is enabled at the beginning of the test. Otherwise, false.
    */
  var nfc: js.UndefOr[Boolean] = js.native
  /**
    * True if Wi-Fi is enabled at the beginning of the test. Otherwise, false.
    */
  var wifi: js.UndefOr[Boolean] = js.native
}

object Radios {
  @scala.inline
  def apply(): Radios = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Radios]
  }
  @scala.inline
  implicit class RadiosOps[Self <: Radios] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBluetooth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluetooth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBluetooth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluetooth")(js.undefined)
        ret
    }
    @scala.inline
    def withGps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gps")(js.undefined)
        ret
    }
    @scala.inline
    def withNfc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nfc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNfc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nfc")(js.undefined)
        ret
    }
    @scala.inline
    def withWifi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wifi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWifi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wifi")(js.undefined)
        ret
    }
  }
  
}

