package typingsSlinky.reactNativeAudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCurrentTime extends js.Object {
  var currentTime: Double = js.native
}

object AnonCurrentTime {
  @scala.inline
  def apply(currentTime: Double): AnonCurrentTime = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrentTime]
  }
  @scala.inline
  implicit class AnonCurrentTimeOps[Self <: AnonCurrentTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

