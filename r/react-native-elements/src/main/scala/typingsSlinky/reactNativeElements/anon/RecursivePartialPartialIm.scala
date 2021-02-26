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
import typingsSlinky.reactNative.mod.ImageErrorEventData
import typingsSlinky.reactNative.mod.ImageLoadEventData
import typingsSlinky.reactNative.mod.ImageProgressEventDataIOS
import typingsSlinky.reactNative.mod.ImageResizeMode
import typingsSlinky.reactNative.mod.ImageSourcePropType
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.ImageURISource
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.RecursivePartial
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.assertive
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.auto
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.button
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.no
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.none
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.polite
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.radiobutton_checked
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.radiobutton_unchecked
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.resize
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.scale
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.ImageProps>> */
@js.native
trait RecursivePartialPartialIm extends StObject {
  
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
  
  var blurRadius: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var borderBottomLeftRadius: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var borderBottomRightRadius: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var borderRadius: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var borderTopLeftRadius: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var borderTopRightRadius: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var capInsets: js.UndefOr[RecursivePartial[js.UndefOr[Insets]]] = js.native
  
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  
  var defaultSource: js.UndefOr[RecursivePartial[js.UndefOr[ImageURISource | Double]]] = js.native
  
  var fadeDuration: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var height: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var importantForAccessibility: js.UndefOr[RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.native
  
  var loadingIndicatorSource: js.UndefOr[RecursivePartial[js.UndefOr[ImageURISource]]] = js.native
  
  var onAccessibilityAction: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]]
    ]
  ] = js.native
  
  var onAccessibilityEscape: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onAccessibilityTap: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onError: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageErrorEventData], Unit]]]
  ] = js.native
  
  var onLayout: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, Layout], Unit]]]
  ] = js.native
  
  var onLoad: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageLoadEventData], Unit]]]
  ] = js.native
  
  var onLoadEnd: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onLoadStart: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onLongPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onMagicTap: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onPartialLoad: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onProgress: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageProgressEventDataIOS], Unit]]
    ]
  ] = js.native
  
  var placeholderStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  
  var progressiveRenderingEnabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var resizeMethod: js.UndefOr[RecursivePartial[js.UndefOr[auto | resize | scale]]] = js.native
  
  var resizeMode: js.UndefOr[RecursivePartial[js.UndefOr[ImageResizeMode]]] = js.native
  
  var source: js.UndefOr[RecursivePartial[js.UndefOr[ImageSourcePropType]]] = js.native
  
  var style: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ImageStyle]]]] = js.native
  
  var testID: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var transition: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var transitionDuration: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var width: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
}
object RecursivePartialPartialIm {
  
