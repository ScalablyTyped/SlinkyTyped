package typingsSlinky.popmotionPose.libTypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.popmotionPose.popmotionPoseNumbers.`-1`
import typingsSlinky.popmotionPose.popmotionPoseNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pose[A, TD]
  extends /* key */ StringDictionary[js.Any] {
  var afterChildren: js.UndefOr[Boolean | BooleanPropFactory] = js.native
  var applyAtEnd: js.UndefOr[ApplyMap] = js.native
  var applyAtStart: js.UndefOr[ApplyMap] = js.native
  var beforeChildren: js.UndefOr[Boolean | BooleanPropFactory] = js.native
  var delay: js.UndefOr[Double | NumberPropFactory] = js.native
  var delayChildren: js.UndefOr[Double | NumberPropFactory] = js.native
  var preTransform: js.UndefOr[js.Function0[_]] = js.native
  var preTransition: js.UndefOr[js.Function1[/* props */ Props, _]] = js.native
  var staggerChildren: js.UndefOr[Double | NumberPropFactory] = js.native
  var staggerDirection: js.UndefOr[`1` | `-1` | StaggerDirectionPropFactory] = js.native
  var transition: js.UndefOr[(TransitionMap[A, TD]) | (TransitionMapFactory[A, TD])] = js.native
}

object Pose {
  @scala.inline
  def apply[A, TD](): Pose[A, TD] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pose[A, TD]]
  }
  @scala.inline
  implicit class PoseOps[Self[a, td] <: Pose[a, td], A, TD] (val x: Self[A, TD]) extends AnyVal {
    @scala.inline
    def duplicate: Self[A, TD] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[A, TD]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[A, TD]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[A, TD]) with Other]
    @scala.inline
    def withAfterChildrenFunction1(value: /* props */ Props => Boolean): Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterChildren")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAfterChildren(value: Boolean | BooleanPropFactory): Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterChildren: Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyAtEnd(value: ApplyMap): Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyAtEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyAtEnd: Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyAtEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyAtStart(value: ApplyMap): Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyAtStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyAtStart: Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyAtStart")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeChildrenFunction1(value: /* props */ Props => Boolean): Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChildren")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBeforeChildren(value: Boolean | BooleanPropFactory): Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeChildren: Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayFunction1(value: /* props */ Props => Double): Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelay(value: Double | NumberPropFactory): Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayChildrenFunction1(value: /* props */ Props => Double): Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayChildren")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelayChildren(value: Double | NumberPropFactory): Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayChildren: Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withPreTransform(value: () => _): Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preTransform")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPreTransform: Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withPreTransition(value: /* props */ Props => _): Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preTransition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreTransition: Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withStaggerChildrenFunction1(value: /* props */ Props => Double): Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staggerChildren")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStaggerChildren(value: Double | NumberPropFactory): Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staggerChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaggerChildren: Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staggerChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withStaggerDirectionFunction1(value: /* props */ Props => `1` | `-1`): Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staggerDirection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStaggerDirection(value: `1` | `-1` | StaggerDirectionPropFactory): Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staggerDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaggerDirection: Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staggerDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionFunction1(value: /* props */ Props => TransitionMap[A, TD]): Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransition(value: (TransitionMap[A, TD]) | (TransitionMapFactory[A, TD])): Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self[A, TD] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
  }
  
}

