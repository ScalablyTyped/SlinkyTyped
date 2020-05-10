package typingsSlinky.jqueryCycle2.JQueryCycle2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsWithState extends Options {
  var busy: Boolean = js.native
  var currSlide: Double = js.native
  var nextSlide: Double = js.native
  @JSName("paused")
  var paused_OptionsWithState: Boolean = js.native
  var slideCount: Double = js.native
  var slideNum: Double = js.native
}

object OptionsWithState {
  @scala.inline
  def apply(
    busy: Boolean,
    currSlide: Double,
    nextSlide: Double,
    paused: Boolean,
    slideCount: Double,
    slideNum: Double
  ): OptionsWithState = {
    val __obj = js.Dynamic.literal(busy = busy.asInstanceOf[js.Any], currSlide = currSlide.asInstanceOf[js.Any], nextSlide = nextSlide.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], slideCount = slideCount.asInstanceOf[js.Any], slideNum = slideNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithState]
  }
  @scala.inline
  implicit class OptionsWithStateOps[Self <: OptionsWithState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBusy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("busy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrSlide(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextSlide(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideNum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideNum")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

