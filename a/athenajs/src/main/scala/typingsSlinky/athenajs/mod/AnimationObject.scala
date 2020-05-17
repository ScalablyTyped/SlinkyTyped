package typingsSlinky.athenajs.mod

import typingsSlinky.athenajs.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationObject extends js.Object {
  var frameDuration: js.UndefOr[Double] = js.native
  var frames: js.Array[Height] = js.native
  var loop: js.UndefOr[Double] = js.native
  var speed: js.UndefOr[Double] = js.native
}

object AnimationObject {
  @scala.inline
  def apply(frames: js.Array[Height]): AnimationObject = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationObject]
  }
  @scala.inline
  implicit class AnimationObjectOps[Self <: AnimationObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrames(value: js.Array[Height]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
  }
  
}

