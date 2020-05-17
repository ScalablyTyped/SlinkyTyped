package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.JulianDate
import typingsSlinky.cesium.mod.ModelAnimationLoop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveOnStop extends js.Object {
  var delay: js.UndefOr[Double] = js.native
  var loop: js.UndefOr[ModelAnimationLoop] = js.native
  var removeOnStop: js.UndefOr[Boolean] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  var speedup: js.UndefOr[Double] = js.native
  var startTime: js.UndefOr[JulianDate] = js.native
  var stopTime: js.UndefOr[JulianDate] = js.native
}

object RemoveOnStop {
  @scala.inline
  def apply(): RemoveOnStop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveOnStop]
  }
  @scala.inline
  implicit class RemoveOnStopOps[Self <: RemoveOnStop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: ModelAnimationLoop): Self = {
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
    def withRemoveOnStop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOnStop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveOnStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOnStop")(js.undefined)
        ret
    }
    @scala.inline
    def withReverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeedup(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeedup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedup")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: JulianDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStopTime(value: JulianDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopTime")(js.undefined)
        ret
    }
  }
  
}

