package typingsSlinky.reactNativeElements

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.ImageSourcePropType
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-elements.react-native-elements.CardProps> */
@js.native
trait PartialCardProps extends js.Object {
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var dividerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var featuredSubtitle: js.UndefOr[String] = js.native
  var featuredSubtitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var featuredTitle: js.UndefOr[String] = js.native
  var featuredTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var image: js.UndefOr[ImageSourcePropType] = js.native
  var imageProps: js.UndefOr[PartialImageProps] = js.native
  var imageStyle: js.UndefOr[ImageStyle] = js.native
  var imageWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var title: js.UndefOr[String | ReactElement] = js.native
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object PartialCardProps {
  @scala.inline
  def apply(): PartialCardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCardProps]
  }
  @scala.inline
  implicit class PartialCardPropsOps[Self <: PartialCardProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDividerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dividerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDividerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dividerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDividerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dividerStyle")(null)
        ret
    }
    @scala.inline
    def withFeaturedSubtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featuredSubtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeaturedSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featuredSubtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withFeaturedSubtitleStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featuredSubtitleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeaturedSubtitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featuredSubtitleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFeaturedSubtitleStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featuredSubtitleStyle")(null)
        ret
    }
    @scala.inline
    def withFeaturedTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featuredTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeaturedTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featuredTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withFeaturedTitleStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featuredTitleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeaturedTitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featuredTitleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFeaturedTitleStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featuredTitleStyle")(null)
        ret
    }
    @scala.inline
    def withImage(value: ImageSourcePropType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
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
    def withImageStyle(value: ImageStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withImageWrapperStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageWrapperStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageWrapperStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageWrapperStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withImageWrapperStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageWrapperStyle")(null)
        ret
    }
    @scala.inline
    def withTitleReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String | ReactElement): Self = {
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
    def withWrapperStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperStyle")(null)
        ret
    }
  }
  
}

