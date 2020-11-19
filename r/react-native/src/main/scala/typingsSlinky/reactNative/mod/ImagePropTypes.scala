package typingsSlinky.reactNative.mod

import slinky.core.SyntheticEvent
import typingsSlinky.propTypes.mod.Validator
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native", "ImagePropTypes")
@js.native
object ImagePropTypes extends js.Object {
  
  var accessibilityActions: js.UndefOr[Validator[js.UndefOr[js.Array[AccessibilityActionInfo]]]] = js.native
  
  var accessibilityComponentType: js.UndefOr[
    Validator[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]
  ] = js.native
  
  var accessibilityElementsHidden: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  
  var accessibilityHint: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  
  var accessibilityIgnoresInvertColors: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  
  var accessibilityLabel: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  
  var accessibilityLiveRegion: js.UndefOr[Validator[js.UndefOr[none | polite | assertive]]] = js.native
  
  var accessibilityRole: js.UndefOr[Validator[js.UndefOr[AccessibilityRole]]] = js.native
  
  var accessibilityState: js.UndefOr[Validator[js.UndefOr[AccessibilityState]]] = js.native
  
  var accessibilityTraits: js.UndefOr[Validator[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]] = js.native
  
  var accessibilityValue: js.UndefOr[Validator[js.UndefOr[AccessibilityValue]]] = js.native
  
  var accessibilityViewIsModal: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  
  var accessible: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  
  var blurRadius: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  
  var borderBottomLeftRadius: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  
  var borderBottomRightRadius: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  
  var borderRadius: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  
  var borderTopLeftRadius: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  
  var borderTopRightRadius: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  
  var capInsets: js.UndefOr[Validator[js.UndefOr[Insets]]] = js.native
  
  var defaultSource: js.UndefOr[Validator[js.UndefOr[ImageURISource | Double]]] = js.native
  
  var fadeDuration: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  
  var height: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  
  var importantForAccessibility: js.UndefOr[Validator[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.native
  
  var loadingIndicatorSource: js.UndefOr[Validator[js.UndefOr[ImageURISource]]] = js.native
  
  var onAccessibilityAction: js.UndefOr[
    Validator[
      js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]]
    ]
  ] = js.native
  
  var onAccessibilityEscape: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onAccessibilityTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onError: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageErrorEventData], Unit]]]
  ] = js.native
  
  var onLayout: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]] = js.native
  
  var onLoad: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageLoadEventData], Unit]]]
  ] = js.native
  
  var onLoadEnd: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onLoadStart: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onMagicTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onPartialLoad: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onProgress: js.UndefOr[
    Validator[
      js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageProgressEventDataIOS], Unit]]
    ]
  ] = js.native
  
  var progressiveRenderingEnabled: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  
  var resizeMethod: js.UndefOr[Validator[js.UndefOr[auto | resize | scale]]] = js.native
  
  var resizeMode: js.UndefOr[Validator[js.UndefOr[ImageResizeMode]]] = js.native
  
  var source: js.UndefOr[Validator[ImageSourcePropType]] = js.native
  
  var style: js.UndefOr[Validator[js.UndefOr[StyleProp[ImageStyle]]]] = js.native
  
  var testID: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  
  var width: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
}
