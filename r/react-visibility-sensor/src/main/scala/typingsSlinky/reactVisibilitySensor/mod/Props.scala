package typingsSlinky.reactVisibilitySensor.mod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[ReactElement | ChildFunction] = js.native
  var containment: js.UndefOr[HTMLElement] = js.native
  var delayedCall: js.UndefOr[Boolean] = js.native
  var intervalCheck: js.UndefOr[Boolean] = js.native
  var intervalDelay: js.UndefOr[Double] = js.native
  var minTopValue: js.UndefOr[Double] = js.native
  var offset: js.UndefOr[Shape] = js.native
  var onChange: js.UndefOr[js.Function1[/* isVisible */ Boolean, Unit]] = js.native
  var partialVisibility: js.UndefOr[Boolean] = js.native
  var resizeCheck: js.UndefOr[Boolean] = js.native
  var resizeDelay: js.UndefOr[Double] = js.native
  var resizeThrottle: js.UndefOr[Double] = js.native
  var scrollCheck: js.UndefOr[Boolean] = js.native
  var scrollDelay: js.UndefOr[Double] = js.native
  var scrollThrottle: js.UndefOr[Double] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenFunction1(value: /* arg */ ChildFunctionArg => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildren(value: ReactElement | ChildFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withContainment(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containment")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayedCall(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayedCall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayedCall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayedCall")(js.undefined)
        ret
    }
    @scala.inline
    def withIntervalCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntervalCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withIntervalDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntervalDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withMinTopValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTopValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinTopValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTopValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Shape): Self = {
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
    def withOnChange(value: /* isVisible */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPartialVisibility(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartialVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeThrottle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeThrottle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeThrottle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeThrottle")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollThrottle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollThrottle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollThrottle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollThrottle")(js.undefined)
        ret
    }
  }
  
}

