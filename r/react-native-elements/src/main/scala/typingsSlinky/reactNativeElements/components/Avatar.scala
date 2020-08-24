package typingsSlinky.reactNativeElements.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ImageSourcePropType
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.ImageURISource
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.anon.PartialIconPropsPartialIm
import typingsSlinky.reactNativeElements.anon.PartialImageProps
import typingsSlinky.reactNativeElements.mod.AvatarIcon
import typingsSlinky.reactNativeElements.mod.AvatarProps
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.large
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.medium
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.small
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.xlarge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Avatar {
  @JSImport("react-native-elements", "Avatar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeElements.mod.Avatar] {
    @scala.inline
    def Component(value: ReactComponentClass[js.Object]): this.type = set("Component", value.asInstanceOf[js.Any])
    @scala.inline
    def ImageComponent(value: ReactComponentClass[js.Object]): this.type = set("ImageComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def accessory(value: PartialIconPropsPartialIm): this.type = set("accessory", value.asInstanceOf[js.Any])
    @scala.inline
    def activeOpacity(value: Double): this.type = set("activeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def avatarStyle(value: ImageStyle): this.type = set("avatarStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def containerStyleNull: this.type = set("containerStyle", null)
    @scala.inline
    def icon(value: AvatarIcon): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def iconStyle(value: StyleProp[TextStyle]): this.type = set("iconStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def iconStyleNull: this.type = set("iconStyle", null)
    @scala.inline
    def imageProps(value: PartialImageProps): this.type = set("imageProps", value.asInstanceOf[js.Any])
    @scala.inline
    def onAccessoryPress(value: () => Unit): this.type = set("onAccessoryPress", js.Any.fromFunction0(value))
    @scala.inline
    def onLongPress(value: () => Unit): this.type = set("onLongPress", js.Any.fromFunction0(value))
    @scala.inline
    def onPress(value: () => Unit): this.type = set("onPress", js.Any.fromFunction0(value))
    @scala.inline
    def overlayContainerStyle(value: StyleProp[ViewStyle]): this.type = set("overlayContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def overlayContainerStyleNull: this.type = set("overlayContainerStyle", null)
    @scala.inline
    def placeholderStyle(value: StyleProp[ViewStyle]): this.type = set("placeholderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def placeholderStyleNull: this.type = set("placeholderStyle", null)
    @scala.inline
    def renderPlaceholderContent(value: ReactElement): this.type = set("renderPlaceholderContent", value.asInstanceOf[js.Any])
    @scala.inline
    def rounded(value: Boolean): this.type = set("rounded", value.asInstanceOf[js.Any])
    @scala.inline
    def showAccessory(value: Boolean): this.type = set("showAccessory", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: small | medium | large | xlarge | Double): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def sourceVarargs(value: ImageURISource*): this.type = set("source", js.Array(value :_*))
    @scala.inline
    def source(value: ImageSourcePropType): this.type = set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def titleStyle(value: StyleProp[TextStyle]): this.type = set("titleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def titleStyleNull: this.type = set("titleStyle", null)
  }
  
  def withProps(p: AvatarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Avatar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

