package typingsSlinky.chromeApps.chrome.networking.onc

import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chromeAppsStrings.CDMA
import typingsSlinky.chromeApps.chromeAppsStrings.GSM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellularProperties[M /* <: ManagedObject */] extends CellularBase {
  /** The cellular network activation type. */
  var ActivationType: js.UndefOr[String] = js.native
  /** Whether roaming is allowed for the network. */
  var AllowRoaming: js.UndefOr[Boolean] = js.native
  /** Whether the cellular network should be connected automatically (when in range). */
  var AutoConnect: js.UndefOr[Boolean | ManagedBoolean] = js.native
  /** The name of the carrier for which the cellular device is configured. */
  var Carrier: js.UndefOr[String | ManagedDOMString] = js.native
  /** Cellular device technology family - CDMA or GSM. */
  var Family: js.UndefOr[CDMA | GSM] = js.native
  /** The firmware revision loaded in the cellular modem. */
  var FirmwareRevision: js.UndefOr[String] = js.native
  /** The list of networks found during the most recent network scan. */
  var FoundNetworks: js.UndefOr[js.Array[FoundNetworkProperties]] = js.native
  /** The cellular modem hardware revision. */
  var HardwareRevision: js.UndefOr[String] = js.native
  /** Information about the operator that issued the SIM card currently installed in the modem. */
  var HomeProvider: js.UndefOr[CellularProviderProperties] = js.native
  /** The cellular modem manufacturer. */
  var MAnufacturer: js.UndefOr[String] = js.native
  /** The cellular modem model ID. */
  var ModelID: js.UndefOr[String] = js.native
  /** The revision of the Preferred Roaming List loaded in the modem. */
  var PRLVersion: js.UndefOr[integer] = js.native
  /** Online payment portal a user can use to sign-up for or modify a mobile data plan. */
  var PaymentPortal: js.UndefOr[typingsSlinky.chromeApps.chrome.networking.onc.PaymentPortal | PaymentPortalPost] = js.native
  /** The state of SIM lock for GSM family networks. */
  var SIMLockStatus: js.UndefOr[typingsSlinky.chromeApps.chrome.networking.onc.SIMLockStatus] = js.native
  /**
    * @since Chrome 63.
    * True when a cellular network scan is in progress.
    */
  var Scanning: js.UndefOr[Boolean] = js.native
  /** Information about the operator on whose network the modem is currently registered. */
  var ServingOperator: js.UndefOr[CellularProviderProperties] = js.native
  /** Whether the cellular network supports scanning. */
  var SupportNetworkScan: js.UndefOr[Boolean] = js.native
  /** A list of supported carriers. */
  var SupportedCarriers: js.UndefOr[js.Array[String]] = js.native
}

object CellularProperties {
  @scala.inline
  def apply[M](): CellularProperties[M] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellularProperties[M]]
  }
  @scala.inline
  implicit class CellularPropertiesOps[Self[m] <: CellularProperties[m], M] (val x: Self[M]) extends AnyVal {
    @scala.inline
    def duplicate: Self[M] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[M]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[M] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[M] with Other]
    @scala.inline
    def withActivationType(value: String): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivationType: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivationType")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowRoaming(value: Boolean): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowRoaming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowRoaming: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowRoaming")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoConnect(value: Boolean | ManagedBoolean): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoConnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoConnect: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withCarrier(value: String | ManagedDOMString): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Carrier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarrier: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Carrier")(js.undefined)
        ret
    }
    @scala.inline
    def withFamily(value: CDMA | GSM): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamily: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Family")(js.undefined)
        ret
    }
    @scala.inline
    def withFirmwareRevision(value: String): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirmwareRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirmwareRevision: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirmwareRevision")(js.undefined)
        ret
    }
    @scala.inline
    def withFoundNetworks(value: js.Array[FoundNetworkProperties]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FoundNetworks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFoundNetworks: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FoundNetworks")(js.undefined)
        ret
    }
    @scala.inline
    def withHardwareRevision(value: String): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HardwareRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHardwareRevision: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HardwareRevision")(js.undefined)
        ret
    }
    @scala.inline
    def withHomeProvider(value: CellularProviderProperties): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeProvider: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withMAnufacturer(value: String): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAnufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMAnufacturer: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAnufacturer")(js.undefined)
        ret
    }
    @scala.inline
    def withModelID(value: String): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelID: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelID")(js.undefined)
        ret
    }
    @scala.inline
    def withPRLVersion(value: integer): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PRLVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPRLVersion: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PRLVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentPortal(value: PaymentPortal | PaymentPortalPost): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaymentPortal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentPortal: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaymentPortal")(js.undefined)
        ret
    }
    @scala.inline
    def withSIMLockStatus(value: SIMLockStatus): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIMLockStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSIMLockStatus: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIMLockStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withScanning(value: Boolean): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scanning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScanning: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scanning")(js.undefined)
        ret
    }
    @scala.inline
    def withServingOperator(value: CellularProviderProperties): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServingOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServingOperator: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServingOperator")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportNetworkScan(value: Boolean): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportNetworkScan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportNetworkScan: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportNetworkScan")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedCarriers(value: js.Array[String]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedCarriers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedCarriers: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedCarriers")(js.undefined)
        ret
    }
  }
  
}

