package typingsSlinky.reactNativeSnapCarousel.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.FlatListProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSnapCarousel.mod.PaginationProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pagination
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeSnapCarousel.mod.Pagination] {
  @JSImport("react-native-snap-carousel", "Pagination")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    activeDotIndex: Double,
    dotsLength: Double,
    activeOpacity: Int | Double = null,
    carouselRef: ReactComponentClass[FlatListProps[_]] = null,
    containerStyle: StyleProp[ViewStyle] = null,
    dotColor: String = null,
    dotContainerStyle: StyleProp[ViewStyle] = null,
    dotElement: TagMod[Any] = null,
    dotStyle: StyleProp[ViewStyle] = null,
    inactiveDotColor: String = null,
    inactiveDotElement: TagMod[Any] = null,
    inactiveDotOpacity: Int | Double = null,
    inactiveDotScale: Int | Double = null,
    inactiveDotStyle: StyleProp[ViewStyle] = null,
    renderDots: (/* activeIndex */ Double, /* total */ Double, /* context */ js.Any) => TagMod[Any] = null,
    tappableDots: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeSnapCarousel.mod.Pagination] = {
    val __obj = js.Dynamic.literal(activeDotIndex = activeDotIndex.asInstanceOf[js.Any], dotsLength = dotsLength.asInstanceOf[js.Any])
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (carouselRef != null) __obj.updateDynamic("carouselRef")(carouselRef.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (dotColor != null) __obj.updateDynamic("dotColor")(dotColor.asInstanceOf[js.Any])
    if (dotContainerStyle != null) __obj.updateDynamic("dotContainerStyle")(dotContainerStyle.asInstanceOf[js.Any])
    if (dotElement != null) __obj.updateDynamic("dotElement")(dotElement.asInstanceOf[js.Any])
    if (dotStyle != null) __obj.updateDynamic("dotStyle")(dotStyle.asInstanceOf[js.Any])
    if (inactiveDotColor != null) __obj.updateDynamic("inactiveDotColor")(inactiveDotColor.asInstanceOf[js.Any])
    if (inactiveDotElement != null) __obj.updateDynamic("inactiveDotElement")(inactiveDotElement.asInstanceOf[js.Any])
    if (inactiveDotOpacity != null) __obj.updateDynamic("inactiveDotOpacity")(inactiveDotOpacity.asInstanceOf[js.Any])
    if (inactiveDotScale != null) __obj.updateDynamic("inactiveDotScale")(inactiveDotScale.asInstanceOf[js.Any])
    if (inactiveDotStyle != null) __obj.updateDynamic("inactiveDotStyle")(inactiveDotStyle.asInstanceOf[js.Any])
    if (renderDots != null) __obj.updateDynamic("renderDots")(js.Any.fromFunction3(renderDots))
    if (!js.isUndefined(tappableDots)) __obj.updateDynamic("tappableDots")(tappableDots.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PaginationProperties
}

