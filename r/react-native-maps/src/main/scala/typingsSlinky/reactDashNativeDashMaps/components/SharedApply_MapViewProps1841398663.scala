package typingsSlinky.reactDashNativeDashMaps.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.Anon_ActionName
import typingsSlinky.reactDashNative.reactDashNativeMod.AccessibilityActionInfo
import typingsSlinky.reactDashNative.reactDashNativeMod.AccessibilityRole
import typingsSlinky.reactDashNative.reactDashNativeMod.AccessibilityState
import typingsSlinky.reactDashNative.reactDashNativeMod.AccessibilityStates
import typingsSlinky.reactDashNative.reactDashNativeMod.AccessibilityTrait
import typingsSlinky.reactDashNative.reactDashNativeMod.Insets
import typingsSlinky.reactDashNative.reactDashNativeMod.LayoutChangeEvent
import typingsSlinky.reactDashNative.reactDashNativeMod.NativeTouchEvent
import typingsSlinky.reactDashNative.reactDashNativeMod.NodeHandle
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.TVParallaxProperties
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNative.reactDashNativeStrings.`box-none`
import typingsSlinky.reactDashNative.reactDashNativeStrings.`box-only`
import typingsSlinky.reactDashNative.reactDashNativeStrings.`no-hide-descendants`
import typingsSlinky.reactDashNative.reactDashNativeStrings.assertive
import typingsSlinky.reactDashNative.reactDashNativeStrings.auto
import typingsSlinky.reactDashNative.reactDashNativeStrings.button
import typingsSlinky.reactDashNative.reactDashNativeStrings.no
import typingsSlinky.reactDashNative.reactDashNativeStrings.none
import typingsSlinky.reactDashNative.reactDashNativeStrings.polite
import typingsSlinky.reactDashNative.reactDashNativeStrings.radiobutton_checked
import typingsSlinky.reactDashNative.reactDashNativeStrings.radiobutton_unchecked
import typingsSlinky.reactDashNative.reactDashNativeStrings.yes
import typingsSlinky.reactDashNativeDashMaps.Anon_Action
import typingsSlinky.reactDashNativeDashMaps.Anon_ActionCalloutpress
import typingsSlinky.reactDashNativeDashMaps.Anon_ActionId
import typingsSlinky.reactDashNativeDashMaps.Anon_ActionIdMarkerdeselect
import typingsSlinky.reactDashNativeDashMaps.Anon_Name
import typingsSlinky.reactDashNativeDashMaps.reactDashNativeDashMapsMod.Camera
import typingsSlinky.reactDashNativeDashMaps.reactDashNativeDashMapsMod.EdgeInsets
import typingsSlinky.reactDashNativeDashMaps.reactDashNativeDashMapsMod.EdgePadding
import typingsSlinky.reactDashNativeDashMaps.reactDashNativeDashMapsMod.EventUserLocation
import typingsSlinky.reactDashNativeDashMaps.reactDashNativeDashMapsMod.KmlMapEvent
import typingsSlinky.reactDashNativeDashMaps.reactDashNativeDashMapsMod.MapEvent
import typingsSlinky.reactDashNativeDashMaps.reactDashNativeDashMapsMod.MapStyleElement
import typingsSlinky.reactDashNativeDashMaps.reactDashNativeDashMapsMod.MapTypes
import typingsSlinky.reactDashNativeDashMaps.reactDashNativeDashMapsMod.MapViewProps
import typingsSlinky.reactDashNativeDashMaps.reactDashNativeDashMapsMod.Point
import typingsSlinky.reactDashNativeDashMaps.reactDashNativeDashMapsMod.Region
import typingsSlinky.reactDashNativeDashMaps.reactDashNativeDashMapsStrings.google
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_MapViewProps1841398663[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: onTouchCancel, onTouchEnd, onTouchMove, onTouchStart */
  def apply(
    accessibilityActions: js.Array[AccessibilityActionInfo] = null,
    accessibilityComponentType: none | button | radiobutton_checked | radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined,
    accessibilityHint: String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined,
    accessibilityLabel: String = null,
    accessibilityLiveRegion: none | polite | assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityState: AccessibilityState = null,
    accessibilityStates: js.Array[AccessibilityStates] = null,
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
    accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined,
    accessible: js.UndefOr[Boolean] = js.undefined,
    cacheEnabled: js.UndefOr[Boolean] = js.undefined,
    camera: Camera = null,
    collapsable: js.UndefOr[Boolean] = js.undefined,
    compassOffset: Point = null,
    customMapStyle: js.Array[MapStyleElement] = null,
    customMapStyleString: String = null,
    followsUserLocation: js.UndefOr[Boolean] = js.undefined,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    initialCamera: Camera = null,
    initialRegion: Region = null,
    isTVSelectable: js.UndefOr[Boolean] = js.undefined,
    kmlSrc: String = null,
    legalLabelInsets: EdgeInsets = null,
    liteMode: js.UndefOr[Boolean] = js.undefined,
    loadingBackgroundColor: String = null,
    loadingEnabled: js.UndefOr[Boolean] = js.undefined,
    loadingIndicatorColor: String = null,
    mapPadding: EdgePadding = null,
    mapType: MapTypes = null,
    maxDelta: Int | Double = null,
    maxZoomLevel: Int | Double = null,
    minDelta: Int | Double = null,
    minZoomLevel: Int | Double = null,
    moveOnMarkerPress: js.UndefOr[Boolean] = js.undefined,
    nativeID: String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined,
    onAccessibilityAction: SyntheticEvent[NodeHandle, Anon_ActionName] => Unit = null,
    onAccessibilityTap: () => Unit = null,
    onCalloutPress: /* event */ MapEvent[Anon_ActionCalloutpress] => Unit = null,
    onKmlReady: /* values */ KmlMapEvent => Unit = null,
    onLayout: /* event */ LayoutChangeEvent => Unit = null,
    onLongPress: /* event */ MapEvent[js.Object] => Unit = null,
    onMagicTap: () => Unit = null,
    onMapReady: () => Unit = null,
    onMarkerDeselect: /* event */ MapEvent[Anon_ActionIdMarkerdeselect] => Unit = null,
    onMarkerDrag: /* event */ MapEvent[js.Object] => Unit = null,
    onMarkerDragEnd: /* event */ MapEvent[js.Object] => Unit = null,
    onMarkerDragStart: /* event */ MapEvent[js.Object] => Unit = null,
    onMarkerPress: /* event */ MapEvent[Anon_Action] => Unit = null,
    onMarkerSelect: /* event */ MapEvent[Anon_ActionId] => Unit = null,
    onMoveShouldSetResponder: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onMoveShouldSetResponderCapture: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onPanDrag: /* event */ MapEvent[js.Object] => Unit = null,
    onPoiClick: /* event */ MapEvent[Anon_Name] => Unit = null,
    onPress: /* event */ MapEvent[js.Object] => Unit = null,
    onRegionChange: /* region */ Region => Unit = null,
    onRegionChangeComplete: /* region */ Region => Unit = null,
    onResponderEnd: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderGrant: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderMove: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderReject: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderRelease: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderStart: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderTerminate: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderTerminationRequest: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onStartShouldSetResponder: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onStartShouldSetResponderCapture: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onTouchEndCapture: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onUserLocationChange: /* event */ EventUserLocation => Unit = null,
    pitchEnabled: js.UndefOr[Boolean] = js.undefined,
    pointerEvents: `box-none` | none | `box-only` | auto = null,
    provider: google = null,
    region: Region = null,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
    rotateEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
    showsBuildings: js.UndefOr[Boolean] = js.undefined,
    showsCompass: js.UndefOr[Boolean] = js.undefined,
    showsIndoorLevelPicker: js.UndefOr[Boolean] = js.undefined,
    showsIndoors: js.UndefOr[Boolean] = js.undefined,
    showsMyLocationButton: js.UndefOr[Boolean] = js.undefined,
    showsPointsOfInterest: js.UndefOr[Boolean] = js.undefined,
    showsScale: js.UndefOr[Boolean] = js.undefined,
    showsTraffic: js.UndefOr[Boolean] = js.undefined,
    showsUserLocation: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    testID: String = null,
    toolbarEnabled: js.UndefOr[Boolean] = js.undefined,
    tvParallaxMagnification: Int | Double = null,
    tvParallaxProperties: TVParallaxProperties = null,
    tvParallaxShiftDistanceX: Int | Double = null,
    tvParallaxShiftDistanceY: Int | Double = null,
    tvParallaxTiltAngle: Int | Double = null,
    userLocationAnnotationTitle: String = null,
    zoomControlEnabled: js.UndefOr[Boolean] = js.undefined,
    zoomEnabled: js.UndefOr[Boolean] = js.undefined,
    zoomTapEnabled: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions.asInstanceOf[js.Any])
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden.asInstanceOf[js.Any])
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole.asInstanceOf[js.Any])
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState.asInstanceOf[js.Any])
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates.asInstanceOf[js.Any])
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheEnabled)) __obj.updateDynamic("cacheEnabled")(cacheEnabled.asInstanceOf[js.Any])
    if (camera != null) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable.asInstanceOf[js.Any])
    if (compassOffset != null) __obj.updateDynamic("compassOffset")(compassOffset.asInstanceOf[js.Any])
    if (customMapStyle != null) __obj.updateDynamic("customMapStyle")(customMapStyle.asInstanceOf[js.Any])
    if (customMapStyleString != null) __obj.updateDynamic("customMapStyleString")(customMapStyleString.asInstanceOf[js.Any])
    if (!js.isUndefined(followsUserLocation)) __obj.updateDynamic("followsUserLocation")(followsUserLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (initialCamera != null) __obj.updateDynamic("initialCamera")(initialCamera.asInstanceOf[js.Any])
    if (initialRegion != null) __obj.updateDynamic("initialRegion")(initialRegion.asInstanceOf[js.Any])
    if (!js.isUndefined(isTVSelectable)) __obj.updateDynamic("isTVSelectable")(isTVSelectable.asInstanceOf[js.Any])
    if (kmlSrc != null) __obj.updateDynamic("kmlSrc")(kmlSrc.asInstanceOf[js.Any])
    if (legalLabelInsets != null) __obj.updateDynamic("legalLabelInsets")(legalLabelInsets.asInstanceOf[js.Any])
    if (!js.isUndefined(liteMode)) __obj.updateDynamic("liteMode")(liteMode.asInstanceOf[js.Any])
    if (loadingBackgroundColor != null) __obj.updateDynamic("loadingBackgroundColor")(loadingBackgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(loadingEnabled)) __obj.updateDynamic("loadingEnabled")(loadingEnabled.asInstanceOf[js.Any])
    if (loadingIndicatorColor != null) __obj.updateDynamic("loadingIndicatorColor")(loadingIndicatorColor.asInstanceOf[js.Any])
    if (mapPadding != null) __obj.updateDynamic("mapPadding")(mapPadding.asInstanceOf[js.Any])
    if (mapType != null) __obj.updateDynamic("mapType")(mapType.asInstanceOf[js.Any])
    if (maxDelta != null) __obj.updateDynamic("maxDelta")(maxDelta.asInstanceOf[js.Any])
    if (maxZoomLevel != null) __obj.updateDynamic("maxZoomLevel")(maxZoomLevel.asInstanceOf[js.Any])
    if (minDelta != null) __obj.updateDynamic("minDelta")(minDelta.asInstanceOf[js.Any])
    if (minZoomLevel != null) __obj.updateDynamic("minZoomLevel")(minZoomLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(moveOnMarkerPress)) __obj.updateDynamic("moveOnMarkerPress")(moveOnMarkerPress.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1(onAccessibilityAction))
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onCalloutPress != null) __obj.updateDynamic("onCalloutPress")(js.Any.fromFunction1(onCalloutPress))
    if (onKmlReady != null) __obj.updateDynamic("onKmlReady")(js.Any.fromFunction1(onKmlReady))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction1(onLongPress))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onMapReady != null) __obj.updateDynamic("onMapReady")(js.Any.fromFunction0(onMapReady))
    if (onMarkerDeselect != null) __obj.updateDynamic("onMarkerDeselect")(js.Any.fromFunction1(onMarkerDeselect))
    if (onMarkerDrag != null) __obj.updateDynamic("onMarkerDrag")(js.Any.fromFunction1(onMarkerDrag))
    if (onMarkerDragEnd != null) __obj.updateDynamic("onMarkerDragEnd")(js.Any.fromFunction1(onMarkerDragEnd))
    if (onMarkerDragStart != null) __obj.updateDynamic("onMarkerDragStart")(js.Any.fromFunction1(onMarkerDragStart))
    if (onMarkerPress != null) __obj.updateDynamic("onMarkerPress")(js.Any.fromFunction1(onMarkerPress))
    if (onMarkerSelect != null) __obj.updateDynamic("onMarkerSelect")(js.Any.fromFunction1(onMarkerSelect))
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1(onMoveShouldSetResponder))
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1(onMoveShouldSetResponderCapture))
    if (onPanDrag != null) __obj.updateDynamic("onPanDrag")(js.Any.fromFunction1(onPanDrag))
    if (onPoiClick != null) __obj.updateDynamic("onPoiClick")(js.Any.fromFunction1(onPoiClick))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (onRegionChange != null) __obj.updateDynamic("onRegionChange")(js.Any.fromFunction1(onRegionChange))
    if (onRegionChangeComplete != null) __obj.updateDynamic("onRegionChangeComplete")(js.Any.fromFunction1(onRegionChangeComplete))
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(js.Any.fromFunction1(onResponderEnd))
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(js.Any.fromFunction1(onResponderGrant))
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(js.Any.fromFunction1(onResponderMove))
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(js.Any.fromFunction1(onResponderReject))
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(js.Any.fromFunction1(onResponderRelease))
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(js.Any.fromFunction1(onResponderStart))
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(js.Any.fromFunction1(onResponderTerminate))
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(js.Any.fromFunction1(onResponderTerminationRequest))
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(js.Any.fromFunction1(onStartShouldSetResponder))
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1(onStartShouldSetResponderCapture))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1(onTouchEndCapture))
    if (onUserLocationChange != null) __obj.updateDynamic("onUserLocationChange")(js.Any.fromFunction1(onUserLocationChange))
    if (!js.isUndefined(pitchEnabled)) __obj.updateDynamic("pitchEnabled")(pitchEnabled.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid.asInstanceOf[js.Any])
    if (!js.isUndefined(rotateEnabled)) __obj.updateDynamic("rotateEnabled")(rotateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS.asInstanceOf[js.Any])
    if (!js.isUndefined(showsBuildings)) __obj.updateDynamic("showsBuildings")(showsBuildings.asInstanceOf[js.Any])
    if (!js.isUndefined(showsCompass)) __obj.updateDynamic("showsCompass")(showsCompass.asInstanceOf[js.Any])
    if (!js.isUndefined(showsIndoorLevelPicker)) __obj.updateDynamic("showsIndoorLevelPicker")(showsIndoorLevelPicker.asInstanceOf[js.Any])
    if (!js.isUndefined(showsIndoors)) __obj.updateDynamic("showsIndoors")(showsIndoors.asInstanceOf[js.Any])
    if (!js.isUndefined(showsMyLocationButton)) __obj.updateDynamic("showsMyLocationButton")(showsMyLocationButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showsPointsOfInterest)) __obj.updateDynamic("showsPointsOfInterest")(showsPointsOfInterest.asInstanceOf[js.Any])
    if (!js.isUndefined(showsScale)) __obj.updateDynamic("showsScale")(showsScale.asInstanceOf[js.Any])
    if (!js.isUndefined(showsTraffic)) __obj.updateDynamic("showsTraffic")(showsTraffic.asInstanceOf[js.Any])
    if (!js.isUndefined(showsUserLocation)) __obj.updateDynamic("showsUserLocation")(showsUserLocation.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (!js.isUndefined(toolbarEnabled)) __obj.updateDynamic("toolbarEnabled")(toolbarEnabled.asInstanceOf[js.Any])
    if (tvParallaxMagnification != null) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceX != null) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceY != null) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.asInstanceOf[js.Any])
    if (tvParallaxTiltAngle != null) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.asInstanceOf[js.Any])
    if (userLocationAnnotationTitle != null) __obj.updateDynamic("userLocationAnnotationTitle")(userLocationAnnotationTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomControlEnabled)) __obj.updateDynamic("zoomControlEnabled")(zoomControlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomEnabled)) __obj.updateDynamic("zoomEnabled")(zoomEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomTapEnabled)) __obj.updateDynamic("zoomTapEnabled")(zoomTapEnabled.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MapViewProps
}

