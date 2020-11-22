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
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNative.reactNativeStrings.`box-none`
import typingsSlinky.reactNative.reactNativeStrings.`box-only`
import typingsSlinky.reactNative.reactNativeStrings.`no-hide-descendants`
import typingsSlinky.reactNative.reactNativeStrings.assertive
import typingsSlinky.reactNative.reactNativeStrings.auto
import typingsSlinky.reactNative.reactNativeStrings.button
import typingsSlinky.reactNative.reactNativeStrings.no
import typingsSlinky.reactNative.reactNativeStrings.none
import typingsSlinky.reactNative.reactNativeStrings.polite
import typingsSlinky.reactNative.reactNativeStrings.radiobutton_checked
import typingsSlinky.reactNative.reactNativeStrings.radiobutton_unchecked
import typingsSlinky.reactNative.reactNativeStrings.resize
import typingsSlinky.reactNative.reactNativeStrings.scale
import typingsSlinky.reactNative.reactNativeStrings.yes
import typingsSlinky.reactNativeElements.anon.PartialImageProps
import typingsSlinky.reactNativeElements.mod.CardProps
import typingsSlinky.reactNativeElements.mod.ImageProps
import typingsSlinky.reactNativeElements.mod.TextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def imageVarargs(value: ImageURISource*): this.type = set("image", js.Array(value :_*))
    
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
  
  object Divider {
    
    @JSImport("react-native-elements", "Card.Divider")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
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
      def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): this.type = set("onAccessibilityAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAccessibilityEscape(value: () => Unit): this.type = set("onAccessibilityEscape", js.Any.fromFunction0(value))
      
      @scala.inline
      def onAccessibilityTap(value: () => Unit): this.type = set("onAccessibilityTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def onLayout(value: SyntheticEvent[NodeHandle, Layout] => Unit): this.type = set("onLayout", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMagicTap(value: () => Unit): this.type = set("onMagicTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def onMoveShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMoveShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResponderEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResponderGrant(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderGrant", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResponderMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResponderReject(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderReject", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResponderRelease(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderRelease", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResponderStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResponderTerminate(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderTerminate", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResponderTerminationRequest(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onResponderTerminationRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def onStartShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
      
      @scala.inline
      def onStartShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchCancel(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchEndCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchEndCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def pointerEvents(value: `box-none` | none | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def styleNull: this.type = set("style", null)
      
      @scala.inline
      def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: ViewProps): typingsSlinky.reactNativeElements.components.Card.Divider.Builder = new typingsSlinky.reactNativeElements.components.Card.Divider.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Divider.type): typingsSlinky.reactNativeElements.components.Card.Divider.Builder = new typingsSlinky.reactNativeElements.components.Card.Divider.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object FeaturedSubtitle {
    
    @JSImport("react-native-elements", "Card.FeaturedSubtitle")
    @js.native
    object component extends js.Object
    
    def withProps(p: TextProps): SharedBuilder_TextProps_219755688 = new SharedBuilder_TextProps_219755688(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: FeaturedSubtitle.type): SharedBuilder_TextProps_219755688 = new SharedBuilder_TextProps_219755688(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object FeaturedTitle {
    
    @JSImport("react-native-elements", "Card.FeaturedTitle")
    @js.native
    object component extends js.Object
    
    def withProps(p: TextProps): SharedBuilder_TextProps_219755688 = new SharedBuilder_TextProps_219755688(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: FeaturedTitle.type): SharedBuilder_TextProps_219755688 = new SharedBuilder_TextProps_219755688(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Image {
    
    @JSImport("react-native-elements", "Card.Image")
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
      def capInsets(value: Insets): this.type = set("capInsets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def containerStyleNull: this.type = set("containerStyle", null)
      
      @scala.inline
      def defaultSource(value: ImageURISource | Double): this.type = set("defaultSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def fadeDuration(value: Double): this.type = set("fadeDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def loadingIndicatorSource(value: ImageURISource): this.type = set("loadingIndicatorSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): this.type = set("onAccessibilityAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAccessibilityEscape(value: () => Unit): this.type = set("onAccessibilityEscape", js.Any.fromFunction0(value))
      
      @scala.inline
      def onAccessibilityTap(value: () => Unit): this.type = set("onAccessibilityTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def onError(value: SyntheticEvent[NodeHandle, ImageErrorEventData] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLayout(value: SyntheticEvent[NodeHandle, Layout] => Unit): this.type = set("onLayout", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoad(value: SyntheticEvent[NodeHandle, ImageLoadEventData] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadEnd(value: () => Unit): this.type = set("onLoadEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def onLoadStart(value: () => Unit): this.type = set("onLoadStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def onLongPress(value: () => Unit): this.type = set("onLongPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def onMagicTap(value: () => Unit): this.type = set("onMagicTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def onPartialLoad(value: () => Unit): this.type = set("onPartialLoad", js.Any.fromFunction0(value))
      
      @scala.inline
      def onPress(value: () => Unit): this.type = set("onPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def onProgress(value: SyntheticEvent[NodeHandle, ImageProgressEventDataIOS] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def placeholderStyle(value: StyleProp[ViewStyle]): this.type = set("placeholderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def placeholderStyleNull: this.type = set("placeholderStyle", null)
      
      @scala.inline
      def progressiveRenderingEnabled(value: Boolean): this.type = set("progressiveRenderingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def resizeMethod(value: auto | resize | scale): this.type = set("resizeMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def resizeMode(value: ImageResizeMode): this.type = set("resizeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: StyleProp[ImageStyle]): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def styleNull: this.type = set("style", null)
      
      @scala.inline
      def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def transition(value: Boolean): this.type = set("transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def transitionDuration(value: Double): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: ImageProps): typingsSlinky.reactNativeElements.components.Card.Image.Builder = new typingsSlinky.reactNativeElements.components.Card.Image.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(source: ImageSourcePropType): typingsSlinky.reactNativeElements.components.Card.Image.Builder = {
      val __props = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      new typingsSlinky.reactNativeElements.components.Card.Image.Builder(js.Array(this.component, __props.asInstanceOf[ImageProps]))
    }
  }
  
  object Title {
    
    @JSImport("react-native-elements", "Card.Title")
    @js.native
    object component extends js.Object
    
    def withProps(p: TextProps): SharedBuilder_TextProps_219755688 = new SharedBuilder_TextProps_219755688(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Title.type): SharedBuilder_TextProps_219755688 = new SharedBuilder_TextProps_219755688(js.Array(this.component, js.Dictionary.empty))()
  }
}
