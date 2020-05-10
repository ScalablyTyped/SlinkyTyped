package typingsSlinky.popmotionPose.typesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.popmotionEasing.mod.Easing
import typingsSlinky.popmotionPose.popmotionPoseStrings.anticipate
import typingsSlinky.popmotionPose.popmotionPoseStrings.backIn
import typingsSlinky.popmotionPose.popmotionPoseStrings.backInOut
import typingsSlinky.popmotionPose.popmotionPoseStrings.backOut
import typingsSlinky.popmotionPose.popmotionPoseStrings.circIn
import typingsSlinky.popmotionPose.popmotionPoseStrings.circInOut
import typingsSlinky.popmotionPose.popmotionPoseStrings.circOut
import typingsSlinky.popmotionPose.popmotionPoseStrings.easeIn
import typingsSlinky.popmotionPose.popmotionPoseStrings.easeInOut
import typingsSlinky.popmotionPose.popmotionPoseStrings.easeOut
import typingsSlinky.popmotionPose.popmotionPoseStrings.linear
import typingsSlinky.popmotionPose.popmotionPoseStrings.tween
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined ts-essentials.ts-essentials.Merge<{  type  :'tween'} & popmotion-pose.popmotion-pose/lib/types.TransitionDefinitionCommonProps & popmotion.popmotion.TweenProps, {  ease  :popmotion.popmotion.TweenProps['ease'] | keyof {  linear  :@popmotion/easing.@popmotion/easing.Easing,   easeIn  :@popmotion/easing.@popmotion/easing.Easing,   easeOut  :@popmotion/easing.@popmotion/easing.Easing,   easeInOut  :@popmotion/easing.@popmotion/easing.Easing,   circIn  :@popmotion/easing.@popmotion/easing.Easing,   circOut  :@popmotion/easing.@popmotion/easing.Easing,   circInOut  :@popmotion/easing.@popmotion/easing.Easing,   backIn  :@popmotion/easing.@popmotion/easing.Easing,   backOut  :@popmotion/easing.@popmotion/easing.Easing,   backInOut  :@popmotion/easing.@popmotion/easing.Easing,   anticipate  :@popmotion/easing.@popmotion/easing.Easing} | popmotion-pose.popmotion-pose/lib/types.CubicBezierArgs}> */
@js.native
trait TweenDefinition extends TransitionDefinition {
  var delay: js.UndefOr[Double] = js.native
  var duration: js.UndefOr[Double] = js.native
  var ease: js.UndefOr[
    Easing | js.Array[Easing] | StringDictionary[Easing] | linear | easeIn | easeOut | easeInOut | circIn | circOut | circInOut | backIn | backOut | backInOut | anticipate | CubicBezierArgs
  ] = js.native
  var elapsed: js.UndefOr[Double] = js.native
  var flip: js.UndefOr[Double] = js.native
  var flipCount: js.UndefOr[Double] = js.native
  var from: js.UndefOr[typingsSlinky.popmotion.valueMod.Value] = js.native
  var loop: js.UndefOr[Double] = js.native
  var loopCount: js.UndefOr[Double] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var playDirection: js.UndefOr[Double] = js.native
  var repeatDelay: js.UndefOr[Double] = js.native
  var round: js.UndefOr[Boolean] = js.native
  var to: js.UndefOr[typingsSlinky.popmotion.valueMod.Value] = js.native
  var `type`: tween = js.native
  var yoyo: js.UndefOr[Double] = js.native
  var yoyoCount: js.UndefOr[Double] = js.native
}

object TweenDefinition {
  @scala.inline
  def apply(`type`: tween): TweenDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TweenDefinition]
  }
  @scala.inline
  implicit class TweenDefinitionOps[Self <: TweenDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: tween): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEaseFunction1(value: /* v */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ease")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEase(
      value: Easing | js.Array[Easing] | StringDictionary[Easing] | linear | easeIn | easeOut | easeInOut | circIn | circOut | circInOut | backIn | backOut | backInOut | anticipate | CubicBezierArgs
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ease")(js.undefined)
        ret
    }
    @scala.inline
    def withElapsed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withFlip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(js.undefined)
        ret
    }
    @scala.inline
    def withFlipCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlipCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: typingsSlinky.popmotion.valueMod.Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Double): Self = {
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
    def withLoopCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoopCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayDirection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeatDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeatDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withRound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: typingsSlinky.popmotion.valueMod.Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
    @scala.inline
    def withYoyo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yoyo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYoyo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yoyo")(js.undefined)
        ret
    }
    @scala.inline
    def withYoyoCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yoyoCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYoyoCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yoyoCount")(js.undefined)
        ret
    }
  }
  
}