  @scala.inline
  def apply(): RecursivePartialPartialIm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialIm]
  }
  
  @scala.inline
  implicit class RecursivePartialPartialImMutableBuilder[Self <: RecursivePartialPartialIm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityActions(value: RecursivePartial[js.UndefOr[js.Array[AccessibilityActionInfo]]]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
    
    @scala.inline
    def setAccessibilityComponentType(value: RecursivePartial[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]): Self = StObject.set(x, "accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityComponentTypeUndefined: Self = StObject.set(x, "accessibilityComponentType", js.undefined)
    
    @scala.inline
    def setAccessibilityElementsHidden(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
    
    @scala.inline
    def setAccessibilityHint(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
    
    @scala.inline
    def setAccessibilityIgnoresInvertColors(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
    
    @scala.inline
    def setAccessibilityLabel(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityLiveRegion(value: RecursivePartial[js.UndefOr[none | polite | assertive]]): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
    
    @scala.inline
    def setAccessibilityRole(value: RecursivePartial[js.UndefOr[AccessibilityRole]]): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
    
    @scala.inline
    def setAccessibilityState(value: RecursivePartial[js.UndefOr[AccessibilityState]]): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    @scala.inline
    def setAccessibilityTraits(value: RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]): Self = StObject.set(x, "accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityTraitsUndefined: Self = StObject.set(x, "accessibilityTraits", js.undefined)
    
    @scala.inline
    def setAccessibilityValue(value: RecursivePartial[js.UndefOr[AccessibilityValue]]): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
    
    @scala.inline
    def setAccessibilityViewIsModal(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
    
    @scala.inline
    def setAccessible(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    @scala.inline
    def setBlurRadius(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "blurRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurRadiusUndefined: Self = StObject.set(x, "blurRadius", js.undefined)
    
    @scala.inline
    def setBorderBottomLeftRadius(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "borderBottomLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomLeftRadiusUndefined: Self = StObject.set(x, "borderBottomLeftRadius", js.undefined)
    
    @scala.inline
    def setBorderBottomRightRadius(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "borderBottomRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomRightRadiusUndefined: Self = StObject.set(x, "borderBottomRightRadius", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    @scala.inline
    def setBorderTopLeftRadius(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "borderTopLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopLeftRadiusUndefined: Self = StObject.set(x, "borderTopLeftRadius", js.undefined)
    
    @scala.inline
    def setBorderTopRightRadius(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "borderTopRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopRightRadiusUndefined: Self = StObject.set(x, "borderTopRightRadius", js.undefined)
    
    @scala.inline
    def setCapInsets(value: RecursivePartial[js.UndefOr[Insets]]): Self = StObject.set(x, "capInsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapInsetsUndefined: Self = StObject.set(x, "capInsets", js.undefined)
    
    @scala.inline
    def setComponent(value: RecursivePartial[js.UndefOr[ReactComponentClass[js.Object]]]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    @scala.inline
    def setDefaultSource(value: RecursivePartial[js.UndefOr[ImageURISource | Double]]): Self = StObject.set(x, "defaultSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSourceUndefined: Self = StObject.set(x, "defaultSource", js.undefined)
    
    @scala.inline
    def setFadeDuration(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "fadeDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeDurationUndefined: Self = StObject.set(x, "fadeDuration", js.undefined)
    
    @scala.inline
    def setHeight(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setImageComponent(value: RecursivePartial[js.UndefOr[ReactComponentClass[_]]]): Self = StObject.set(x, "ImageComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageComponentUndefined: Self = StObject.set(x, "ImageComponent", js.undefined)
    
    @scala.inline
    def setImportantForAccessibility(value: RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    @scala.inline
    def setLoadingIndicatorSource(value: RecursivePartial[js.UndefOr[ImageURISource]]): Self = StObject.set(x, "loadingIndicatorSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingIndicatorSourceUndefined: Self = StObject.set(x, "loadingIndicatorSource", js.undefined)
    
    @scala.inline
    def setOnAccessibilityAction(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]]
        ]
    ): Self = StObject.set(x, "onAccessibilityAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    @scala.inline
    def setOnAccessibilityEscape(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onAccessibilityEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    @scala.inline
    def setOnAccessibilityTap(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onAccessibilityTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
    @scala.inline
    def setOnError(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageErrorEventData], Unit]]]
    ): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnLayout(value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, Layout], Unit]]]): Self = StObject.set(x, "onLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    @scala.inline
    def setOnLoad(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageLoadEventData], Unit]]]
    ): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadEnd(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onLoadEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadEndUndefined: Self = StObject.set(x, "onLoadEnd", js.undefined)
    
    @scala.inline
    def setOnLoadStart(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onLoadStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    @scala.inline
    def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    @scala.inline
    def setOnLongPress(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    @scala.inline
    def setOnMagicTap(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onMagicTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    @scala.inline
    def setOnPartialLoad(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onPartialLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPartialLoadUndefined: Self = StObject.set(x, "onPartialLoad", js.undefined)
    
    @scala.inline
    def setOnPress(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setOnProgress(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageProgressEventDataIOS], Unit]]
        ]
    ): Self = StObject.set(x, "onProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    @scala.inline
    def setPlaceholderContent(value: RecursivePartial[js.UndefOr[ReactElement]]): Self = StObject.set(x, "PlaceholderContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderContentUndefined: Self = StObject.set(x, "PlaceholderContent", js.undefined)
    
    @scala.inline
    def setPlaceholderStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "placeholderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderStyleUndefined: Self = StObject.set(x, "placeholderStyle", js.undefined)
    
    @scala.inline
    def setProgressiveRenderingEnabled(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "progressiveRenderingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressiveRenderingEnabledUndefined: Self = StObject.set(x, "progressiveRenderingEnabled", js.undefined)
    
    @scala.inline
    def setResizeMethod(value: RecursivePartial[js.UndefOr[auto | resize | scale]]): Self = StObject.set(x, "resizeMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeMethodUndefined: Self = StObject.set(x, "resizeMethod", js.undefined)
    
    @scala.inline
    def setResizeMode(value: RecursivePartial[js.UndefOr[ImageResizeMode]]): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
    
    @scala.inline
    def setSource(value: RecursivePartial[js.UndefOr[ImageSourcePropType]]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setStyle(value: RecursivePartial[js.UndefOr[StyleProp[ImageStyle]]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTestID(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    @scala.inline
    def setTransition(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionDuration(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    @scala.inline
    def setWidth(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
