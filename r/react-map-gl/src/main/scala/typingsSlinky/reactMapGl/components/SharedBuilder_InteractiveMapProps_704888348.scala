package typingsSlinky.reactMapGl.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMapGl.anon.Height
import typingsSlinky.reactMapGl.anon.MaxPitch
import typingsSlinky.reactMapGl.mod.ContextViewStateChangeInfo
import typingsSlinky.reactMapGl.mod.ExtraState
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_InteractiveMapProps_704888348[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def altitude(value: Double): this.type = set("altitude", value.asInstanceOf[js.Any])
  
  @scala.inline
  def attributionControl(value: Boolean): this.type = set("attributionControl", value.asInstanceOf[js.Any])
  
  @scala.inline
  def bearing(value: Double): this.type = set("bearing", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def clickRadius(value: Double): this.type = set("clickRadius", value.asInstanceOf[js.Any])
  
  @scala.inline
  def container(value: js.Object): this.type = set("container", value.asInstanceOf[js.Any])
  
  @scala.inline
  def controller(value: MapController): this.type = set("controller", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disableTokenWarning(value: Boolean): this.type = set("disableTokenWarning", value.asInstanceOf[js.Any])
  
  @scala.inline
  def doubleClickZoom(value: Boolean): this.type = set("doubleClickZoom", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dragPan(value: Boolean): this.type = set("dragPan", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dragRotate(value: Boolean): this.type = set("dragRotate", value.asInstanceOf[js.Any])
  
  @scala.inline
  def getCursor(value: /* state */ ExtraState => Unit): this.type = set("getCursor", js.Any.fromFunction1(value))
  
  @scala.inline
  def gl(value: js.Object): this.type = set("gl", value.asInstanceOf[js.Any])
  
  @scala.inline
  def interactiveLayerIds(value: js.Array[String]): this.type = set("interactiveLayerIds", value.asInstanceOf[js.Any])
  
  @scala.inline
  def interactiveLayerIdsVarargs(value: String*): this.type = set("interactiveLayerIds", js.Array(value :_*))
  
  @scala.inline
  def keyboard(value: Boolean): this.type = set("keyboard", value.asInstanceOf[js.Any])
  
  @scala.inline
  def latitude(value: Double): this.type = set("latitude", value.asInstanceOf[js.Any])
  
  @scala.inline
  def longitude(value: Double): this.type = set("longitude", value.asInstanceOf[js.Any])
  
  @scala.inline
  def mapOptions(value: js.Object): this.type = set("mapOptions", value.asInstanceOf[js.Any])
  
  @scala.inline
  def mapStyle(value: String | js.Object): this.type = set("mapStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def mapboxApiAccessToken(value: String): this.type = set("mapboxApiAccessToken", value.asInstanceOf[js.Any])
  
  @scala.inline
  def mapboxApiUrl(value: String): this.type = set("mapboxApiUrl", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maxPitch(value: Double): this.type = set("maxPitch", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maxZoom(value: Double): this.type = set("maxZoom", value.asInstanceOf[js.Any])
  
  @scala.inline
  def minPitch(value: Double): this.type = set("minPitch", value.asInstanceOf[js.Any])
  
  @scala.inline
  def minZoom(value: Double): this.type = set("minZoom", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onClick(value: /* event */ PointerEvent => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def onContextMenu(value: /* event */ PointerEvent => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDblClick(value: /* event */ PointerEvent => Unit): this.type = set("onDblClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def onError(value: /* e */ MapError => Unit): this.type = set("onError", js.Any.fromFunction1(value))
  
  @scala.inline
  def onHover(value: /* event */ PointerEvent => Unit): this.type = set("onHover", js.Any.fromFunction1(value))
  
  @scala.inline
  def onInteractionStateChange(value: /* state */ ExtraState => Unit): this.type = set("onInteractionStateChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onLoad(value: /* event */ MapLoadEvent => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseDown(value: /* event */ PointerEvent => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseEnter(value: /* event */ PointerEvent => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseLeave(value: /* event */ PointerEvent => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseMove(value: /* event */ PointerEvent => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseOut(value: /* event */ PointerEvent => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseUp(value: /* event */ PointerEvent => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
  
  @scala.inline
  def onNativeClick(value: /* event */ PointerEvent => Unit): this.type = set("onNativeClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def onResize(value: /* dimensions */ Height => Unit): this.type = set("onResize", js.Any.fromFunction1(value))
  
  @scala.inline
  def onTouchEnd(value: /* event */ PointerEvent => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
  
  @scala.inline
  def onTouchMove(value: /* event */ PointerEvent => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
  
  @scala.inline
  def onTouchStart(value: /* event */ PointerEvent => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
  
  @scala.inline
  def onTransitionEnd(value: () => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction0(value))
  
  @scala.inline
  def onTransitionInterrupt(value: () => Unit): this.type = set("onTransitionInterrupt", js.Any.fromFunction0(value))
  
  @scala.inline
  def onTransitionStart(value: () => Unit): this.type = set("onTransitionStart", js.Any.fromFunction0(value))
  
  @scala.inline
  def onViewStateChange(value: /* info */ ContextViewStateChangeInfo => Unit): this.type = set("onViewStateChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onViewportChange(
    value: (/* viewState */ ViewportProps, /* interactionState */ ExtraState, /* oldViewState */ ViewportProps) => Unit
  ): this.type = set("onViewportChange", js.Any.fromFunction3(value))
  
  @scala.inline
  def onWheel(value: /* event */ PointerEvent => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
  
  @scala.inline
  def pitch(value: Double): this.type = set("pitch", value.asInstanceOf[js.Any])
  
  @scala.inline
  def preserveDrawingBuffer(value: Boolean): this.type = set("preserveDrawingBuffer", value.asInstanceOf[js.Any])
  
  @scala.inline
  def preventStyleDiffing(value: Boolean): this.type = set("preventStyleDiffing", value.asInstanceOf[js.Any])
  
  @scala.inline
  def reuseMap(value: Boolean): this.type = set("reuseMap", value.asInstanceOf[js.Any])
  
  @scala.inline
  def reuseMaps(value: Boolean): this.type = set("reuseMaps", value.asInstanceOf[js.Any])
  
  @scala.inline
  def scrollZoom(value: Boolean): this.type = set("scrollZoom", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def touchAction(value: String): this.type = set("touchAction", value.asInstanceOf[js.Any])
  
  @scala.inline
  def touchRotate(value: Boolean): this.type = set("touchRotate", value.asInstanceOf[js.Any])
  
  @scala.inline
  def touchZoom(value: Boolean): this.type = set("touchZoom", value.asInstanceOf[js.Any])
  
  @scala.inline
  def transformRequest(value: (/* url */ js.UndefOr[String], /* resourceType */ js.UndefOr[String]) => MapRequest): this.type = set("transformRequest", js.Any.fromFunction2(value))
  
  @scala.inline
  def transitionDuration(value: Double | auto): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
  
  @scala.inline
  def transitionEasing(value: /* t */ Double => Double): this.type = set("transitionEasing", js.Any.fromFunction1(value))
  
  @scala.inline
  def transitionInterpolator(value: TransitionInterpolator): this.type = set("transitionInterpolator", value.asInstanceOf[js.Any])
  
  @scala.inline
  def transitionInterruption(value: TRANSITION_EVENTS): this.type = set("transitionInterruption", value.asInstanceOf[js.Any])
  
  @scala.inline
  def viewState(value: ViewState): this.type = set("viewState", value.asInstanceOf[js.Any])
  
  @scala.inline
  def visibilityConstraints(value: MaxPitch): this.type = set("visibilityConstraints", value.asInstanceOf[js.Any])
  
  @scala.inline
  def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  
  @scala.inline
  def zoom(value: Double): this.type = set("zoom", value.asInstanceOf[js.Any])
}
