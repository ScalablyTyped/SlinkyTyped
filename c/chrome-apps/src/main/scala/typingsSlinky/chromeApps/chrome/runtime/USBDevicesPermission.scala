package typingsSlinky.chromeApps.chrome.runtime

import typingsSlinky.chromeApps.AnonProductId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait USBDevicesPermission extends Permission {
  var usbDevices: js.Array[AnonProductId] = js.native
}

object USBDevicesPermission {
  @scala.inline
  def apply(usbDevices: js.Array[AnonProductId]): USBDevicesPermission = {
    val __obj = js.Dynamic.literal(usbDevices = usbDevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBDevicesPermission]
  }
  @scala.inline
  implicit class USBDevicesPermissionOps[Self <: USBDevicesPermission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUsbDevices(value: js.Array[AnonProductId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usbDevices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

