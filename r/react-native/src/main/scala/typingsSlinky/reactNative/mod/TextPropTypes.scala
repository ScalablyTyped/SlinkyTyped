package typingsSlinky.reactNative.mod

import slinky.core.SyntheticEvent
import typingsSlinky.propTypes.mod.Validator
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
import typingsSlinky.reactNative.reactNativeStrings.`no-hide-descendants`
import typingsSlinky.reactNative.reactNativeStrings.all_
import typingsSlinky.reactNative.reactNativeStrings.assertive
import typingsSlinky.reactNative.reactNativeStrings.auto
import typingsSlinky.reactNative.reactNativeStrings.balanced
import typingsSlinky.reactNative.reactNativeStrings.button
import typingsSlinky.reactNative.reactNativeStrings.clip
import typingsSlinky.reactNative.reactNativeStrings.email
import typingsSlinky.reactNative.reactNativeStrings.head
import typingsSlinky.reactNative.reactNativeStrings.highQuality
import typingsSlinky.reactNative.reactNativeStrings.link
import typingsSlinky.reactNative.reactNativeStrings.middle
import typingsSlinky.reactNative.reactNativeStrings.no
import typingsSlinky.reactNative.reactNativeStrings.none
import typingsSlinky.reactNative.reactNativeStrings.phoneNumber
import typingsSlinky.reactNative.reactNativeStrings.polite
import typingsSlinky.reactNative.reactNativeStrings.radiobutton_checked
import typingsSlinky.reactNative.reactNativeStrings.radiobutton_unchecked
import typingsSlinky.reactNative.reactNativeStrings.simple
import typingsSlinky.reactNative.reactNativeStrings.tail
import typingsSlinky.reactNative.reactNativeStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.ValidationMap<react-native.react-native.TextProps> */
object TextPropTypes {
  
