package typingsSlinky.atAntDashDesignReactDashNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atAntDashDesignReactDashNative.libCarouselMod.CarouselProps
import typingsSlinky.atAntDashDesignReactDashNative.libCarouselMod.CarouselState
import typingsSlinky.atAntDashDesignReactDashNative.libCarouselMod.PaginationProps
import typingsSlinky.atAntDashDesignReactDashNative.libCarouselMod.default
import typingsSlinky.atAntDashDesignReactDashNative.libCarouselStyleMod.CarouselStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.NativeScrollEvent
import typingsSlinky.reactDashNative.reactDashNativeMod.NativeSyntheticEvent
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Carousel
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@ant-design/react-native/lib/carousel", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    afterChange: /* index */ Double => Unit = null,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayInterval: Int | Double = null,
    bounces: js.UndefOr[Boolean] = js.undefined,
    dotActiveStyle: StyleProp[ViewStyle] = null,
    dotStyle: StyleProp[ViewStyle] = null,
    dots: js.UndefOr[Boolean] = js.undefined,
    infinite: js.UndefOr[Boolean] = js.undefined,
    initialSlideWidth: Int | Double = null,
    onMomentumScrollEnd: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ CarouselState, /* carousel */ typingsSlinky.atAntDashDesignReactDashNative.libCarouselMod.Carousel) => Unit = null,
    onScrollBeginDrag: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ CarouselState, /* carousel */ typingsSlinky.atAntDashDesignReactDashNative.libCarouselMod.Carousel) => Unit = null,
    pagination: /* props */ PaginationProps => TagMod[Any] = null,
    selectedIndex: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[CarouselStyle] = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (afterChange != null) __obj.updateDynamic("afterChange")(js.Any.fromFunction1(afterChange))
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (autoplayInterval != null) __obj.updateDynamic("autoplayInterval")(autoplayInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(bounces)) __obj.updateDynamic("bounces")(bounces.asInstanceOf[js.Any])
    if (dotActiveStyle != null) __obj.updateDynamic("dotActiveStyle")(dotActiveStyle.asInstanceOf[js.Any])
    if (dotStyle != null) __obj.updateDynamic("dotStyle")(dotStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite.asInstanceOf[js.Any])
    if (initialSlideWidth != null) __obj.updateDynamic("initialSlideWidth")(initialSlideWidth.asInstanceOf[js.Any])
    if (onMomentumScrollEnd != null) __obj.updateDynamic("onMomentumScrollEnd")(js.Any.fromFunction3(onMomentumScrollEnd))
    if (onScrollBeginDrag != null) __obj.updateDynamic("onScrollBeginDrag")(js.Any.fromFunction3(onScrollBeginDrag))
    if (pagination != null) __obj.updateDynamic("pagination")(js.Any.fromFunction1(pagination))
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atAntDashDesignReactDashNative.libCarouselMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = CarouselProps
}

