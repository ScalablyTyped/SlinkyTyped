package typingsSlinky.riotGamesApi.RiotGamesAPI.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timeline extends js.Object {
  var frameInverval: Double = js.native
  var frames: js.Array[Frame] = js.native
}

object Timeline {
  @scala.inline
  def apply(frameInverval: Double, frames: js.Array[Frame]): Timeline = {
    val __obj = js.Dynamic.literal(frameInverval = frameInverval.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeline]
  }
  @scala.inline
  implicit class TimelineOps[Self <: Timeline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrameInverval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameInverval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrames(value: js.Array[Frame]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

