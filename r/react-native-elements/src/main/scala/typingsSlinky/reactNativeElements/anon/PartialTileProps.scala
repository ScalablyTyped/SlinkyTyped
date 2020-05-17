package typingsSlinky.reactNativeElements.anon

import slinky.core.ReactComponentClass
import typingsSlinky.reactNative.mod.ImageURISource
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.IconObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-elements.react-native-elements.TileProps> */
@js.native
trait PartialTileProps extends js.Object {
  var ImageComponent: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  var activeOpacity: js.UndefOr[Double] = js.native
  var caption: js.UndefOr[String] = js.native
  var captionStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var featured: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var icon: js.UndefOr[IconObject] = js.native
  var iconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var imageContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var imageProps: js.UndefOr[PartialImageProps] = js.native
  var imageSrc: js.UndefOr[ImageURISource | String | Double] = js.native
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  var overlayContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var title: js.UndefOr[String] = js.native
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var width: js.UndefOr[Double] = js.native
}

object PartialTileProps {
  @scala.inline
  def apply(): PartialTileProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTileProps]
  }
  @scala.inline
  implicit class PartialTilePropsOps[Self <: PartialTileProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageComponent(value: ReactComponentClass[js.Object]): Self = {
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
    def withActiveOpacity(value: Double): Self = {
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
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptionStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptionStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptionStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionStyle")(null)
        ret
    }
    @scala.inline
    def withContainerStyle(value: StyleProp[ViewStyle]): Self = {
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
    def withContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(null)
        ret
    }
    @scala.inline
    def withContentContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withContentContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerStyle")(null)
        ret
    }
    @scala.inline
    def withFeatured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatured: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featured")(js.undefined)
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
    def withIcon(value: IconObject): Self = {
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
    def withIconContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withIconContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconContainerStyle")(null)
        ret
    }
    @scala.inline
    def withImageContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withImageContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageContainerStyle")(null)
        ret
    }
    @scala.inline
    def withImageProps(value: PartialImageProps): Self = {
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
    def withImageSrc(value: ImageURISource | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayContainerStyle(value: StyleProp[ViewStyle]): Self = {
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
    def withOverlayContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayContainerStyle")(null)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
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
    def withTitleStyle(value: StyleProp[TextStyle]): Self = {
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
    @scala.inline
    def withTitleStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(null)
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

