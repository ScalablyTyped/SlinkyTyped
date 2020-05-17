package typingsSlinky.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation extends js.Object {
  var duration: Double = js.native
  var name: String = js.native
  var timelineIds: js.Array[Boolean] = js.native
  var timelines: js.Array[Timeline] = js.native
  @JSName("apply")
  def apply(
    skeleton: Skeleton,
    lastTime: Double,
    time: Double,
    loop: Boolean,
    events: js.Array[Event],
    alpha: Double,
    blend: MixBlend,
    direction: MixDirection
  ): Unit = js.native
  def hasTimeline(id: Double): Boolean = js.native
}

object Animation {
  @scala.inline
  def apply(
    apply: (Skeleton, Double, Double, Boolean, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    duration: Double,
    hasTimeline: Double => Boolean,
    name: String,
    timelineIds: js.Array[Boolean],
    timelines: js.Array[Timeline]
  ): Animation = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction8(apply), duration = duration.asInstanceOf[js.Any], hasTimeline = js.Any.fromFunction1(hasTimeline), name = name.asInstanceOf[js.Any], timelineIds = timelineIds.asInstanceOf[js.Any], timelines = timelines.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
  @scala.inline
  implicit class AnimationOps[Self <: Animation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApply(
      value: (Skeleton, Double, Double, Boolean, js.Array[Event], Double, MixBlend, MixDirection) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction8(value))
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasTimeline(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTimeline")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimelineIds(value: js.Array[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelineIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimelines(value: js.Array[Timeline]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelines")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

