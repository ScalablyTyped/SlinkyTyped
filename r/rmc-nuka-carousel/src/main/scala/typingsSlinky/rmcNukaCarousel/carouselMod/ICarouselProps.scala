package typingsSlinky.rmcNukaCarousel.carouselMod

import typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.auto
import typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.center
import typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.left
import typingsSlinky.rmcNukaCarousel.rmcNukaCarouselStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICarouselProps extends js.Object {
  var afterSlide: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  var autoplay: js.UndefOr[Boolean] = js.native
  var autoplayInterval: js.UndefOr[Double] = js.native
  var beforeSlide: js.UndefOr[js.Function2[/* currentIndex */ Double, /* endIndex */ Double, Unit]] = js.native
  var cellAlign: js.UndefOr[left | center | right] = js.native
  var cellSpacing: js.UndefOr[Double] = js.native
  var className: js.UndefOr[String] = js.native
  var data: js.UndefOr[js.Function0[Unit]] = js.native
  var decorators: js.UndefOr[js.Array[_]] = js.native
  var dragging: js.UndefOr[Boolean] = js.native
  var easing: js.UndefOr[js.Function] = js.native
  var edgeEasing: js.UndefOr[js.Function] = js.native
  var frameOverflow: js.UndefOr[String] = js.native
  var framePadding: js.UndefOr[String] = js.native
  var initialSlideHeight: js.UndefOr[Double] = js.native
  var initialSlideWidth: js.UndefOr[Double] = js.native
  var resetAutoplay: js.UndefOr[Boolean] = js.native
  var slideIndex: js.UndefOr[Double] = js.native
  var slideWidth: js.UndefOr[String | Double] = js.native
  var slidesToScroll: js.UndefOr[Double | auto] = js.native
  var slidesToShow: js.UndefOr[Double] = js.native
  var speed: js.UndefOr[Double] = js.native
  var style: js.UndefOr[js.Any] = js.native
  var swipeSpeed: js.UndefOr[Double] = js.native
  var swiping: js.UndefOr[Boolean] = js.native
  var vertical: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[String] = js.native
  var wrapAround: js.UndefOr[Boolean] = js.native
}

object ICarouselProps {
  @scala.inline
  def apply(): ICarouselProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICarouselProps]
  }
  @scala.inline
  implicit class ICarouselPropsOps[Self <: ICarouselProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterSlide(value: /* index */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSlide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplayInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplayInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSlide(value: (/* currentIndex */ Double, /* endIndex */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSlide")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withCellAlign(value: left | center | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellAlign")(js.undefined)
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
    def withData(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDecorators(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecorators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorators")(js.undefined)
        ret
    }
    @scala.inline
    def withDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeEasing(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeEasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameOverflow(value: String): Self = {
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
    def withFramePadding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFramePadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framePadding")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialSlideHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSlideHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialSlideHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSlideHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialSlideWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSlideWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialSlideWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSlideWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withResetAutoplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetAutoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetAutoplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetAutoplay")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideIndex")(js.undefined)
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
    def withSlidesToScroll(value: Double | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesToScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlidesToScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesToScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidesToShow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesToShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlidesToShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesToShow")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Any): Self = {
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
    @scala.inline
    def withSwiping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swiping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwiping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swiping")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapAround(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapAround")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapAround: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapAround")(js.undefined)
        ret
    }
  }
  
}

