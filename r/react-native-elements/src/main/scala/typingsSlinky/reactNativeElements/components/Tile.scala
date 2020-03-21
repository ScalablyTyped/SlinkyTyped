package typingsSlinky.reactNativeElements.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.ImageURISource
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.PartialImageProps
import typingsSlinky.reactNativeElements.mod.IconObject
import typingsSlinky.reactNativeElements.mod.TileProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tile
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeElements.mod.Tile] {
  @JSImport("react-native-elements", "Tile")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: title */
  def apply(
    imageSrc: ImageURISource | String | Double,
    ImageComponent: ReactComponentClass[js.Object] = null,
    activeOpacity: Int | Double = null,
    caption: String = null,
    captionStyle: StyleProp[TextStyle] = null,
    containerStyle: StyleProp[ViewStyle] = null,
    contentContainerStyle: StyleProp[ViewStyle] = null,
    featured: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    icon: IconObject = null,
    iconContainerStyle: StyleProp[ViewStyle] = null,
    imageContainerStyle: StyleProp[ViewStyle] = null,
    imageProps: PartialImageProps = null,
    onPress: () => Unit = null,
    overlayContainerStyle: StyleProp[ViewStyle] = null,
    titleStyle: StyleProp[TextStyle] = null,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeElements.mod.Tile] = {
    val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    if (ImageComponent != null) __obj.updateDynamic("ImageComponent")(ImageComponent.asInstanceOf[js.Any])
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (captionStyle != null) __obj.updateDynamic("captionStyle")(captionStyle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (contentContainerStyle != null) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(featured)) __obj.updateDynamic("featured")(featured.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconContainerStyle != null) __obj.updateDynamic("iconContainerStyle")(iconContainerStyle.asInstanceOf[js.Any])
    if (imageContainerStyle != null) __obj.updateDynamic("imageContainerStyle")(imageContainerStyle.asInstanceOf[js.Any])
    if (imageProps != null) __obj.updateDynamic("imageProps")(imageProps.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (overlayContainerStyle != null) __obj.updateDynamic("overlayContainerStyle")(overlayContainerStyle.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TileProps
}

