package typingsSlinky.angularAnimations.browserBrowserMod

import typingsSlinky.angularAnimations.mod.ɵStyleData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationTimelineInstruction extends AnimationEngineInstruction {
  var delay: Double = js.native
  var duration: Double = js.native
  var easing: String | Null = js.native
  var element: js.Any = js.native
  var keyframes: js.Array[ɵStyleData] = js.native
  var postStyleProps: js.Array[String] = js.native
  var preStyleProps: js.Array[String] = js.native
  var stretchStartingKeyframe: js.UndefOr[Boolean] = js.native
  var subTimeline: Boolean = js.native
  var totalTime: Double = js.native
}

object AnimationTimelineInstruction {
  @scala.inline
  def apply(
    delay: Double,
    duration: Double,
    element: js.Any,
    keyframes: js.Array[ɵStyleData],
    postStyleProps: js.Array[String],
    preStyleProps: js.Array[String],
    subTimeline: Boolean,
    totalTime: Double,
    `type`: AnimationTransitionInstructionType
  ): AnimationTimelineInstruction = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], keyframes = keyframes.asInstanceOf[js.Any], postStyleProps = postStyleProps.asInstanceOf[js.Any], preStyleProps = preStyleProps.asInstanceOf[js.Any], subTimeline = subTimeline.asInstanceOf[js.Any], totalTime = totalTime.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationTimelineInstruction]
  }
  @scala.inline
  implicit class AnimationTimelineInstructionOps[Self <: AnimationTimelineInstruction] (val x: Self) extends AnyVal {
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
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyframes(value: js.Array[ɵStyleData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyframes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostStyleProps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postStyleProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreStyleProps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preStyleProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubTimeline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subTimeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEasingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(null)
        ret
    }
    @scala.inline
    def withStretchStartingKeyframe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchStartingKeyframe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStretchStartingKeyframe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchStartingKeyframe")(js.undefined)
        ret
    }
  }
  
}

