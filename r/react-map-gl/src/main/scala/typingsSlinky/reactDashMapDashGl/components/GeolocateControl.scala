package typingsSlinky.reactDashMapDashGl.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.mapboxDashGl.mapboxDashGlMod.FitBoundsOptions
import typingsSlinky.mapboxDashGl.mapboxDashGlMod.PositionOptions
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashMapDashGl.reactDashMapDashGlMod.GeolocateControlProps
import typingsSlinky.reactDashMapDashGl.reactDashMapDashGlMod.ViewStateChangeInfo
import typingsSlinky.reactDashMapDashGl.reactDashMapDashGlMod.ViewportProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GeolocateControl
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashMapDashGl.reactDashMapDashGlMod.GeolocateControl] {
  @JSImport("react-map-gl", "GeolocateControl")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    captureClick: js.UndefOr[Boolean] = js.undefined,
    captureDoubleClick: js.UndefOr[Boolean] = js.undefined,
    captureDrag: js.UndefOr[Boolean] = js.undefined,
    captureScroll: js.UndefOr[Boolean] = js.undefined,
    fitBoundsOptions: FitBoundsOptions = null,
    onViewStateChange: /* info */ ViewStateChangeInfo => Unit = null,
    onViewportChange: /* viewState */ ViewportProps => Unit = null,
    positionOptions: PositionOptions = null,
    showUserLocation: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    trackUserLocation: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashMapDashGl.reactDashMapDashGlMod.GeolocateControl] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(captureClick)) __obj.updateDynamic("captureClick")(captureClick.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDoubleClick)) __obj.updateDynamic("captureDoubleClick")(captureDoubleClick.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDrag)) __obj.updateDynamic("captureDrag")(captureDrag.asInstanceOf[js.Any])
    if (!js.isUndefined(captureScroll)) __obj.updateDynamic("captureScroll")(captureScroll.asInstanceOf[js.Any])
    if (fitBoundsOptions != null) __obj.updateDynamic("fitBoundsOptions")(fitBoundsOptions.asInstanceOf[js.Any])
    if (onViewStateChange != null) __obj.updateDynamic("onViewStateChange")(js.Any.fromFunction1(onViewStateChange))
    if (onViewportChange != null) __obj.updateDynamic("onViewportChange")(js.Any.fromFunction1(onViewportChange))
    if (positionOptions != null) __obj.updateDynamic("positionOptions")(positionOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(showUserLocation)) __obj.updateDynamic("showUserLocation")(showUserLocation.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(trackUserLocation)) __obj.updateDynamic("trackUserLocation")(trackUserLocation.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashMapDashGl.reactDashMapDashGlMod.GeolocateControl] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashMapDashGl.reactDashMapDashGlMod.GeolocateControl](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = GeolocateControlProps
}

