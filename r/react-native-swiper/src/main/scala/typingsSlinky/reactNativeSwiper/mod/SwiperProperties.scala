package typingsSlinky.reactNativeSwiper.mod

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Props
import typingsSlinky.reactNative.mod.NativeScrollEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwiperProperties extends Props[Swiper] {
  var activeDot: js.UndefOr[ReactElement] = js.native
  var activeDotColor: js.UndefOr[String] = js.native
  var activeDotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.native
  var autoplay: js.UndefOr[Boolean] = js.native
  var autoplayDirection: js.UndefOr[Boolean] = js.native
  var autoplayTimeout: js.UndefOr[Double] = js.native
  var bounces: js.UndefOr[Boolean] = js.native
  var buttonWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var dot: js.UndefOr[ReactElement] = js.native
  var dotColor: js.UndefOr[String] = js.native
  var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var height: js.UndefOr[Double] = js.native
  var horizontal: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[Double] = js.native
  var loadMinimal: js.UndefOr[Boolean] = js.native
  var loadMinimalLoader: js.UndefOr[ReactElement] = js.native
  var loadMinimalSize: js.UndefOr[Double] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var nextButton: js.UndefOr[ReactElement] = js.native
  var onMomentumScrollEnd: js.UndefOr[
    js.Function3[
      SyntheticEvent[NodeHandle, NativeScrollEvent], 
      /* state */ SwiperState, 
      /* context */ Swiper, 
      Unit
    ]
  ] = js.native
  var onResponderRelease: js.UndefOr[
    js.Function3[
      SyntheticEvent[NodeHandle, NativeScrollEvent], 
      /* state */ SwiperState, 
      /* context */ Swiper, 
      Unit
    ]
  ] = js.native
  var onScrollBeginDrag: js.UndefOr[
    js.Function3[
      SyntheticEvent[NodeHandle, NativeScrollEvent], 
      /* state */ SwiperState, 
      /* context */ Swiper, 
      Unit
    ]
  ] = js.native
  var onTouchEnd: js.UndefOr[
    js.Function3[
      SyntheticEvent[NodeHandle, NativeScrollEvent], 
      /* state */ SwiperState, 
      /* context */ Swiper, 
      Unit
    ]
  ] = js.native
  var onTouchStart: js.UndefOr[
    js.Function3[
      SyntheticEvent[NodeHandle, NativeScrollEvent], 
      /* state */ SwiperState, 
      /* context */ Swiper, 
      Unit
    ]
  ] = js.native
  var onTouchStartCapture: js.UndefOr[
    js.Function3[
      SyntheticEvent[NodeHandle, NativeScrollEvent], 
      /* state */ SwiperState, 
      /* context */ Swiper, 
      Unit
    ]
  ] = js.native
  var paginationStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var pagingEnabled: js.UndefOr[Boolean] = js.native
  var prevButton: js.UndefOr[ReactElement] = js.native
  var removeClippedSubviews: js.UndefOr[Boolean] = js.native
  var renderPagination: js.UndefOr[
    js.Function3[/* index */ Double, /* total */ Double, /* thisObject */ Swiper, ReactElement]
  ] = js.native
  var scrollEnabled: js.UndefOr[Boolean] = js.native
  var scrollsToTop: js.UndefOr[Boolean] = js.native
  var showsButtons: js.UndefOr[Boolean] = js.native
  var showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.native
  var showsPagination: js.UndefOr[Boolean] = js.native
  var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var width: js.UndefOr[Double] = js.native
}

object SwiperProperties {
  @scala.inline
  def apply(): SwiperProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwiperProperties]
  }
  @scala.inline
  implicit class SwiperPropertiesOps[Self <: SwiperProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveDot(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveDot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDot")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveDotColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDotColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveDotColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDotColor")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveDotStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDotStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveDotStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDotStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveDotStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDotStyle")(null)
        ret
    }
    @scala.inline
    def withAutomaticallyAdjustContentInsets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticallyAdjustContentInsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticallyAdjustContentInsets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticallyAdjustContentInsets")(js.undefined)
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
    def withAutoplayDirection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplayDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplayTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplayTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withBounces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounces")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonWrapperStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonWrapperStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonWrapperStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonWrapperStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonWrapperStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonWrapperStyle")(null)
        ret
    }
    @scala.inline
    def withDot(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(js.undefined)
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
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadMinimal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMinimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadMinimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMinimal")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadMinimalLoader(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMinimalLoader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadMinimalLoader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMinimalLoader")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadMinimalSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMinimalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadMinimalSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMinimalSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withNextButton(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButton")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMomentumScrollEnd(
      value: (SyntheticEvent[NodeHandle, NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMomentumScrollEnd")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnMomentumScrollEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMomentumScrollEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderRelease(
      value: (SyntheticEvent[NodeHandle, NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderRelease")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnResponderRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderRelease")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScrollBeginDrag(
      value: (SyntheticEvent[NodeHandle, NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollBeginDrag")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnScrollBeginDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollBeginDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchEnd(
      value: (SyntheticEvent[NodeHandle, NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnTouchEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchStart(
      value: (SyntheticEvent[NodeHandle, NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnTouchStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchStartCapture(
      value: (SyntheticEvent[NodeHandle, NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStartCapture")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnTouchStartCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStartCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationStyle")(null)
        ret
    }
    @scala.inline
    def withPagingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevButton(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevButton")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveClippedSubviews(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClippedSubviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveClippedSubviews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClippedSubviews")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderPagination(value: (/* index */ Double, /* total */ Double, /* thisObject */ Swiper) => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPagination")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRenderPagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPagination")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollsToTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollsToTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollsToTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollsToTop")(js.undefined)
        ret
    }
    @scala.inline
    def withShowsButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withShowsHorizontalScrollIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsHorizontalScrollIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsHorizontalScrollIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsHorizontalScrollIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withShowsPagination(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsPagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsPagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsPagination")(js.undefined)
        ret
    }
    @scala.inline
    def withShowsVerticalScrollIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsVerticalScrollIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsVerticalScrollIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsVerticalScrollIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StyleProp[ViewStyle]): Self = {
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
    def withStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
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
  }
  
}

