package typingsSlinky.reactNativeElements.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.ImageSourcePropType
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.PartialImageProps
import typingsSlinky.reactNativeElements.mod.CardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Card
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeElements.mod.Card] {
  @JSImport("react-native-elements", "Card")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    containerStyle: StyleProp[ViewStyle] = null,
    dividerStyle: StyleProp[ViewStyle] = null,
    featuredSubtitle: String = null,
    featuredSubtitleStyle: StyleProp[TextStyle] = null,
    featuredTitle: String = null,
    featuredTitleStyle: StyleProp[TextStyle] = null,
    image: ImageSourcePropType = null,
    imageProps: PartialImageProps = null,
    imageStyle: ImageStyle = null,
    imageWrapperStyle: StyleProp[ViewStyle] = null,
    title: String | ReactElement = null,
    titleStyle: StyleProp[TextStyle] = null,
    wrapperStyle: StyleProp[ViewStyle] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeElements.mod.Card] = {
    val __obj = js.Dynamic.literal()
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (dividerStyle != null) __obj.updateDynamic("dividerStyle")(dividerStyle.asInstanceOf[js.Any])
    if (featuredSubtitle != null) __obj.updateDynamic("featuredSubtitle")(featuredSubtitle.asInstanceOf[js.Any])
    if (featuredSubtitleStyle != null) __obj.updateDynamic("featuredSubtitleStyle")(featuredSubtitleStyle.asInstanceOf[js.Any])
    if (featuredTitle != null) __obj.updateDynamic("featuredTitle")(featuredTitle.asInstanceOf[js.Any])
    if (featuredTitleStyle != null) __obj.updateDynamic("featuredTitleStyle")(featuredTitleStyle.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (imageProps != null) __obj.updateDynamic("imageProps")(imageProps.asInstanceOf[js.Any])
    if (imageStyle != null) __obj.updateDynamic("imageStyle")(imageStyle.asInstanceOf[js.Any])
    if (imageWrapperStyle != null) __obj.updateDynamic("imageWrapperStyle")(imageWrapperStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactNativeElements.mod.Card] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactNativeElements.mod.Card](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = CardProps
}

