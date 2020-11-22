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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements.IconProps> & std.Partial<react-native-elements.react-native-elements.ImageProps> */
@js.native
trait PartialIconPropsPartialIm extends js.Object {
  
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
  implicit class PartialIconPropsPartialImOps[Self <: PartialIconPropsPartialIm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnLongPress(
      value: (js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]) with js.UndefOr[js.Function0[Unit]]
    ): Self = this.set("onLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPress(
      value: (js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]) with js.UndefOr[js.Function0[Unit]]
    ): Self = this.set("onPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: (js.UndefOr[ViewStyle | TextStyle]) with js.UndefOr[StyleProp[ImageStyle]]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: ReactComponentClass[js.Object]): Self = this.set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("Component", js.undefined)
    
    @scala.inline
    def setImageComponentFunctionComponent(value: ReactComponentClass[_]): Self = this.set("ImageComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageComponentComponentClass(value: ReactComponentClass[_]): Self = this.set("ImageComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageComponent(value: ReactComponentClass[_]): Self = this.set("ImageComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageComponent: Self = this.set("ImageComponent", js.undefined)
    
    @scala.inline
    def setPlaceholderContent(value: ReactElement): Self = this.set("PlaceholderContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderContent: Self = this.set("PlaceholderContent", js.undefined)
    
    @scala.inline
    def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = this.set("accessibilityActions", js.Array(value :_*))
    
    @scala.inline
    def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = this.set("accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityActions: Self = this.set("accessibilityActions", js.undefined)
    
    @scala.inline
    def setAccessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): Self = this.set("accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityComponentType: Self = this.set("accessibilityComponentType", js.undefined)
    
    @scala.inline
    def setAccessibilityElementsHidden(value: Boolean): Self = this.set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityElementsHidden: Self = this.set("accessibilityElementsHidden", js.undefined)
    
    @scala.inline
    def setAccessibilityHint(value: String): Self = this.set("accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityHint: Self = this.set("accessibilityHint", js.undefined)
    
    @scala.inline
    def setAccessibilityIgnoresInvertColors(value: Boolean): Self = this.set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityIgnoresInvertColors: Self = this.set("accessibilityIgnoresInvertColors", js.undefined)
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityLiveRegion(value: none | polite | assertive): Self = this.set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLiveRegion: Self = this.set("accessibilityLiveRegion", js.undefined)
    
    @scala.inline
    def setAccessibilityRole(value: AccessibilityRole): Self = this.set("accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityRole: Self = this.set("accessibilityRole", js.undefined)
    
    @scala.inline
    def setAccessibilityState(value: AccessibilityState): Self = this.set("accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityState: Self = this.set("accessibilityState", js.undefined)
    
    @scala.inline
    def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = this.set("accessibilityTraits", js.Array(value :_*))
    
    @scala.inline
    def setAccessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): Self = this.set("accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityTraits: Self = this.set("accessibilityTraits", js.undefined)
    
    @scala.inline
    def setAccessibilityValue(value: AccessibilityValue): Self = this.set("accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityValue: Self = this.set("accessibilityValue", js.undefined)
    
    @scala.inline
    def setAccessibilityViewIsModal(value: Boolean): Self = this.set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityViewIsModal: Self = this.set("accessibilityViewIsModal", js.undefined)
    
    @scala.inline
    def setAccessible(value: Boolean): Self = this.set("accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessible: Self = this.set("accessible", js.undefined)
    
    @scala.inline
    def setActiveOpacity(value: Double): Self = this.set("activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveOpacity: Self = this.set("activeOpacity", js.undefined)
    
    @scala.inline
    def setAdjustsFontSizeToFit(value: Boolean): Self = this.set("adjustsFontSizeToFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjustsFontSizeToFit: Self = this.set("adjustsFontSizeToFit", js.undefined)
    
    @scala.inline
    def setAllowFontScaling(value: Boolean): Self = this.set("allowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFontScaling: Self = this.set("allowFontScaling", js.undefined)
    
    @scala.inline
    def setBackground(value: BackgroundPropType): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBlurRadius(value: Double): Self = this.set("blurRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlurRadius: Self = this.set("blurRadius", js.undefined)
    
    @scala.inline
    def setBorderBottomLeftRadius(value: Double): Self = this.set("borderBottomLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBottomLeftRadius: Self = this.set("borderBottomLeftRadius", js.undefined)
    
    @scala.inline
    def setBorderBottomRightRadius(value: Double): Self = this.set("borderBottomRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBottomRightRadius: Self = this.set("borderBottomRightRadius", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    
    @scala.inline
    def setBorderTopLeftRadius(value: Double): Self = this.set("borderTopLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderTopLeftRadius: Self = this.set("borderTopLeftRadius", js.undefined)
    
    @scala.inline
    def setBorderTopRightRadius(value: Double): Self = this.set("borderTopRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderTopRightRadius: Self = this.set("borderTopRightRadius", js.undefined)
    
    @scala.inline
    def setBrand(value: Boolean): Self = this.set("brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrand: Self = this.set("brand", js.undefined)
    
    @scala.inline
    def setCapInsets(value: Insets): Self = this.set("capInsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapInsets: Self = this.set("capInsets", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    
    @scala.inline
    def setDataDetectorType(value: phoneNumber | link | email | none | all): Self = this.set("dataDetectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataDetectorType: Self = this.set("dataDetectorType", js.undefined)
    
    @scala.inline
    def setDataDetectorTypeNull: Self = this.set("dataDetectorType", null)
    
    @scala.inline
    def setDefaultSource(value: ImageURISource | Double): Self = this.set("defaultSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSource: Self = this.set("defaultSource", js.undefined)
    
    @scala.inline
    def setDelayLongPress(value: Double): Self = this.set("delayLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayLongPress: Self = this.set("delayLongPress", js.undefined)
    
    @scala.inline
    def setDelayPressIn(value: Double): Self = this.set("delayPressIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayPressIn: Self = this.set("delayPressIn", js.undefined)
    
    @scala.inline
    def setDelayPressOut(value: Double): Self = this.set("delayPressOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayPressOut: Self = this.set("delayPressOut", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDisabledNull: Self = this.set("disabled", null)
    
    @scala.inline
    def setDisabledStyle(value: StyleProp[ViewStyle]): Self = this.set("disabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledStyle: Self = this.set("disabledStyle", js.undefined)
    
    @scala.inline
    def setDisabledStyleNull: Self = this.set("disabledStyle", null)
    
    @scala.inline
    def setEllipsizeMode(value: head | middle | tail | clip): Self = this.set("ellipsizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEllipsizeMode: Self = this.set("ellipsizeMode", js.undefined)
    
    @scala.inline
    def setFadeDuration(value: Double): Self = this.set("fadeDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFadeDuration: Self = this.set("fadeDuration", js.undefined)
    
    @scala.inline
    def setHasTVPreferredFocus(value: Boolean): Self = this.set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasTVPreferredFocus: Self = this.set("hasTVPreferredFocus", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHitSlop(value: Insets): Self = this.set("hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitSlop: Self = this.set("hitSlop", js.undefined)
    
    @scala.inline
    def setIconProps(value: IconProps): Self = this.set("iconProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconProps: Self = this.set("iconProps", js.undefined)
    
    @scala.inline
    def setIconStyle(value: TextStyle): Self = this.set("iconStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconStyle: Self = this.set("iconStyle", js.undefined)
    
    @scala.inline
    def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = this.set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportantForAccessibility: Self = this.set("importantForAccessibility", js.undefined)
    
    @scala.inline
    def setLineBreakMode(value: head | middle | tail | clip): Self = this.set("lineBreakMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineBreakMode: Self = this.set("lineBreakMode", js.undefined)
    
    @scala.inline
    def setLoadingIndicatorSource(value: ImageURISource): Self = this.set("loadingIndicatorSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingIndicatorSource: Self = this.set("loadingIndicatorSource", js.undefined)
    
    @scala.inline
    def setMaxFontSizeMultiplier(value: Double): Self = this.set("maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFontSizeMultiplier: Self = this.set("maxFontSizeMultiplier", js.undefined)
    
    @scala.inline
    def setMaxFontSizeMultiplierNull: Self = this.set("maxFontSizeMultiplier", null)
    
    @scala.inline
    def setMinimumFontScale(value: Double): Self = this.set("minimumFontScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumFontScale: Self = this.set("minimumFontScale", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNativeID(value: String): Self = this.set("nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeID: Self = this.set("nativeID", js.undefined)
    
    @scala.inline
    def setNumberOfLines(value: Double): Self = this.set("numberOfLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfLines: Self = this.set("numberOfLines", js.undefined)
    
    @scala.inline
    def setOnAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): Self = this.set("onAccessibilityAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAccessibilityAction: Self = this.set("onAccessibilityAction", js.undefined)
    
    @scala.inline
    def setOnAccessibilityEscape(value: () => Unit): Self = this.set("onAccessibilityEscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnAccessibilityEscape: Self = this.set("onAccessibilityEscape", js.undefined)
    
    @scala.inline
    def setOnAccessibilityTap(value: () => Unit): Self = this.set("onAccessibilityTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnAccessibilityTap: Self = this.set("onAccessibilityTap", js.undefined)
    
    @scala.inline
    def setOnBlur(value: SyntheticEvent[NodeHandle, TargetedEvent] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnError(value: SyntheticEvent[NodeHandle, ImageErrorEventData] => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnFocus(value: SyntheticEvent[NodeHandle, TargetedEvent] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnHideUnderlay(value: () => Unit): Self = this.set("onHideUnderlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnHideUnderlay: Self = this.set("onHideUnderlay", js.undefined)
    
    @scala.inline
    def setOnLayout(value: SyntheticEvent[NodeHandle, Layout] => Unit): Self = this.set("onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLayout: Self = this.set("onLayout", js.undefined)
    
    @scala.inline
    def setOnLoad(value: SyntheticEvent[NodeHandle, ImageLoadEventData] => Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setOnLoadEnd(value: () => Unit): Self = this.set("onLoadEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnLoadEnd: Self = this.set("onLoadEnd", js.undefined)
    
    @scala.inline
    def setOnLoadStart(value: () => Unit): Self = this.set("onLoadStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnLoadStart: Self = this.set("onLoadStart", js.undefined)
    
    @scala.inline
    def setOnMagicTap(value: () => Unit): Self = this.set("onMagicTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnMagicTap: Self = this.set("onMagicTap", js.undefined)
    
    @scala.inline
    def setOnPartialLoad(value: () => Unit): Self = this.set("onPartialLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPartialLoad: Self = this.set("onPartialLoad", js.undefined)
    
    @scala.inline
    def setOnPressIn(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onPressIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPressIn: Self = this.set("onPressIn", js.undefined)
    
    @scala.inline
    def setOnPressOut(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onPressOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPressOut: Self = this.set("onPressOut", js.undefined)
    
    @scala.inline
    def setOnProgress(value: SyntheticEvent[NodeHandle, ImageProgressEventDataIOS] => Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    
    @scala.inline
    def setOnShowUnderlay(value: () => Unit): Self = this.set("onShowUnderlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnShowUnderlay: Self = this.set("onShowUnderlay", js.undefined)
    
    @scala.inline
    def setOnTextLayout(value: SyntheticEvent[NodeHandle, TextLayoutEventData] => Unit): Self = this.set("onTextLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTextLayout: Self = this.set("onTextLayout", js.undefined)
    
    @scala.inline
    def setPlaceholderStyle(value: StyleProp[ViewStyle]): Self = this.set("placeholderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderStyle: Self = this.set("placeholderStyle", js.undefined)
    
    @scala.inline
    def setPlaceholderStyleNull: Self = this.set("placeholderStyle", null)
    
    @scala.inline
    def setPressRetentionOffset(value: Insets): Self = this.set("pressRetentionOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePressRetentionOffset: Self = this.set("pressRetentionOffset", js.undefined)
    
    @scala.inline
    def setProgressiveRenderingEnabled(value: Boolean): Self = this.set("progressiveRenderingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressiveRenderingEnabled: Self = this.set("progressiveRenderingEnabled", js.undefined)
    
    @scala.inline
    def setRaised(value: Boolean): Self = this.set("raised", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaised: Self = this.set("raised", js.undefined)
    
    @scala.inline
    def setResizeMethod(value: auto | resize | scale): Self = this.set("resizeMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeMethod: Self = this.set("resizeMethod", js.undefined)
    
    @scala.inline
    def setResizeMode(value: ImageResizeMode): Self = this.set("resizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeMode: Self = this.set("resizeMode", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setReverseColor(value: String): Self = this.set("reverseColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverseColor: Self = this.set("reverseColor", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    
    @scala.inline
    def setSelectionColor(value: ColorValue): Self = this.set("selectionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionColor: Self = this.set("selectionColor", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSolid(value: Boolean): Self = this.set("solid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolid: Self = this.set("solid", js.undefined)
    
    @scala.inline
    def setSourceVarargs(value: ImageURISource*): Self = this.set("source", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: ImageSourcePropType): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSuppressHighlighting(value: Boolean): Self = this.set("suppressHighlighting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressHighlighting: Self = this.set("suppressHighlighting", js.undefined)
    
    @scala.inline
    def setTestID(value: String): Self = this.set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
    
    @scala.inline
    def setTextBreakStrategy(value: simple | highQuality | balanced): Self = this.set("textBreakStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextBreakStrategy: Self = this.set("textBreakStrategy", js.undefined)
    
    @scala.inline
    def setTouchSoundDisabled(value: Boolean): Self = this.set("touchSoundDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchSoundDisabled: Self = this.set("touchSoundDisabled", js.undefined)
    
    @scala.inline
    def setTouchSoundDisabledNull: Self = this.set("touchSoundDisabled", null)
    
    @scala.inline
    def setTransition(value: Boolean): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: Double): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
    
    @scala.inline
    def setTvParallaxProperties(value: TVParallaxProperties): Self = this.set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxProperties: Self = this.set("tvParallaxProperties", js.undefined)
    
    @scala.inline
    def setType(value: IconType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnderlayColor(value: ColorValue): Self = this.set("underlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlayColor: Self = this.set("underlayColor", js.undefined)
    
    @scala.inline
    def setUseForeground(value: Boolean): Self = this.set("useForeground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseForeground: Self = this.set("useForeground", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
