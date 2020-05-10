package typingsSlinky.reactMotionSlider.mod

import typingsSlinky.reactMotion.mod.OpaqueConfig
import typingsSlinky.reactMotionSlider.reactMotionSliderStrings.center
import typingsSlinky.reactMotionSlider.reactMotionSliderStrings.left
import typingsSlinky.reactMotionSlider.reactMotionSliderStrings.mouse
import typingsSlinky.reactMotionSlider.reactMotionSliderStrings.right
import typingsSlinky.reactMotionSlider.reactMotionSliderStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderProps extends js.Object {
  /**
    * Prop callback fired after slide change.
    * @param currentIndex
    */
  var afterSlide: js.UndefOr[js.Function1[/* currentIndex */ Double, Unit]] = js.native
  /**
    * Offsets the slide to align either left, center, or right.
    * @default "left"
    */
  var align: js.UndefOr[left | center | right] = js.native
  /**
    * Animates the wrapper height to fit the current slide.
    * @default false
    */
  var autoHeight: js.UndefOr[Boolean] = js.native
  /**
    * Prop callback fired before slide change.
    * @param currentIndex
    * @param nextIndex
    */
  var beforeSlide: js.UndefOr[js.Function2[/* currentIndex */ Double, /* nextIndex */ Double, Unit]] = js.native
  /**
    * Move to a slide by its index.
    */
  var currentIndex: js.UndefOr[Double] = js.native
  /**
    * Move to a slide by its key.
    */
  var currentKey: js.UndefOr[String | Double] = js.native
  /**
    * The amount of time in milliseconds that determines if a swipe was a flick or not.
    */
  var flickTimeout: js.UndefOr[Double] = js.native
  /**
    * The amount of slides to move upon using prev and next methods.
    * @default 1
    */
  var slidesToMove: js.UndefOr[Double] = js.native
  /**
    * The amount of slides shown in view
    * @default 1
    */
  var slidesToShow: js.UndefOr[Double] = js.native
  /**
    * Accepts a React Motion spring config.
    */
  var springConfig: js.UndefOr[OpaqueConfig] = js.native
  /**
    * Enable touch and/or mouse dragging
    * @default true
    */
  var swipe: js.UndefOr[Boolean | touch | mouse] = js.native
  /**
    * The amount the user must swipe to advance slides. (sliderWidth * swipeThreshold)
    * @default 0.5
    */
  var swipeThreshold: js.UndefOr[Double] = js.native
}

object SliderProps {
  @scala.inline
  def apply(): SliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderProps]
  }
  @scala.inline
  implicit class SliderPropsOps[Self <: SliderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterSlide(value: /* currentIndex */ Double => Unit): Self = {
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
    def withAlign(value: left | center | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSlide(value: (/* currentIndex */ Double, /* nextIndex */ Double) => Unit): Self = {
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
    def withCurrentIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentKey(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentKey")(js.undefined)
        ret
    }
    @scala.inline
    def withFlickTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flickTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlickTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flickTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidesToMove(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesToMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlidesToMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesToMove")(js.undefined)
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
    def withSpringConfig(value: OpaqueConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpringConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipe(value: Boolean | touch | mouse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeThreshold")(js.undefined)
        ret
    }
  }
  
}

