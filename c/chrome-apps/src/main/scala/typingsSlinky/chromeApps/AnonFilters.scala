package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chrome.usb.DeviceFilterStrict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFilters extends js.Object {
  /**
    * A list of USB device filters matching supported devices.
    * A device only needs to match one of the provided filters.
    * A vendorId is required and only one of productId or interfaceClass may be provided.
    */
  var filters: js.Array[DeviceFilterStrict] = js.native
}

object AnonFilters {
  @scala.inline
  def apply(filters: js.Array[DeviceFilterStrict]): AnonFilters = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilters]
  }
  @scala.inline
  implicit class AnonFiltersOps[Self <: AnonFilters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: js.Array[DeviceFilterStrict]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

