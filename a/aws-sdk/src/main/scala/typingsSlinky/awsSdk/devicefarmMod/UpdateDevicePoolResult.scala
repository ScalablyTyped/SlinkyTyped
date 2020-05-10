package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDevicePoolResult extends js.Object {
  /**
    * The device pool you just updated.
    */
  var devicePool: js.UndefOr[DevicePool] = js.native
}

object UpdateDevicePoolResult {
  @scala.inline
  def apply(): UpdateDevicePoolResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDevicePoolResult]
  }
  @scala.inline
  implicit class UpdateDevicePoolResultOps[Self <: UpdateDevicePoolResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevicePool(value: DevicePool): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicePool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevicePool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicePool")(js.undefined)
        ret
    }
  }
  
}

