package typingsSlinky.reactNative.mod

import slinky.core.SyntheticEvent
import typingsSlinky.propTypes.mod.Validator
import typingsSlinky.reactNative.anon.Layout
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.ValidationMap<react-native.react-native.ImageProps> */
object ImagePropTypes {
  
  @JSImport("react-native", "ImagePropTypes")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native", "ImagePropTypes.accessibilityActions")
  @js.native
  def accessibilityActions: js.UndefOr[Validator[js.UndefOr[js.Array[AccessibilityActionInfo]]]] = js.native
  @scala.inline
  def accessibilityActions_=(x: js.UndefOr[Validator[js.UndefOr[js.Array[AccessibilityActionInfo]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityActions")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.accessibilityComponentType")
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
  
  @JSImport("react-native", "ImagePropTypes.accessibilityElementsHidden")
  @js.native
  def accessibilityElementsHidden: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  @scala.inline
  def accessibilityElementsHidden_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityElementsHidden")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.accessibilityHint")
  @js.native
  def accessibilityHint: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  @scala.inline
  def accessibilityHint_=(x: js.UndefOr[Validator[js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityHint")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.accessibilityIgnoresInvertColors")
  @js.native
  def accessibilityIgnoresInvertColors: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  @scala.inline
  def accessibilityIgnoresInvertColors_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityIgnoresInvertColors")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.accessibilityLabel")
  @js.native
  def accessibilityLabel: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  @scala.inline
  def accessibilityLabel_=(x: js.UndefOr[Validator[js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLabel")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.accessibilityLiveRegion")
  @js.native
  def accessibilityLiveRegion: js.UndefOr[Validator[js.UndefOr[none | polite | assertive]]] = js.native
  @scala.inline
  def accessibilityLiveRegion_=(x: js.UndefOr[Validator[js.UndefOr[none | polite | assertive]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLiveRegion")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.accessibilityRole")
  @js.native
  def accessibilityRole: js.UndefOr[Validator[js.UndefOr[AccessibilityRole]]] = js.native
  @scala.inline
  def accessibilityRole_=(x: js.UndefOr[Validator[js.UndefOr[AccessibilityRole]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityRole")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.accessibilityState")
  @js.native
  def accessibilityState: js.UndefOr[Validator[js.UndefOr[AccessibilityState]]] = js.native
  @scala.inline
  def accessibilityState_=(x: js.UndefOr[Validator[js.UndefOr[AccessibilityState]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityState")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.accessibilityTraits")
  @js.native
  def accessibilityTraits: js.UndefOr[Validator[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]] = js.native
  @scala.inline
  def accessibilityTraits_=(x: js.UndefOr[Validator[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityTraits")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.accessibilityValue")
  @js.native
  def accessibilityValue: js.UndefOr[Validator[js.UndefOr[AccessibilityValue]]] = js.native
  @scala.inline
  def accessibilityValue_=(x: js.UndefOr[Validator[js.UndefOr[AccessibilityValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityValue")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.accessibilityViewIsModal")
  @js.native
  def accessibilityViewIsModal: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  @scala.inline
  def accessibilityViewIsModal_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityViewIsModal")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.accessible")
  @js.native
  def accessible: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  @scala.inline
  def accessible_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessible")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.blurRadius")
  @js.native
  def blurRadius: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  @scala.inline
  def blurRadius_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blurRadius")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.borderBottomLeftRadius")
  @js.native
  def borderBottomLeftRadius: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  @scala.inline
  def borderBottomLeftRadius_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderBottomLeftRadius")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.borderBottomRightRadius")
  @js.native
  def borderBottomRightRadius: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  @scala.inline
  def borderBottomRightRadius_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderBottomRightRadius")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.borderRadius")
  @js.native
  def borderRadius: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  @scala.inline
  def borderRadius_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.borderTopLeftRadius")
  @js.native
  def borderTopLeftRadius: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  @scala.inline
  def borderTopLeftRadius_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderTopLeftRadius")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.borderTopRightRadius")
  @js.native
  def borderTopRightRadius: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  @scala.inline
  def borderTopRightRadius_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderTopRightRadius")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.capInsets")
  @js.native
  def capInsets: js.UndefOr[Validator[js.UndefOr[Insets]]] = js.native
  @scala.inline
  def capInsets_=(x: js.UndefOr[Validator[js.UndefOr[Insets]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capInsets")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.defaultSource")
  @js.native
  def defaultSource: js.UndefOr[Validator[js.UndefOr[ImageURISource | Double]]] = js.native
  @scala.inline
  def defaultSource_=(x: js.UndefOr[Validator[js.UndefOr[ImageURISource | Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSource")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.fadeDuration")
  @js.native
  def fadeDuration: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  @scala.inline
  def fadeDuration_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fadeDuration")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.height")
  @js.native
  def height: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  @scala.inline
  def height_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.importantForAccessibility")
  @js.native
  def importantForAccessibility: js.UndefOr[Validator[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.native
  @scala.inline
  def importantForAccessibility_=(x: js.UndefOr[Validator[js.UndefOr[auto | yes | no | `no-hide-descendants`]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("importantForAccessibility")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.loadingIndicatorSource")
  @js.native
  def loadingIndicatorSource: js.UndefOr[Validator[js.UndefOr[ImageURISource]]] = js.native
  @scala.inline
  def loadingIndicatorSource_=(x: js.UndefOr[Validator[js.UndefOr[ImageURISource]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadingIndicatorSource")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.onAccessibilityAction")
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
  
  @JSImport("react-native", "ImagePropTypes.onAccessibilityEscape")
  @js.native
  def onAccessibilityEscape: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  @scala.inline
  def onAccessibilityEscape_=(x: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityEscape")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.onAccessibilityTap")
  @js.native
  def onAccessibilityTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  @scala.inline
  def onAccessibilityTap_=(x: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityTap")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.onError")
  @js.native
  def onError: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageErrorEventData], Unit]]]
  ] = js.native
  @scala.inline
  def onError_=(
    x: js.UndefOr[
      Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageErrorEventData], Unit]]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onError")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.onLayout")
  @js.native
  def onLayout: js.UndefOr[Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, Layout], Unit]]]] = js.native
  @scala.inline
  def onLayout_=(x: js.UndefOr[Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, Layout], Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onLayout")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.onLoad")
  @js.native
  def onLoad: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageLoadEventData], Unit]]]
  ] = js.native
  
  @JSImport("react-native", "ImagePropTypes.onLoadEnd")
  @js.native
  def onLoadEnd: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  @scala.inline
  def onLoadEnd_=(x: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onLoadEnd")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.onLoadStart")
  @js.native
  def onLoadStart: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  @scala.inline
  def onLoadStart_=(x: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onLoadStart")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def onLoad_=(
    x: js.UndefOr[
      Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageLoadEventData], Unit]]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.onMagicTap")
  @js.native
  def onMagicTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  @scala.inline
  def onMagicTap_=(x: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMagicTap")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.onPartialLoad")
  @js.native
  def onPartialLoad: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  @scala.inline
  def onPartialLoad_=(x: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPartialLoad")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.onProgress")
  @js.native
  def onProgress: js.UndefOr[
    Validator[
      js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageProgressEventDataIOS], Unit]]
    ]
  ] = js.native
  @scala.inline
  def onProgress_=(
    x: js.UndefOr[
      Validator[
        js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ImageProgressEventDataIOS], Unit]]
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.progressiveRenderingEnabled")
  @js.native
  def progressiveRenderingEnabled: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  @scala.inline
  def progressiveRenderingEnabled_=(x: js.UndefOr[Validator[js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("progressiveRenderingEnabled")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.resizeMethod")
  @js.native
  def resizeMethod: js.UndefOr[Validator[js.UndefOr[auto | resize | scale]]] = js.native
  @scala.inline
  def resizeMethod_=(x: js.UndefOr[Validator[js.UndefOr[auto | resize | scale]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resizeMethod")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.resizeMode")
  @js.native
  def resizeMode: js.UndefOr[Validator[js.UndefOr[ImageResizeMode]]] = js.native
  @scala.inline
  def resizeMode_=(x: js.UndefOr[Validator[js.UndefOr[ImageResizeMode]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resizeMode")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.source")
  @js.native
  def source: js.UndefOr[Validator[ImageSourcePropType]] = js.native
  @scala.inline
  def source_=(x: js.UndefOr[Validator[ImageSourcePropType]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("source")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.style")
  @js.native
  def style: js.UndefOr[Validator[js.UndefOr[StyleProp[ImageStyle]]]] = js.native
  @scala.inline
  def style_=(x: js.UndefOr[Validator[js.UndefOr[StyleProp[ImageStyle]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.testID")
  @js.native
  def testID: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  @scala.inline
  def testID_=(x: js.UndefOr[Validator[js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("testID")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "ImagePropTypes.width")
  @js.native
  def width: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  @scala.inline
  def width_=(x: js.UndefOr[Validator[js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
}
