package typingsSlinky.athenajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimOptions extends js.Object {
  var frameDuration: Double = js.native
  var frameHeight: Double = js.native
  var frameSpacing: js.UndefOr[Double] = js.native
  var frameWidth: Double = js.native
  var numFrames: Double = js.native
  var offsetX: js.UndefOr[Double] = js.native
  var offsetY: js.UndefOr[Double] = js.native
}

object AnimOptions {
  @scala.inline
  def apply(frameDuration: Double, frameHeight: Double, frameWidth: Double, numFrames: Double): AnimOptions = {
    val __obj = js.Dynamic.literal(frameDuration = frameDuration.asInstanceOf[js.Any], frameHeight = frameHeight.asInstanceOf[js.Any], frameWidth = frameWidth.asInstanceOf[js.Any], numFrames = numFrames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimOptions]
  }
  @scala.inline
  implicit class AnimOptionsOps[Self <: AnimOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrameDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumFrames(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(js.undefined)
        ret
    }
  }
  
}

