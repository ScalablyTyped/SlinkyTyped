package typingsSlinky.betterScroll.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlideOption extends js.Object {
  var el: Element = js.native
  var listenFlick: Boolean = js.native
  var loop: Boolean = js.native
  var speed: Double = js.native
  var stepX: Double = js.native
  var stepY: Double = js.native
  var threshold: Double = js.native
}

object SlideOption {
  @scala.inline
  def apply(
    el: Element,
    listenFlick: Boolean,
    loop: Boolean,
    speed: Double,
    stepX: Double,
    stepY: Double,
    threshold: Double
  ): SlideOption = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], listenFlick = listenFlick.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], stepX = stepX.asInstanceOf[js.Any], stepY = stepY.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideOption]
  }
  @scala.inline
  implicit class SlideOptionOps[Self <: SlideOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEl(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListenFlick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenFlick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

