package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceSelectionResult extends js.Object {
  /**
    * The filters in a device selection result.
    */
  var filters: js.UndefOr[DeviceFilters] = js.native
  /**
    * The number of devices that matched the device filter selection criteria.
    */
  var matchedDevicesCount: js.UndefOr[Integer] = js.native
  /**
    * The maximum number of devices to be selected by a device filter and included in a test run.
    */
  var maxDevices: js.UndefOr[Integer] = js.native
}

object DeviceSelectionResult {
  @scala.inline
  def apply(): DeviceSelectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceSelectionResult]
  }
  @scala.inline
  implicit class DeviceSelectionResultOps[Self <: DeviceSelectionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: DeviceFilters): Self = {
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
    def withMatchedDevicesCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchedDevicesCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchedDevicesCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchedDevicesCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDevices(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDevices")(js.undefined)
        ret
    }
  }
  
}

