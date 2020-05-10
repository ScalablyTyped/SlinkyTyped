package typingsSlinky.reactNativeSwiper.components

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.NativeScrollEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSwiper.mod.Swiper
import typingsSlinky.reactNativeSwiper.mod.SwiperProperties
import typingsSlinky.reactNativeSwiper.mod.SwiperState
import typingsSlinky.reactNativeSwiper.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeSwiper {
  @JSImport("react-native-swiper", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def activeDot(value: ReactElement): this.type = set("activeDot", value.asInstanceOf[js.Any])
    @scala.inline
    def activeDotColor(value: String): this.type = set("activeDotColor", value.asInstanceOf[js.Any])
    @scala.inline
    def activeDotStyle(value: StyleProp[ViewStyle]): this.type = set("activeDotStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def activeDotStyleNull: this.type = set("activeDotStyle", null)
    @scala.inline
    def automaticallyAdjustContentInsets(value: Boolean): this.type = set("automaticallyAdjustContentInsets", value.asInstanceOf[js.Any])
    @scala.inline
    def autoplay(value: Boolean): this.type = set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def autoplayDirection(value: Boolean): this.type = set("autoplayDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def autoplayTimeout(value: Double): this.type = set("autoplayTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def bounces(value: Boolean): this.type = set("bounces", value.asInstanceOf[js.Any])
    @scala.inline
    def buttonWrapperStyle(value: StyleProp[ViewStyle]): this.type = set("buttonWrapperStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def buttonWrapperStyleNull: this.type = set("buttonWrapperStyle", null)
    @scala.inline
    def dot(value: ReactElement): this.type = set("dot", value.asInstanceOf[js.Any])
    @scala.inline
    def dotColor(value: String): this.type = set("dotColor", value.asInstanceOf[js.Any])
    @scala.inline
    def dotStyle(value: StyleProp[ViewStyle]): this.type = set("dotStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def dotStyleNull: this.type = set("dotStyle", null)
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def loadMinimal(value: Boolean): this.type = set("loadMinimal", value.asInstanceOf[js.Any])
    @scala.inline
    def loadMinimalLoader(value: ReactElement): this.type = set("loadMinimalLoader", value.asInstanceOf[js.Any])
    @scala.inline
    def loadMinimalSize(value: Double): this.type = set("loadMinimalSize", value.asInstanceOf[js.Any])
    @scala.inline
    def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def nextButton(value: ReactElement): this.type = set("nextButton", value.asInstanceOf[js.Any])
    @scala.inline
    def onMomentumScrollEnd(
      value: (SyntheticEvent[NodeHandle, NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit
    ): this.type = set("onMomentumScrollEnd", js.Any.fromFunction3(value))
    @scala.inline
    def onResponderRelease(
      value: (SyntheticEvent[NodeHandle, NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit
    ): this.type = set("onResponderRelease", js.Any.fromFunction3(value))
    @scala.inline
    def onScrollBeginDrag(
      value: (SyntheticEvent[NodeHandle, NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit
    ): this.type = set("onScrollBeginDrag", js.Any.fromFunction3(value))
    @scala.inline
    def onTouchEnd(
      value: (SyntheticEvent[NodeHandle, NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit
    ): this.type = set("onTouchEnd", js.Any.fromFunction3(value))
    @scala.inline
    def onTouchStart(
      value: (SyntheticEvent[NodeHandle, NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit
    ): this.type = set("onTouchStart", js.Any.fromFunction3(value))
    @scala.inline
    def onTouchStartCapture(
      value: (SyntheticEvent[NodeHandle, NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit
    ): this.type = set("onTouchStartCapture", js.Any.fromFunction3(value))
    @scala.inline
    def paginationStyle(value: StyleProp[ViewStyle]): this.type = set("paginationStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def paginationStyleNull: this.type = set("paginationStyle", null)
    @scala.inline
    def pagingEnabled(value: Boolean): this.type = set("pagingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def prevButton(value: ReactElement): this.type = set("prevButton", value.asInstanceOf[js.Any])
    @scala.inline
    def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
    @scala.inline
    def renderPagination(value: (/* index */ Double, /* total */ Double, /* thisObject */ Swiper) => ReactElement): this.type = set("renderPagination", js.Any.fromFunction3(value))
    @scala.inline
    def scrollEnabled(value: Boolean): this.type = set("scrollEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollsToTop(value: Boolean): this.type = set("scrollsToTop", value.asInstanceOf[js.Any])
    @scala.inline
    def showsButtons(value: Boolean): this.type = set("showsButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def showsHorizontalScrollIndicator(value: Boolean): this.type = set("showsHorizontalScrollIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def showsPagination(value: Boolean): this.type = set("showsPagination", value.asInstanceOf[js.Any])
    @scala.inline
    def showsVerticalScrollIndicator(value: Boolean): this.type = set("showsVerticalScrollIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SwiperProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactNativeSwiper.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

