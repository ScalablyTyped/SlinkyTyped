package typingsSlinky.reactNativeElements.anon

import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
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
import typingsSlinky.reactNative.mod.ImageURISource
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.LayoutChangeEvent
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TVParallaxProperties
import typingsSlinky.reactNative.mod.TargetedEvent
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.IconType
import typingsSlinky.reactNativeElements.mod.RecursivePartial
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.assertive
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.auto
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.balanced
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.button
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.clip
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.head
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.highQuality
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.middle
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.no
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.none
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.polite
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.radiobutton_checked
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.radiobutton_unchecked
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.resize
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.scale
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.simple
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.tail
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.IconProps> & std.Partial<react-native-elements.react-native-elements.ImageProps>> */
@js.native
trait RecursivePartialPartialIc extends js.Object {
  
  var Component: js.UndefOr[RecursivePartial[js.UndefOr[ReactComponentClass[js.Object]]]] = js.native
  
  var ImageComponent: js.UndefOr[RecursivePartial[js.UndefOr[ReactComponentClass[_]]]] = js.native
  
  var PlaceholderContent: js.UndefOr[RecursivePartial[js.UndefOr[ReactElement]]] = js.native
  
  var accessibilityActions: js.UndefOr[RecursivePartial[js.UndefOr[js.Array[AccessibilityActionInfo]]]] = js.native
  
  var accessibilityComponentType: js.UndefOr[
    RecursivePartial[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]
  ] = js.native
  
  var accessibilityElementsHidden: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var accessibilityHint: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var accessibilityIgnoresInvertColors: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var accessibilityLabel: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var accessibilityLiveRegion: js.UndefOr[RecursivePartial[js.UndefOr[none | polite | assertive]]] = js.native
  
