package typingsSlinky.nukaCarousel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselState extends js.Object {
  /**
    * Current slide index
    */
  var currentSlide: Double = js.native
  /**
    * Is dragging enabled
    */
  var dragging: Boolean = js.native
  /**
    * Easing function name
    */
  var easing: String = js.native
  /**
    * Current frame width
    */
  var frameWidth: Double = js.native
  var isWrappingAround: Boolean = js.native
  /**
    * Current left value
    */
  var left: Double = js.native
  var pauseOnHover: Boolean = js.native
  var resetWrapAroundPosition: Boolean = js.native
  /**
    * Total amount of slides
    */
  var slideCount: Double = js.native
  /**
    * Current slide width
    */
  var slideWidth: CarouselSlideWidthProp = js.native
  /**
    * Slides to scroll at once
    */
  var slidesToScroll: CarouselSlidesToScrollProp = js.native
  /**
    * Current top value
    */
  var top: Double = js.native
  /**
    * Is infinite mode enabled
    */
  var wrapToIndex: Boolean = js.native
}

object CarouselState {
  @scala.inline
  def apply(
    currentSlide: Double,
    dragging: Boolean,
    easing: String,
    frameWidth: Double,
    isWrappingAround: Boolean,
    left: Double,
    pauseOnHover: Boolean,
    resetWrapAroundPosition: Boolean,
    slideCount: Double,
    slideWidth: CarouselSlideWidthProp,
    slidesToScroll: CarouselSlidesToScrollProp,
    top: Double,
    wrapToIndex: Boolean
  ): CarouselState = {
    val __obj = js.Dynamic.literal(currentSlide = currentSlide.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], frameWidth = frameWidth.asInstanceOf[js.Any], isWrappingAround = isWrappingAround.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], pauseOnHover = pauseOnHover.asInstanceOf[js.Any], resetWrapAroundPosition = resetWrapAroundPosition.asInstanceOf[js.Any], slideCount = slideCount.asInstanceOf[js.Any], slideWidth = slideWidth.asInstanceOf[js.Any], slidesToScroll = slidesToScroll.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], wrapToIndex = wrapToIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselState]
  }
  @scala.inline
  implicit class CarouselStateOps[Self <: CarouselState] (val x: Self) extends AnyVal {
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
    def withDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsWrappingAround(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWrappingAround")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPauseOnHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetWrapAroundPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetWrapAroundPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideWidth(value: CarouselSlideWidthProp): Self = {
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
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapToIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapToIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

