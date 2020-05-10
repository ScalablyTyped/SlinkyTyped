package typingsSlinky.reactNativeElements.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
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

object Tile {
  @JSImport("react-native-elements", "Tile")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeElements.mod.Tile] {
    @scala.inline
    def ImageComponent(value: ReactComponentClass[js.Object]): this.type = set("ImageComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def activeOpacity(value: Double): this.type = set("activeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def caption(value: String): this.type = set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def captionStyle(value: StyleProp[TextStyle]): this.type = set("captionStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def captionStyleNull: this.type = set("captionStyle", null)
    @scala.inline
    def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def containerStyleNull: this.type = set("containerStyle", null)
    @scala.inline
    def contentContainerStyle(value: StyleProp[ViewStyle]): this.type = set("contentContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def contentContainerStyleNull: this.type = set("contentContainerStyle", null)
    @scala.inline
    def featured(value: Boolean): this.type = set("featured", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def icon(value: IconObject): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def iconContainerStyle(value: StyleProp[ViewStyle]): this.type = set("iconContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def iconContainerStyleNull: this.type = set("iconContainerStyle", null)
    @scala.inline
    def imageContainerStyle(value: StyleProp[ViewStyle]): this.type = set("imageContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def imageContainerStyleNull: this.type = set("imageContainerStyle", null)
    @scala.inline
    def imageProps(value: PartialImageProps): this.type = set("imageProps", value.asInstanceOf[js.Any])
    @scala.inline
    def onPress(value: () => Unit): this.type = set("onPress", js.Any.fromFunction0(value))
    @scala.inline
    def overlayContainerStyle(value: StyleProp[ViewStyle]): this.type = set("overlayContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def overlayContainerStyleNull: this.type = set("overlayContainerStyle", null)
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def titleStyle(value: StyleProp[TextStyle]): this.type = set("titleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def titleStyleNull: this.type = set("titleStyle", null)
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TileProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(imageSrc: ImageURISource | String | Double): Builder = {
    val __props = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TileProps]))
  }
}

