package typingsSlinky.reactNativeSwiper.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
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

object ReactNativeSwiper
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-swiper", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: loop */
  def apply(
    activeDot: ReactElement = null,
    activeDotColor: String = null,
    activeDotStyle: StyleProp[ViewStyle] = null,
    automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayDirection: js.UndefOr[Boolean] = js.undefined,
    autoplayTimeout: Int | Double = null,
    bounces: js.UndefOr[Boolean] = js.undefined,
    buttonWrapperStyle: StyleProp[ViewStyle] = null,
    dot: ReactElement = null,
    dotColor: String = null,
    dotStyle: StyleProp[ViewStyle] = null,
    height: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    loadMinimal: js.UndefOr[Boolean] = js.undefined,
    loadMinimalLoader: ReactElement = null,
    loadMinimalSize: Int | Double = null,
    nextButton: ReactElement = null,
    onMomentumScrollEnd: (SyntheticEvent[NodeHandle, NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit = null,
    onResponderRelease: (SyntheticEvent[NodeHandle, NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit = null,
    onScrollBeginDrag: (SyntheticEvent[NodeHandle, NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit = null,
    onTouchEnd: (SyntheticEvent[NodeHandle, NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit = null,
    onTouchStart: (SyntheticEvent[NodeHandle, NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit = null,
    onTouchStartCapture: (SyntheticEvent[NodeHandle, NativeScrollEvent], /* state */ SwiperState, /* context */ Swiper) => Unit = null,
    paginationStyle: StyleProp[ViewStyle] = null,
    pagingEnabled: js.UndefOr[Boolean] = js.undefined,
    prevButton: ReactElement = null,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    renderPagination: (/* index */ Double, /* total */ Double, /* thisObject */ Swiper) => ReactElement = null,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollsToTop: js.UndefOr[Boolean] = js.undefined,
    showsButtons: js.UndefOr[Boolean] = js.undefined,
    showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    showsPagination: js.UndefOr[Boolean] = js.undefined,
    showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (activeDot != null) __obj.updateDynamic("activeDot")(activeDot.asInstanceOf[js.Any])
    if (activeDotColor != null) __obj.updateDynamic("activeDotColor")(activeDotColor.asInstanceOf[js.Any])
    if (activeDotStyle != null) __obj.updateDynamic("activeDotStyle")(activeDotStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(automaticallyAdjustContentInsets)) __obj.updateDynamic("automaticallyAdjustContentInsets")(automaticallyAdjustContentInsets.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayDirection)) __obj.updateDynamic("autoplayDirection")(autoplayDirection.asInstanceOf[js.Any])
    if (autoplayTimeout != null) __obj.updateDynamic("autoplayTimeout")(autoplayTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(bounces)) __obj.updateDynamic("bounces")(bounces.asInstanceOf[js.Any])
    if (buttonWrapperStyle != null) __obj.updateDynamic("buttonWrapperStyle")(buttonWrapperStyle.asInstanceOf[js.Any])
    if (dot != null) __obj.updateDynamic("dot")(dot.asInstanceOf[js.Any])
    if (dotColor != null) __obj.updateDynamic("dotColor")(dotColor.asInstanceOf[js.Any])
    if (dotStyle != null) __obj.updateDynamic("dotStyle")(dotStyle.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(loadMinimal)) __obj.updateDynamic("loadMinimal")(loadMinimal.asInstanceOf[js.Any])
    if (loadMinimalLoader != null) __obj.updateDynamic("loadMinimalLoader")(loadMinimalLoader.asInstanceOf[js.Any])
    if (loadMinimalSize != null) __obj.updateDynamic("loadMinimalSize")(loadMinimalSize.asInstanceOf[js.Any])
    if (nextButton != null) __obj.updateDynamic("nextButton")(nextButton.asInstanceOf[js.Any])
    if (onMomentumScrollEnd != null) __obj.updateDynamic("onMomentumScrollEnd")(js.Any.fromFunction3(onMomentumScrollEnd))
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(js.Any.fromFunction3(onResponderRelease))
    if (onScrollBeginDrag != null) __obj.updateDynamic("onScrollBeginDrag")(js.Any.fromFunction3(onScrollBeginDrag))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction3(onTouchEnd))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction3(onTouchStart))
    if (onTouchStartCapture != null) __obj.updateDynamic("onTouchStartCapture")(js.Any.fromFunction3(onTouchStartCapture))
    if (paginationStyle != null) __obj.updateDynamic("paginationStyle")(paginationStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(pagingEnabled)) __obj.updateDynamic("pagingEnabled")(pagingEnabled.asInstanceOf[js.Any])
    if (prevButton != null) __obj.updateDynamic("prevButton")(prevButton.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    if (renderPagination != null) __obj.updateDynamic("renderPagination")(js.Any.fromFunction3(renderPagination))
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollsToTop)) __obj.updateDynamic("scrollsToTop")(scrollsToTop.asInstanceOf[js.Any])
    if (!js.isUndefined(showsButtons)) __obj.updateDynamic("showsButtons")(showsButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(showsHorizontalScrollIndicator)) __obj.updateDynamic("showsHorizontalScrollIndicator")(showsHorizontalScrollIndicator.asInstanceOf[js.Any])
    if (!js.isUndefined(showsPagination)) __obj.updateDynamic("showsPagination")(showsPagination.asInstanceOf[js.Any])
    if (!js.isUndefined(showsVerticalScrollIndicator)) __obj.updateDynamic("showsVerticalScrollIndicator")(showsVerticalScrollIndicator.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactNativeSwiper.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SwiperProperties
}

