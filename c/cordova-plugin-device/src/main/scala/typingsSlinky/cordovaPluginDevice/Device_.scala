package typingsSlinky.cordovaPluginDevice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device_ extends js.Object {
  /** Indicates that Cordova initialize successfully. */
  var available: Boolean = js.native
  /** Get the version of Cordova running on the device. */
  var cordova: String = js.native
  /** Whether the device is running on a simulator. */
  var isVirtual: Boolean = js.native
  /** Get the device's manufacturer. */
  var manufacturer: String = js.native
  /**
    * The device.model returns the name of the device's model or product. The value is set
    * by the device manufacturer and may be different across versions of the same product.
    */
  var model: String = js.native
  /** Get the device's operating system name. */
  var platform: String = js.native
  /** Get the device hardware serial number. */
  var serial: String = js.native
  /** Get the device's Universally Unique Identifier (UUID). */
  var uuid: String = js.native
  /** Get the operating system version. */
  var version: String = js.native
}

object Device_ {
  @scala.inline
  def apply(
    available: Boolean,
    cordova: String,
    isVirtual: Boolean,
    manufacturer: String,
    model: String,
    platform: String,
    serial: String,
    uuid: String,
    version: String
  ): Device_ = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], cordova = cordova.asInstanceOf[js.Any], isVirtual = isVirtual.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device_]
  }
  @scala.inline
  implicit class Device_Ops[Self <: Device_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCordova(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cordova")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVirtual(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVirtual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManufacturer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

