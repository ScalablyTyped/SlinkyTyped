package typingsSlinky.reactNativeAudio.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentTime extends js.Object {
  var currentTime: Double = js.native
}

object CurrentTime {
  @scala.inline
  def apply(currentTime: Double): CurrentTime = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentTime]
  }
  @scala.inline
  implicit class CurrentTimeOps[Self <: CurrentTime] (val x: Self) extends AnyVal {
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

