package typingsSlinky.chromeApps.chrome.hid

import typingsSlinky.chromeApps.chrome.deprecated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceOptions extends js.Object {
  /**
    * A device matching any given filter will be returned.
    * An empty filter list will return all devices the app has permission for.
    * @since Chrome 39
    */
  var filters: js.UndefOr[js.Array[DeviceFilter]] = js.native
  /**
    * Equivalent to setting DeviceFilter.productId.
    * @deprecated Deprecated since Chrome 39.
    */
  var productId: js.UndefOr[deprecated] = js.native
  /**
    * Equivalent to setting DeviceFilter.vendorId.
    * @deprecated Deprecated since Chrome 39
    */
  var vendorId: js.UndefOr[deprecated] = js.native
}

object DeviceOptions {
  @scala.inline
  def apply(): DeviceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceOptions]
  }
  @scala.inline
  implicit class DeviceOptionsOps[Self <: DeviceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: js.Array[DeviceFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withProductId(value: deprecated): Self = {
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
    def withVendorId(value: deprecated): Self = {
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

