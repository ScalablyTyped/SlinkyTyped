package typingsSlinky.reactNativeAnimatable.mod

import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.infinite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimatableProperties[S /* <: js.Object */] extends js.Object {
  var animation: js.UndefOr[Animation | String | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])] = js.native
  var delay: js.UndefOr[Double] = js.native
  var direction: js.UndefOr[Direction] = js.native
  var duration: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[Easing] = js.native
  var iterationCount: js.UndefOr[Double | infinite] = js.native
  var iterationDelay: js.UndefOr[Double] = js.native
  var onAnimationBegin: js.UndefOr[js.Function] = js.native
  var onAnimationEnd: js.UndefOr[js.Function] = js.native
  var onTransitionBegin: js.UndefOr[js.Function1[/* property */ String, Unit]] = js.native
  var onTransitionEnd: js.UndefOr[js.Function1[/* property */ String, Unit]] = js.native
  var transition: js.UndefOr[(/* keyof S */ String) | (js.Array[/* keyof S */ String])] = js.native
  var useNativeDriver: js.UndefOr[Boolean] = js.native
}

object AnimatableProperties {
  @scala.inline
  def apply[S](): AnimatableProperties[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimatableProperties[S]]
  }
  @scala.inline
  implicit class AnimatablePropertiesOps[Self[s] <: AnimatableProperties[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withAnimation(value: Animation | String | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: Direction): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEasingFunction1(value: /* t */ Double => Double): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEasing(value: Easing): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withIterationCount(value: Double | infinite): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterationCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIterationCount: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterationCount")(js.undefined)
        ret
    }
    @scala.inline
    def withIterationDelay(value: Double): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterationDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIterationDelay: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterationDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationBegin(value: js.Function): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationBegin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAnimationBegin: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationEnd(value: js.Function): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAnimationEnd: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTransitionBegin(value: /* property */ String => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionBegin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTransitionBegin: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTransitionEnd(value: /* property */ String => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTransitionEnd: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: (/* keyof S */ String) | (js.Array[/* keyof S */ String])): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNativeDriver(value: Boolean): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeDriver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNativeDriver: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeDriver")(js.undefined)
        ret
    }
  }
  
}

