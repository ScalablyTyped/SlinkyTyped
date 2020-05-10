package typingsSlinky.expoLinearGradient

import slinky.core.SyntheticEvent
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.`box-none`
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.`box-only`
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.`no-hide-descendants`
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.adjustable
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.alert
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.allowsDirectInteraction
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.assertive
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.auto
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.button
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.checkbox
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.combobox
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.disabled
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.frequentUpdates
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.header
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.image
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.imagebutton
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.key
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.keyboardkey
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.link
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.menu
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.menubar
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.menuitem
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.no
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.none
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.pageTurn
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.plays
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.polite
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.progressbar
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.radio
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.radiobutton_checked
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.radiobutton_unchecked
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.radiogroup
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.scrollbar
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.search
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.selected
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.spinbutton
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.startsMedia
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.summary
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.switch
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.tab
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.tablist
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.text
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.timer
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.toolbar
import typingsSlinky.expoLinearGradient.expoLinearGradientStrings.yes
import typingsSlinky.propTypes.mod.Requireable
import typingsSlinky.propTypes.mod.Validator
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityStates
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.LayoutChangeEvent
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TVParallaxProperties
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccessibilityActions extends js.Object {
  var accessibilityActions: js.UndefOr[Validator[js.UndefOr[js.Array[String]]]] = js.native
  var accessibilityComponentType: js.UndefOr[
    Validator[js.UndefOr[button | none | radiobutton_checked | radiobutton_unchecked]]
  ] = js.native
  var accessibilityElementsHidden: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var accessibilityHint: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  var accessibilityIgnoresInvertColors: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var accessibilityLabel: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  var accessibilityLiveRegion: js.UndefOr[Validator[js.UndefOr[none | polite | assertive]]] = js.native
  var accessibilityRole: js.UndefOr[
    Validator[
      js.UndefOr[
        button | header | link | menu | menuitem | summary | image | switch | text | none | search | keyboardkey | adjustable | imagebutton | alert | checkbox | combobox | menubar | progressbar | radio | radiogroup | scrollbar | spinbutton | tab | tablist | timer | toolbar
      ]
    ]
  ] = js.native
  var accessibilityState: js.UndefOr[Validator[js.UndefOr[AccessibilityState]]] = js.native
  var accessibilityStates: js.UndefOr[Validator[js.UndefOr[js.Array[AccessibilityStates]]]] = js.native
  var accessibilityTraits: js.UndefOr[
    Validator[
      js.UndefOr[
        button | header | link | summary | image | text | none | search | adjustable | disabled | selected | plays | key | frequentUpdates | startsMedia | allowsDirectInteraction | pageTurn | js.Array[AccessibilityTrait]
      ]
    ]
  ] = js.native
  var accessibilityViewIsModal: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var accessible: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var collapsable: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var colors: Validator[js.Array[String]] = js.native
  var end: Requireable[js.Object] = js.native
  var hasTVPreferredFocus: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var hitSlop: js.UndefOr[Validator[js.UndefOr[Insets]]] = js.native
  var importantForAccessibility: js.UndefOr[Validator[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.native
  var isTVSelectable: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var locations: Requireable[js.Array[js.UndefOr[Double | Null]]] = js.native
  var nativeID: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  var needsOffscreenAlphaCompositing: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var onAccessibilityAction: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  var onAccessibilityTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  var onLayout: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]] = js.native
  var onMagicTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.native
  var onMoveShouldSetResponder: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
  ] = js.native
  var onMoveShouldSetResponderCapture: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
  ] = js.native
  var onResponderEnd: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  var onResponderGrant: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  var onResponderMove: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  var onResponderReject: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  var onResponderRelease: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  var onResponderStart: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  var onResponderTerminate: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  var onResponderTerminationRequest: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
  ] = js.native
  var onStartShouldSetResponder: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
  ] = js.native
  var onStartShouldSetResponderCapture: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
  ] = js.native
  var onTouchCancel: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  var onTouchEnd: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  var onTouchEndCapture: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  var onTouchMove: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  var onTouchStart: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  var pointerEvents: js.UndefOr[Validator[js.UndefOr[`box-none` | none | `box-only` | auto]]] = js.native
  var removeClippedSubviews: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var renderToHardwareTextureAndroid: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var shouldRasterizeIOS: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.native
  var start: Requireable[js.Object] = js.native
  var style: js.UndefOr[Validator[StyleProp[ViewStyle]]] = js.native
  var testID: js.UndefOr[Validator[js.UndefOr[String]]] = js.native
  var tvParallaxMagnification: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  var tvParallaxProperties: js.UndefOr[Validator[js.UndefOr[TVParallaxProperties]]] = js.native
  var tvParallaxShiftDistanceX: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  var tvParallaxShiftDistanceY: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
  var tvParallaxTiltAngle: js.UndefOr[Validator[js.UndefOr[Double]]] = js.native
}

