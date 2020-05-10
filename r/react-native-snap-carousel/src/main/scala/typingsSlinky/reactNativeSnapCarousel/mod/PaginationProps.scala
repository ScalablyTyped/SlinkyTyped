package typingsSlinky.reactNativeSnapCarousel.mod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.FlatListProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationProps extends js.Object {
  /**
    * Currently focused dot
    */
  var activeDotIndex: Double = js.native
  /**
    * Opacity of the dot when tapped. The prop has no effect if tappableDots hasn't been set to true
    */
  var activeOpacity: js.UndefOr[Double] = js.native
  /**
    * Length of dot animation (milliseconds)
    */
  var animatedDuration: js.UndefOr[Double] = js.native
  /**
    * Controls "bounciness"/overshoot on dot animation
    */
  var animatedFriction: js.UndefOr[Double] = js.native
  /**
    * Controls speed dot animation
    */
  var animatedTension: js.UndefOr[Double] = js.native
  /**
    * Reference to the Carousel component to which pagination is linked.
    * Needed only when setting tappableDots to true
    */
  var carouselRef: js.UndefOr[ReactComponentClass[FlatListProps[_]]] = js.native
  /**
    * Style for dots' container that will be merged with the default one
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Delay in ms, from the start of the touch, before onPressIn is called on dot
    */
  var delayPressInDot: js.UndefOr[Double] = js.native
  /**
    * Background color of the active dot.
    * Use this if you want to animate the change between active and inactive colors,
    * and always in conjunction with inactiveDotColor
    */
  var dotColor: js.UndefOr[String] = js.native
  /**
    * Style of each dot's container.
    * Use this if you need to specify styles that wouldn't have any effect when defined with dotStyle (such as flex)
    */
  var dotContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Optional custom active dot element that will replace the default one.
    * The element will receive a prop active set to true as well as a prop index
    */
  var dotElement: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Dots' style that will be merged with the default one
    */
  var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Number of dots to display
    */
  var dotsLength: Double = js.native
  /**
    * Background color of the inactive dots.
    * Use this if you want to animate the change between active and inactive colors, and always in conjunction with dotColor
    */
  var inactiveDotColor: js.UndefOr[String] = js.native
  /**
    * Optional custom inactive dot element that will replace the default one.
    * The element will receive a prop active set to false as well as a prop index
    */
  var inactiveDotElement: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Value of the opacity effect applied to inactive dots
    */
  var inactiveDotOpacity: js.UndefOr[Double] = js.native
  /**
    * Value of the 'scale' transform applied to inactive dots
    */
  var inactiveDotScale: js.UndefOr[Double] = js.native
  /**
    * Dots' style that will be applied to inactive elements
    */
  var inactiveDotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Function that gives you complete control over pagination's rendering.
    * It will receive three parameters : (activeIndex, total, context).
    * This can be especially useful in order to replace dots with numbers
    */
  var renderDots: js.UndefOr[
    js.Function3[/* activeIndex */ Double, /* total */ Double, /* context */ js.Any, TagMod[Any]]
  ] = js.native
  /**
    * Make default dots tappable, e.g. your carousel will slide to the corresponding item.
    * Note that carouselRef must be specified for this to work
    */
  var tappableDots: js.UndefOr[Boolean] = js.native
  /**
    * Whether to layout dots vertically or horizontally
    */
  var vertical: js.UndefOr[Boolean] = js.native
}

object PaginationProps {
  @scala.inline
  def apply(activeDotIndex: Double, dotsLength: Double): PaginationProps = {
    val __obj = js.Dynamic.literal(activeDotIndex = activeDotIndex.asInstanceOf[js.Any], dotsLength = dotsLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
  @scala.inline
  implicit class PaginationPropsOps[Self <: PaginationProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveDotIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDotIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDotsLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotsLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimatedDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animatedDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimatedDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animatedDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimatedFriction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animatedFriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimatedFriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animatedFriction")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimatedTension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animatedTension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimatedTension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animatedTension")(js.undefined)
        ret
    }
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
    def withContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(null)
        ret
    }
    @scala.inline
    def withDelayPressInDot(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayPressInDot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayPressInDot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayPressInDot")(js.undefined)
        ret
    }
    @scala.inline
    def withDotColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDotContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDotContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotContainerStyle")(null)
        ret
    }
    @scala.inline
    def withDotElementReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDotElement(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotElement")(js.undefined)
        ret
    }
    @scala.inline
    def withDotStyle(value: StyleProp[ViewStyle]): Self = {
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
    def withDotStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotStyle")(null)
        ret
    }
    @scala.inline
    def withInactiveDotColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveDotColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInactiveDotColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveDotColor")(js.undefined)
        ret
    }
    @scala.inline
    def withInactiveDotElementReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveDotElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInactiveDotElement(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveDotElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInactiveDotElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveDotElement")(js.undefined)
        ret
    }
    @scala.inline
    def withInactiveDotOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveDotOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInactiveDotOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveDotOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withInactiveDotScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveDotScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInactiveDotScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveDotScale")(js.undefined)
        ret
    }
    @scala.inline
    def withInactiveDotStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveDotStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInactiveDotStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveDotStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withInactiveDotStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveDotStyle")(null)
        ret
    }
    @scala.inline
    def withRenderDots(value: (/* activeIndex */ Double, /* total */ Double, /* context */ js.Any) => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDots")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRenderDots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDots")(js.undefined)
        ret
    }
    @scala.inline
    def withTappableDots(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tappableDots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTappableDots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tappableDots")(js.undefined)
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

