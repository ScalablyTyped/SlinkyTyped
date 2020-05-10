package typingsSlinky.chromeApps.chrome.bluetooth

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
  /** The address of the device, in the format 'XX:XX:XX:XX:XX:XX'. */
  var address: String = js.native
  /**
    * Indicates whether the device is connectable.
    * @since Chrome 48
    */
  var connectable: js.UndefOr[Boolean] = js.native
  /** Indicates whether the device is currently connected to the system. */
  var connected: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the device is currently connecting to the system.
    * @since Chrome 48
    */
  var connecting: js.UndefOr[Boolean] = js.native
  /** The class of the device, a bit-field defined by http://www.bluetooth.org/en-us/specification/assigned-numbers/baseband. */
  var deviceClass: js.UndefOr[integer] = js.native
  var deviceId: js.UndefOr[integer] = js.native
  /**
    * The received signal strength, in dBm. This field is avaliable and valid only during discovery. Outside of discovery it's value is not specified.
    * @since Chrome 44
    */
  var inquiryRssi: integer = js.native
  /**
    * The transmitted power level. This field is avaliable only for LE devices that include this field in AD. It is avaliable and valid only during discovery.
    * @since Chrome 44
    */
  var inquiryTxPower: integer = js.native
  /** The human-readable name of the device. */
  var name: js.UndefOr[String] = js.native
  /** Indicates whether or not the device is paired with the system. */
  var paired: js.UndefOr[Boolean] = js.native
  var productId: js.UndefOr[integer] = js.native
  /**
    * The type of the device, if recognized by Chrome.
    * This is obtained from the |deviceClass| field and only represents a small fraction of the possible device types.
    * When in doubt you should use the |deviceClass| field directly.
    */
  var `type`: js.UndefOr[DeviceType] = js.native
  /**
    * UUIDs of protocols, profiles and services advertised by the device.
    * For classic Bluetooth devices, this list is obtained from EIR data and SDP tables.
    * For Low Energy devices, this list is obtained from AD and GATT primary services.
    * For dual mode devices this may be obtained from both.
    */
  var uuids: js.UndefOr[js.Array[String]] = js.native
  var vendorId: js.UndefOr[integer] = js.native
  /** The Device ID record of the device, where available. */
  var vendorIdSource: js.UndefOr[DeviceVendorIdSource] = js.native
}

object Device {
  @scala.inline
  def apply(address: String, inquiryRssi: integer, inquiryTxPower: integer): Device = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], inquiryRssi = inquiryRssi.asInstanceOf[js.Any], inquiryTxPower = inquiryTxPower.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInquiryRssi(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inquiryRssi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInquiryTxPower(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inquiryTxPower")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectable")(js.undefined)
        ret
    }
    @scala.inline
    def withConnected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected")(js.undefined)
        ret
    }
    @scala.inline
    def withConnecting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connecting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnecting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connecting")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceClass(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceId(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPaired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paired")(js.undefined)
        ret
    }
    @scala.inline
    def withProductId(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: DeviceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUuids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUuids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuids")(js.undefined)
        ret
    }
    @scala.inline
    def withVendorId(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVendorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorId")(js.undefined)
        ret
    }
    @scala.inline
    def withVendorIdSource(value: DeviceVendorIdSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorIdSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVendorIdSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorIdSource")(js.undefined)
        ret
    }
  }
  
}

