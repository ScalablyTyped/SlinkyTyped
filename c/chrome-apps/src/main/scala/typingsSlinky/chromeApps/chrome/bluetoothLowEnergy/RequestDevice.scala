package typingsSlinky.chromeApps.chrome.bluetoothLowEnergy

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestDevice extends js.Object {
  /** The address of the device, in the format 'XX:XX:XX:XX:XX:XX'. */
  var address: String = js.native
  /** The class of the device, a bit - field defined by:
    * @see [Specs]{@link http://www.bluetooth.org/en-us/specification/assigned-numbers/baseband}
    **/
  var deviceClass: js.UndefOr[integer] = js.native
  /** The human-readable name of the device. */
  var name: js.UndefOr[String] = js.native
}

object RequestDevice {
  @scala.inline
  def apply(address: String): RequestDevice = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDevice]
  }
  @scala.inline
  implicit class RequestDeviceOps[Self <: RequestDevice] (val x: Self) extends AnyVal {
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
  }
  
}

