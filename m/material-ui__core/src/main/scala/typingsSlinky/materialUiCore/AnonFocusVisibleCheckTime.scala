package typingsSlinky.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFocusVisibleCheckTime extends js.Object {
  var focusVisibleCheckTime: Double = js.native
  var focusVisibleMaxCheckTimes: Double = js.native
  var focusVisibleTimeout: js.Any = js.native
}

object AnonFocusVisibleCheckTime {
  @scala.inline
  def apply(focusVisibleCheckTime: Double, focusVisibleMaxCheckTimes: Double, focusVisibleTimeout: js.Any): AnonFocusVisibleCheckTime = {
    val __obj = js.Dynamic.literal(focusVisibleCheckTime = focusVisibleCheckTime.asInstanceOf[js.Any], focusVisibleMaxCheckTimes = focusVisibleMaxCheckTimes.asInstanceOf[js.Any], focusVisibleTimeout = focusVisibleTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFocusVisibleCheckTime]
  }
  @scala.inline
  implicit class AnonFocusVisibleCheckTimeOps[Self <: AnonFocusVisibleCheckTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocusVisibleCheckTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusVisibleCheckTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusVisibleMaxCheckTimes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusVisibleMaxCheckTimes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusVisibleTimeout(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusVisibleTimeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

