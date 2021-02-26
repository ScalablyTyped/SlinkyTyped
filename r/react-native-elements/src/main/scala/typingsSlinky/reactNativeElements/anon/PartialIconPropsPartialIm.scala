package typingsSlinky.reactNativeElements.anon

import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
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
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.link
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
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.tail
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.yes
import typingsSlinky.reactNativeVectorIcons.iconMod.IconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements.IconProps> & std.Partial<react-native-elements.react-native-elements.ImageProps> */
@js.native
trait PartialIconPropsPartialIm extends StObject {
  
  var Component: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  
  var ImageComponent: js.UndefOr[ReactComponentClass[_]] = js.native
  
  var PlaceholderContent: js.UndefOr[ReactElement] = js.native
  
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.native
  
  var accessibilityComponentType: js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked] = js.native
  
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.native
  
  var accessibilityHint: js.UndefOr[String] = js.native
  
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.native
  
  var accessibilityLabel: js.UndefOr[String] = js.native
  
  var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.native
  
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.native
  
  var accessibilityState: js.UndefOr[AccessibilityState] = js.native
  
  var accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.native
  
  var accessibilityValue: js.UndefOr[AccessibilityValue] = js.native
  
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.native
  
  var accessible: js.UndefOr[Boolean] = js.native
  
  var activeOpacity: js.UndefOr[Double] = js.native
  
  var adjustsFontSizeToFit: js.UndefOr[Boolean] = js.native
  
  var allowFontScaling: js.UndefOr[Boolean] = js.native
  
  var background: js.UndefOr[BackgroundPropType] = js.native
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var blurRadius: js.UndefOr[Double] = js.native
  
  var borderBottomLeftRadius: js.UndefOr[Double] = js.native
  
  var borderBottomRightRadius: js.UndefOr[Double] = js.native
  
  var borderRadius: js.UndefOr[Double] = js.native
  
  var borderTopLeftRadius: js.UndefOr[Double] = js.native
  
  var borderTopRightRadius: js.UndefOr[Double] = js.native
  
  var brand: js.UndefOr[Boolean] = js.native
  
  var capInsets: js.UndefOr[Insets] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var dataDetectorType: js.UndefOr[Null | phoneNumber | link | email | none | all] = js.native
  
  var defaultSource: js.UndefOr[ImageURISource | Double] = js.native
  
  var delayLongPress: js.UndefOr[Double] = js.native
  
  var delayPressIn: js.UndefOr[Double] = js.native
  
  var delayPressOut: js.UndefOr[Double] = js.native
  
  var disabled: js.UndefOr[Boolean | Null] = js.native
  
  var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var ellipsizeMode: js.UndefOr[head | middle | tail | clip] = js.native
  
  var fadeDuration: js.UndefOr[Double] = js.native
  
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var hitSlop: js.UndefOr[Insets] = js.native
  
  var iconProps: js.UndefOr[IconProps] = js.native
  
  var iconStyle: js.UndefOr[TextStyle] = js.native
  
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.native
  
  var lineBreakMode: js.UndefOr[head | middle | tail | clip] = js.native
  
  var loadingIndicatorSource: js.UndefOr[ImageURISource] = js.native
  
  var maxFontSizeMultiplier: js.UndefOr[Double | Null] = js.native
  
  var minimumFontScale: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var nativeID: js.UndefOr[String] = js.native
  
  var numberOfLines: js.UndefOr[Double] = js.native
  
  var onAccessibilityAction: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]] = js.native
  
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onBlur: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TargetedEvent], Unit]] = js.native
  
  var onError: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageErrorEventData], Unit]] = js.native
  
  var onFocus: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TargetedEvent], Unit]] = js.native
  
  var onHideUnderlay: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onLayout: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, Layout], Unit]] = js.native
  
  var onLoad: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageLoadEventData], Unit]] = js.native
  
  var onLoadEnd: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onLoadStart: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onLongPress: (js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]) with js.UndefOr[js.Function0[Unit]] = js.native
  
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPartialLoad: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPress: (js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]) with js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPressIn: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onPressOut: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onProgress: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageProgressEventDataIOS], Unit]] = js.native
  
  var onShowUnderlay: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onTextLayout: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextLayoutEventData], Unit]] = js.native
  
  var placeholderStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var pressRetentionOffset: js.UndefOr[Insets] = js.native
  
  var progressiveRenderingEnabled: js.UndefOr[Boolean] = js.native
  
  var raised: js.UndefOr[Boolean] = js.native
  
  var resizeMethod: js.UndefOr[auto | resize | scale] = js.native
  
  var resizeMode: js.UndefOr[ImageResizeMode] = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var reverseColor: js.UndefOr[String] = js.native
  
  var selectable: js.UndefOr[Boolean] = js.native
  
  var selectionColor: js.UndefOr[ColorValue] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var solid: js.UndefOr[Boolean] = js.native
  
  var source: js.UndefOr[ImageSourcePropType] = js.native
  
  var style: (js.UndefOr[ViewStyle | TextStyle]) with js.UndefOr[StyleProp[ImageStyle]] = js.native
  
  var suppressHighlighting: js.UndefOr[Boolean] = js.native
  
  var testID: js.UndefOr[String] = js.native
  
  var textBreakStrategy: js.UndefOr[simple | highQuality | balanced] = js.native
  
  var touchSoundDisabled: js.UndefOr[Boolean | Null] = js.native
  
  var transition: js.UndefOr[Boolean] = js.native
  
  var transitionDuration: js.UndefOr[Double] = js.native
  
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.native
  
  var `type`: js.UndefOr[IconType] = js.native
  
  var underlayColor: js.UndefOr[ColorValue] = js.native
  
  var useForeground: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object PartialIconPropsPartialIm {
  
  @scala.inline
  def apply(
    onLongPress: (js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]) with js.UndefOr[js.Function0[Unit]],
    onPress: (js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]) with js.UndefOr[js.Function0[Unit]],
    style: (js.UndefOr[ViewStyle | TextStyle]) with js.UndefOr[StyleProp[ImageStyle]]
  ): PartialIconPropsPartialIm = {
    val __obj = js.Dynamic.literal(onLongPress = onLongPress.asInstanceOf[js.Any], onPress = onPress.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIconPropsPartialIm]
  }
  
  @scala.inline
  implicit class PartialIconPropsPartialImMutableBuilder[Self <: PartialIconPropsPartialIm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
    
    @scala.inline
    def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value :_*))
    
    @scala.inline
    def setAccessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): Self = StObject.set(x, "accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityComponentTypeUndefined: Self = StObject.set(x, "accessibilityComponentType", js.undefined)
    
    @scala.inline
    def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
    
    @scala.inline
    def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
    
    @scala.inline
    def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityLiveRegion(value: none | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
    
    @scala.inline
    def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
    
    @scala.inline
    def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    @scala.inline
    def setAccessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): Self = StObject.set(x, "accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityTraitsUndefined: Self = StObject.set(x, "accessibilityTraits", js.undefined)
    
    @scala.inline
    def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = StObject.set(x, "accessibilityTraits", js.Array(value :_*))
    
    @scala.inline
    def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
    
    @scala.inline
    def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
    
    @scala.inline
    def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    @scala.inline
    def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    
    @scala.inline
    def setAdjustsFontSizeToFit(value: Boolean): Self = StObject.set(x, "adjustsFontSizeToFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustsFontSizeToFitUndefined: Self = StObject.set(x, "adjustsFontSizeToFit", js.undefined)
    
    @scala.inline
    def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
    
    @scala.inline
    def setBackground(value: BackgroundPropType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBlurRadius(value: Double): Self = StObject.set(x, "blurRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurRadiusUndefined: Self = StObject.set(x, "blurRadius", js.undefined)
    
    @scala.inline
    def setBorderBottomLeftRadius(value: Double): Self = StObject.set(x, "borderBottomLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomLeftRadiusUndefined: Self = StObject.set(x, "borderBottomLeftRadius", js.undefined)
    
    @scala.inline
    def setBorderBottomRightRadius(value: Double): Self = StObject.set(x, "borderBottomRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomRightRadiusUndefined: Self = StObject.set(x, "borderBottomRightRadius", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    @scala.inline
    def setBorderTopLeftRadius(value: Double): Self = StObject.set(x, "borderTopLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopLeftRadiusUndefined: Self = StObject.set(x, "borderTopLeftRadius", js.undefined)
    
    @scala.inline
    def setBorderTopRightRadius(value: Double): Self = StObject.set(x, "borderTopRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopRightRadiusUndefined: Self = StObject.set(x, "borderTopRightRadius", js.undefined)
    
    @scala.inline
    def setBrand(value: Boolean): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    @scala.inline
    def setCapInsets(value: Insets): Self = StObject.set(x, "capInsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapInsetsUndefined: Self = StObject.set(x, "capInsets", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
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
    def setDataDetectorType(value: phoneNumber | link | email | none | all): Self = StObject.set(x, "dataDetectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataDetectorTypeNull: Self = StObject.set(x, "dataDetectorType", null)
    
    @scala.inline
    def setDataDetectorTypeUndefined: Self = StObject.set(x, "dataDetectorType", js.undefined)
    
    @scala.inline
    def setDefaultSource(value: ImageURISource | Double): Self = StObject.set(x, "defaultSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSourceUndefined: Self = StObject.set(x, "defaultSource", js.undefined)
    
    @scala.inline
    def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
    
    @scala.inline
    def setDelayPressIn(value: Double): Self = StObject.set(x, "delayPressIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayPressInUndefined: Self = StObject.set(x, "delayPressIn", js.undefined)
    
    @scala.inline
    def setDelayPressOut(value: Double): Self = StObject.set(x, "delayPressOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayPressOutUndefined: Self = StObject.set(x, "delayPressOut", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    @scala.inline
    def setDisabledStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledStyleNull: Self = StObject.set(x, "disabledStyle", null)
    
    @scala.inline
    def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setEllipsizeMode(value: head | middle | tail | clip): Self = StObject.set(x, "ellipsizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsizeModeUndefined: Self = StObject.set(x, "ellipsizeMode", js.undefined)
    
    @scala.inline
    def setFadeDuration(value: Double): Self = StObject.set(x, "fadeDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeDurationUndefined: Self = StObject.set(x, "fadeDuration", js.undefined)
    
    @scala.inline
    def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    @scala.inline
    def setIconProps(value: IconProps): Self = StObject.set(x, "iconProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconPropsUndefined: Self = StObject.set(x, "iconProps", js.undefined)
    
    @scala.inline
    def setIconStyle(value: TextStyle): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
    
    @scala.inline
    def setImageComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "ImageComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageComponentComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "ImageComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageComponentFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "ImageComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageComponentUndefined: Self = StObject.set(x, "ImageComponent", js.undefined)
    
    @scala.inline
    def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    @scala.inline
    def setLineBreakMode(value: head | middle | tail | clip): Self = StObject.set(x, "lineBreakMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineBreakModeUndefined: Self = StObject.set(x, "lineBreakMode", js.undefined)
    
    @scala.inline
    def setLoadingIndicatorSource(value: ImageURISource): Self = StObject.set(x, "loadingIndicatorSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingIndicatorSourceUndefined: Self = StObject.set(x, "loadingIndicatorSource", js.undefined)
    
    @scala.inline
    def setMaxFontSizeMultiplier(value: Double): Self = StObject.set(x, "maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFontSizeMultiplierNull: Self = StObject.set(x, "maxFontSizeMultiplier", null)
    
    @scala.inline
    def setMaxFontSizeMultiplierUndefined: Self = StObject.set(x, "maxFontSizeMultiplier", js.undefined)
    
    @scala.inline
    def setMinimumFontScale(value: Double): Self = StObject.set(x, "minimumFontScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumFontScaleUndefined: Self = StObject.set(x, "minimumFontScale", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    @scala.inline
    def setNumberOfLines(value: Double): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfLinesUndefined: Self = StObject.set(x, "numberOfLines", js.undefined)
    
    @scala.inline
    def setOnAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    @scala.inline
    def setOnAccessibilityEscape(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    @scala.inline
    def setOnAccessibilityTap(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
    @scala.inline
    def setOnBlur(value: SyntheticEvent[NodeHandle, TargetedEvent] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnError(value: SyntheticEvent[NodeHandle, ImageErrorEventData] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnFocus(value: SyntheticEvent[NodeHandle, TargetedEvent] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnHideUnderlay(value: () => Unit): Self = StObject.set(x, "onHideUnderlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHideUnderlayUndefined: Self = StObject.set(x, "onHideUnderlay", js.undefined)
    
    @scala.inline
    def setOnLayout(value: SyntheticEvent[NodeHandle, Layout] => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    @scala.inline
    def setOnLoad(value: SyntheticEvent[NodeHandle, ImageLoadEventData] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadEnd(value: () => Unit): Self = StObject.set(x, "onLoadEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLoadEndUndefined: Self = StObject.set(x, "onLoadEnd", js.undefined)
    
    @scala.inline
    def setOnLoadStart(value: () => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    @scala.inline
    def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    @scala.inline
    def setOnLongPress(
      value: (js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]) with js.UndefOr[js.Function0[Unit]]
    ): Self = StObject.set(x, "onLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMagicTap(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    @scala.inline
    def setOnPartialLoad(value: () => Unit): Self = StObject.set(x, "onPartialLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPartialLoadUndefined: Self = StObject.set(x, "onPartialLoad", js.undefined)
    
    @scala.inline
    def setOnPress(
      value: (js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]) with js.UndefOr[js.Function0[Unit]]
    ): Self = StObject.set(x, "onPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPressIn(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
    
    @scala.inline
    def setOnPressOut(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
    
    @scala.inline
    def setOnProgress(value: SyntheticEvent[NodeHandle, ImageProgressEventDataIOS] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    @scala.inline
    def setOnShowUnderlay(value: () => Unit): Self = StObject.set(x, "onShowUnderlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShowUnderlayUndefined: Self = StObject.set(x, "onShowUnderlay", js.undefined)
    
    @scala.inline
    def setOnTextLayout(value: SyntheticEvent[NodeHandle, TextLayoutEventData] => Unit): Self = StObject.set(x, "onTextLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTextLayoutUndefined: Self = StObject.set(x, "onTextLayout", js.undefined)
    
    @scala.inline
    def setPlaceholderContent(value: ReactElement): Self = StObject.set(x, "PlaceholderContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderContentUndefined: Self = StObject.set(x, "PlaceholderContent", js.undefined)
    
    @scala.inline
    def setPlaceholderStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "placeholderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderStyleNull: Self = StObject.set(x, "placeholderStyle", null)
    
    @scala.inline
    def setPlaceholderStyleUndefined: Self = StObject.set(x, "placeholderStyle", js.undefined)
    
    @scala.inline
    def setPressRetentionOffset(value: Insets): Self = StObject.set(x, "pressRetentionOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressRetentionOffsetUndefined: Self = StObject.set(x, "pressRetentionOffset", js.undefined)
    
    @scala.inline
    def setProgressiveRenderingEnabled(value: Boolean): Self = StObject.set(x, "progressiveRenderingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressiveRenderingEnabledUndefined: Self = StObject.set(x, "progressiveRenderingEnabled", js.undefined)
    
    @scala.inline
    def setRaised(value: Boolean): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaisedUndefined: Self = StObject.set(x, "raised", js.undefined)
    
    @scala.inline
    def setResizeMethod(value: auto | resize | scale): Self = StObject.set(x, "resizeMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeMethodUndefined: Self = StObject.set(x, "resizeMethod", js.undefined)
    
    @scala.inline
    def setResizeMode(value: ImageResizeMode): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseColor(value: String): Self = StObject.set(x, "reverseColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseColorUndefined: Self = StObject.set(x, "reverseColor", js.undefined)
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    @scala.inline
    def setSelectionColor(value: ColorValue): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSolid(value: Boolean): Self = StObject.set(x, "solid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolidUndefined: Self = StObject.set(x, "solid", js.undefined)
    
    @scala.inline
    def setSource(value: ImageSourcePropType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setSourceVarargs(value: ImageURISource*): Self = StObject.set(x, "source", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: (js.UndefOr[ViewStyle | TextStyle]) with js.UndefOr[StyleProp[ImageStyle]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressHighlighting(value: Boolean): Self = StObject.set(x, "suppressHighlighting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressHighlightingUndefined: Self = StObject.set(x, "suppressHighlighting", js.undefined)
    
    @scala.inline
    def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    @scala.inline
    def setTextBreakStrategy(value: simple | highQuality | balanced): Self = StObject.set(x, "textBreakStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBreakStrategyUndefined: Self = StObject.set(x, "textBreakStrategy", js.undefined)
    
    @scala.inline
    def setTouchSoundDisabled(value: Boolean): Self = StObject.set(x, "touchSoundDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchSoundDisabledNull: Self = StObject.set(x, "touchSoundDisabled", null)
    
    @scala.inline
    def setTouchSoundDisabledUndefined: Self = StObject.set(x, "touchSoundDisabled", js.undefined)
    
    @scala.inline
    def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    @scala.inline
    def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
    
    @scala.inline
    def setType(value: IconType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnderlayColor(value: ColorValue): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    
    @scala.inline
    def setUseForeground(value: Boolean): Self = StObject.set(x, "useForeground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseForegroundUndefined: Self = StObject.set(x, "useForeground", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
