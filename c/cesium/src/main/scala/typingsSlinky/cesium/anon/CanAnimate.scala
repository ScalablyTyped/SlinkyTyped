package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.ClockRange
import typingsSlinky.cesium.mod.ClockStep
import typingsSlinky.cesium.mod.JulianDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanAnimate extends js.Object {
  var canAnimate: js.UndefOr[Boolean] = js.native
  var clockRange: js.UndefOr[ClockRange] = js.native
  var clockStep: js.UndefOr[ClockStep] = js.native
  var currentTime: js.UndefOr[JulianDate] = js.native
  var multiplier: js.UndefOr[Double] = js.native
  var shouldAnimate: js.UndefOr[Boolean] = js.native
  var startTime: js.UndefOr[JulianDate] = js.native
  var stopTime: js.UndefOr[JulianDate] = js.native
}

object CanAnimate {
  @scala.inline
  def apply(): CanAnimate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanAnimate]
  }
  @scala.inline
  implicit class CanAnimateOps[Self <: CanAnimate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canAnimate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canAnimate")(js.undefined)
        ret
    }
    @scala.inline
    def withClockRange(value: ClockRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClockRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockRange")(js.undefined)
        ret
    }
    @scala.inline
    def withClockStep(value: ClockStep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClockStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockStep")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentTime(value: JulianDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiplier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplier")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldAnimate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldAnimate")(js.undefined)
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

