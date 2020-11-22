package typingsSlinky.reactNativeElements.components

import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.AccessibilityValue
import typingsSlinky.reactNative.mod.BackgroundPropType
import typingsSlinky.reactNative.mod.ColorValue
import typingsSlinky.reactNative.mod.ImageErrorEventData
import typingsSlinky.reactNative.mod.ImageLoadEventData
import typingsSlinky.reactNative.mod.ImageProgressEventDataIOS
import typingsSlinky.reactNative.mod.ImageResizeMode
import typingsSlinky.reactNative.mod.ImageSourcePropType
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.ImageURISource
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TVParallaxProperties
import typingsSlinky.reactNative.mod.TargetedEvent
import typingsSlinky.reactNative.mod.TextLayoutEventData
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.anon.PartialIconPropsPartialIm
import typingsSlinky.reactNativeElements.anon.PartialImageProps
import typingsSlinky.reactNativeElements.mod.AvatarIcon
import typingsSlinky.reactNativeElements.mod.AvatarProps
import typingsSlinky.reactNativeElements.mod.IconType
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.all
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.assertive
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.auto
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.balanced
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.button
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.clip
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.email
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.head
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.highQuality
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.large
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.link
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.medium
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.middle
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.no
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.none
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.phoneNumber
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.polite
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.radiobutton_checked
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.radiobutton_unchecked
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.resize
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.scale
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.simple
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.small
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.tail
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.xlarge
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.yes
import typingsSlinky.reactNativeVectorIcons.iconMod.IconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  object Accessory {
    
    @JSImport("react-native-elements", "Avatar.Accessory")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def Component(value: ReactComponentClass[js.Object]): this.type = set("Component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def ImageComponentFunctionComponent(value: ReactComponentClass[_]): this.type = set("ImageComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def ImageComponentComponentClass(value: ReactComponentClass[_]): this.type = set("ImageComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def ImageComponent(value: ReactComponentClass[_]): this.type = set("ImageComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def PlaceholderContent(value: ReactElement): this.type = set("PlaceholderContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityActionsVarargs(value: AccessibilityActionInfo*): this.type = set("accessibilityActions", js.Array(value :_*))
      
      @scala.inline
      def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): this.type = set("accessibilityComponentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityElementsHidden(value: Boolean): this.type = set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityHint(value: String): this.type = set("accessibilityHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityIgnoresInvertColors(value: Boolean): this.type = set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityLiveRegion(value: none | polite | assertive): this.type = set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityRole(value: AccessibilityRole): this.type = set("accessibilityRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityState(value: AccessibilityState): this.type = set("accessibilityState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityTraitsVarargs(value: AccessibilityTrait*): this.type = set("accessibilityTraits", js.Array(value :_*))
      
      @scala.inline
      def accessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): this.type = set("accessibilityTraits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def activeOpacity(value: Double): this.type = set("activeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def adjustsFontSizeToFit(value: Boolean): this.type = set("adjustsFontSizeToFit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def allowFontScaling(value: Boolean): this.type = set("allowFontScaling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def background(value: BackgroundPropType): this.type = set("background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def blurRadius(value: Double): this.type = set("blurRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def borderBottomLeftRadius(value: Double): this.type = set("borderBottomLeftRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def borderBottomRightRadius(value: Double): this.type = set("borderBottomRightRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def borderRadius(value: Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def borderTopLeftRadius(value: Double): this.type = set("borderTopLeftRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def borderTopRightRadius(value: Double): this.type = set("borderTopRightRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def brand(value: Boolean): this.type = set("brand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def capInsets(value: Insets): this.type = set("capInsets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def containerStyleNull: this.type = set("containerStyle", null)
      
      @scala.inline
      def dataDetectorType(value: phoneNumber | link | email | none | all): this.type = set("dataDetectorType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dataDetectorTypeNull: this.type = set("dataDetectorType", null)
      
      @scala.inline
      def defaultSource(value: ImageURISource | Double): this.type = set("defaultSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def delayLongPress(value: Double): this.type = set("delayLongPress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def delayPressIn(value: Double): this.type = set("delayPressIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def delayPressOut(value: Double): this.type = set("delayPressOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabledNull: this.type = set("disabled", null)
      
      @scala.inline
      def disabledStyle(value: StyleProp[ViewStyle]): this.type = set("disabledStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabledStyleNull: this.type = set("disabledStyle", null)
      
      @scala.inline
      def ellipsizeMode(value: head | middle | tail | clip): this.type = set("ellipsizeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def fadeDuration(value: Double): this.type = set("fadeDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def iconProps(value: IconProps): this.type = set("iconProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def iconStyle(value: TextStyle): this.type = set("iconStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def lineBreakMode(value: head | middle | tail | clip): this.type = set("lineBreakMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def loadingIndicatorSource(value: ImageURISource): this.type = set("loadingIndicatorSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def maxFontSizeMultiplier(value: Double): this.type = set("maxFontSizeMultiplier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def maxFontSizeMultiplierNull: this.type = set("maxFontSizeMultiplier", null)
      
      @scala.inline
      def minimumFontScale(value: Double): this.type = set("minimumFontScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def numberOfLines(value: Double): this.type = set("numberOfLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): this.type = set("onAccessibilityAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAccessibilityEscape(value: () => Unit): this.type = set("onAccessibilityEscape", js.Any.fromFunction0(value))
      
      @scala.inline
      def onAccessibilityTap(value: () => Unit): this.type = set("onAccessibilityTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def onBlur(value: SyntheticEvent[NodeHandle, TargetedEvent] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def onError(value: SyntheticEvent[NodeHandle, ImageErrorEventData] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def onFocus(value: SyntheticEvent[NodeHandle, TargetedEvent] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def onHideUnderlay(value: () => Unit): this.type = set("onHideUnderlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def onLayout(value: SyntheticEvent[NodeHandle, Layout] => Unit): this.type = set("onLayout", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoad(value: SyntheticEvent[NodeHandle, ImageLoadEventData] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadEnd(value: () => Unit): this.type = set("onLoadEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def onLoadStart(value: () => Unit): this.type = set("onLoadStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def onMagicTap(value: () => Unit): this.type = set("onMagicTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def onPartialLoad(value: () => Unit): this.type = set("onPartialLoad", js.Any.fromFunction0(value))
      
      @scala.inline
      def onPressIn(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onPressIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPressOut(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onPressOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def onProgress(value: SyntheticEvent[NodeHandle, ImageProgressEventDataIOS] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def onShowUnderlay(value: () => Unit): this.type = set("onShowUnderlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def onTextLayout(value: SyntheticEvent[NodeHandle, TextLayoutEventData] => Unit): this.type = set("onTextLayout", js.Any.fromFunction1(value))
      
      @scala.inline
      def placeholderStyle(value: StyleProp[ViewStyle]): this.type = set("placeholderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def placeholderStyleNull: this.type = set("placeholderStyle", null)
      
      @scala.inline
      def pressRetentionOffset(value: Insets): this.type = set("pressRetentionOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def progressiveRenderingEnabled(value: Boolean): this.type = set("progressiveRenderingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def raised(value: Boolean): this.type = set("raised", value.asInstanceOf[js.Any])
      
      @scala.inline
      def resizeMethod(value: auto | resize | scale): this.type = set("resizeMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def resizeMode(value: ImageResizeMode): this.type = set("resizeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def reverseColor(value: String): this.type = set("reverseColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def selectionColor(value: ColorValue): this.type = set("selectionColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def solid(value: Boolean): this.type = set("solid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def sourceVarargs(value: ImageURISource*): this.type = set("source", js.Array(value :_*))
      
      @scala.inline
      def source(value: ImageSourcePropType): this.type = set("source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suppressHighlighting(value: Boolean): this.type = set("suppressHighlighting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def textBreakStrategy(value: simple | highQuality | balanced): this.type = set("textBreakStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def touchSoundDisabled(value: Boolean): this.type = set("touchSoundDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def touchSoundDisabledNull: this.type = set("touchSoundDisabled", null)
      
      @scala.inline
      def transition(value: Boolean): this.type = set("transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def transitionDuration(value: Double): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `type`(value: IconType): this.type = set("type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def underlayColor(value: ColorValue): this.type = set("underlayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def useForeground(value: Boolean): this.type = set("useForeground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: PartialIconPropsPartialIm): typingsSlinky.reactNativeElements.components.Avatar.Accessory.Builder = new typingsSlinky.reactNativeElements.components.Avatar.Accessory.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(
      onLongPress: (js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]) with js.UndefOr[js.Function0[Unit]],
      onPress: (js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]) with js.UndefOr[js.Function0[Unit]],
      style: (js.UndefOr[ViewStyle | TextStyle]) with js.UndefOr[StyleProp[ImageStyle]]
    ): typingsSlinky.reactNativeElements.components.Avatar.Accessory.Builder = {
      val __props = js.Dynamic.literal(onLongPress = onLongPress.asInstanceOf[js.Any], onPress = onPress.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      new typingsSlinky.reactNativeElements.components.Avatar.Accessory.Builder(js.Array(this.component, __props.asInstanceOf[PartialIconPropsPartialIm]))
    }
  }
}
