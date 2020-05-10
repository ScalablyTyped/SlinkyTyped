package typingsSlinky.rcGesture.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGestureStatus extends js.Object {
  var availablePan: js.UndefOr[Boolean] = js.native
  var direction: js.UndefOr[Double] = js.native
  var moveStatus: js.UndefOr[SingeFingerMoveStatus] = js.native
  var mutliFingerStatus: js.UndefOr[js.Array[MultiFingerStatus]] = js.native
  var pan: js.UndefOr[Boolean] = js.native
  var pinch: js.UndefOr[Boolean] = js.native
  var preTouches: js.Array[Finger] = js.native
  var press: js.UndefOr[Boolean] = js.native
  var rotate: js.UndefOr[Boolean] = js.native
  var rotation: js.UndefOr[Double] = js.native
  var scale: js.UndefOr[Double] = js.native
  var srcEvent: js.Any = js.native
  var startMutliFingerStatus: js.UndefOr[js.Array[MultiFingerStatus]] = js.native
  var startTime: Double = js.native
  var startTouches: js.Array[Finger] = js.native
  var swipe: js.UndefOr[Boolean] = js.native
  var time: Double = js.native
  var touches: js.Array[Finger] = js.native
}

object IGestureStatus {
  @scala.inline
  def apply(
    preTouches: js.Array[Finger],
    srcEvent: js.Any,
    startTime: Double,
    startTouches: js.Array[Finger],
    time: Double,
    touches: js.Array[Finger]
  ): IGestureStatus = {
    val __obj = js.Dynamic.literal(preTouches = preTouches.asInstanceOf[js.Any], srcEvent = srcEvent.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], startTouches = startTouches.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGestureStatus]
  }
  @scala.inline
  implicit class IGestureStatusOps[Self <: IGestureStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreTouches(value: js.Array[Finger]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preTouches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrcEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTouches(value: js.Array[Finger]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTouches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouches(value: js.Array[Finger]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailablePan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availablePan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailablePan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availablePan")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveStatus(value: SingeFingerMoveStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withMutliFingerStatus(value: js.Array[MultiFingerStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutliFingerStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutliFingerStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutliFingerStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withPan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pan")(js.undefined)
        ret
    }
    @scala.inline
    def withPinch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinch")(js.undefined)
        ret
    }
    @scala.inline
    def withPress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("press")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("press")(js.undefined)
        ret
    }
    @scala.inline
    def withRotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMutliFingerStatus(value: js.Array[MultiFingerStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMutliFingerStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMutliFingerStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMutliFingerStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(js.undefined)
        ret
    }
  }
  
}

