package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBeaconUpdateCallbackResult extends js.Object {
  /** 当前搜寻到的所有 iBeacon 设备列表 */
  var beacons: Array[IBeaconInfo] = js.native
}

object OnBeaconUpdateCallbackResult {
  @scala.inline
  def apply(beacons: Array[IBeaconInfo]): OnBeaconUpdateCallbackResult = {
    val __obj = js.Dynamic.literal(beacons = beacons.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeaconUpdateCallbackResult]
  }
  @scala.inline
  implicit class OnBeaconUpdateCallbackResultOps[Self <: OnBeaconUpdateCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeacons(value: Array[IBeaconInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beacons")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

