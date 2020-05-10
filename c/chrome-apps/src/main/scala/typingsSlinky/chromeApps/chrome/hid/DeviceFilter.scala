package typingsSlinky.chromeApps.chrome.hid

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since Chrome 39. */
@js.native
trait DeviceFilter extends js.Object {
  /** Device product ID, only checked only if the vendor ID matches. */
  var productId: js.UndefOr[integer] = js.native
  /** HID usage identifier, checked only if the HID usage page matches. */
  var usage: js.UndefOr[integer] = js.native
  /** HID usage page identifier. */
  var usagePage: js.UndefOr[integer] = js.native
  /** Device vendor ID. */
  var vendorId: js.UndefOr[integer] = js.native
}

object DeviceFilter {
  @scala.inline
  def apply(): DeviceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceFilter]
  }
  @scala.inline
  implicit class DeviceFilterOps[Self <: DeviceFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withUsage(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(js.undefined)
        ret
    }
    @scala.inline
    def withUsagePage(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usagePage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsagePage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usagePage")(js.undefined)
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
  }
  
}

