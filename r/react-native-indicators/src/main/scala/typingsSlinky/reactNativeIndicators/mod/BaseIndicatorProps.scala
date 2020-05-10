package typingsSlinky.reactNativeIndicators.mod

import typingsSlinky.reactNative.mod.EasingFunction
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseIndicatorProps extends js.Object {
  /**
    * Animation toggle
    * @default true
    */
  var animating: js.UndefOr[Boolean] = js.native
  /**
    * Animation duration in ms
    * @default 1200
    */
  var animationDuration: js.UndefOr[Double] = js.native
  /**
    * Animation easing function
    * @default Easing.linear
    */
  var animationEasing: js.UndefOr[EasingFunction] = js.native
  /**
    * Hide when not animating
    * @default true
    */
  var hidesWhenStopped: js.UndefOr[Boolean] = js.native
  /**
    * Animation is interaction
    * @default true
    */
  var interaction: js.UndefOr[Boolean] = js.native
  /**
    * Style is proxied to the underlying View
    * @default undefined
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object BaseIndicatorProps {
  @scala.inline
  def apply(): BaseIndicatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseIndicatorProps]
  }
  @scala.inline
  implicit class BaseIndicatorPropsOps[Self <: BaseIndicatorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animating")(js.undefined)
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
    def withAnimationEasing(value: /* value */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEasing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAnimationEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withHidesWhenStopped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidesWhenStopped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidesWhenStopped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidesWhenStopped")(js.undefined)
        ret
    }
    @scala.inline
    def withInteraction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interaction")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
  }
  
}

