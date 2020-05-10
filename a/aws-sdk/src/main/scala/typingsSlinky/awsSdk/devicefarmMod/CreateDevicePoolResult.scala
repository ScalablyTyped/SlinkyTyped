package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDevicePoolResult extends js.Object {
  /**
    * The newly created device pool.
    */
  var devicePool: js.UndefOr[DevicePool] = js.native
}

object CreateDevicePoolResult {
  @scala.inline
  def apply(): CreateDevicePoolResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDevicePoolResult]
  }
  @scala.inline
  implicit class CreateDevicePoolResultOps[Self <: CreateDevicePoolResult] (val x: Self) extends AnyVal {
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