object AnonAccessibilityActions {
  @scala.inline
  def apply(
    colors: Validator[js.Array[String]],
    end: Requireable[js.Object],
    locations: Requireable[js.Array[js.UndefOr[Double | Null]]],
    start: Requireable[js.Object]
  ): AnonAccessibilityActions = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccessibilityActions]
  }
  @scala.inline
  implicit class AnonAccessibilityActionsOps[Self <: AnonAccessibilityActions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: Validator[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: Requireable[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocations(value: Requireable[js.Array[js.UndefOr[Double | Null]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Requireable[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessibilityActions(value: Validator[js.UndefOr[js.Array[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityActions")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityComponentType(value: Validator[js.UndefOr[button | none | radiobutton_checked | radiobutton_unchecked]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityComponentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityComponentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityComponentType")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityElementsHidden(value: Validator[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityElementsHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityElementsHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityElementsHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityHint(value: Validator[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityHint")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityIgnoresInvertColors(value: Validator[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityIgnoresInvertColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityIgnoresInvertColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityIgnoresInvertColors")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityLabel(value: Validator[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityLiveRegion(value: Validator[js.UndefOr[none | polite | assertive]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLiveRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityLiveRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLiveRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityRole(
      value: Validator[
          js.UndefOr[
            button | header | link | menu | menuitem | summary | image | switch | text | none | search | keyboardkey | adjustable | imagebutton | alert | checkbox | combobox | menubar | progressbar | radio | radiogroup | scrollbar | spinbutton | tab | tablist | timer | toolbar
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityRole")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityState(value: Validator[js.UndefOr[AccessibilityState]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityState")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityStates(value: Validator[js.UndefOr[js.Array[AccessibilityStates]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityStates")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityTraits(
      value: Validator[
          js.UndefOr[
            button | header | link | summary | image | text | none | search | adjustable | disabled | selected | plays | key | frequentUpdates | startsMedia | allowsDirectInteraction | pageTurn | js.Array[AccessibilityTrait]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityTraits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityTraits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityTraits")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityViewIsModal(value: Validator[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityViewIsModal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityViewIsModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityViewIsModal")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessible(value: Validator[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessible")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsable(value: Validator[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsable")(js.undefined)
        ret
    }
    @scala.inline
    def withHasTVPreferredFocus(value: Validator[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTVPreferredFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasTVPreferredFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTVPreferredFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withHitSlop(value: Validator[js.UndefOr[Insets]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitSlop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHitSlop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitSlop")(js.undefined)
        ret
    }
    @scala.inline
    def withImportantForAccessibility(value: Validator[js.UndefOr[auto | yes | no | `no-hide-descendants`]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importantForAccessibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportantForAccessibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importantForAccessibility")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTVSelectable(value: Validator[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTVSelectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTVSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTVSelectable")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeID(value: Validator[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeID")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedsOffscreenAlphaCompositing(value: Validator[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsOffscreenAlphaCompositing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedsOffscreenAlphaCompositing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsOffscreenAlphaCompositing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAccessibilityAction(value: Validator[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAccessibilityAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityAction")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAccessibilityTap(value: Validator[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityTap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAccessibilityTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityTap")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLayout(value: Validator[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMagicTap(value: Validator[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMagicTap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMagicTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMagicTap")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMoveShouldSetResponder(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetResponder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMoveShouldSetResponder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetResponder")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMoveShouldSetResponderCapture(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetResponderCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMoveShouldSetResponderCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetResponderCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderEnd(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnResponderEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderGrant(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderGrant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnResponderGrant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderGrant")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderMove(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnResponderMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderReject(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderReject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnResponderReject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderReject")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderRelease(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnResponderRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderRelease")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderStart(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnResponderStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderTerminate(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderTerminate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnResponderTerminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderTerminate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderTerminationRequest(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderTerminationRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnResponderTerminationRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderTerminationRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStartShouldSetResponder(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetResponder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnStartShouldSetResponder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetResponder")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStartShouldSetResponderCapture(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetResponderCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnStartShouldSetResponderCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetResponderCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchCancel(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTouchCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchEnd(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTouchEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchEndCapture(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEndCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTouchEndCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEndCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchMove(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTouchMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchStart(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTouchStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerEvents(value: Validator[js.UndefOr[`box-none` | none | `box-only` | auto]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveClippedSubviews(value: Validator[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClippedSubviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveClippedSubviews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClippedSubviews")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderToHardwareTextureAndroid(value: Validator[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderToHardwareTextureAndroid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderToHardwareTextureAndroid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderToHardwareTextureAndroid")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldRasterizeIOS(value: Validator[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRasterizeIOS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldRasterizeIOS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRasterizeIOS")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: Validator[StyleProp[ViewStyle]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTestID(value: Validator[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testID")(js.undefined)
        ret
    }
    @scala.inline
    def withTvParallaxMagnification(value: Validator[js.UndefOr[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxMagnification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTvParallaxMagnification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxMagnification")(js.undefined)
        ret
    }
    @scala.inline
    def withTvParallaxProperties(value: Validator[js.UndefOr[TVParallaxProperties]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTvParallaxProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withTvParallaxShiftDistanceX(value: Validator[js.UndefOr[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxShiftDistanceX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTvParallaxShiftDistanceX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxShiftDistanceX")(js.undefined)
        ret
    }
    @scala.inline
    def withTvParallaxShiftDistanceY(value: Validator[js.UndefOr[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxShiftDistanceY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTvParallaxShiftDistanceY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxShiftDistanceY")(js.undefined)
        ret
    }
    @scala.inline
    def withTvParallaxTiltAngle(value: Validator[js.UndefOr[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxTiltAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTvParallaxTiltAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxTiltAngle")(js.undefined)
        ret
    }
  }
  
}

