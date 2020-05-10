package typingsSlinky.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceValidity extends js.Object {
  /** The descriptor of the device for which the validity check was requested. It will always be present. */
  var deviceDesc: js.UndefOr[DeviceDescriptor] = js.native
  /** The validity status: true if the device is valid for operation, false otherwise. It will always be present. */
  var isValid: js.UndefOr[Boolean] = js.native
  /**
    * If the device identifier is not valid, the database may include a reason. The reason may be in any language. The length of the value should not exceed
    * 128 characters.
    */
  var reason: js.UndefOr[String] = js.native
}

object DeviceValidity {
  @scala.inline
  def apply(): DeviceValidity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceValidity]
  }
  @scala.inline
  implicit class DeviceValidityOps[Self <: DeviceValidity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceDesc(value: DeviceDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceDesc")(js.undefined)
        ret
    }
    @scala.inline
    def withIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
  }
  
}

