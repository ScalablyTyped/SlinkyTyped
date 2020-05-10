package typingsSlinky.reactWow.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactWOWProps extends js.Object {
  /**
    * Animation css class.
    * @default animated
    */
  var animateClass: js.UndefOr[String] = js.native
  /**
    * Animation name.
    * @see https://daneden.github.io/animate.css/
    */
  var animation: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 76 */ js.Any = js.native
  /**
    * The callback is fired every time an animation is stoped.
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Content you want to apply the animation to.
    */
  var children: ReactElement = js.native
  /**
    * Animation delay.
    */
  var delay: js.UndefOr[String] = js.native
  /**
    * Disable the animation.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Animation duration.
    */
  var duration: js.UndefOr[String] = js.native
  /**
    * Animation iteration count.
    */
  var iteration: js.UndefOr[String] = js.native
  /**
    * Distance to the element when triggering the animation.
    * @default 0
    */
  var offset: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * If your components inside a overflow container, set this to true.
    * @default false
    */
  var overflow: js.UndefOr[Boolean] = js.native
  /**
    * Listen and react to resize event.
    * @default true
    */
  var resize: js.UndefOr[Boolean] = js.native
  /**
    * Listen and react to scroll event.
    * @default true
    */
  var scroll: js.UndefOr[Boolean] = js.native
}

object ReactWOWProps {
  @scala.inline
  def apply(
    animation: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 76 */ js.Any,
    children: ReactElement
  ): ReactWOWProps = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactWOWProps]
  }
  @scala.inline
  implicit class ReactWOWPropsOps[Self <: ReactWOWProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 76 */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimateClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: String): Self = {
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
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: String): Self = {
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
    def withIteration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iteration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIteration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iteration")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.undefined)
        ret
    }
  }
  
}

