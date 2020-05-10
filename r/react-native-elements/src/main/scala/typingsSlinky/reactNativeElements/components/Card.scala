package typingsSlinky.reactNativeElements.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
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

object Card {
  @JSImport("react-native-elements", "Card")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeElements.mod.Card] {
    @scala.inline
    def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def containerStyleNull: this.type = set("containerStyle", null)
    @scala.inline
    def dividerStyle(value: StyleProp[ViewStyle]): this.type = set("dividerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def dividerStyleNull: this.type = set("dividerStyle", null)
    @scala.inline
    def featuredSubtitle(value: String): this.type = set("featuredSubtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def featuredSubtitleStyle(value: StyleProp[TextStyle]): this.type = set("featuredSubtitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def featuredSubtitleStyleNull: this.type = set("featuredSubtitleStyle", null)
    @scala.inline
    def featuredTitle(value: String): this.type = set("featuredTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def featuredTitleStyle(value: StyleProp[TextStyle]): this.type = set("featuredTitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def featuredTitleStyleNull: this.type = set("featuredTitleStyle", null)
    @scala.inline
    def image(value: ImageSourcePropType): this.type = set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def imageProps(value: PartialImageProps): this.type = set("imageProps", value.asInstanceOf[js.Any])
    @scala.inline
    def imageStyle(value: ImageStyle): this.type = set("imageStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def imageWrapperStyle(value: StyleProp[ViewStyle]): this.type = set("imageWrapperStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def imageWrapperStyleNull: this.type = set("imageWrapperStyle", null)
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String | ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def titleStyle(value: StyleProp[TextStyle]): this.type = set("titleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def titleStyleNull: this.type = set("titleStyle", null)
    @scala.inline
    def wrapperStyle(value: StyleProp[ViewStyle]): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def wrapperStyleNull: this.type = set("wrapperStyle", null)
  }
  
  def withProps(p: CardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Card.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

