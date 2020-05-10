package typingsSlinky.appletvjs.AppleTVJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
  /** The unique identifier for the app. */
  var appIdentifier: String = js.native
  /** The current app version. */
  var appVersion: String = js.native
  /** A string that identifies the device model. */
  var model: String = js.native
  /** The version of the product installed on the device. */
  var productType: String = js.native
  /** The operating system on the device. */
  var systemVersion: String = js.native
  /** The UUID of the device. */
  var vendorIdentifier: String = js.native
}

object Device {
  @scala.inline
  def apply(
    appIdentifier: String,
    appVersion: String,
    model: String,
    productType: String,
    systemVersion: String,
    vendorIdentifier: String
  ): Device = {
    val __obj = js.Dynamic.literal(appIdentifier = appIdentifier.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], productType = productType.asInstanceOf[js.Any], systemVersion = systemVersion.asInstanceOf[js.Any], vendorIdentifier = vendorIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVendorIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

