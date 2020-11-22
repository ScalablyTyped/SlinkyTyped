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
import typingsSlinky.reactNativeMaps.anon.Markers
import typingsSlinky.reactNativeMaps.anon.Name
import typingsSlinky.reactNativeMaps.anon.`0`
import typingsSlinky.reactNativeMaps.mod.Camera
import typingsSlinky.reactNativeMaps.mod.EdgeInsets
import typingsSlinky.reactNativeMaps.mod.EdgePadding
import typingsSlinky.reactNativeMaps.mod.EventUserLocation
import typingsSlinky.reactNativeMaps.mod.MapStyleElement
import typingsSlinky.reactNativeMaps.mod.MapTypes
import typingsSlinky.reactNativeMaps.mod.Point
import typingsSlinky.reactNativeMaps.mod.Region
import typingsSlinky.reactNativeMaps.reactNativeMapsStrings.google
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_MapViewProps_1186437086[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
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
  def cacheEnabled(value: Boolean): this.type = set("cacheEnabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def camera(value: Camera): this.type = set("camera", value.asInstanceOf[js.Any])
  
  @scala.inline
  def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
  
  @scala.inline
  def compassOffset(value: Point): this.type = set("compassOffset", value.asInstanceOf[js.Any])
  
  @scala.inline
  def customMapStyleVarargs(value: MapStyleElement*): this.type = set("customMapStyle", js.Array(value :_*))
  
  @scala.inline
  def customMapStyle(value: js.Array[MapStyleElement]): this.type = set("customMapStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def customMapStyleString(value: String): this.type = set("customMapStyleString", value.asInstanceOf[js.Any])
  
  @scala.inline
  def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
  
  @scala.inline
  def followsUserLocation(value: Boolean): this.type = set("followsUserLocation", value.asInstanceOf[js.Any])
  
  @scala.inline
  def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
  
  @scala.inline
  def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
  
  @scala.inline
  def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
  
  @scala.inline
  def initialCamera(value: Camera): this.type = set("initialCamera", value.asInstanceOf[js.Any])
  
  @scala.inline
  def initialRegion(value: Region): this.type = set("initialRegion", value.asInstanceOf[js.Any])
  
  @scala.inline
  def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
  
  @scala.inline
  def kmlSrc(value: String): this.type = set("kmlSrc", value.asInstanceOf[js.Any])
  
  @scala.inline
  def legalLabelInsets(value: EdgeInsets): this.type = set("legalLabelInsets", value.asInstanceOf[js.Any])
  
  @scala.inline
  def liteMode(value: Boolean): this.type = set("liteMode", value.asInstanceOf[js.Any])
  
  @scala.inline
  def loadingBackgroundColor(value: String): this.type = set("loadingBackgroundColor", value.asInstanceOf[js.Any])
  
  @scala.inline
  def loadingEnabled(value: Boolean): this.type = set("loadingEnabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def loadingIndicatorColor(value: String): this.type = set("loadingIndicatorColor", value.asInstanceOf[js.Any])
  
  @scala.inline
  def mapPadding(value: EdgePadding): this.type = set("mapPadding", value.asInstanceOf[js.Any])
  
  @scala.inline
  def mapType(value: MapTypes): this.type = set("mapType", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maxDelta(value: Double): this.type = set("maxDelta", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maxZoomLevel(value: Double): this.type = set("maxZoomLevel", value.asInstanceOf[js.Any])
  
  @scala.inline
  def minDelta(value: Double): this.type = set("minDelta", value.asInstanceOf[js.Any])
  
  @scala.inline
  def minZoomLevel(value: Double): this.type = set("minZoomLevel", value.asInstanceOf[js.Any])
  
  @scala.inline
  def moveOnMarkerPress(value: Boolean): this.type = set("moveOnMarkerPress", value.asInstanceOf[js.Any])
  
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
  def onKmlReady(value: SyntheticEvent[NodeHandle, Markers] => Unit): this.type = set("onKmlReady", js.Any.fromFunction1(value))
  
  @scala.inline
  def onLayout(value: SyntheticEvent[NodeHandle, Layout] => Unit): this.type = set("onLayout", js.Any.fromFunction1(value))
  
  @scala.inline
  def onLongPress(value: SyntheticEvent[NodeHandle, js.Object with Coordinate] => Unit): this.type = set("onLongPress", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMagicTap(value: () => Unit): this.type = set("onMagicTap", js.Any.fromFunction0(value))
  
  @scala.inline
  def onMapReady(value: () => Unit): this.type = set("onMapReady", js.Any.fromFunction0(value))
  
  @scala.inline
  def onMarkerDeselect(value: SyntheticEvent[NodeHandle, ActionId with Coordinate] => Unit): this.type = set("onMarkerDeselect", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMarkerDrag(value: SyntheticEvent[NodeHandle, js.Object with Coordinate] => Unit): this.type = set("onMarkerDrag", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMarkerDragEnd(value: SyntheticEvent[NodeHandle, js.Object with Coordinate] => Unit): this.type = set("onMarkerDragEnd", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMarkerDragStart(value: SyntheticEvent[NodeHandle, js.Object with Coordinate] => Unit): this.type = set("onMarkerDragStart", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMarkerPress(value: SyntheticEvent[NodeHandle, Action with Coordinate] => Unit): this.type = set("onMarkerPress", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMarkerSelect(value: SyntheticEvent[NodeHandle, Id with Coordinate] => Unit): this.type = set("onMarkerSelect", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMoveShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMoveShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPanDrag(value: SyntheticEvent[NodeHandle, js.Object with Coordinate] => Unit): this.type = set("onPanDrag", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPoiClick(value: SyntheticEvent[NodeHandle, Name with Coordinate] => Unit): this.type = set("onPoiClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPress(value: SyntheticEvent[NodeHandle, js.Object with Coordinate] => Unit): this.type = set("onPress", js.Any.fromFunction1(value))
  
  @scala.inline
  def onRegionChange(value: /* region */ Region => Unit): this.type = set("onRegionChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onRegionChangeComplete(value: /* region */ Region => Unit): this.type = set("onRegionChangeComplete", js.Any.fromFunction1(value))
  
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
  def onUserLocationChange(value: /* event */ EventUserLocation => Unit): this.type = set("onUserLocationChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def pitchEnabled(value: Boolean): this.type = set("pitchEnabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def pointerEvents(value: `box-none` | none | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
  
  @scala.inline
  def provider(value: google): this.type = set("provider", value.asInstanceOf[js.Any])
  
  @scala.inline
  def providerNull: this.type = set("provider", null)
  
  @scala.inline
  def region(value: Region): this.type = set("region", value.asInstanceOf[js.Any])
  
  @scala.inline
  def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
  
  @scala.inline
  def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rotateEnabled(value: Boolean): this.type = set("rotateEnabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def scrollEnabled(value: Boolean): this.type = set("scrollEnabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
  
  @scala.inline
  def showsBuildings(value: Boolean): this.type = set("showsBuildings", value.asInstanceOf[js.Any])
  
  @scala.inline
  def showsCompass(value: Boolean): this.type = set("showsCompass", value.asInstanceOf[js.Any])
  
  @scala.inline
  def showsIndoorLevelPicker(value: Boolean): this.type = set("showsIndoorLevelPicker", value.asInstanceOf[js.Any])
  
  @scala.inline
  def showsIndoors(value: Boolean): this.type = set("showsIndoors", value.asInstanceOf[js.Any])
  
  @scala.inline
  def showsMyLocationButton(value: Boolean): this.type = set("showsMyLocationButton", value.asInstanceOf[js.Any])
  
  @scala.inline
  def showsPointsOfInterest(value: Boolean): this.type = set("showsPointsOfInterest", value.asInstanceOf[js.Any])
  
  @scala.inline
  def showsScale(value: Boolean): this.type = set("showsScale", value.asInstanceOf[js.Any])
  
  @scala.inline
  def showsTraffic(value: Boolean): this.type = set("showsTraffic", value.asInstanceOf[js.Any])
  
  @scala.inline
  def showsUserLocation(value: Boolean): this.type = set("showsUserLocation", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def styleNull: this.type = set("style", null)
  
  @scala.inline
  def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
  
  @scala.inline
  def toolbarEnabled(value: Boolean): this.type = set("toolbarEnabled", value.asInstanceOf[js.Any])
  
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
  def userLocationAnnotationTitle(value: String): this.type = set("userLocationAnnotationTitle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def zoomControlEnabled(value: Boolean): this.type = set("zoomControlEnabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def zoomEnabled(value: Boolean): this.type = set("zoomEnabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def zoomTapEnabled(value: Boolean): this.type = set("zoomTapEnabled", value.asInstanceOf[js.Any])
}
