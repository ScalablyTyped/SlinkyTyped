package typingsSlinky.chromeApps.chrome.usb

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceFilterStrict extends js.Object {
  /** USB interface class, matches any interface on the device. */
  var interfaceClass: js.UndefOr[integer] = js.native
  /** USB interface protocol, checked only if the interface sub-class matches. */
  var interfaceProtocol: js.UndefOr[integer] = js.native
  /** USB interface sub-class, checked only if the interface class matches. */
  var interfaceSubclass: js.UndefOr[integer] = js.native
  /** Device product ID, checked only if the vendor ID matches. */
  var productId: js.UndefOr[integer] = js.native
  /** Device vendor ID. */
  var vendorId: integer = js.native
}

object DeviceFilterStrict {
  @scala.inline
  def apply(vendorId: integer): DeviceFilterStrict = {
    val __obj = js.Dynamic.literal(vendorId = vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceFilterStrict]
  }
  @scala.inline
  implicit class DeviceFilterStrictOps[Self <: DeviceFilterStrict] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVendorId(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterfaceClass(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterfaceClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceClass")(js.undefined)
        ret
    }
    @scala.inline
    def withInterfaceProtocol(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterfaceProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withInterfaceSubclass(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceSubclass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterfaceSubclass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceSubclass")(js.undefined)
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
  }
  
}

