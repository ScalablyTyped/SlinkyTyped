package typingsSlinky.chromeApps.chrome.bluetooth

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Some criteria to filter the list of returned bluetooth devices. If the filter is not set or set to {}, returned device list will contain all bluetooth devices. Right now this is only supported in ChromeOS, for other platforms, a full list is returned.
  */
@js.native
trait DeviceFilter extends js.Object {
  /** Type of filter to apply to the device list. Default is all. */
  var filterType: js.UndefOr[DeviceFilterType] = js.native
  /** Maximum number of bluetoth devices to return. Default is 0 (no limit) if unspecified. */
  var limit: js.UndefOr[integer] = js.native
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
    def withFilterType(value: DeviceFilterType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
  }
  
}

