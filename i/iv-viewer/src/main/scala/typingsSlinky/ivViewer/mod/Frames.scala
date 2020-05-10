package typingsSlinky.ivViewer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frames extends js.Object {
  var slideMomentumCheck: js.UndefOr[Double] = js.native
  var sliderMomentumFrame: js.UndefOr[Double] = js.native
  var snapViewTimeout: js.UndefOr[Double] = js.native
  var zoomFrame: js.UndefOr[Double] = js.native
}

object Frames {
  @scala.inline
  def apply(): Frames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Frames]
  }
  @scala.inline
  implicit class FramesOps[Self <: Frames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSlideMomentumCheck(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideMomentumCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideMomentumCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideMomentumCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withSliderMomentumFrame(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderMomentumFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliderMomentumFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderMomentumFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapViewTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapViewTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapViewTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapViewTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomFrame(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomFrame")(js.undefined)
        ret
    }
  }
  
}

