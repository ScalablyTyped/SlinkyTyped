package typingsSlinky.reactNavigationStack.components

import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.AccessibilityValue
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.LayoutChangeEvent
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TVParallaxProperties
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNavigationStack.anon.ViewPropsenabledbooleanch
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.`box-none`
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.`box-only`
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.`no-hide-descendants`
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.assertive
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.auto
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.button
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.no
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.none
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.polite
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.radiobutton_checked
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.radiobutton_unchecked
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MaybeScreenContainer {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Screens", "MaybeScreenContainer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def accessibilityActionsVarargs(value: AccessibilityActionInfo*): this.type = set("accessibilityActions", js.Array(value :_*))
    
    @scala.inline
    def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
    
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
    def accessibilityTraitsVarargs(value: AccessibilityTrait*): this.type = set("accessibilityTraits", js.Array(value :_*))
    
    @scala.inline
    def accessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): this.type = set("accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): this.type = set("onAccessibilityAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAccessibilityEscape(value: () => Unit): this.type = set("onAccessibilityEscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def onAccessibilityTap(value: () => Unit): this.type = set("onAccessibilityTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def onLayout(value: /* event */ LayoutChangeEvent => Unit): this.type = set("onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMagicTap(value: () => Unit): this.type = set("onMagicTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def onMoveShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMoveShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderGrant(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderGrant", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderReject(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderReject", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderRelease(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderTerminate(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderTerminate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderTerminationRequest(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStartShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStartShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchCancel(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEndCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchEndCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def pointerEvents(value: `box-none` | none | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ViewPropsenabledbooleanch): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(enabled: Boolean): Builder = {
    val __props = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ViewPropsenabledbooleanch]))
  }
}
