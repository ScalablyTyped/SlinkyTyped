package typingsSlinky.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTimeline extends Timeline {
  var events: js.Array[Event] = js.native
  var frames: ArrayLike[Double] = js.native
  def getFrameCount(): Double = js.native
  def setFrame(frameIndex: Double, event: Event): Unit = js.native
}

object EventTimeline {
  @scala.inline
  def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    events: js.Array[Event],
    frames: ArrayLike[Double],
    getFrameCount: () => Double,
    getPropertyId: () => Double,
    setFrame: (Double, Event) => Unit
  ): EventTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), events = events.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getFrameCount = js.Any.fromFunction0(getFrameCount), getPropertyId = js.Any.fromFunction0(getPropertyId), setFrame = js.Any.fromFunction2(setFrame))
    __obj.asInstanceOf[EventTimeline]
  }
  @scala.inline
  implicit class EventTimelineOps[Self <: EventTimeline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: js.Array[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrames(value: ArrayLike[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetFrameCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFrameCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetFrame(value: (Double, Event) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFrame")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

