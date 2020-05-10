package typingsSlinky.gapiClientCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceConfig extends js.Object {
  /** The device configuration data. */
  var binaryData: js.UndefOr[String] = js.native
  /**
    * [Output only] The time at which this configuration version was updated in
    * Cloud IoT Core. This timestamp is set by the server.
    */
  var cloudUpdateTime: js.UndefOr[String] = js.native
  /**
    * [Output only] The time at which Cloud IoT Core received the
    * acknowledgment from the device, indicating that the device has received
    * this configuration version. If this field is not present, the device has
    * not yet acknowledged that it received this version. Note that when
    * the config was sent to the device, many config versions may have been
    * available in Cloud IoT Core while the device was disconnected, and on
    * connection, only the latest version is sent to the device. Some
    * versions may never be sent to the device, and therefore are never
    * acknowledged. This timestamp is set by Cloud IoT Core.
    */
  var deviceAckTime: js.UndefOr[String] = js.native
  /**
    * [Output only] The version of this update. The version number is assigned by
    * the server, and is always greater than 0 after device creation. The
    * version must be 0 on the `CreateDevice` request if a `config` is
    * specified; the response of `CreateDevice` will always have a value of 1.
    */
  var version: js.UndefOr[String] = js.native
}

object DeviceConfig {
  @scala.inline
  def apply(): DeviceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceConfig]
  }
  @scala.inline
  implicit class DeviceConfigOps[Self <: DeviceConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinaryData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinaryData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryData")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudUpdateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudUpdateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceAckTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceAckTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceAckTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceAckTime")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

