package typingsSlinky.reactMapGl.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactMapGl.AnonHeight
import typingsSlinky.reactMapGl.AnonMaxPitch
import typingsSlinky.reactMapGl.mod.MapError
import typingsSlinky.reactMapGl.mod.MapLoadEvent
import typingsSlinky.reactMapGl.mod.MapRequest
import typingsSlinky.reactMapGl.mod.StaticMapProps
import typingsSlinky.reactMapGl.mod.ViewState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StaticMap
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactMapGl.mod.StaticMap] {
  @JSImport("react-map-gl", "StaticMap")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    height: Double | String,
    width: Double | String,
    altitude: Int | Double = null,
    attributionControl: js.UndefOr[Boolean] = js.undefined,
    bearing: Int | Double = null,
    container: js.Object = null,
    disableTokenWarning: js.UndefOr[Boolean] = js.undefined,
    gl: js.Object = null,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    mapOptions: js.Object = null,
    mapStyle: String | js.Object = null,
    mapboxApiAccessToken: String = null,
    onError: /* e */ MapError => Unit = null,
    onLoad: /* event */ MapLoadEvent => Unit = null,
    onResize: /* dimensions */ AnonHeight => Unit = null,
    pitch: Int | Double = null,
    preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined,
    preventStyleDiffing: js.UndefOr[Boolean] = js.undefined,
    reuseMap: js.UndefOr[Boolean] = js.undefined,
    reuseMaps: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    transformRequest: (/* url */ js.UndefOr[String], /* resourceType */ js.UndefOr[String]) => MapRequest = null,
    viewState: ViewState = null,
    visibilityConstraints: AnonMaxPitch = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zoom: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactMapGl.mod.StaticMap] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (!js.isUndefined(attributionControl)) __obj.updateDynamic("attributionControl")(attributionControl.asInstanceOf[js.Any])
    if (bearing != null) __obj.updateDynamic("bearing")(bearing.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTokenWarning)) __obj.updateDynamic("disableTokenWarning")(disableTokenWarning.asInstanceOf[js.Any])
    if (gl != null) __obj.updateDynamic("gl")(gl.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (mapOptions != null) __obj.updateDynamic("mapOptions")(mapOptions.asInstanceOf[js.Any])
    if (mapStyle != null) __obj.updateDynamic("mapStyle")(mapStyle.asInstanceOf[js.Any])
    if (mapboxApiAccessToken != null) __obj.updateDynamic("mapboxApiAccessToken")(mapboxApiAccessToken.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveDrawingBuffer)) __obj.updateDynamic("preserveDrawingBuffer")(preserveDrawingBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(preventStyleDiffing)) __obj.updateDynamic("preventStyleDiffing")(preventStyleDiffing.asInstanceOf[js.Any])
    if (!js.isUndefined(reuseMap)) __obj.updateDynamic("reuseMap")(reuseMap.asInstanceOf[js.Any])
    if (!js.isUndefined(reuseMaps)) __obj.updateDynamic("reuseMaps")(reuseMaps.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction2(transformRequest))
    if (viewState != null) __obj.updateDynamic("viewState")(viewState.asInstanceOf[js.Any])
    if (visibilityConstraints != null) __obj.updateDynamic("visibilityConstraints")(visibilityConstraints.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StaticMapProps
}

