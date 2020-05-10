package typingsSlinky.reactNativeSnapCarousel.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNative.mod.FlatListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdditionalParallaxProps extends js.Object {
  var carouselRef: js.UndefOr[ReactComponentClass[FlatListProps[_]]] = js.native
  var itemHeight: js.UndefOr[Double] = js.native
  var itemWidth: js.UndefOr[Double] = js.native
  var scrollPosition: js.UndefOr[Value] = js.native
  var sliderHeight: js.UndefOr[Double] = js.native
  var sliderWidth: js.UndefOr[Double] = js.native
  var vertical: js.UndefOr[Boolean] = js.native
}

object AdditionalParallaxProps {
  @scala.inline
  def apply(): AdditionalParallaxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalParallaxProps]
  }
  @scala.inline
  implicit class AdditionalParallaxPropsOps[Self <: AdditionalParallaxProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCarouselRef(value: ReactComponentClass[FlatListProps[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carouselRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarouselRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carouselRef")(js.undefined)
        ret
    }
    @scala.inline
    def withItemHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withItemWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollPosition(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSliderHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliderHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSliderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderWidth")(js.undefined)
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
  }
  
}

