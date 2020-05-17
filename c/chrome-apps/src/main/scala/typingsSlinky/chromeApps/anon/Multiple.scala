package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chrome.usb.DeviceFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Multiple extends js.Object {
  var filters: js.UndefOr[js.Array[DeviceFilter]] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
}

object Multiple {
  @scala.inline
  def apply(): Multiple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Multiple]
  }
  @scala.inline
  implicit class MultipleOps[Self <: Multiple] (val x: Self) extends AnyVal {
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
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
  }
  
}

