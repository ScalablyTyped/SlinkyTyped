package typingsSlinky.reactNativeElements.anon

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.ImageSourcePropType
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.ImageURISource
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.AvatarIcon
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.large
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.medium
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.small
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.xlarge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements.AvatarProps> */
@js.native
trait PartialAvatarProps extends StObject {
  
  var Component: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  
  var ImageComponent: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  
  var activeOpacity: js.UndefOr[Double] = js.native
  
  var avatarStyle: js.UndefOr[ImageStyle] = js.native
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var icon: js.UndefOr[AvatarIcon] = js.native
  
  var iconStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var imageProps: js.UndefOr[PartialImageProps] = js.native
  
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var overlayContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var placeholderStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var renderPlaceholderContent: js.UndefOr[ReactElement] = js.native
  
  var rounded: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[small | medium | large | xlarge | Double] = js.native
  
  var source: js.UndefOr[ImageSourcePropType] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
}
object PartialAvatarProps {
  
  @scala.inline
  def apply(): PartialAvatarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAvatarProps]
  }
  
  @scala.inline
  implicit class PartialAvatarPropsMutableBuilder[Self <: PartialAvatarProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    
    @scala.inline
    def setAvatarStyle(value: ImageStyle): Self = StObject.set(x, "avatarStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatarStyleUndefined: Self = StObject.set(x, "avatarStyle", js.undefined)
    
    @scala.inline
    def setComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    @scala.inline
    def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    @scala.inline
    def setIcon(value: AvatarIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconStyleNull: Self = StObject.set(x, "iconStyle", null)
    
    @scala.inline
    def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setImageComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "ImageComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageComponentUndefined: Self = StObject.set(x, "ImageComponent", js.undefined)
    
    @scala.inline
    def setImageProps(value: PartialImageProps): Self = StObject.set(x, "imageProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePropsUndefined: Self = StObject.set(x, "imageProps", js.undefined)
    
    @scala.inline
    def setOnLongPress(value: () => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setOverlayContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "overlayContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayContainerStyleNull: Self = StObject.set(x, "overlayContainerStyle", null)
    
    @scala.inline
    def setOverlayContainerStyleUndefined: Self = StObject.set(x, "overlayContainerStyle", js.undefined)
    
    @scala.inline
    def setPlaceholderStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "placeholderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderStyleNull: Self = StObject.set(x, "placeholderStyle", null)
    
    @scala.inline
    def setPlaceholderStyleUndefined: Self = StObject.set(x, "placeholderStyle", js.undefined)
    
    @scala.inline
    def setRenderPlaceholderContent(value: ReactElement): Self = StObject.set(x, "renderPlaceholderContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderPlaceholderContentUndefined: Self = StObject.set(x, "renderPlaceholderContent", js.undefined)
    
    @scala.inline
    def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
    
    @scala.inline
    def setSize(value: small | medium | large | xlarge | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSource(value: ImageSourcePropType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setSourceVarargs(value: ImageURISource*): Self = StObject.set(x, "source", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    @scala.inline
    def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