  var accessibilityRole: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityRole]]] = js.native
  
  var accessibilityState: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityState]]] = js.native
  
  var accessibilityTraits: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]] = js.native
  
  var accessibilityValue: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityValue]]] = js.native
  
  var accessibilityViewIsModal: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var accessible: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var activeOpacity: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var adjustsFontSizeToFit: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var allowFontScaling: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var background: js.UndefOr[RecursivePartial[js.UndefOr[BackgroundPropType]]] = js.native
  
  var backgroundColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var blurRadius: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var borderBottomLeftRadius: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var borderBottomRightRadius: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var borderRadius: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var borderTopLeftRadius: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var borderTopRightRadius: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var brand: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var capInsets: js.UndefOr[RecursivePartial[js.UndefOr[Insets]]] = js.native
  
  var color: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  
  var defaultSource: js.UndefOr[RecursivePartial[js.UndefOr[ImageURISource | Double]]] = js.native
  
  var delayLongPress: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var delayPressIn: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var delayPressOut: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var disabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean | Null]]] = js.native
  
  var disabledStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  
  var ellipsizeMode: js.UndefOr[RecursivePartial[js.UndefOr[head | middle | tail | clip]]] = js.native
  
  var fadeDuration: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var hasTVPreferredFocus: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var height: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var hitSlop: js.UndefOr[RecursivePartial[js.UndefOr[Insets]]] = js.native
  
  var iconStyle: js.UndefOr[RecursivePartial[js.UndefOr[TextStyle]]] = js.native
  
  var importantForAccessibility: js.UndefOr[RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.native
  
  var lineBreakMode: js.UndefOr[RecursivePartial[js.UndefOr[head | middle | tail | clip]]] = js.native
  
  var loadingIndicatorSource: js.UndefOr[RecursivePartial[js.UndefOr[ImageURISource]]] = js.native
  
  var maxFontSizeMultiplier: js.UndefOr[RecursivePartial[js.UndefOr[Double | Null]]] = js.native
  
  var minimumFontScale: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var name: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var nativeID: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var numberOfLines: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var onAccessibilityAction: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]]
    ]
  ] = js.native
  
  var onAccessibilityEscape: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onAccessibilityTap: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onBlur: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TargetedEvent], Unit]]]
  ] = js.native
  
  var onError: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageErrorEventData], Unit]]]
  ] = js.native
  
  var onFocus: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TargetedEvent], Unit]]]
  ] = js.native
  
  var onHideUnderlay: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onLayout: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]] = js.native
  
  var onLoad: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageLoadEventData], Unit]]]
  ] = js.native
  
  var onLoadEnd: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onLoadStart: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onLongPress: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  
  var onMagicTap: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onPartialLoad: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onPress: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  
  var onPressIn: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  
  var onPressOut: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  
  var onProgress: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageProgressEventDataIOS], Unit]]
    ]
  ] = js.native
  
  var onShowUnderlay: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var placeholderStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  
  var pressRetentionOffset: js.UndefOr[RecursivePartial[js.UndefOr[Insets]]] = js.native
  
  var progressiveRenderingEnabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var raised: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var resizeMethod: js.UndefOr[RecursivePartial[js.UndefOr[auto | resize | scale]]] = js.native
  
  var resizeMode: js.UndefOr[RecursivePartial[js.UndefOr[ImageResizeMode]]] = js.native
  
  var reverse: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var reverseColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var selectable: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var selectionColor: js.UndefOr[RecursivePartial[js.UndefOr[ColorValue]]] = js.native
  
  var size: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var solid: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var source: js.UndefOr[RecursivePartial[js.UndefOr[ImageSourcePropType]]] = js.native
  
  var style: js.UndefOr[RecursivePartial[js.UndefOr[ViewStyle | TextStyle]]] = js.native
  
  var suppressHighlighting: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var testID: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var textBreakStrategy: js.UndefOr[RecursivePartial[js.UndefOr[simple | highQuality | balanced]]] = js.native
  
  var touchSoundDisabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean | Null]]] = js.native
  
  var transition: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var tvParallaxProperties: js.UndefOr[RecursivePartial[js.UndefOr[TVParallaxProperties]]] = js.native
  
  var `type`: js.UndefOr[RecursivePartial[js.UndefOr[IconType]]] = js.native
  
  var underlayColor: js.UndefOr[RecursivePartial[js.UndefOr[ColorValue]]] = js.native
  
  var useForeground: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var width: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
}
object RecursivePartialPartialIc {
  
