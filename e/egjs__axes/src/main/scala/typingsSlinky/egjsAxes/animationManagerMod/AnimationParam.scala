package typingsSlinky.egjsAxes.animationManagerMod

import typingsSlinky.egjsAxes.AnonDestPos
import typingsSlinky.egjsAxes.axisManagerMod.Axis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationParam extends js.Object {
  var delta: Axis = js.native
  var depaPos: Axis = js.native
  var destPos: Axis = js.native
  var done: js.UndefOr[js.Function0[Unit]] = js.native
  var duration: Double = js.native
  var inputEvent: js.UndefOr[js.Any] = js.native
  var setTo: js.UndefOr[
    js.Function2[/* destPos */ js.UndefOr[Axis], /* duration */ js.UndefOr[Double], AnonDestPos]
  ] = js.native
  var startTime: js.UndefOr[Double] = js.native
}

object AnimationParam {
  @scala.inline
  def apply(delta: Axis, depaPos: Axis, destPos: Axis, duration: Double): AnimationParam = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], depaPos = depaPos.asInstanceOf[js.Any], destPos = destPos.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationParam]
  }
  @scala.inline
  implicit class AnimationParamOps[Self <: AnimationParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelta(value: Axis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepaPos(value: Axis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depaPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestPos(value: Axis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDone(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.undefined)
        ret
    }
    @scala.inline
    def withInputEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTo(value: (/* destPos */ js.UndefOr[Axis], /* duration */ js.UndefOr[Double]) => AnonDestPos): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTo")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: Double): Self = {
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
  }
  
}

