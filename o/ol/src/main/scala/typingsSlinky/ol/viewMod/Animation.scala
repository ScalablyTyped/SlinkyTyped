package typingsSlinky.ol.viewMod

import typingsSlinky.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation extends js.Object {
  var anchor: js.UndefOr[Coordinate] = js.native
  var complete: Boolean = js.native
  var duration: Double = js.native
  var sourceCenter: js.UndefOr[Coordinate] = js.native
  var sourceResolution: js.UndefOr[Double] = js.native
  var sourceRotation: js.UndefOr[Double] = js.native
  var start: Double = js.native
  var targetCenter: js.UndefOr[Coordinate] = js.native
  var targetResolution: js.UndefOr[Double] = js.native
  var targetRotation: js.UndefOr[Double] = js.native
  def callback(p0: Boolean): Unit = js.native
  def easing(p0: Double): Double = js.native
}

object Animation {
  @scala.inline
  def apply(
    callback: Boolean => Unit,
    complete: Boolean,
    duration: Double,
    easing: Double => Double,
    start: Double
  ): Animation = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), complete = complete.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = js.Any.fromFunction1(easing), start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
  @scala.inline
  implicit class AnimationOps[Self <: Animation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEasing(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnchor(value: Coordinate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceCenter(value: Coordinate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetCenter(value: Coordinate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRotation")(js.undefined)
        ret
    }
  }
  
}

