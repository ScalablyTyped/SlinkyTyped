package typingsSlinky.chromeApps.chrome.hid

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HidDeviceInfo extends js.Object {
  /**
    * Top-level collections from this device's report descriptors.
    */
  var collections: js.Array[Collection] = js.native
  /** Opaque device ID. */
  var deviceId: integer = js.native
  /** Top-level collection's maximum feature report size. */
  var maxFeatureReportSize: integer = js.native
  /** Top-level collection's maximum input report size. */
  var maxInputReportSize: integer = js.native
  /** Top-level collection's maximum output report size. */
  var maxOutputReportSize: integer = js.native
  /** Product ID. */
  var productId: integer = js.native
  /**
    * The product name read from the device, if available.
    * @since Chrome 46
    * */
  var productName: String = js.native
  /**
    * Raw device report descriptor (not available on Windows).
    * @since Chrome 42
    * */
  var reportDescriptor: js.typedarray.ArrayBuffer = js.native
  /**
    * The serial number read from the device, if available.
    * @since Chrome 46
    */
  var serialNumber: String = js.native
  /** Vendor ID. */
  var vendorId: integer = js.native
}

object HidDeviceInfo {
  @scala.inline
  def apply(
    collections: js.Array[Collection],
    deviceId: integer,
    maxFeatureReportSize: integer,
    maxInputReportSize: integer,
    maxOutputReportSize: integer,
    productId: integer,
    productName: String,
    reportDescriptor: js.typedarray.ArrayBuffer,
    serialNumber: String,
    vendorId: integer
  ): HidDeviceInfo = {
    val __obj = js.Dynamic.literal(collections = collections.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], maxFeatureReportSize = maxFeatureReportSize.asInstanceOf[js.Any], maxInputReportSize = maxInputReportSize.asInstanceOf[js.Any], maxOutputReportSize = maxOutputReportSize.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], productName = productName.asInstanceOf[js.Any], reportDescriptor = reportDescriptor.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HidDeviceInfo]
  }
  @scala.inline
  implicit class HidDeviceInfoOps[Self <: HidDeviceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollections(value: js.Array[Collection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceId(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxFeatureReportSize(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFeatureReportSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxInputReportSize(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInputReportSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxOutputReportSize(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOutputReportSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductId(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReportDescriptor(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerialNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVendorId(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