  @JSImport("react-native", "TextPropTypes")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native", "TextPropTypes.accessibilityActions")
  @js.native
  def accessibilityActions: js.UndefOr[Validator[js.UndefOr[js.Array[AccessibilityActionInfo]]]] = js.native
  @scala.inline
  def accessibilityActions_=(x: js.UndefOr[Validator[js.UndefOr[js.Array[AccessibilityActionInfo]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityActions")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.accessibilityComponentType")
  @js.native
  def accessibilityComponentType: js.UndefOr[
    Validator[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]
  ] = js.native
  @scala.inline
  def accessibilityComponentType_=(
    x: js.UndefOr[
      Validator[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityComponentType")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.accessibilityElementsHidden")
  @js.native
  def accessibilityElementsHidden: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  @scala.inline
  def accessibilityElementsHidden_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityElementsHidden")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.accessibilityHint")
  @js.native
  def accessibilityHint: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  @scala.inline
  def accessibilityHint_=(x: js.UndefOr[Validator[js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityHint")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.accessibilityIgnoresInvertColors")
  @js.native
  def accessibilityIgnoresInvertColors: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  @scala.inline
  def accessibilityIgnoresInvertColors_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityIgnoresInvertColors")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.accessibilityLabel")
  @js.native
  def accessibilityLabel: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  @scala.inline
  def accessibilityLabel_=(x: js.UndefOr[Validator[js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLabel")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.accessibilityLiveRegion")
  @js.native
  def accessibilityLiveRegion: js.UndefOr[Validator[js.UndefOr[none | polite | assertive]]] = js.native
  @scala.inline
  def accessibilityLiveRegion_=(x: js.UndefOr[Validator[js.UndefOr[none | polite | assertive]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLiveRegion")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.accessibilityRole")
  @js.native
  def accessibilityRole: js.UndefOr[Validator[js.UndefOr[AccessibilityRole]]] = js.native
  @scala.inline
  def accessibilityRole_=(x: js.UndefOr[Validator[js.UndefOr[AccessibilityRole]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityRole")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.accessibilityState")
  @js.native
  def accessibilityState: js.UndefOr[Validator[js.UndefOr[AccessibilityState]]] = js.native
  @scala.inline
  def accessibilityState_=(x: js.UndefOr[Validator[js.UndefOr[AccessibilityState]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityState")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.accessibilityTraits")
  @js.native
  def accessibilityTraits: js.UndefOr[Validator[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]] = js.native
  @scala.inline
  def accessibilityTraits_=(x: js.UndefOr[Validator[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityTraits")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.accessibilityValue")
  @js.native
  def accessibilityValue: js.UndefOr[Validator[js.UndefOr[AccessibilityValue]]] = js.native
  @scala.inline
  def accessibilityValue_=(x: js.UndefOr[Validator[js.UndefOr[AccessibilityValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityValue")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.accessibilityViewIsModal")
  @js.native
  def accessibilityViewIsModal: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  @scala.inline
  def accessibilityViewIsModal_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityViewIsModal")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.accessible")
  @js.native
  def accessible: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  @scala.inline
  def accessible_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessible")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.adjustsFontSizeToFit")
  @js.native
  def adjustsFontSizeToFit: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  @scala.inline
  def adjustsFontSizeToFit_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("adjustsFontSizeToFit")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.allowFontScaling")
  @js.native
  def allowFontScaling: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  @scala.inline
  def allowFontScaling_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowFontScaling")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.dataDetectorType")
  @js.native
  def dataDetectorType: js.UndefOr[Validator[js.UndefOr[Null | phoneNumber | link | email | none | all_]]] = js.native
  @scala.inline
  def dataDetectorType_=(x: js.UndefOr[Validator[js.UndefOr[Null | phoneNumber | link | email | none | all_]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataDetectorType")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.ellipsizeMode")
  @js.native
  def ellipsizeMode: js.UndefOr[Validator[js.UndefOr[head | middle | tail | clip]]] = js.native
  @scala.inline
  def ellipsizeMode_=(x: js.UndefOr[Validator[js.UndefOr[head | middle | tail | clip]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ellipsizeMode")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.importantForAccessibility")
  @js.native
  def importantForAccessibility: js.UndefOr[Validator[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.native
  @scala.inline
  def importantForAccessibility_=(x: js.UndefOr[Validator[js.UndefOr[auto | yes | no | `no-hide-descendants`]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("importantForAccessibility")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.lineBreakMode")
  @js.native
  def lineBreakMode: js.UndefOr[Validator[js.UndefOr[head | middle | tail | clip]]] = js.native
  @scala.inline
  def lineBreakMode_=(x: js.UndefOr[Validator[js.UndefOr[head | middle | tail | clip]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineBreakMode")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.maxFontSizeMultiplier")
  @js.native
  def maxFontSizeMultiplier: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  @scala.inline
  def maxFontSizeMultiplier_=(x: js.UndefOr[Validator[js.UndefOr[Double | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxFontSizeMultiplier")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.minimumFontScale")
  @js.native
  def minimumFontScale: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  @scala.inline
  def minimumFontScale_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minimumFontScale")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.nativeID")
  @js.native
  def nativeID: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  @scala.inline
  def nativeID_=(x: js.UndefOr[Validator[js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nativeID")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.numberOfLines")
  @js.native
  def numberOfLines: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  @scala.inline
  def numberOfLines_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("numberOfLines")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.onAccessibilityAction")
  @js.native
  def onAccessibilityAction: js.UndefOr[
    Validator[
      js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]]
    ]
  ] = js.native
  @scala.inline
  def onAccessibilityAction_=(
    x: js.UndefOr[
      Validator[
        js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]]
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityAction")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.onAccessibilityEscape")
  @js.native
  def onAccessibilityEscape: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  @scala.inline
  def onAccessibilityEscape_=(x: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityEscape")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.onAccessibilityTap")
  @js.native
  def onAccessibilityTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  @scala.inline
  def onAccessibilityTap_=(x: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityTap")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.onLayout")
  @js.native
  def onLayout: js.UndefOr[Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, Layout], Unit]]]] = js.native
  @scala.inline
  def onLayout_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, Layout], Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onLayout")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.onLongPress")
  @js.native
  def onLongPress: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  @scala.inline
  def onLongPress_=(
    x: js.UndefOr[
      Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onLongPress")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.onMagicTap")
  @js.native
  def onMagicTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  @scala.inline
  def onMagicTap_=(x: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMagicTap")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.onPress")
  @js.native
  def onPress: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  @scala.inline
  def onPress_=(
    x: js.UndefOr[
      Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPress")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.onTextLayout")
  @js.native
  def onTextLayout: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextLayoutEventData], Unit]]]
  ] = js.native
  @scala.inline
  def onTextLayout_=(
    x: js.UndefOr[
      Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextLayoutEventData], Unit]]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onTextLayout")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.selectable")
  @js.native
  def selectable: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  @scala.inline
  def selectable_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectable")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.selectionColor")
  @js.native
  def selectionColor: js.UndefOr[Validator[js.UndefOr[ColorValue]]] = js.native
  @scala.inline
  def selectionColor_=(x: js.UndefOr[Validator[js.UndefOr[ColorValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectionColor")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.style")
  @js.native
  def style: js.UndefOr[Validator[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  @scala.inline
  def style_=(x: js.UndefOr[Validator[js.UndefOr[StyleProp[TextStyle]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.suppressHighlighting")
  @js.native
  def suppressHighlighting: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  @scala.inline
  def suppressHighlighting_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suppressHighlighting")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.testID")
  @js.native
  def testID: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  @scala.inline
  def testID_=(x: js.UndefOr[Validator[js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("testID")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "TextPropTypes.textBreakStrategy")
  @js.native
  def textBreakStrategy: js.UndefOr[Validator[js.UndefOr[simple | highQuality | balanced]]] = js.native
  @scala.inline
  def textBreakStrategy_=(x: js.UndefOr[Validator[js.UndefOr[simple | highQuality | balanced]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textBreakStrategy")(x.asInstanceOf[js.Any])
}