  @scala.inline
  def apply(): RecursivePartialPartialIc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialIc]
  }
  
  @scala.inline
  implicit class RecursivePartialPartialIcOps[Self <: RecursivePartialPartialIc] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: RecursivePartial[js.UndefOr[ReactComponentClass[js.Object]]]): Self = this.set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("Component", js.undefined)
    
    @scala.inline
    def setImageComponent(value: RecursivePartial[js.UndefOr[ReactComponentClass[_]]]): Self = this.set("ImageComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageComponent: Self = this.set("ImageComponent", js.undefined)
    
    @scala.inline
    def setPlaceholderContent(value: RecursivePartial[js.UndefOr[ReactElement]]): Self = this.set("PlaceholderContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderContent: Self = this.set("PlaceholderContent", js.undefined)
    
    @scala.inline
    def setAccessibilityActions(value: RecursivePartial[js.UndefOr[js.Array[AccessibilityActionInfo]]]): Self = this.set("accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityActions: Self = this.set("accessibilityActions", js.undefined)
    
    @scala.inline
    def setAccessibilityComponentType(value: RecursivePartial[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]): Self = this.set("accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityComponentType: Self = this.set("accessibilityComponentType", js.undefined)
    
    @scala.inline
    def setAccessibilityElementsHidden(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityElementsHidden: Self = this.set("accessibilityElementsHidden", js.undefined)
    
    @scala.inline
    def setAccessibilityHint(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityHint: Self = this.set("accessibilityHint", js.undefined)
    
    @scala.inline
    def setAccessibilityIgnoresInvertColors(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityIgnoresInvertColors: Self = this.set("accessibilityIgnoresInvertColors", js.undefined)
    
    @scala.inline
    def setAccessibilityLabel(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityLiveRegion(value: RecursivePartial[js.UndefOr[none | polite | assertive]]): Self = this.set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLiveRegion: Self = this.set("accessibilityLiveRegion", js.undefined)
    
    @scala.inline
    def setAccessibilityRole(value: RecursivePartial[js.UndefOr[AccessibilityRole]]): Self = this.set("accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityRole: Self = this.set("accessibilityRole", js.undefined)
    
    @scala.inline
    def setAccessibilityState(value: RecursivePartial[js.UndefOr[AccessibilityState]]): Self = this.set("accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityState: Self = this.set("accessibilityState", js.undefined)
    
    @scala.inline
    def setAccessibilityTraits(value: RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]): Self = this.set("accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityTraits: Self = this.set("accessibilityTraits", js.undefined)
    
    @scala.inline
    def setAccessibilityValue(value: RecursivePartial[js.UndefOr[AccessibilityValue]]): Self = this.set("accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityValue: Self = this.set("accessibilityValue", js.undefined)
    
    @scala.inline
    def setAccessibilityViewIsModal(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityViewIsModal: Self = this.set("accessibilityViewIsModal", js.undefined)
    
    @scala.inline
    def setAccessible(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessible: Self = this.set("accessible", js.undefined)
    
    @scala.inline
    def setActiveOpacity(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveOpacity: Self = this.set("activeOpacity", js.undefined)
    
    @scala.inline
    def setAdjustsFontSizeToFit(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("adjustsFontSizeToFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjustsFontSizeToFit: Self = this.set("adjustsFontSizeToFit", js.undefined)
    
    @scala.inline
    def setAllowFontScaling(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("allowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFontScaling: Self = this.set("allowFontScaling", js.undefined)
    
    @scala.inline
    def setBackground(value: RecursivePartial[js.UndefOr[BackgroundPropType]]): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBlurRadius(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("blurRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlurRadius: Self = this.set("blurRadius", js.undefined)
    
    @scala.inline
    def setBorderBottomLeftRadius(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("borderBottomLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBottomLeftRadius: Self = this.set("borderBottomLeftRadius", js.undefined)
    
    @scala.inline
    def setBorderBottomRightRadius(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("borderBottomRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBottomRightRadius: Self = this.set("borderBottomRightRadius", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    
    @scala.inline
    def setBorderTopLeftRadius(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("borderTopLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderTopLeftRadius: Self = this.set("borderTopLeftRadius", js.undefined)
    
    @scala.inline
    def setBorderTopRightRadius(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("borderTopRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderTopRightRadius: Self = this.set("borderTopRightRadius", js.undefined)
    
    @scala.inline
    def setBrand(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrand: Self = this.set("brand", js.undefined)
    
    @scala.inline
    def setCapInsets(value: RecursivePartial[js.UndefOr[Insets]]): Self = this.set("capInsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapInsets: Self = this.set("capInsets", js.undefined)
    
    @scala.inline
    def setColor(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setDefaultSource(value: RecursivePartial[js.UndefOr[ImageURISource | Double]]): Self = this.set("defaultSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSource: Self = this.set("defaultSource", js.undefined)
    
    @scala.inline
    def setDelayLongPress(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("delayLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayLongPress: Self = this.set("delayLongPress", js.undefined)
    
    @scala.inline
    def setDelayPressIn(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("delayPressIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayPressIn: Self = this.set("delayPressIn", js.undefined)
    
    @scala.inline
    def setDelayPressOut(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("delayPressOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayPressOut: Self = this.set("delayPressOut", js.undefined)
    
    @scala.inline
    def setDisabled(value: RecursivePartial[js.UndefOr[Boolean | Null]]): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDisabledStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("disabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledStyle: Self = this.set("disabledStyle", js.undefined)
    
    @scala.inline
    def setEllipsizeMode(value: RecursivePartial[js.UndefOr[head | middle | tail | clip]]): Self = this.set("ellipsizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEllipsizeMode: Self = this.set("ellipsizeMode", js.undefined)
    
    @scala.inline
    def setFadeDuration(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("fadeDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFadeDuration: Self = this.set("fadeDuration", js.undefined)
    
    @scala.inline
    def setHasTVPreferredFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasTVPreferredFocus: Self = this.set("hasTVPreferredFocus", js.undefined)
    
    @scala.inline
    def setHeight(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHitSlop(value: RecursivePartial[js.UndefOr[Insets]]): Self = this.set("hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitSlop: Self = this.set("hitSlop", js.undefined)
    
    @scala.inline
    def setIconStyle(value: RecursivePartial[js.UndefOr[TextStyle]]): Self = this.set("iconStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconStyle: Self = this.set("iconStyle", js.undefined)
    
    @scala.inline
    def setImportantForAccessibility(value: RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]): Self = this.set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportantForAccessibility: Self = this.set("importantForAccessibility", js.undefined)
    
    @scala.inline
    def setLineBreakMode(value: RecursivePartial[js.UndefOr[head | middle | tail | clip]]): Self = this.set("lineBreakMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineBreakMode: Self = this.set("lineBreakMode", js.undefined)
    
    @scala.inline
    def setLoadingIndicatorSource(value: RecursivePartial[js.UndefOr[ImageURISource]]): Self = this.set("loadingIndicatorSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingIndicatorSource: Self = this.set("loadingIndicatorSource", js.undefined)
    
    @scala.inline
    def setMaxFontSizeMultiplier(value: RecursivePartial[js.UndefOr[Double | Null]]): Self = this.set("maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFontSizeMultiplier: Self = this.set("maxFontSizeMultiplier", js.undefined)
    
    @scala.inline
    def setMinimumFontScale(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("minimumFontScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumFontScale: Self = this.set("minimumFontScale", js.undefined)
    
    @scala.inline
    def setName(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNativeID(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeID: Self = this.set("nativeID", js.undefined)
    
    @scala.inline
    def setNumberOfLines(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("numberOfLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfLines: Self = this.set("numberOfLines", js.undefined)
    
    @scala.inline
    def setOnAccessibilityAction(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]]
        ]
    ): Self = this.set("onAccessibilityAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAccessibilityAction: Self = this.set("onAccessibilityAction", js.undefined)
    
    @scala.inline
    def setOnAccessibilityEscape(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onAccessibilityEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAccessibilityEscape: Self = this.set("onAccessibilityEscape", js.undefined)
    
    @scala.inline
    def setOnAccessibilityTap(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onAccessibilityTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAccessibilityTap: Self = this.set("onAccessibilityTap", js.undefined)
    
    @scala.inline
    def setOnBlur(value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TargetedEvent], Unit]]]): Self = this.set("onBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnError(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageErrorEventData], Unit]]]
    ): Self = this.set("onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnFocus(value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TargetedEvent], Unit]]]): Self = this.set("onFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnHideUnderlay(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onHideUnderlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnHideUnderlay: Self = this.set("onHideUnderlay", js.undefined)
    
    @scala.inline
    def setOnLayout(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]): Self = this.set("onLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLayout: Self = this.set("onLayout", js.undefined)
    
    @scala.inline
    def setOnLoad(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageLoadEventData], Unit]]]
    ): Self = this.set("onLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setOnLoadEnd(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onLoadEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadEnd: Self = this.set("onLoadEnd", js.undefined)
    
    @scala.inline
    def setOnLoadStart(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onLoadStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadStart: Self = this.set("onLoadStart", js.undefined)
    
    @scala.inline
    def setOnLongPress(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = this.set("onLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLongPress: Self = this.set("onLongPress", js.undefined)
    
    @scala.inline
    def setOnMagicTap(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onMagicTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMagicTap: Self = this.set("onMagicTap", js.undefined)
    
    @scala.inline
    def setOnPartialLoad(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onPartialLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPartialLoad: Self = this.set("onPartialLoad", js.undefined)
    
    @scala.inline
    def setOnPress(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = this.set("onPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    
    @scala.inline
    def setOnPressIn(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = this.set("onPressIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPressIn: Self = this.set("onPressIn", js.undefined)
    
    @scala.inline
    def setOnPressOut(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = this.set("onPressOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPressOut: Self = this.set("onPressOut", js.undefined)
    
    @scala.inline
    def setOnProgress(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageProgressEventDataIOS], Unit]]
        ]
    ): Self = this.set("onProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    
    @scala.inline
    def setOnShowUnderlay(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onShowUnderlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnShowUnderlay: Self = this.set("onShowUnderlay", js.undefined)
    
    @scala.inline
    def setPlaceholderStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("placeholderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderStyle: Self = this.set("placeholderStyle", js.undefined)
    
    @scala.inline
    def setPressRetentionOffset(value: RecursivePartial[js.UndefOr[Insets]]): Self = this.set("pressRetentionOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePressRetentionOffset: Self = this.set("pressRetentionOffset", js.undefined)
    
    @scala.inline
    def setProgressiveRenderingEnabled(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("progressiveRenderingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressiveRenderingEnabled: Self = this.set("progressiveRenderingEnabled", js.undefined)
    
    @scala.inline
    def setRaised(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("raised", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaised: Self = this.set("raised", js.undefined)
    
    @scala.inline
    def setResizeMethod(value: RecursivePartial[js.UndefOr[auto | resize | scale]]): Self = this.set("resizeMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeMethod: Self = this.set("resizeMethod", js.undefined)
    
    @scala.inline
    def setResizeMode(value: RecursivePartial[js.UndefOr[ImageResizeMode]]): Self = this.set("resizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeMode: Self = this.set("resizeMode", js.undefined)
    
    @scala.inline
    def setReverse(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setReverseColor(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("reverseColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverseColor: Self = this.set("reverseColor", js.undefined)
    
    @scala.inline
    def setSelectable(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    
    @scala.inline
    def setSelectionColor(value: RecursivePartial[js.UndefOr[ColorValue]]): Self = this.set("selectionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionColor: Self = this.set("selectionColor", js.undefined)
    
    @scala.inline
    def setSize(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSolid(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("solid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolid: Self = this.set("solid", js.undefined)
    
    @scala.inline
    def setSource(value: RecursivePartial[js.UndefOr[ImageSourcePropType]]): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setStyle(value: RecursivePartial[js.UndefOr[ViewStyle | TextStyle]]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSuppressHighlighting(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("suppressHighlighting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressHighlighting: Self = this.set("suppressHighlighting", js.undefined)
    
    @scala.inline
    def setTestID(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
    
    @scala.inline
    def setTextBreakStrategy(value: RecursivePartial[js.UndefOr[simple | highQuality | balanced]]): Self = this.set("textBreakStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextBreakStrategy: Self = this.set("textBreakStrategy", js.undefined)
    
    @scala.inline
    def setTouchSoundDisabled(value: RecursivePartial[js.UndefOr[Boolean | Null]]): Self = this.set("touchSoundDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchSoundDisabled: Self = this.set("touchSoundDisabled", js.undefined)
    
    @scala.inline
    def setTransition(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    
    @scala.inline
    def setTvParallaxProperties(value: RecursivePartial[js.UndefOr[TVParallaxProperties]]): Self = this.set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxProperties: Self = this.set("tvParallaxProperties", js.undefined)
    
    @scala.inline
    def setType(value: RecursivePartial[js.UndefOr[IconType]]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnderlayColor(value: RecursivePartial[js.UndefOr[ColorValue]]): Self = this.set("underlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlayColor: Self = this.set("underlayColor", js.undefined)
    
    @scala.inline
    def setUseForeground(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("useForeground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseForeground: Self = this.set("useForeground", js.undefined)
    
    @scala.inline
    def setWidth(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
