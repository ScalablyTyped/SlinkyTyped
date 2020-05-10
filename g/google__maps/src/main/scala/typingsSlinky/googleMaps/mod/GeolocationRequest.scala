package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeolocationRequest extends js.Object {
  /** The carrier name. */
  var carrier: js.UndefOr[String] = js.native
  /** An array of cell tower objects. */
  var cellTowers: js.UndefOr[js.Array[CellTower]] = js.native
  /**
    * Specifies whether to fall back to IP geolocation if wifi and cell tower signals are not available.
    * Defaults to `true`. Set `considerIp` to `false` to disable fall back.
    */
  var considerIp: js.UndefOr[Boolean] = js.native
  /** The mobile country code (MCC) for the device's home network. */
  var homeMobileCountryCode: js.UndefOr[Double] = js.native
  /** The mobile network code (MNC) for the device's home network. */
  var homeMobileNetworkCode: js.UndefOr[Double] = js.native
  /** The mobile radio type. While this field is optional, it should be included if a value is available, for more accurate results. */
  var radioType: js.UndefOr[RadioType] = js.native
  /** An array of WiFi access point objects. */
  var wifiAccessPoints: js.UndefOr[js.Array[WifiAccessPoint]] = js.native
}

object GeolocationRequest {
  @scala.inline
  def apply(): GeolocationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeolocationRequest]
  }
  @scala.inline
  implicit class GeolocationRequestOps[Self <: GeolocationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCarrier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarrier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrier")(js.undefined)
        ret
    }
    @scala.inline
    def withCellTowers(value: js.Array[CellTower]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTowers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellTowers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTowers")(js.undefined)
        ret
    }
    @scala.inline
    def withConsiderIp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("considerIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsiderIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("considerIp")(js.undefined)
        ret
    }
    @scala.inline
    def withHomeMobileCountryCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeMobileCountryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeMobileCountryCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeMobileCountryCode")(js.undefined)
        ret
    }
    @scala.inline
    def withHomeMobileNetworkCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeMobileNetworkCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeMobileNetworkCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeMobileNetworkCode")(js.undefined)
        ret
    }
    @scala.inline
    def withRadioType(value: RadioType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadioType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioType")(js.undefined)
        ret
    }
    @scala.inline
    def withWifiAccessPoints(value: js.Array[WifiAccessPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wifiAccessPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWifiAccessPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wifiAccessPoints")(js.undefined)
        ret
    }
  }
  
}

