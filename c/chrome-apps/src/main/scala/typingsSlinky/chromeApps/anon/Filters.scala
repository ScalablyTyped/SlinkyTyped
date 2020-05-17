package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chrome.usb.DeviceFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filters extends js.Object {
  var filters: js.UndefOr[js.Array[DeviceFilter]] = js.native
}

object Filters {
  @scala.inline
  def apply(): Filters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filters]
  }
  @scala.inline
  implicit class FiltersOps[Self <: Filters] (val x: Self) extends AnyVal {
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
  }
  
}

