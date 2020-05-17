package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chrome.usb.DeviceFilterStrict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FiltersArray extends js.Object {
  /**
    * A list of USB device filters matching supported devices.
    * A device only needs to match one of the provided filters.
    * A vendorId is required and only one of productId or interfaceClass may be provided.
    */
  var filters: js.Array[DeviceFilterStrict] = js.native
}

object FiltersArray {
  @scala.inline
  def apply(filters: js.Array[DeviceFilterStrict]): FiltersArray = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FiltersArray]
  }
  @scala.inline
  implicit class FiltersArrayOps[Self <: FiltersArray] (val x: Self) extends AnyVal {
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

