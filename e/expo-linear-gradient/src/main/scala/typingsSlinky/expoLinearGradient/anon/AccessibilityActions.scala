package typingsSlinky.expoLinearGradient.anon

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

trait AccessibilityActions extends js.Object {
  var accessibilityActions: js.UndefOr[Validator[js.UndefOr[js.Array[String]]]] = js.undefined
  var accessibilityComponentType: js.UndefOr[
    Validator[js.UndefOr[button | none | radiobutton_checked | radiobutton_unchecked]]
  ] = js.undefined
  var accessibilityElementsHidden: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var accessibilityHint: js.UndefOr[Validator[js.UndefOr[String]]] = js.undefined
  var accessibilityIgnoresInvertColors: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var accessibilityLabel: js.UndefOr[Validator[js.UndefOr[String]]] = js.undefined
  var accessibilityLiveRegion: js.UndefOr[Validator[js.UndefOr[none | polite | assertive]]] = js.undefined
  var accessibilityRole: js.UndefOr[
    Validator[
      js.UndefOr[
        button | header | link | menu | menuitem | summary | image | switch | text | none | search | keyboardkey | adjustable | imagebutton | alert | checkbox | combobox | menubar | progressbar | radio | radiogroup | scrollbar | spinbutton | tab | tablist | timer | toolbar
      ]
    ]
  ] = js.undefined
  var accessibilityState: js.UndefOr[Validator[js.UndefOr[AccessibilityState]]] = js.undefined
  var accessibilityStates: js.UndefOr[
    Validator[
      js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_react-native.AccessibilityStates */ _
        ]
      ]
    ]
  ] = js.undefined
  var accessibilityTraits: js.UndefOr[
    Validator[
      js.UndefOr[
        button | header | link | summary | image | text | none | search | adjustable | disabled | selected | plays | key | frequentUpdates | startsMedia | allowsDirectInteraction | pageTurn | js.Array[AccessibilityTrait]
      ]
    ]
  ] = js.undefined
  var accessibilityViewIsModal: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var accessible: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var collapsable: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var colors: Validator[js.Array[String]]
  var end: Requireable[js.Object]
  var hasTVPreferredFocus: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var hitSlop: js.UndefOr[Validator[js.UndefOr[Insets]]] = js.undefined
  var importantForAccessibility: js.UndefOr[Validator[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.undefined
  var isTVSelectable: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var locations: Requireable[js.Array[js.UndefOr[Double | Null]]]
  var nativeID: js.UndefOr[Validator[js.UndefOr[String]]] = js.undefined
  var needsOffscreenAlphaCompositing: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var onAccessibilityAction: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var onAccessibilityTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var onLayout: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]] = js.undefined
  var onMagicTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var onMoveShouldSetResponder: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
  ] = js.undefined
  var onMoveShouldSetResponderCapture: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
  ] = js.undefined
  var onResponderEnd: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.undefined
  var onResponderGrant: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.undefined
  var onResponderMove: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.undefined
  var onResponderReject: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.undefined
  var onResponderRelease: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.undefined
  var onResponderStart: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.undefined
  var onResponderTerminate: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.undefined
  var onResponderTerminationRequest: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
  ] = js.undefined
  var onStartShouldSetResponder: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
  ] = js.undefined
  var onStartShouldSetResponderCapture: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
  ] = js.undefined
  var onTouchCancel: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.undefined
  var onTouchEnd: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.undefined
  var onTouchEndCapture: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.undefined
  var onTouchMove: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.undefined
  var onTouchStart: js.UndefOr[
    Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.undefined
  var pointerEvents: js.UndefOr[Validator[js.UndefOr[`box-none` | none | `box-only` | auto]]] = js.undefined
  var removeClippedSubviews: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var renderToHardwareTextureAndroid: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var shouldRasterizeIOS: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var start: Requireable[js.Object]
  var style: js.UndefOr[Validator[StyleProp[ViewStyle]]] = js.undefined
  var testID: js.UndefOr[Validator[js.UndefOr[String]]] = js.undefined
  var tvParallaxMagnification: js.UndefOr[Validator[js.UndefOr[Double]]] = js.undefined
  var tvParallaxProperties: js.UndefOr[Validator[js.UndefOr[TVParallaxProperties]]] = js.undefined
  var tvParallaxShiftDistanceX: js.UndefOr[Validator[js.UndefOr[Double]]] = js.undefined
  var tvParallaxShiftDistanceY: js.UndefOr[Validator[js.UndefOr[Double]]] = js.undefined
  var tvParallaxTiltAngle: js.UndefOr[Validator[js.UndefOr[Double]]] = js.undefined
}

