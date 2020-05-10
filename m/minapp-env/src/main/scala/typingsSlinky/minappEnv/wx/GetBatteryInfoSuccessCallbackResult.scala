package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBatteryInfoSuccessCallbackResult extends js.Object {
  /** 是否正在充电中 */
  var isCharging: Boolean = js.native
  /** 设备电量，范围 1 - 100 */
  var level: String = js.native
}

object GetBatteryInfoSuccessCallbackResult {
  @scala.inline
  def apply(isCharging: Boolean, level: String): GetBatteryInfoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(isCharging = isCharging.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBatteryInfoSuccessCallbackResult]
  }
  @scala.inline
  implicit class GetBatteryInfoSuccessCallbackResultOps[Self <: GetBatteryInfoSuccessCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsCharging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCharging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

