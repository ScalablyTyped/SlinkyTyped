package typingsSlinky.nukaCarousel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselSlideRenderControlProps extends js.Object {
  /**
    * When displaying more than one slide, sets which position to anchor the current slide to.
    */
  var cellAlign: CarouselCellAlignProp = js.native
  /**
    * Space between slides, as an integer, but reflected as px
    */
  var cellSpacing: Double = js.native
  /**
    * Current slide index
    */
  var currentSlide: Double = js.native
  /**
    * Current frame width (px)
    */
  var frameWidth: Double = js.native
  /**
    * Total amount of slides
    */
  var slideCount: Double = js.native
  /**
    * Current slide width (px)
    */
  var slideWidth: Double = js.native
  /**
    * Slides to scroll at once
    */
  var slidesToScroll: CarouselSlidesToScrollProp = js.native
  /**
    * Slides to show at once
    */
  var slidesToShow: Double = js.native
  /**
    * Infinite mode enabled
    */
  var wrapAround: Boolean = js.native
  /**
    * Go to X slide method
    * @param index Slide's index to go
    */
  def goToSlide(index: Double): Unit = js.native
  /**
    * Go to the next slide method
    */
  def nextSlide(): Unit = js.native
  /**
    * Go to the previous slide method
    */
  def previousSlide(): Unit = js.native
}

object CarouselSlideRenderControlProps {
  @scala.inline
  def apply(
    cellAlign: CarouselCellAlignProp,
    cellSpacing: Double,
    currentSlide: Double,
    frameWidth: Double,
    goToSlide: Double => Unit,
    nextSlide: () => Unit,
    previousSlide: () => Unit,
    slideCount: Double,
    slideWidth: Double,
    slidesToScroll: CarouselSlidesToScrollProp,
    slidesToShow: Double,
    wrapAround: Boolean
  ): CarouselSlideRenderControlProps = {
    val __obj = js.Dynamic.literal(cellAlign = cellAlign.asInstanceOf[js.Any], cellSpacing = cellSpacing.asInstanceOf[js.Any], currentSlide = currentSlide.asInstanceOf[js.Any], frameWidth = frameWidth.asInstanceOf[js.Any], goToSlide = js.Any.fromFunction1(goToSlide), nextSlide = js.Any.fromFunction0(nextSlide), previousSlide = js.Any.fromFunction0(previousSlide), slideCount = slideCount.asInstanceOf[js.Any], slideWidth = slideWidth.asInstanceOf[js.Any], slidesToScroll = slidesToScroll.asInstanceOf[js.Any], slidesToShow = slidesToShow.asInstanceOf[js.Any], wrapAround = wrapAround.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselSlideRenderControlProps]
  }
  @scala.inline
  implicit class CarouselSlideRenderControlPropsOps[Self <: CarouselSlideRenderControlProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellAlign(value: CarouselCellAlignProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentSlide(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoToSlide(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToSlide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNextSlide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSlide")(js.Any.fromFunction0(value))
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
    def withSlideWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlidesToScroll(value: CarouselSlidesToScrollProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesToScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlidesToShow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesToShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapAround(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapAround")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