object AccessibilityActions {
  @scala.inline
  def apply(
    colors: Validator[js.Array[String]],
    end: Requireable[js.Object],
    locations: Requireable[js.Array[js.UndefOr[Double | Null]]],
    start: Requireable[js.Object]
  ): AccessibilityActions = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityActions]
  }
  @scala.inline
  implicit class AccessibilityActionsOps[Self <: AccessibilityActions] (val x: Self) extends AnyVal {
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
    def setColors(value: Validator[js.Array[String]]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: Requireable[js.Object]): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocations(value: Requireable[js.Array[js.UndefOr[Double | Null]]]): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Requireable[js.Object]): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessibilityActions(value: Validator[js.UndefOr[js.Array[String]]]): Self = this.set("accessibilityActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityActions: Self = this.set("accessibilityActions", js.undefined)
    @scala.inline
    def setAccessibilityComponentType(value: Validator[js.UndefOr[button | none | radiobutton_checked | radiobutton_unchecked]]): Self = this.set("accessibilityComponentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityComponentType: Self = this.set("accessibilityComponentType", js.undefined)
    @scala.inline
    def setAccessibilityElementsHidden(value: Validator[js.UndefOr[Boolean]]): Self = this.set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityElementsHidden: Self = this.set("accessibilityElementsHidden", js.undefined)
    @scala.inline
    def setAccessibilityHint(value: Validator[js.UndefOr[String]]): Self = this.set("accessibilityHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityHint: Self = this.set("accessibilityHint", js.undefined)
    @scala.inline
    def setAccessibilityIgnoresInvertColors(value: Validator[js.UndefOr[Boolean]]): Self = this.set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityIgnoresInvertColors: Self = this.set("accessibilityIgnoresInvertColors", js.undefined)
    @scala.inline
    def setAccessibilityLabel(value: Validator[js.UndefOr[String]]): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    @scala.inline
    def setAccessibilityLiveRegion(value: Validator[js.UndefOr[none | polite | assertive]]): Self = this.set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityLiveRegion: Self = this.set("accessibilityLiveRegion", js.undefined)
    @scala.inline
    def setAccessibilityRole(
      value: Validator[
          js.UndefOr[
            button | header | link | menu | menuitem | summary | image | switch | text | none | search | keyboardkey | adjustable | imagebutton | alert | checkbox | combobox | menubar | progressbar | radio | radiogroup | scrollbar | spinbutton | tab | tablist | timer | toolbar
          ]
        ]
    ): Self = this.set("accessibilityRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityRole: Self = this.set("accessibilityRole", js.undefined)
    @scala.inline
    def setAccessibilityState(value: Validator[js.UndefOr[AccessibilityState]]): Self = this.set("accessibilityState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityState: Self = this.set("accessibilityState", js.undefined)
    @scala.inline
    def setAccessibilityStates(
      value: Validator[
          js.UndefOr[
            js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_react-native.AccessibilityStates */ _
            ]
          ]
        ]
    ): Self = this.set("accessibilityStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityStates: Self = this.set("accessibilityStates", js.undefined)
    @scala.inline
    def setAccessibilityTraits(
      value: Validator[
          js.UndefOr[
            button | header | link | summary | image | text | none | search | adjustable | disabled | selected | plays | key | frequentUpdates | startsMedia | allowsDirectInteraction | pageTurn | js.Array[AccessibilityTrait]
          ]
        ]
    ): Self = this.set("accessibilityTraits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityTraits: Self = this.set("accessibilityTraits", js.undefined)
    @scala.inline
    def setAccessibilityViewIsModal(value: Validator[js.UndefOr[Boolean]]): Self = this.set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityViewIsModal: Self = this.set("accessibilityViewIsModal", js.undefined)
    @scala.inline
    def setAccessible(value: Validator[js.UndefOr[Boolean]]): Self = this.set("accessible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessible: Self = this.set("accessible", js.undefined)
    @scala.inline
    def setCollapsable(value: Validator[js.UndefOr[Boolean]]): Self = this.set("collapsable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsable: Self = this.set("collapsable", js.undefined)
    @scala.inline
    def setHasTVPreferredFocus(value: Validator[js.UndefOr[Boolean]]): Self = this.set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasTVPreferredFocus: Self = this.set("hasTVPreferredFocus", js.undefined)
    @scala.inline
    def setHitSlop(value: Validator[js.UndefOr[Insets]]): Self = this.set("hitSlop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHitSlop: Self = this.set("hitSlop", js.undefined)
    @scala.inline
    def setImportantForAccessibility(value: Validator[js.UndefOr[auto | yes | no | `no-hide-descendants`]]): Self = this.set("importantForAccessibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportantForAccessibility: Self = this.set("importantForAccessibility", js.undefined)
    @scala.inline
    def setIsTVSelectable(value: Validator[js.UndefOr[Boolean]]): Self = this.set("isTVSelectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTVSelectable: Self = this.set("isTVSelectable", js.undefined)
    @scala.inline
    def setNativeID(value: Validator[js.UndefOr[String]]): Self = this.set("nativeID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNativeID: Self = this.set("nativeID", js.undefined)
    @scala.inline
    def setNeedsOffscreenAlphaCompositing(value: Validator[js.UndefOr[Boolean]]): Self = this.set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedsOffscreenAlphaCompositing: Self = this.set("needsOffscreenAlphaCompositing", js.undefined)
    @scala.inline
    def setOnAccessibilityAction(value: Validator[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onAccessibilityAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAccessibilityAction: Self = this.set("onAccessibilityAction", js.undefined)
    @scala.inline
    def setOnAccessibilityTap(value: Validator[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onAccessibilityTap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAccessibilityTap: Self = this.set("onAccessibilityTap", js.undefined)
    @scala.inline
    def setOnLayout(value: Validator[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]): Self = this.set("onLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLayout: Self = this.set("onLayout", js.undefined)
    @scala.inline
    def setOnMagicTap(value: Validator[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onMagicTap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMagicTap: Self = this.set("onMagicTap", js.undefined)
    @scala.inline
    def setOnMoveShouldSetResponder(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]): Self = this.set("onMoveShouldSetResponder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMoveShouldSetResponder: Self = this.set("onMoveShouldSetResponder", js.undefined)
    @scala.inline
    def setOnMoveShouldSetResponderCapture(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]): Self = this.set("onMoveShouldSetResponderCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMoveShouldSetResponderCapture: Self = this.set("onMoveShouldSetResponderCapture", js.undefined)
    @scala.inline
    def setOnResponderEnd(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]): Self = this.set("onResponderEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnResponderEnd: Self = this.set("onResponderEnd", js.undefined)
    @scala.inline
    def setOnResponderGrant(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]): Self = this.set("onResponderGrant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnResponderGrant: Self = this.set("onResponderGrant", js.undefined)
    @scala.inline
    def setOnResponderMove(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]): Self = this.set("onResponderMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnResponderMove: Self = this.set("onResponderMove", js.undefined)
    @scala.inline
    def setOnResponderReject(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]): Self = this.set("onResponderReject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnResponderReject: Self = this.set("onResponderReject", js.undefined)
    @scala.inline
    def setOnResponderRelease(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]): Self = this.set("onResponderRelease", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnResponderRelease: Self = this.set("onResponderRelease", js.undefined)
    @scala.inline
    def setOnResponderStart(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]): Self = this.set("onResponderStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnResponderStart: Self = this.set("onResponderStart", js.undefined)
    @scala.inline
    def setOnResponderTerminate(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]): Self = this.set("onResponderTerminate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnResponderTerminate: Self = this.set("onResponderTerminate", js.undefined)
    @scala.inline
    def setOnResponderTerminationRequest(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]): Self = this.set("onResponderTerminationRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnResponderTerminationRequest: Self = this.set("onResponderTerminationRequest", js.undefined)
    @scala.inline
    def setOnStartShouldSetResponder(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]): Self = this.set("onStartShouldSetResponder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnStartShouldSetResponder: Self = this.set("onStartShouldSetResponder", js.undefined)
    @scala.inline
    def setOnStartShouldSetResponderCapture(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]): Self = this.set("onStartShouldSetResponderCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnStartShouldSetResponderCapture: Self = this.set("onStartShouldSetResponderCapture", js.undefined)
    @scala.inline
    def setOnTouchCancel(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]): Self = this.set("onTouchCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    @scala.inline
    def setOnTouchEnd(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]): Self = this.set("onTouchEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    @scala.inline
    def setOnTouchEndCapture(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]): Self = this.set("onTouchEndCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchEndCapture: Self = this.set("onTouchEndCapture", js.undefined)
    @scala.inline
    def setOnTouchMove(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]): Self = this.set("onTouchMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    @scala.inline
    def setOnTouchStart(value: Validator[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]): Self = this.set("onTouchStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    @scala.inline
    def setPointerEvents(value: Validator[js.UndefOr[`box-none` | none | `box-only` | auto]]): Self = this.set("pointerEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointerEvents: Self = this.set("pointerEvents", js.undefined)
    @scala.inline
    def setRemoveClippedSubviews(value: Validator[js.UndefOr[Boolean]]): Self = this.set("removeClippedSubviews", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveClippedSubviews: Self = this.set("removeClippedSubviews", js.undefined)
    @scala.inline
    def setRenderToHardwareTextureAndroid(value: Validator[js.UndefOr[Boolean]]): Self = this.set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderToHardwareTextureAndroid: Self = this.set("renderToHardwareTextureAndroid", js.undefined)
    @scala.inline
    def setShouldRasterizeIOS(value: Validator[js.UndefOr[Boolean]]): Self = this.set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldRasterizeIOS: Self = this.set("shouldRasterizeIOS", js.undefined)
    @scala.inline
    def setStyle(value: Validator[StyleProp[ViewStyle]]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTestID(value: Validator[js.UndefOr[String]]): Self = this.set("testID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
    @scala.inline
    def setTvParallaxMagnification(value: Validator[js.UndefOr[Double]]): Self = this.set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTvParallaxMagnification: Self = this.set("tvParallaxMagnification", js.undefined)
    @scala.inline
    def setTvParallaxProperties(value: Validator[js.UndefOr[TVParallaxProperties]]): Self = this.set("tvParallaxProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTvParallaxProperties: Self = this.set("tvParallaxProperties", js.undefined)
    @scala.inline
    def setTvParallaxShiftDistanceX(value: Validator[js.UndefOr[Double]]): Self = this.set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTvParallaxShiftDistanceX: Self = this.set("tvParallaxShiftDistanceX", js.undefined)
    @scala.inline
    def setTvParallaxShiftDistanceY(value: Validator[js.UndefOr[Double]]): Self = this.set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTvParallaxShiftDistanceY: Self = this.set("tvParallaxShiftDistanceY", js.undefined)
    @scala.inline
    def setTvParallaxTiltAngle(value: Validator[js.UndefOr[Double]]): Self = this.set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTvParallaxTiltAngle: Self = this.set("tvParallaxTiltAngle", js.undefined)
  }
  
}

