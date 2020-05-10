package typingsSlinky.reactSlick.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var accessibility: js.UndefOr[Boolean] = js.native
  var adaptiveHeight: js.UndefOr[Boolean] = js.native
  var afterChange: js.UndefOr[js.Function1[/* currentSlide */ Double, Unit]] = js.native
  var appendDots: js.UndefOr[js.Function1[/* dots */ TagMod[Any], ReactElement]] = js.native
  var arrows: js.UndefOr[Boolean] = js.native
  var asNavFor: js.UndefOr[Slider] = js.native
  var autoplay: js.UndefOr[Boolean] = js.native
  var autoplaySpeed: js.UndefOr[Double] = js.native
  var beforeChange: js.UndefOr[js.Function2[/* currentSlide */ Double, /* nextSlide */ Double, Unit]] = js.native
  var centerMode: js.UndefOr[Boolean] = js.native
  var centerPadding: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var cssEase: js.UndefOr[String] = js.native
  var customPaging: js.UndefOr[js.Function1[/* index */ Double, ReactElement]] = js.native
  var dots: js.UndefOr[Boolean] = js.native
  var dotsClass: js.UndefOr[String] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var easing: js.UndefOr[String] = js.native
  var edgeFriction: js.UndefOr[Double] = js.native
  var fade: js.UndefOr[Boolean] = js.native
  var focusOnSelect: js.UndefOr[Boolean] = js.native
  var infinite: js.UndefOr[Boolean] = js.native
  var initialSlide: js.UndefOr[Double] = js.native
  var lazyLoad: js.UndefOr[LazyLoadTypes] = js.native
  var nextArrow: js.UndefOr[ReactElement] = js.native
  var onEdge: js.UndefOr[js.Function1[/* swipeDirection */ SwipeDirection, Unit]] = js.native
  var onInit: js.UndefOr[js.Function0[Unit]] = js.native
  var onLazyLoad: js.UndefOr[js.Function1[/* slidesToLoad */ js.Array[Double], Unit]] = js.native
  var onReInit: js.UndefOr[js.Function0[Unit]] = js.native
  var onSwipe: js.UndefOr[js.Function1[/* swipeDirection */ SwipeDirection, Unit]] = js.native
  var pauseOnDotsHover: js.UndefOr[Boolean] = js.native
  var pauseOnFocus: js.UndefOr[Boolean] = js.native
  var pauseOnHover: js.UndefOr[Boolean] = js.native
  var prevArrow: js.UndefOr[ReactElement] = js.native
  var responsive: js.UndefOr[js.Array[ResponsiveObject]] = js.native
  var rows: js.UndefOr[Double] = js.native
  var rtl: js.UndefOr[Boolean] = js.native
  var slide: js.UndefOr[String] = js.native
  var slidesPerRow: js.UndefOr[Double] = js.native
  var slidesToScroll: js.UndefOr[Double] = js.native
  var slidesToShow: js.UndefOr[Double] = js.native
  var speed: js.UndefOr[Double] = js.native
  var swipe: js.UndefOr[Boolean] = js.native
  var swipeEvent: js.UndefOr[js.Function1[/* swipeDirection */ SwipeDirection, Unit]] = js.native
  var swipeToSlide: js.UndefOr[Boolean] = js.native
  var touchMove: js.UndefOr[Boolean] = js.native
  var touchThreshold: js.UndefOr[Double] = js.native
  var useCSS: js.UndefOr[Boolean] = js.native
  var useTransform: js.UndefOr[Boolean] = js.native
  var variableWidth: js.UndefOr[Boolean] = js.native
  var vertical: js.UndefOr[Boolean] = js.native
  var verticalSwiping: js.UndefOr[Boolean] = js.native
  var waitForAnimate: js.UndefOr[Boolean] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibility(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(js.undefined)
        ret
    }
    @scala.inline
    def withAdaptiveHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdaptiveHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterChange(value: /* currentSlide */ Double => Unit): Self = {
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
    def withAppendDots(value: /* dots */ TagMod[Any] => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendDots")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAppendDots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendDots")(js.undefined)
        ret
    }
    @scala.inline
    def withArrows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrows")(js.undefined)
        ret
    }
    @scala.inline
    def withAsNavFor(value: Slider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asNavFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsNavFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asNavFor")(js.undefined)
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
    def withAutoplaySpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplaySpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplaySpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplaySpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeChange(value: (/* currentSlide */ Double, /* nextSlide */ Double) => Unit): Self = {
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
    def withCenterMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterPadding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerPadding")(js.undefined)
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
    def withCssEase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssEase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssEase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssEase")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomPaging(value: /* index */ Double => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customPaging")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomPaging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customPaging")(js.undefined)
        ret
    }
    @scala.inline
    def withDots(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dots")(js.undefined)
        ret
    }
    @scala.inline
    def withDotsClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotsClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotsClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotsClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: String): Self = {
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
    def withEdgeFriction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeFriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeFriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeFriction")(js.undefined)
        ret
    }
    @scala.inline
    def withFade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fade")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusOnSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withInfinite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfinite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinite")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialSlide(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyLoad(value: LazyLoadTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazyLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withNextArrow(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEdge(value: /* swipeDirection */ SwipeDirection => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEdge")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEdge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEdge")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLazyLoad(value: /* slidesToLoad */ js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLazyLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLazyLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLazyLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReInit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnReInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReInit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipe(value: /* swipeDirection */ SwipeDirection => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSwipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipe")(js.undefined)
        ret
    }
    @scala.inline
    def withPauseOnDotsHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnDotsHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseOnDotsHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnDotsHover")(js.undefined)
        ret
    }
    @scala.inline
    def withPauseOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withPauseOnHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnHover")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevArrow(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsive(value: js.Array[ResponsiveObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withRtl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(js.undefined)
        ret
    }
    @scala.inline
    def withSlide(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidesPerRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesPerRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlidesPerRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesPerRow")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidesToScroll(value: Double): Self = {
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
    def withSwipe(value: Boolean): Self = {
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
    def withSwipeEvent(value: /* swipeDirection */ SwipeDirection => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSwipeEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeToSlide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeToSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeToSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeToSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchMove")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCSS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCSS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCSS")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTransform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withVariableWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariableWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableWidth")(js.undefined)
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
    def withVerticalSwiping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalSwiping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalSwiping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalSwiping")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForAnimate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForAnimate")(js.undefined)
        ret
    }
  }
  
}

