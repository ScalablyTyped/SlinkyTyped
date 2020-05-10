package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Device network info.
  */
@js.native
trait SchemaNetworkInfo extends js.Object {
  /**
    * IMEI number of the GSM device. For example, A1000031212.
    */
  var imei: js.UndefOr[String] = js.native
  /**
    * MEID number of the CDMA device. For example, A00000292788E1.
    */
  var meid: js.UndefOr[String] = js.native
  /**
    * Alphabetic name of current registered operator. For example, Vodafone.
    */
  var networkOperatorName: js.UndefOr[String] = js.native
  /**
    * Wi-Fi MAC address of the device. For example, 7c:11:11:11:11:11.
    */
  var wifiMacAddress: js.UndefOr[String] = js.native
}

object SchemaNetworkInfo {
  @scala.inline
  def apply(): SchemaNetworkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkInfo]
  }
  @scala.inline
  implicit class SchemaNetworkInfoOps[Self <: SchemaNetworkInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImei(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imei")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImei: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imei")(js.undefined)
        ret
    }
    @scala.inline
    def withMeid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meid")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkOperatorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkOperatorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkOperatorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkOperatorName")(js.undefined)
        ret
    }
    @scala.inline
    def withWifiMacAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wifiMacAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWifiMacAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wifiMacAddress")(js.undefined)
        ret
    }
  }
  
}

