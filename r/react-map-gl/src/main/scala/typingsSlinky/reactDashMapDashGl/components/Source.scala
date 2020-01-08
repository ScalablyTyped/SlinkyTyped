package typingsSlinky.reactDashMapDashGl.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.geojson.geojsonMod.Feature
import typingsSlinky.geojson.geojsonMod.FeatureCollection
import typingsSlinky.geojson.geojsonMod.GeoJsonProperties
import typingsSlinky.geojson.geojsonMod.Geometry
import typingsSlinky.reactDashMapDashGl.reactDashMapDashGlMod.SourceProps
import typingsSlinky.reactDashMapDashGl.reactDashMapDashGlStrings.mapbox
import typingsSlinky.reactDashMapDashGl.reactDashMapDashGlStrings.terrarium
import typingsSlinky.reactDashMapDashGl.reactDashMapDashGlStrings.tms
import typingsSlinky.reactDashMapDashGl.reactDashMapDashGlStrings.xyz
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Source
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashMapDashGl.reactDashMapDashGlMod.Source] {
  @JSImport("react-map-gl", "Source")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: id */
  def apply(
    `type`: String,
    attribution: String = null,
    bounds: js.Array[Double] = null,
    buffer: Int | Double = null,
    cluster: js.UndefOr[Boolean] = js.undefined,
    clusterMaxZoom: Int | Double = null,
    clusterProperties: js.Object = null,
    clusterRadius: Int | Double = null,
    coordinates: js.Array[js.Array[Double]] = null,
    data: (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties]) | String = null,
    encoding: terrarium | mapbox = null,
    generateId: js.UndefOr[Boolean] = js.undefined,
    lineMetrics: js.UndefOr[Boolean] = js.undefined,
    maxzoon: Int | Double = null,
    minzoom: Int | Double = null,
    schema: xyz | tms = null,
    tileSize: Int | Double = null,
    tiles: js.Array[String] = null,
    tolerance: Int | Double = null,
    url: String = null,
    urls: js.Array[String] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashMapDashGl.reactDashMapDashGlMod.Source] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (!js.isUndefined(cluster)) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    if (clusterMaxZoom != null) __obj.updateDynamic("clusterMaxZoom")(clusterMaxZoom.asInstanceOf[js.Any])
    if (clusterProperties != null) __obj.updateDynamic("clusterProperties")(clusterProperties.asInstanceOf[js.Any])
    if (clusterRadius != null) __obj.updateDynamic("clusterRadius")(clusterRadius.asInstanceOf[js.Any])
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(generateId)) __obj.updateDynamic("generateId")(generateId.asInstanceOf[js.Any])
    if (!js.isUndefined(lineMetrics)) __obj.updateDynamic("lineMetrics")(lineMetrics.asInstanceOf[js.Any])
    if (maxzoon != null) __obj.updateDynamic("maxzoon")(maxzoon.asInstanceOf[js.Any])
    if (minzoom != null) __obj.updateDynamic("minzoom")(minzoom.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tiles != null) __obj.updateDynamic("tiles")(tiles.asInstanceOf[js.Any])
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashMapDashGl.reactDashMapDashGlMod.Source] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashMapDashGl.reactDashMapDashGlMod.Source](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SourceProps
}

