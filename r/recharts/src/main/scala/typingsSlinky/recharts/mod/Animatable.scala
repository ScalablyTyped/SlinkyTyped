package typingsSlinky.recharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animatable extends js.Object {
  var animationBegin: js.UndefOr[Double] = js.native
  var animationDuration: js.UndefOr[Double] = js.native
  var animationEasing: js.UndefOr[AnimationEasingType] = js.native
  var animationId: js.UndefOr[Double] = js.native
  var isAnimationActive: js.UndefOr[Boolean] = js.native
  var isUpdateAnimationActive: js.UndefOr[Boolean] = js.native
  var onAnimationEnd: js.UndefOr[RechartsFunction] = js.native
  var onAnimationStart: js.UndefOr[RechartsFunction] = js.native
}

object Animatable {
  @scala.inline
  def apply(): Animatable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animatable]
  }
  @scala.inline
  implicit class AnimatableOps[Self <: Animatable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationBegin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationBegin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationEasing(value: AnimationEasingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationId")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAnimationActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAnimationActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAnimationActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAnimationActive")(js.undefined)
        ret
    }
    @scala.inline
    def withIsUpdateAnimationActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUpdateAnimationActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsUpdateAnimationActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUpdateAnimationActive")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationEnd(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationStart(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationStart")(js.undefined)
        ret
    }
  }
  
}

