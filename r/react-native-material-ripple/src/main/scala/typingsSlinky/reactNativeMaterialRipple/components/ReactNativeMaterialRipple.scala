package typingsSlinky.reactNativeMaterialRipple.components

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.AccessibilityValue
import typingsSlinky.reactNative.mod.Animated.CompositeAnimation
import typingsSlinky.reactNative.mod.Animated.LegacyRef
import typingsSlinky.reactNative.mod.Animated.TAugmentRef
import typingsSlinky.reactNative.mod.Animated.WithAnimatedValue
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TVParallaxProperties
import typingsSlinky.reactNative.mod.TargetedEvent
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNative.reactNativeStrings.`no-hide-descendants`
import typingsSlinky.reactNative.reactNativeStrings.assertive
import typingsSlinky.reactNative.reactNativeStrings.auto
import typingsSlinky.reactNative.reactNativeStrings.button
import typingsSlinky.reactNative.reactNativeStrings.no
import typingsSlinky.reactNative.reactNativeStrings.none
import typingsSlinky.reactNative.reactNativeStrings.polite
import typingsSlinky.reactNative.reactNativeStrings.radiobutton_checked
import typingsSlinky.reactNative.reactNativeStrings.radiobutton_unchecked
import typingsSlinky.reactNative.reactNativeStrings.yes
import typingsSlinky.reactNativeMaterialRipple.mod.RippleProps
import typingsSlinky.reactNativeMaterialRipple.mod.default
import typingsSlinky.reactNativeMaterialRipple.reactNativeMaterialRippleStrings.`box-none`
import typingsSlinky.reactNativeMaterialRipple.reactNativeMaterialRippleStrings.`box-only`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeMaterialRipple {
  
  @JSImport("react-native-material-ripple", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityActionsVarargs(value: AccessibilityActionInfo*): this.type = set("accessibilityActions", js.Array(value :_*))
    
    @scala.inline
    def accessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): this.type = set("accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityElementsHidden(value: Boolean): this.type = set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityHint(value: String): this.type = set("accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityIgnoresInvertColors(value: Boolean): this.type = set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityLiveRegion(value: none | polite | assertive): this.type = set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityRole(value: AccessibilityRole): this.type = set("accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityState(value: AccessibilityState): this.type = set("accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): this.type = set("accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityTraitsVarargs(value: AccessibilityTrait*): this.type = set("accessibilityTraits", js.Array(value :_*))
    
    @scala.inline
    def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def collapsable(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): this.type = set("collapsable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def collapsableFunction1(value: /* instance */ js.Any | LegacyRef[js.Any] | Null => Unit): this.type = set("collapsable", js.Any.fromFunction1(value))
    
    @scala.inline
    def collapsableNull: this.type = set("collapsable", null)
    
    @scala.inline
    def collapsableRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("collapsable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delayLongPress(value: Double): this.type = set("delayLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delayPressIn(value: Double): this.type = set("delayPressIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delayPressOut(value: Double): this.type = set("delayPressOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledNull: this.type = set("disabled", null)
    
    @scala.inline
    def focusable(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusableFunction1(value: /* instance */ js.Any | LegacyRef[js.Any] | Null => Unit): this.type = set("focusable", js.Any.fromFunction1(value))
    
    @scala.inline
    def focusableNull: this.type = set("focusable", null)
    
    @scala.inline
    def focusableRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isTVSelectable(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isTVSelectableFunction1(value: /* instance */ js.Any | LegacyRef[js.Any] | Null => Unit): this.type = set("isTVSelectable", js.Any.fromFunction1(value))
    
    @scala.inline
    def isTVSelectableNull: this.type = set("isTVSelectable", null)
    
    @scala.inline
    def isTVSelectableRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nativeID(value: WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nativeIDFunction1(value: /* instance */ js.Any | LegacyRef[js.Any] | Null => Unit): this.type = set("nativeID", js.Any.fromFunction1(value))
    
    @scala.inline
    def nativeIDNull: this.type = set("nativeID", null)
    
    @scala.inline
    def nativeIDRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def needsOffscreenAlphaCompositing(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def needsOffscreenAlphaCompositingFunction1(value: /* instance */ js.Any | LegacyRef[js.Any] | Null => Unit): this.type = set("needsOffscreenAlphaCompositing", js.Any.fromFunction1(value))
    
    @scala.inline
    def needsOffscreenAlphaCompositingNull: this.type = set("needsOffscreenAlphaCompositing", null)
    
    @scala.inline
    def needsOffscreenAlphaCompositingRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): this.type = set("onAccessibilityAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAccessibilityEscape(value: () => Unit): this.type = set("onAccessibilityEscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def onAccessibilityTap(value: () => Unit): this.type = set("onAccessibilityTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def onBlur(value: SyntheticEvent[NodeHandle, TargetedEvent] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: SyntheticEvent[NodeHandle, TargetedEvent] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLayout(value: SyntheticEvent[NodeHandle, Layout] => Unit): this.type = set("onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLongPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onLongPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMagicTap(value: () => Unit): this.type = set("onMagicTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def onMoveShouldSetResponder(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]) | (js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]])
    ): this.type = set("onMoveShouldSetResponder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMoveShouldSetResponderCapture(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]) | (js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]])
    ): this.type = set("onMoveShouldSetResponderCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMoveShouldSetResponderCaptureFunction1(
      value: js.Any | (SyntheticEvent[NodeHandle, NativeTouchEvent]) | LegacyRef[js.Any] | Null => Boolean | Unit
    ): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMoveShouldSetResponderCaptureNull: this.type = set("onMoveShouldSetResponderCapture", null)
    
    @scala.inline
    def onMoveShouldSetResponderCaptureRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("onMoveShouldSetResponderCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMoveShouldSetResponderFunction1(
      value: js.Any | (SyntheticEvent[NodeHandle, NativeTouchEvent]) | LegacyRef[js.Any] | Null => Boolean | Unit
    ): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMoveShouldSetResponderNull: this.type = set("onMoveShouldSetResponder", null)
    
    @scala.inline
    def onMoveShouldSetResponderRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("onMoveShouldSetResponder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPressIn(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onPressIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPressOut(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onPressOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderEnd(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]) | (js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]) | (TAugmentRef[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]])
    ): this.type = set("onResponderEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onResponderEndFunction1(value: js.Any | (SyntheticEvent[NodeHandle, NativeTouchEvent]) | LegacyRef[js.Any] | Null => Unit): this.type = set("onResponderEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderEndNull: this.type = set("onResponderEnd", null)
    
    @scala.inline
    def onResponderEndRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("onResponderEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onResponderGrant(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]) | (js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]) | (TAugmentRef[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]])
    ): this.type = set("onResponderGrant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onResponderGrantFunction1(value: js.Any | (SyntheticEvent[NodeHandle, NativeTouchEvent]) | LegacyRef[js.Any] | Null => Unit): this.type = set("onResponderGrant", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderGrantNull: this.type = set("onResponderGrant", null)
    
    @scala.inline
    def onResponderGrantRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("onResponderGrant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onResponderMove(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]) | (js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]) | (TAugmentRef[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]])
    ): this.type = set("onResponderMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onResponderMoveFunction1(value: js.Any | (SyntheticEvent[NodeHandle, NativeTouchEvent]) | LegacyRef[js.Any] | Null => Unit): this.type = set("onResponderMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderMoveNull: this.type = set("onResponderMove", null)
    
    @scala.inline
    def onResponderMoveRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("onResponderMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onResponderReject(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]) | (js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]) | (TAugmentRef[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]])
    ): this.type = set("onResponderReject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onResponderRejectFunction1(value: js.Any | (SyntheticEvent[NodeHandle, NativeTouchEvent]) | LegacyRef[js.Any] | Null => Unit): this.type = set("onResponderReject", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderRejectNull: this.type = set("onResponderReject", null)
    
    @scala.inline
    def onResponderRejectRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("onResponderReject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onResponderRelease(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]) | (js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]) | (TAugmentRef[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]])
    ): this.type = set("onResponderRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onResponderReleaseFunction1(value: js.Any | (SyntheticEvent[NodeHandle, NativeTouchEvent]) | LegacyRef[js.Any] | Null => Unit): this.type = set("onResponderRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderReleaseNull: this.type = set("onResponderRelease", null)
    
    @scala.inline
    def onResponderReleaseRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("onResponderRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onResponderStart(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]) | (js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]) | (TAugmentRef[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]])
    ): this.type = set("onResponderStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onResponderStartFunction1(value: js.Any | (SyntheticEvent[NodeHandle, NativeTouchEvent]) | LegacyRef[js.Any] | Null => Unit): this.type = set("onResponderStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderStartNull: this.type = set("onResponderStart", null)
    
    @scala.inline
    def onResponderStartRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("onResponderStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onResponderTerminate(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]) | (js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]) | (TAugmentRef[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]])
    ): this.type = set("onResponderTerminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onResponderTerminateFunction1(value: js.Any | (SyntheticEvent[NodeHandle, NativeTouchEvent]) | LegacyRef[js.Any] | Null => Unit): this.type = set("onResponderTerminate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderTerminateNull: this.type = set("onResponderTerminate", null)
    
    @scala.inline
    def onResponderTerminateRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("onResponderTerminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onResponderTerminationRequest(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]) | (js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]])
    ): this.type = set("onResponderTerminationRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onResponderTerminationRequestFunction1(
      value: js.Any | (SyntheticEvent[NodeHandle, NativeTouchEvent]) | LegacyRef[js.Any] | Null => Boolean | Unit
    ): this.type = set("onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderTerminationRequestNull: this.type = set("onResponderTerminationRequest", null)
    
    @scala.inline
    def onResponderTerminationRequestRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("onResponderTerminationRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onRippleAnimation(value: (/* animation */ CompositeAnimation, /* callback */ js.Function0[Unit]) => Unit): this.type = set("onRippleAnimation", js.Any.fromFunction2(value))
    
    @scala.inline
    def onStartShouldSetResponder(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]) | (js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]])
    ): this.type = set("onStartShouldSetResponder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onStartShouldSetResponderCapture(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]) | (js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]) | (TAugmentRef[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]])
    ): this.type = set("onStartShouldSetResponderCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onStartShouldSetResponderCaptureFunction1(
      value: js.Any | (SyntheticEvent[NodeHandle, NativeTouchEvent]) | LegacyRef[js.Any] | Null => Boolean | Unit
    ): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStartShouldSetResponderCaptureNull: this.type = set("onStartShouldSetResponderCapture", null)
    
    @scala.inline
    def onStartShouldSetResponderCaptureRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("onStartShouldSetResponderCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onStartShouldSetResponderFunction1(
      value: js.Any | (SyntheticEvent[NodeHandle, NativeTouchEvent]) | LegacyRef[js.Any] | Null => Boolean | Unit
    ): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStartShouldSetResponderNull: this.type = set("onStartShouldSetResponder", null)
    
    @scala.inline
    def onStartShouldSetResponderRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("onStartShouldSetResponder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchCancel(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]) | (js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]) | (TAugmentRef[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]])
    ): this.type = set("onTouchCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchCancelFunction1(value: js.Any | (SyntheticEvent[NodeHandle, NativeTouchEvent]) | LegacyRef[js.Any] | Null => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchCancelNull: this.type = set("onTouchCancel", null)
    
    @scala.inline
    def onTouchCancelRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("onTouchCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchEnd(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]) | (js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]) | (TAugmentRef[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]])
    ): this.type = set("onTouchEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchEndCapture(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]) | (js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]) | (TAugmentRef[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]])
    ): this.type = set("onTouchEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchEndCaptureFunction1(value: js.Any | (SyntheticEvent[NodeHandle, NativeTouchEvent]) | LegacyRef[js.Any] | Null => Unit): this.type = set("onTouchEndCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEndCaptureNull: this.type = set("onTouchEndCapture", null)
    
    @scala.inline
    def onTouchEndCaptureRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("onTouchEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchEndFunction1(value: js.Any | (SyntheticEvent[NodeHandle, NativeTouchEvent]) | LegacyRef[js.Any] | Null => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEndNull: this.type = set("onTouchEnd", null)
    
    @scala.inline
    def onTouchEndRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("onTouchEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchMove(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]) | (js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]) | (TAugmentRef[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]])
    ): this.type = set("onTouchMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchMoveFunction1(value: js.Any | (SyntheticEvent[NodeHandle, NativeTouchEvent]) | LegacyRef[js.Any] | Null => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchMoveNull: this.type = set("onTouchMove", null)
    
    @scala.inline
    def onTouchMoveRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("onTouchMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchStart(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]) | (js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]) | (TAugmentRef[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]])
    ): this.type = set("onTouchStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchStartFunction1(value: js.Any | (SyntheticEvent[NodeHandle, NativeTouchEvent]) | LegacyRef[js.Any] | Null => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchStartNull: this.type = set("onTouchStart", null)
    
    @scala.inline
    def onTouchStartRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("onTouchStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pointerEvents(
      value: (WithAnimatedValue[
          js.UndefOr[
            `box-none` | typingsSlinky.reactNativeMaterialRipple.reactNativeMaterialRippleStrings.none | `box-only` | typingsSlinky.reactNativeMaterialRipple.reactNativeMaterialRippleStrings.auto
          ]
        ]) | `box-none` | typingsSlinky.reactNativeMaterialRipple.reactNativeMaterialRippleStrings.none | `box-only` | typingsSlinky.reactNativeMaterialRipple.reactNativeMaterialRippleStrings.auto | (TAugmentRef[
          js.UndefOr[
            `box-none` | typingsSlinky.reactNativeMaterialRipple.reactNativeMaterialRippleStrings.none | `box-only` | typingsSlinky.reactNativeMaterialRipple.reactNativeMaterialRippleStrings.auto
          ]
        ])
    ): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pointerEventsFunction1(value: /* instance */ js.Any | LegacyRef[js.Any] | Null => Unit): this.type = set("pointerEvents", js.Any.fromFunction1(value))
    
    @scala.inline
    def pointerEventsNull: this.type = set("pointerEvents", null)
    
    @scala.inline
    def pointerEventsRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pressRetentionOffset(value: Insets): this.type = set("pressRetentionOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def removeClippedSubviews(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def removeClippedSubviewsFunction1(value: /* instance */ js.Any | LegacyRef[js.Any] | Null => Unit): this.type = set("removeClippedSubviews", js.Any.fromFunction1(value))
    
    @scala.inline
    def removeClippedSubviewsNull: this.type = set("removeClippedSubviews", null)
    
    @scala.inline
    def removeClippedSubviewsRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderToHardwareTextureAndroid(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderToHardwareTextureAndroidFunction1(value: /* instance */ js.Any | LegacyRef[js.Any] | Null => Unit): this.type = set("renderToHardwareTextureAndroid", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderToHardwareTextureAndroidNull: this.type = set("renderToHardwareTextureAndroid", null)
    
    @scala.inline
    def renderToHardwareTextureAndroidRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rippleCentered(value: Boolean): this.type = set("rippleCentered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rippleColor(value: String): this.type = set("rippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rippleContainerBorderRadius(value: Double): this.type = set("rippleContainerBorderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rippleDuration(value: Double): this.type = set("rippleDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rippleFades(value: Boolean): this.type = set("rippleFades", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rippleOpacity(value: Double): this.type = set("rippleOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rippleSequential(value: Boolean): this.type = set("rippleSequential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rippleSize(value: Double): this.type = set("rippleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shouldRasterizeIOS(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shouldRasterizeIOSFunction1(value: /* instance */ js.Any | LegacyRef[js.Any] | Null => Unit): this.type = set("shouldRasterizeIOS", js.Any.fromFunction1(value))
    
    @scala.inline
    def shouldRasterizeIOSNull: this.type = set("shouldRasterizeIOS", null)
    
    @scala.inline
    def shouldRasterizeIOSRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def touchSoundDisabled(value: Boolean): this.type = set("touchSoundDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def touchSoundDisabledNull: this.type = set("touchSoundDisabled", null)
    
    @scala.inline
    def tvParallaxMagnification(value: WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxMagnificationFunction1(value: /* instance */ js.Any | LegacyRef[js.Any] | Null => Unit): this.type = set("tvParallaxMagnification", js.Any.fromFunction1(value))
    
    @scala.inline
    def tvParallaxMagnificationNull: this.type = set("tvParallaxMagnification", null)
    
    @scala.inline
    def tvParallaxMagnificationRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxShiftDistanceX(value: WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxShiftDistanceXFunction1(value: /* instance */ js.Any | LegacyRef[js.Any] | Null => Unit): this.type = set("tvParallaxShiftDistanceX", js.Any.fromFunction1(value))
    
    @scala.inline
    def tvParallaxShiftDistanceXNull: this.type = set("tvParallaxShiftDistanceX", null)
    
    @scala.inline
    def tvParallaxShiftDistanceXRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxShiftDistanceY(value: WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxShiftDistanceYFunction1(value: /* instance */ js.Any | LegacyRef[js.Any] | Null => Unit): this.type = set("tvParallaxShiftDistanceY", js.Any.fromFunction1(value))
    
    @scala.inline
    def tvParallaxShiftDistanceYNull: this.type = set("tvParallaxShiftDistanceY", null)
    
    @scala.inline
    def tvParallaxShiftDistanceYRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxTiltAngle(value: WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxTiltAngleFunction1(value: /* instance */ js.Any | LegacyRef[js.Any] | Null => Unit): this.type = set("tvParallaxTiltAngle", js.Any.fromFunction1(value))
    
    @scala.inline
    def tvParallaxTiltAngleNull: this.type = set("tvParallaxTiltAngle", null)
    
    @scala.inline
    def tvParallaxTiltAngleRefObject(value: ReactRef[js.Any | LegacyRef[js.Any]]): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeMaterialRipple.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RippleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
