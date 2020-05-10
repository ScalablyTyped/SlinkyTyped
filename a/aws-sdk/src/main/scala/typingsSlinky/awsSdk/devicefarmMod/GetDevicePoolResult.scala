package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDevicePoolResult extends js.Object {
  /**
    * An object that contains information about the requested device pool.
    */
  var devicePool: js.UndefOr[DevicePool] = js.native
}

object GetDevicePoolResult {
  @scala.inline
  def apply(): GetDevicePoolResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDevicePoolResult]
  }
  @scala.inline
  implicit class GetDevicePoolResultOps[Self <: GetDevicePoolResult] (val x: Self) extends AnyVal {
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

