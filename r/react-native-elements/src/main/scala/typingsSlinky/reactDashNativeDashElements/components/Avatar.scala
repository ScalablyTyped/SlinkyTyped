package typingsSlinky.reactDashNativeDashElements.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.ImageSourcePropType
import typingsSlinky.reactDashNative.reactDashNativeMod.ImageStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.TextStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.AvatarIcon
import typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.AvatarProps
import typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.IconProps
import typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.ImageProps
import typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsStrings.large
import typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsStrings.medium
import typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsStrings.small
import typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsStrings.xlarge
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Avatar
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.Avatar
    ] {
  @JSImport("react-native-elements", "Avatar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    Component: ReactComponentClass[js.Object] = null,
    ImageComponent: ReactComponentClass[js.Object] = null,
    activeOpacity: Int | Double = null,
    avatarStyle: ImageStyle = null,
    containerStyle: StyleProp[ViewStyle] = null,
    editButton: Partial[IconProps] = null,
    icon: AvatarIcon = null,
    iconStyle: StyleProp[TextStyle] = null,
    imageProps: Partial[ImageProps] = null,
    onEditPress: () => Unit = null,
    onLongPress: () => Unit = null,
    onPress: () => Unit = null,
    overlayContainerStyle: StyleProp[ViewStyle] = null,
    placeholderStyle: StyleProp[ViewStyle] = null,
    renderPlaceholderContent: ReactElement = null,
    rounded: js.UndefOr[Boolean] = js.undefined,
    showEditButton: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large | xlarge | Double = null,
    source: ImageSourcePropType = null,
    title: String = null,
    titleStyle: StyleProp[TextStyle] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.Avatar
  ] = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (ImageComponent != null) __obj.updateDynamic("ImageComponent")(ImageComponent.asInstanceOf[js.Any])
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (avatarStyle != null) __obj.updateDynamic("avatarStyle")(avatarStyle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (editButton != null) __obj.updateDynamic("editButton")(editButton.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (imageProps != null) __obj.updateDynamic("imageProps")(imageProps.asInstanceOf[js.Any])
    if (onEditPress != null) __obj.updateDynamic("onEditPress")(js.Any.fromFunction0(onEditPress))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction0(onLongPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (overlayContainerStyle != null) __obj.updateDynamic("overlayContainerStyle")(overlayContainerStyle.asInstanceOf[js.Any])
    if (placeholderStyle != null) __obj.updateDynamic("placeholderStyle")(placeholderStyle.asInstanceOf[js.Any])
    if (renderPlaceholderContent != null) __obj.updateDynamic("renderPlaceholderContent")(renderPlaceholderContent.asInstanceOf[js.Any])
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded.asInstanceOf[js.Any])
    if (!js.isUndefined(showEditButton)) __obj.updateDynamic("showEditButton")(showEditButton.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.Avatar
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.Avatar](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = AvatarProps
}

