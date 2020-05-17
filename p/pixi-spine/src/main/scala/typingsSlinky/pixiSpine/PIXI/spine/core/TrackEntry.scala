package typingsSlinky.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackEntry extends js.Object {
  var alpha: Double = js.native
  var animation: Animation = js.native
  var animationEnd: Double = js.native
  var animationLast: Double = js.native
  var animationStart: Double = js.native
  var attachmentThreshold: Double = js.native
  var delay: Double = js.native
  var drawOrderThreshold: Double = js.native
  var endTime: Double = js.native
  var eventThreshold: Double = js.native
  var holdPrevious: Boolean = js.native
  var interruptAlpha: Double = js.native
  var listener: AnimationStateListener = js.native
  var loop: Boolean = js.native
  var mixBlend: MixBlend = js.native
  var mixDuration: Double = js.native
  var mixTime: Double = js.native
  var mixingFrom: TrackEntry = js.native
  var mixingTo: TrackEntry = js.native
  var next: TrackEntry = js.native
  var nextAnimationLast: Double = js.native
  var nextTrackLast: Double = js.native
  var time: Double = js.native
  var timeScale: Double = js.native
  var timelineHoldMix: js.Array[TrackEntry] = js.native
  var timelineMode: js.Array[Double] = js.native
  var timelinesRotation: js.Array[Double] = js.native
  var totalAlpha: Double = js.native
  var trackEnd: Double = js.native
  var trackIndex: Double = js.native
  var trackLast: Double = js.native
  var trackTime: Double = js.native
  def getAnimationTime(): Double = js.native
  def isComplete(): Boolean = js.native
  def loopsCount(): Double = js.native
  def onComplete(trackIndex: Double, loopCount: Double): js.Any = js.native
  def onEnd(trackIndex: Double): js.Any = js.native
  def onEvent(trackIndex: Double, event: Event): js.Any = js.native
  def onStart(trackIndex: Double): js.Any = js.native
  def reset(): Unit = js.native
  def resetRotationDirections(): Unit = js.native
  def setAnimationLast(animationLast: Double): Unit = js.native
}

object TrackEntry {
  @scala.inline
  def apply(
    alpha: Double,
    animation: Animation,
    animationEnd: Double,
    animationLast: Double,
    animationStart: Double,
    attachmentThreshold: Double,
    delay: Double,
    drawOrderThreshold: Double,
    endTime: Double,
    eventThreshold: Double,
    getAnimationTime: () => Double,
    holdPrevious: Boolean,
    interruptAlpha: Double,
    isComplete: () => Boolean,
    listener: AnimationStateListener,
    loop: Boolean,
    loopsCount: () => Double,
    mixBlend: MixBlend,
    mixDuration: Double,
    mixTime: Double,
    mixingFrom: TrackEntry,
    mixingTo: TrackEntry,
    next: TrackEntry,
    nextAnimationLast: Double,
    nextTrackLast: Double,
    onComplete: (Double, Double) => js.Any,
    onEnd: Double => js.Any,
    onEvent: (Double, Event) => js.Any,
    onStart: Double => js.Any,
    reset: () => Unit,
    resetRotationDirections: () => Unit,
    setAnimationLast: Double => Unit,
    time: Double,
    timeScale: Double,
    timelineHoldMix: js.Array[TrackEntry],
    timelineMode: js.Array[Double],
    timelinesRotation: js.Array[Double],
    totalAlpha: Double,
    trackEnd: Double,
    trackIndex: Double,
    trackLast: Double,
    trackTime: Double
  ): TrackEntry = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], animationEnd = animationEnd.asInstanceOf[js.Any], animationLast = animationLast.asInstanceOf[js.Any], animationStart = animationStart.asInstanceOf[js.Any], attachmentThreshold = attachmentThreshold.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], drawOrderThreshold = drawOrderThreshold.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], eventThreshold = eventThreshold.asInstanceOf[js.Any], getAnimationTime = js.Any.fromFunction0(getAnimationTime), holdPrevious = holdPrevious.asInstanceOf[js.Any], interruptAlpha = interruptAlpha.asInstanceOf[js.Any], isComplete = js.Any.fromFunction0(isComplete), listener = listener.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], loopsCount = js.Any.fromFunction0(loopsCount), mixBlend = mixBlend.asInstanceOf[js.Any], mixDuration = mixDuration.asInstanceOf[js.Any], mixTime = mixTime.asInstanceOf[js.Any], mixingFrom = mixingFrom.asInstanceOf[js.Any], mixingTo = mixingTo.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], nextAnimationLast = nextAnimationLast.asInstanceOf[js.Any], nextTrackLast = nextTrackLast.asInstanceOf[js.Any], onComplete = js.Any.fromFunction2(onComplete), onEnd = js.Any.fromFunction1(onEnd), onEvent = js.Any.fromFunction2(onEvent), onStart = js.Any.fromFunction1(onStart), reset = js.Any.fromFunction0(reset), resetRotationDirections = js.Any.fromFunction0(resetRotationDirections), setAnimationLast = js.Any.fromFunction1(setAnimationLast), time = time.asInstanceOf[js.Any], timeScale = timeScale.asInstanceOf[js.Any], timelineHoldMix = timelineHoldMix.asInstanceOf[js.Any], timelineMode = timelineMode.asInstanceOf[js.Any], timelinesRotation = timelinesRotation.asInstanceOf[js.Any], totalAlpha = totalAlpha.asInstanceOf[js.Any], trackEnd = trackEnd.asInstanceOf[js.Any], trackIndex = trackIndex.asInstanceOf[js.Any], trackLast = trackLast.asInstanceOf[js.Any], trackTime = trackTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackEntry]
  }
  @scala.inline
  implicit class TrackEntryOps[Self <: TrackEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimation(value: Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationLast(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationLast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachmentThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawOrderThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawOrderThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAnimationTime(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnimationTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHoldPrevious(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holdPrevious")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterruptAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interruptAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsComplete(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withListener(value: AnimationStateListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoopsCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopsCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMixBlend(value: MixBlend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixBlend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMixDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMixTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMixingFrom(value: TrackEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixingFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMixingTo(value: TrackEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixingTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: TrackEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextAnimationLast(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextAnimationLast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextTrackLast(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextTrackLast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnComplete(value: (Double, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnEnd(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnEvent(value: (Double, Event) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEvent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnStart(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResetRotationDirections(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetRotationDirections")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAnimationLast(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAnimationLast")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimelineHoldMix(value: js.Array[TrackEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelineHoldMix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimelineMode(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelineMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimelinesRotation(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelinesRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackLast(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackLast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

