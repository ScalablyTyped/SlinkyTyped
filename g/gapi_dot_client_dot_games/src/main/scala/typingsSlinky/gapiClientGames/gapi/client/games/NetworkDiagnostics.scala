package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkDiagnostics extends js.Object {
  /** The Android network subtype. */
  var androidNetworkSubtype: js.UndefOr[Double] = js.native
  /** The Android network type. */
  var androidNetworkType: js.UndefOr[Double] = js.native
  /** iOS network type as defined in Reachability.h. */
  var iosNetworkType: js.UndefOr[Double] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#networkDiagnostics. */
  var kind: js.UndefOr[String] = js.native
  /**
    * The MCC+MNC code for the client's network connection. On Android:
    * http://developer.android.com/reference/android/telephony/TelephonyManager.html#getNetworkOperator() On iOS, see:
    * https://developer.apple.com/library/ios/documentation/NetworkingInternet/Reference/CTCarrier/Reference/Reference.html
    */
  var networkOperatorCode: js.UndefOr[String] = js.native
  /**
    * The name of the carrier of the client's network connection. On Android:
    * http://developer.android.com/reference/android/telephony/TelephonyManager.html#getNetworkOperatorName() On iOS:
    * https://developer.apple.com/library/ios/documentation/NetworkingInternet/Reference/CTCarrier/Reference/Reference.html#//apple_ref/occ/instp/CTCarrier/carrierName
    */
  var networkOperatorName: js.UndefOr[String] = js.native
  /** The amount of time in milliseconds it took for the client to establish a connection with the XMPP server. */
  var registrationLatencyMillis: js.UndefOr[Double] = js.native
}

object NetworkDiagnostics {
  @scala.inline
  def apply(): NetworkDiagnostics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkDiagnostics]
  }
  @scala.inline
  implicit class NetworkDiagnosticsOps[Self <: NetworkDiagnostics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidNetworkSubtype(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidNetworkSubtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidNetworkSubtype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidNetworkSubtype")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidNetworkType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidNetworkType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidNetworkType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidNetworkType")(js.undefined)
        ret
    }
    @scala.inline
    def withIosNetworkType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosNetworkType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosNetworkType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosNetworkType")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkOperatorCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkOperatorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkOperatorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkOperatorCode")(js.undefined)
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
    def withRegistrationLatencyMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationLatencyMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistrationLatencyMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationLatencyMillis")(js.undefined)
        ret
    }
  }
  
}

