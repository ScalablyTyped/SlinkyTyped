package typingsSlinky.reactMapGl.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.`*`.tag
import typingsSlinky.reactMapGl.AnonHeight
import typingsSlinky.reactMapGl.AnonMaxPitch
import typingsSlinky.reactMapGl.mod.ContextViewStateChangeInfo
import typingsSlinky.reactMapGl.mod.ExtraState
import typingsSlinky.reactMapGl.mod.InteractiveMapProps
import typingsSlinky.reactMapGl.mod.MapController
import typingsSlinky.reactMapGl.mod.MapError
import typingsSlinky.reactMapGl.mod.MapLoadEvent
import typingsSlinky.reactMapGl.mod.MapRequest
import typingsSlinky.reactMapGl.mod.PointerEvent
import typingsSlinky.reactMapGl.mod.TRANSITION_EVENTS
import typingsSlinky.reactMapGl.mod.TransitionInterpolator
import typingsSlinky.reactMapGl.mod.ViewState
import typingsSlinky.reactMapGl.mod.ViewportProps
import typingsSlinky.reactMapGl.reactMapGlStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_InteractiveMapProps581129139[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className */
  def apply(
    height: Double | String,
    width: Double | String,
    altitude: Int | Double = null,
    attributionControl: js.UndefOr[Boolean] = js.undefined,
    bearing: Int | Double = null,
    clickRadius: Int | Double = null,
    container: js.Object = null,
    controller: MapController = null,
    disableTokenWarning: js.UndefOr[Boolean] = js.undefined,
    doubleClickZoom: js.UndefOr[Boolean] = js.undefined,
    dragPan: js.UndefOr[Boolean] = js.undefined,
    dragRotate: js.UndefOr[Boolean] = js.undefined,
    getCursor: /* state */ ExtraState => Unit = null,
    gl: js.Object = null,
    interactiveLayerIds: js.Array[String] = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    mapOptions: js.Object = null,
    mapStyle: String | js.Object = null,
    mapboxApiAccessToken: String = null,
    maxPitch: Int | Double = null,
    maxZoom: Int | Double = null,
    minPitch: Int | Double = null,
    minZoom: Int | Double = null,
    onClick: /* event */ PointerEvent => Unit = null,
    onContextMenu: /* event */ PointerEvent => Unit = null,
    onDblClick: /* event */ PointerEvent => Unit = null,
    onError: /* e */ MapError => Unit = null,
    onHover: /* event */ PointerEvent => Unit = null,
    onInteractionStateChange: /* state */ ExtraState => Unit = null,
    onLoad: /* event */ MapLoadEvent => Unit = null,
    onMouseDown: /* event */ PointerEvent => Unit = null,
    onMouseEnter: /* event */ PointerEvent => Unit = null,
    onMouseLeave: /* event */ PointerEvent => Unit = null,
    onMouseMove: /* event */ PointerEvent => Unit = null,
    onMouseOut: /* event */ PointerEvent => Unit = null,
    onMouseUp: /* event */ PointerEvent => Unit = null,
    onNativeClick: /* event */ PointerEvent => Unit = null,
    onResize: /* dimensions */ AnonHeight => Unit = null,
    onTouchEnd: /* event */ PointerEvent => Unit = null,
    onTouchMove: /* event */ PointerEvent => Unit = null,
    onTouchStart: /* event */ PointerEvent => Unit = null,
    onTransitionEnd: () => Unit = null,
    onTransitionInterrupt: () => Unit = null,
    onTransitionStart: () => Unit = null,
    onViewStateChange: /* info */ ContextViewStateChangeInfo => Unit = null,
    onViewportChange: (/* viewState */ ViewportProps, /* interactionState */ ExtraState, /* oldViewState */ ViewportProps) => Unit = null,
    onWheel: /* event */ PointerEvent => Unit = null,
    pitch: Int | Double = null,
    preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined,
    preventStyleDiffing: js.UndefOr[Boolean] = js.undefined,
    reuseMap: js.UndefOr[Boolean] = js.undefined,
    reuseMaps: js.UndefOr[Boolean] = js.undefined,
    scrollZoom: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    touchAction: String = null,
    touchRotate: js.UndefOr[Boolean] = js.undefined,
    touchZoom: js.UndefOr[Boolean] = js.undefined,
    transformRequest: (/* url */ js.UndefOr[String], /* resourceType */ js.UndefOr[String]) => MapRequest = null,
    transitionDuration: Double | auto = null,
    transitionEasing: /* t */ Double => Double = null,
    transitionInterpolator: TransitionInterpolator = null,
    transitionInterruption: TRANSITION_EVENTS = null,
    viewState: ViewState = null,
    visibilityConstraints: AnonMaxPitch = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zoom: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (!js.isUndefined(attributionControl)) __obj.updateDynamic("attributionControl")(attributionControl.asInstanceOf[js.Any])
    if (bearing != null) __obj.updateDynamic("bearing")(bearing.asInstanceOf[js.Any])
    if (clickRadius != null) __obj.updateDynamic("clickRadius")(clickRadius.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTokenWarning)) __obj.updateDynamic("disableTokenWarning")(disableTokenWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleClickZoom)) __obj.updateDynamic("doubleClickZoom")(doubleClickZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(dragPan)) __obj.updateDynamic("dragPan")(dragPan.asInstanceOf[js.Any])
    if (!js.isUndefined(dragRotate)) __obj.updateDynamic("dragRotate")(dragRotate.asInstanceOf[js.Any])
    if (getCursor != null) __obj.updateDynamic("getCursor")(js.Any.fromFunction1(getCursor))
    if (gl != null) __obj.updateDynamic("gl")(gl.asInstanceOf[js.Any])
    if (interactiveLayerIds != null) __obj.updateDynamic("interactiveLayerIds")(interactiveLayerIds.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (mapOptions != null) __obj.updateDynamic("mapOptions")(mapOptions.asInstanceOf[js.Any])
    if (mapStyle != null) __obj.updateDynamic("mapStyle")(mapStyle.asInstanceOf[js.Any])
    if (mapboxApiAccessToken != null) __obj.updateDynamic("mapboxApiAccessToken")(mapboxApiAccessToken.asInstanceOf[js.Any])
    if (maxPitch != null) __obj.updateDynamic("maxPitch")(maxPitch.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minPitch != null) __obj.updateDynamic("minPitch")(minPitch.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onDblClick != null) __obj.updateDynamic("onDblClick")(js.Any.fromFunction1(onDblClick))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1(onHover))
    if (onInteractionStateChange != null) __obj.updateDynamic("onInteractionStateChange")(js.Any.fromFunction1(onInteractionStateChange))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onNativeClick != null) __obj.updateDynamic("onNativeClick")(js.Any.fromFunction1(onNativeClick))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction0(onTransitionEnd))
    if (onTransitionInterrupt != null) __obj.updateDynamic("onTransitionInterrupt")(js.Any.fromFunction0(onTransitionInterrupt))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction0(onTransitionStart))
    if (onViewStateChange != null) __obj.updateDynamic("onViewStateChange")(js.Any.fromFunction1(onViewStateChange))
    if (onViewportChange != null) __obj.updateDynamic("onViewportChange")(js.Any.fromFunction3(onViewportChange))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveDrawingBuffer)) __obj.updateDynamic("preserveDrawingBuffer")(preserveDrawingBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(preventStyleDiffing)) __obj.updateDynamic("preventStyleDiffing")(preventStyleDiffing.asInstanceOf[js.Any])
    if (!js.isUndefined(reuseMap)) __obj.updateDynamic("reuseMap")(reuseMap.asInstanceOf[js.Any])
    if (!js.isUndefined(reuseMaps)) __obj.updateDynamic("reuseMaps")(reuseMaps.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollZoom)) __obj.updateDynamic("scrollZoom")(scrollZoom.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (touchAction != null) __obj.updateDynamic("touchAction")(touchAction.asInstanceOf[js.Any])
    if (!js.isUndefined(touchRotate)) __obj.updateDynamic("touchRotate")(touchRotate.asInstanceOf[js.Any])
    if (!js.isUndefined(touchZoom)) __obj.updateDynamic("touchZoom")(touchZoom.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction2(transformRequest))
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (transitionEasing != null) __obj.updateDynamic("transitionEasing")(js.Any.fromFunction1(transitionEasing))
    if (transitionInterpolator != null) __obj.updateDynamic("transitionInterpolator")(transitionInterpolator.asInstanceOf[js.Any])
    if (transitionInterruption != null) __obj.updateDynamic("transitionInterruption")(transitionInterruption.asInstanceOf[js.Any])
    if (viewState != null) __obj.updateDynamic("viewState")(viewState.asInstanceOf[js.Any])
    if (visibilityConstraints != null) __obj.updateDynamic("visibilityConstraints")(visibilityConstraints.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = InteractiveMapProps
}

