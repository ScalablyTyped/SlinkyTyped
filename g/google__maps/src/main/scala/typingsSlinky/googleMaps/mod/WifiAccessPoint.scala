package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WifiAccessPoint extends js.Object {
  /** The number of milliseconds since this access point was detected. */
  var age: js.UndefOr[Double] = js.native
  /** The channel over which the client is communicating with the acces. */
  var channel: js.UndefOr[Double] = js.native
  /** The MAC address of the WiFi node. It's typically called a BSS, BSSID or MAC address. Separators must be `:` (colon). */
  var macAddress: String = js.native
  /** The current signal strength measured in dBm. */
  var signalStrength: js.UndefOr[Double] = js.native
  /** The current signal to noise ratio measured in dB. */
  var signalToNoiseRatio: js.UndefOr[Double] = js.native
}

object WifiAccessPoint {
  @scala.inline
  def apply(macAddress: String): WifiAccessPoint = {
    val __obj = js.Dynamic.literal(macAddress = macAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[WifiAccessPoint]
  }
  @scala.inline
  implicit class WifiAccessPointOps[Self <: WifiAccessPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMacAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("age")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("age")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(js.undefined)
        ret
    }
    @scala.inline
    def withSignalStrength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalStrength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignalStrength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalStrength")(js.undefined)
        ret
    }
    @scala.inline
    def withSignalToNoiseRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalToNoiseRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignalToNoiseRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalToNoiseRatio")(js.undefined)
        ret
    }
  }
  
}

