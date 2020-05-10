package typingsSlinky.ibmMobilefirst.WL.Device

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInfo extends js.Object {
  var Ipv4Addresses: js.UndefOr[js.Array[AddressPair]] = js.native
  var Ipv6Addresses: js.UndefOr[js.Array[AddressPair]] = js.native
  var carrierName: js.UndefOr[String] = js.native
  var ipAddress: js.UndefOr[String] = js.native
  var isAirplaneMode: js.UndefOr[Boolean] = js.native
  var isNetworkConnected: js.UndefOr[Boolean] = js.native
  var isRoaming: js.UndefOr[Boolean] = js.native
  var networkConnectionType: js.UndefOr[String] = js.native
  var telephonyNetworkType: js.UndefOr[String] = js.native
  var wifiName: js.UndefOr[String] = js.native
}

object NetworkInfo {
  @scala.inline
  def apply(): NetworkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInfo]
  }
  @scala.inline
  implicit class NetworkInfoOps[Self <: NetworkInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIpv4Addresses(value: js.Array[AddressPair]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv4Addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv4Addresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv4Addresses")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6Addresses(value: js.Array[AddressPair]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6Addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6Addresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6Addresses")(js.undefined)
        ret
    }
    @scala.inline
    def withCarrierName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrierName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarrierName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrierName")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAirplaneMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAirplaneMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAirplaneMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAirplaneMode")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNetworkConnected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNetworkConnected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNetworkConnected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNetworkConnected")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRoaming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRoaming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRoaming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRoaming")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkConnectionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkConnectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkConnectionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkConnectionType")(js.undefined)
        ret
    }
    @scala.inline
    def withTelephonyNetworkType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telephonyNetworkType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTelephonyNetworkType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telephonyNetworkType")(js.undefined)
        ret
    }
    @scala.inline
    def withWifiName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wifiName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWifiName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wifiName")(js.undefined)
        ret
    }
  }
  
}

