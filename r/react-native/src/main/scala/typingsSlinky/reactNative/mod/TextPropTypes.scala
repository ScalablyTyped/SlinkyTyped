package typingsSlinky.reactNative.mod

import slinky.core.SyntheticEvent
import typingsSlinky.propTypes.mod.Validator
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
import typingsSlinky.reactNative.reactNativeStrings.`no-hide-descendants`
import typingsSlinky.reactNative.reactNativeStrings.assertive
import typingsSlinky.reactNative.reactNativeStrings.auto
import typingsSlinky.reactNative.reactNativeStrings.balanced
import typingsSlinky.reactNative.reactNativeStrings.button
import typingsSlinky.reactNative.reactNativeStrings.clip
import typingsSlinky.reactNative.reactNativeStrings.head
import typingsSlinky.reactNative.reactNativeStrings.highQuality
import typingsSlinky.reactNative.reactNativeStrings.middle
import typingsSlinky.reactNative.reactNativeStrings.no
import typingsSlinky.reactNative.reactNativeStrings.none
import typingsSlinky.reactNative.reactNativeStrings.polite
import typingsSlinky.reactNative.reactNativeStrings.radiobutton_checked
import typingsSlinky.reactNative.reactNativeStrings.radiobutton_unchecked
import typingsSlinky.reactNative.reactNativeStrings.simple
import typingsSlinky.reactNative.reactNativeStrings.tail
import typingsSlinky.reactNative.reactNativeStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native", "TextPropTypes")
@js.native
object TextPropTypes extends js.Object {
  
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
  
  var adjustsFontSizeToFit: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  
  var allowFontScaling: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  
  var ellipsizeMode: js.UndefOr[Validator[js.UndefOr[head | middle | tail | clip]]] = js.native
  
  var importantForAccessibility: js.UndefOr[Validator[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.native
  
  var lineBreakMode: js.UndefOr[Validator[js.UndefOr[head | middle | tail | clip]]] = js.native
  
  var maxFontSizeMultiplier: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var minimumFontScale: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  
  var nativeID: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  
  var numberOfLines: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  
  var onAccessibilityAction: js.UndefOr[
    Validator[
      js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]]
    ]
  ] = js.native
  
  var onAccessibilityEscape: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onAccessibilityTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onLayout: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]] = js.native
  
  var onLongPress: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  
  var onMagicTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onPress: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  
  var selectable: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  
  var selectionColor: js.UndefOr[Validator[js.UndefOr[ColorValue]]] = js.native
  
  var style: js.UndefOr[Validator[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  
  var suppressHighlighting: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  
  var testID: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  
  var textBreakStrategy: js.UndefOr[Validator[js.UndefOr[simple | highQuality | balanced]]] = js.native
}
