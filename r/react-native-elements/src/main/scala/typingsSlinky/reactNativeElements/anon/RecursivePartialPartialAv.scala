package typingsSlinky.reactNativeElements.anon

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.ImageSourcePropType
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.AvatarIcon
import typingsSlinky.reactNativeElements.mod.RecursivePartial
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.large
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.medium
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.small
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.xlarge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.AvatarProps>> */
@js.native
trait RecursivePartialPartialAv extends js.Object {
  var Component: js.UndefOr[RecursivePartial[js.UndefOr[ReactComponentClass[js.Object]]]] = js.native
  var ImageComponent: js.UndefOr[RecursivePartial[js.UndefOr[ReactComponentClass[js.Object]]]] = js.native
  var activeOpacity: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var avatarStyle: js.UndefOr[RecursivePartial[js.UndefOr[ImageStyle]]] = js.native
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var editButton: js.UndefOr[RecursivePartial[js.UndefOr[PartialIconProps]]] = js.native
  var icon: js.UndefOr[RecursivePartial[js.UndefOr[AvatarIcon]]] = js.native
  var iconStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  var imageProps: js.UndefOr[RecursivePartial[js.UndefOr[PartialImageProps]]] = js.native
  var onEditPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var onLongPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var onPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var overlayContainerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var placeholderStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var renderPlaceholderContent: js.UndefOr[RecursivePartial[js.UndefOr[ReactElement]]] = js.native
  var rounded: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var showEditButton: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var size: js.UndefOr[RecursivePartial[js.UndefOr[small | medium | large | xlarge | Double]]] = js.native
  var source: js.UndefOr[RecursivePartial[js.UndefOr[ImageSourcePropType]]] = js.native
  var title: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var titleStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.native
}

object RecursivePartialPartialAv {
  @scala.inline
  def apply(): RecursivePartialPartialAv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialAv]
  }
  @scala.inline
  implicit class RecursivePartialPartialAvOps[Self <: RecursivePartialPartialAv] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponent(value: RecursivePartial[js.UndefOr[ReactComponentClass[js.Object]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(js.undefined)
        ret
    }
    @scala.inline
    def withImageComponent(value: RecursivePartial[js.UndefOr[ReactComponentClass[js.Object]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveOpacity(value: RecursivePartial[js.UndefOr[Double]]): Self = {
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
    def withAvatarStyle(value: RecursivePartial[js.UndefOr[ImageStyle]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvatarStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = {
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
    def withEditButton(value: RecursivePartial[js.UndefOr[PartialIconProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editButton")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: RecursivePartial[js.UndefOr[AvatarIcon]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withImageProps(value: RecursivePartial[js.UndefOr[PartialImageProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageProps")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEditPress(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEditPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLongPress(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLongPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPress(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderPlaceholderContent(value: RecursivePartial[js.UndefOr[ReactElement]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPlaceholderContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderPlaceholderContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPlaceholderContent")(js.undefined)
        ret
    }
    @scala.inline
    def withRounded(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rounded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRounded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rounded")(js.undefined)
        ret
    }
    @scala.inline
    def withShowEditButton(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEditButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowEditButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEditButton")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: RecursivePartial[js.UndefOr[small | medium | large | xlarge | Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: RecursivePartial[js.UndefOr[ImageSourcePropType]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: RecursivePartial[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(js.undefined)
        ret
    }
  }
  
}

