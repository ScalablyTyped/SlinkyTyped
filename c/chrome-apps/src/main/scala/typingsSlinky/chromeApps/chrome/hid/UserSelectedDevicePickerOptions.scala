package typingsSlinky.chromeApps.chrome.hid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserSelectedDevicePickerOptions extends js.Object {
  /**
    * Filter the list of devices presented to the user.
    * If multiple filters are provided devices matching any filter will be displayed.
    */
  var filters: js.UndefOr[js.Array[DeviceFilter]] = js.native
  /**
    * Allow the user to select multiple devices.
    */
  var multiple: js.UndefOr[Boolean] = js.native
}

object UserSelectedDevicePickerOptions {
  @scala.inline
  def apply(): UserSelectedDevicePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSelectedDevicePickerOptions]
  }
  @scala.inline
  implicit class UserSelectedDevicePickerOptionsOps[Self <: UserSelectedDevicePickerOptions] (val x: Self) extends AnyVal {
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

