package typingsSlinky.antdMobile.carouselMod

import typingsSlinky.antdMobile.carouselPropsTypeMod.CarouselPropsType
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselProps extends CarouselPropsType {
  var afterChange: js.UndefOr[js.Function1[/* current */ Double, Unit]] = js.native
  var beforeChange: js.UndefOr[js.Function2[/* from */ Double, /* to */ Double, Unit]] = js.native
  var cellSpacing: js.UndefOr[Double] = js.native
  var className: js.UndefOr[String] = js.native
  var dotActiveStyle: js.UndefOr[CSSProperties] = js.native
  var dotStyle: js.UndefOr[CSSProperties] = js.native
  var easing: js.UndefOr[js.Function0[Unit]] = js.native
  var frameOverflow: js.UndefOr[IFrameOverFlow] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var slideWidth: js.UndefOr[String | Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var swipeSpeed: js.UndefOr[Double] = js.native
}

object CarouselProps {
  @scala.inline
  def apply(): CarouselProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarouselProps]
  }
  @scala.inline
  implicit class CarouselPropsOps[Self <: CarouselProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterChange(value: /* current */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterChange")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeChange(value: (/* from */ Double, /* to */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withCellSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDotActiveStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotActiveStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotActiveStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotActiveStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDotStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameOverflow(value: IFrameOverFlow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
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
    def withSwipeSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeSpeed")(js.undefined)
        ret
    }
  }
  
}

