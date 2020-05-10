package typingsSlinky.cordovaPluginDeviceName.CordovaPluginDeviceName

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CordovaPluginDeviceName extends js.Object {
  /**
    * User-friendly name of the device.
    * @example cordova.plugins.deviceName.name // e.g: Larry's Android
    */
  var name: String = js.native
}

object CordovaPluginDeviceName {
  @scala.inline
  def apply(name: String): CordovaPluginDeviceName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPluginDeviceName]
  }
  @scala.inline
  implicit class CordovaPluginDeviceNameOps[Self <: typingsSlinky.cordovaPluginDeviceName.CordovaPluginDeviceName.CordovaPluginDeviceName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

