package typingsSlinky.reactNativeMaps.components

import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.AccessibilityValue
import typingsSlinky.reactNative.mod.ImageRequireSource
import typingsSlinky.reactNative.mod.ImageURISource
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TVParallaxProperties
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNative.reactNativeStrings.`box-none`
import typingsSlinky.reactNative.reactNativeStrings.`box-only`
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
import typingsSlinky.reactNativeMaps.anon.Action
import typingsSlinky.reactNativeMaps.anon.ActionId
import typingsSlinky.reactNativeMaps.anon.Coordinate
import typingsSlinky.reactNativeMaps.anon.Id
import typingsSlinky.reactNativeMaps.anon.`0`
import typingsSlinky.reactNativeMaps.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_MarkerProps278311419[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
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
  def anchor(value: Point): this.type = set("anchor", value.asInstanceOf[js.Any])
  
  @scala.inline
  def calloutAnchor(value: Point): this.type = set("calloutAnchor", value.asInstanceOf[js.Any])
  
  @scala.inline
  def calloutOffset(value: Point): this.type = set("calloutOffset", value.asInstanceOf[js.Any])
  
  @scala.inline
  def centerOffset(value: Point): this.type = set("centerOffset", value.asInstanceOf[js.Any])
  
  @scala.inline
  def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
  
  @scala.inline
  def description(value: String): this.type = set("description", value.asInstanceOf[js.Any])
  
  @scala.inline
  def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
  
  @scala.inline
  def flat(value: Boolean): this.type = set("flat", value.asInstanceOf[js.Any])
  
  @scala.inline
  def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
  
  @scala.inline
  def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
  
  @scala.inline
  def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
  
  @scala.inline
  def icon(value: ImageURISource | ImageRequireSource): this.type = set("icon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def identifier(value: String): this.type = set("identifier", value.asInstanceOf[js.Any])
  
  @scala.inline
  def image(value: ImageURISource | ImageRequireSource): this.type = set("image", value.asInstanceOf[js.Any])
  
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
  def onCalloutPress(value: SyntheticEvent[NodeHandle, `0` with Coordinate] => Unit): this.type = set("onCalloutPress", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDeselect(value: SyntheticEvent[NodeHandle, ActionId with Coordinate] => Unit): this.type = set("onDeselect", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDrag(value: SyntheticEvent[NodeHandle, js.Object with Coordinate] => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDragEnd(value: SyntheticEvent[NodeHandle, js.Object with Coordinate] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDragStart(value: SyntheticEvent[NodeHandle, js.Object with Coordinate] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
  
  @scala.inline
  def onLayout(value: SyntheticEvent[NodeHandle, Layout] => Unit): this.type = set("onLayout", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMagicTap(value: () => Unit): this.type = set("onMagicTap", js.Any.fromFunction0(value))
  
  @scala.inline
  def onMoveShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMoveShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPress(value: SyntheticEvent[NodeHandle, Action with Coordinate] => Unit): this.type = set("onPress", js.Any.fromFunction1(value))
  
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
  def onSelect(value: SyntheticEvent[NodeHandle, Id with Coordinate] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
  
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
  def opacity(value: Double): this.type = set("opacity", value.asInstanceOf[js.Any])
  
  @scala.inline
  def pinColor(value: String): this.type = set("pinColor", value.asInstanceOf[js.Any])
  
  @scala.inline
  def pointerEvents(value: `box-none` | none | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
  
  @scala.inline
  def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
  
  @scala.inline
  def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
  
  @scala.inline
  def reuseIdentifier(value: String): this.type = set("reuseIdentifier", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rotation(value: Double): this.type = set("rotation", value.asInstanceOf[js.Any])
  
  @scala.inline
  def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
  
  @scala.inline
  def stopPropagation(value: Boolean): this.type = set("stopPropagation", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def styleNull: this.type = set("style", null)
  
  @scala.inline
  def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
  
  @scala.inline
  def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tracksInfoWindowChanges(value: Boolean): this.type = set("tracksInfoWindowChanges", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tracksViewChanges(value: Boolean): this.type = set("tracksViewChanges", value.asInstanceOf[js.Any])
  
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
  
  @scala.inline
  def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
}
