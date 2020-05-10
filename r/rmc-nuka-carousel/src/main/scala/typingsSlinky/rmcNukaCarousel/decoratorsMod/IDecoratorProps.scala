package typingsSlinky.rmcNukaCarousel.decoratorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDecoratorProps extends js.Object {
  var cellSpacing: js.UndefOr[Double] = js.native
  var currentSlide: Double = js.native
  var frameWidth: Double | String = js.native
  var goToSlide: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  var nextSlide: js.UndefOr[js.Function0[Unit]] = js.native
  var slideCount: Double = js.native
  var slideWidth: Double | String = js.native
  var slidesToScroll: Double = js.native
  var slidesToShow: js.UndefOr[Double] = js.native
  var wrapAround: js.UndefOr[Boolean] = js.native
  def previousSlide(): Unit = js.native
}

object IDecoratorProps {
  @scala.inline
  def apply(
    currentSlide: Double,
    frameWidth: Double | String,
    previousSlide: () => Unit,
    slideCount: Double,
    slideWidth: Double | String,
    slidesToScroll: Double
  ): IDecoratorProps = {
    val __obj = js.Dynamic.literal(currentSlide = currentSlide.asInstanceOf[js.Any], frameWidth = frameWidth.asInstanceOf[js.Any], previousSlide = js.Any.fromFunction0(previousSlide), slideCount = slideCount.asInstanceOf[js.Any], slideWidth = slideWidth.asInstanceOf[js.Any], slidesToScroll = slidesToScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDecoratorProps]
  }
  @scala.inline
  implicit class IDecoratorPropsOps[Self <: IDecoratorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentSlide(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousSlide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSlide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSlideCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlidesToScroll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesToScroll")(value.asInstanceOf[js.Any])
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
    def withGoToSlide(value: /* index */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToSlide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGoToSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withNextSlide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSlide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutNextSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSlide")(js.undefined)
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

