package typingsSlinky.mapboxGl.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.geojson.mod.Feature
import typingsSlinky.geojson.mod.FeatureCollection
import typingsSlinky.geojson.mod.GeoJsonProperties
import typingsSlinky.geojson.mod.Geometry
import typingsSlinky.mapboxGl.mapboxGlStrings.`raster-dem`
import typingsSlinky.mapboxGl.mapboxGlStrings.canvas
import typingsSlinky.mapboxGl.mapboxGlStrings.geojson
import typingsSlinky.mapboxGl.mapboxGlStrings.image_
import typingsSlinky.mapboxGl.mapboxGlStrings.mapbox
import typingsSlinky.mapboxGl.mapboxGlStrings.raster
import typingsSlinky.mapboxGl.mapboxGlStrings.terrarium
import typingsSlinky.mapboxGl.mapboxGlStrings.tms
import typingsSlinky.mapboxGl.mapboxGlStrings.vector
import typingsSlinky.mapboxGl.mapboxGlStrings.video
import typingsSlinky.mapboxGl.mapboxGlStrings.xyz
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mapboxGl.mod.GeoJSONSourceRaw
  - typingsSlinky.mapboxGl.mod.VideoSourceRaw
  - typingsSlinky.mapboxGl.mod.ImageSourceRaw
  - typingsSlinky.mapboxGl.mod.CanvasSourceRaw
  - typingsSlinky.mapboxGl.mod.VectorSource
  - typingsSlinky.mapboxGl.mod.RasterSource
  - typingsSlinky.mapboxGl.mod.RasterDemSource
*/
trait AnySourceData extends js.Object

object AnySourceData {
  @scala.inline
  def RasterDemSource(
    `type`: `raster-dem`,
    attribution: String = null,
    bounds: js.Array[Double] = null,
    encoding: terrarium | mapbox = null,
    maxzoom: Int | Double = null,
    minzoom: Int | Double = null,
    tileSize: Int | Double = null,
    tiles: js.Array[String] = null,
    url: String = null
  ): AnySourceData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (maxzoom != null) __obj.updateDynamic("maxzoom")(maxzoom.asInstanceOf[js.Any])
    if (minzoom != null) __obj.updateDynamic("minzoom")(minzoom.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tiles != null) __obj.updateDynamic("tiles")(tiles.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
  @scala.inline
  def VectorSource(
    `type`: vector,
    attribution: String = null,
    bounds: js.Array[Double] = null,
    maxzoom: Int | Double = null,
    minzoom: Int | Double = null,
    promoteId: PromoteIdSpecification = null,
    scheme: xyz | tms = null,
    tiles: js.Array[String] = null,
    url: String = null
  ): AnySourceData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (maxzoom != null) __obj.updateDynamic("maxzoom")(maxzoom.asInstanceOf[js.Any])
    if (minzoom != null) __obj.updateDynamic("minzoom")(minzoom.asInstanceOf[js.Any])
    if (promoteId != null) __obj.updateDynamic("promoteId")(promoteId.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (tiles != null) __obj.updateDynamic("tiles")(tiles.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
  @scala.inline
  def RasterSource(
    `type`: raster,
    attribution: String = null,
    bounds: js.Array[Double] = null,
    maxzoom: Int | Double = null,
    minzoom: Int | Double = null,
    scheme: xyz | tms = null,
    tileSize: Int | Double = null,
    tiles: js.Array[String] = null,
    url: String = null
  ): AnySourceData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (maxzoom != null) __obj.updateDynamic("maxzoom")(maxzoom.asInstanceOf[js.Any])
    if (minzoom != null) __obj.updateDynamic("minzoom")(minzoom.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tiles != null) __obj.updateDynamic("tiles")(tiles.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
  @scala.inline
  def GeoJSONSourceRaw(
    `type`: geojson,
    attribution: String = null,
    buffer: Int | Double = null,
    cluster: Double | Boolean = null,
    clusterMaxZoom: Int | Double = null,
    clusterRadius: Int | Double = null,
    data: (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties]) | String = null,
    generateId: js.UndefOr[Boolean] = js.undefined,
    lineMetrics: js.UndefOr[Boolean] = js.undefined,
    maxzoom: Int | Double = null,
    promoteId: PromoteIdSpecification = null,
    tolerance: Int | Double = null
  ): AnySourceData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    if (clusterMaxZoom != null) __obj.updateDynamic("clusterMaxZoom")(clusterMaxZoom.asInstanceOf[js.Any])
    if (clusterRadius != null) __obj.updateDynamic("clusterRadius")(clusterRadius.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(generateId)) __obj.updateDynamic("generateId")(generateId.asInstanceOf[js.Any])
    if (!js.isUndefined(lineMetrics)) __obj.updateDynamic("lineMetrics")(lineMetrics.asInstanceOf[js.Any])
    if (maxzoom != null) __obj.updateDynamic("maxzoom")(maxzoom.asInstanceOf[js.Any])
    if (promoteId != null) __obj.updateDynamic("promoteId")(promoteId.asInstanceOf[js.Any])
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
  @scala.inline
  def VideoSourceRaw(`type`: video, coordinates: js.Array[js.Array[Double]] = null, urls: js.Array[String] = null): AnySourceData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
  @scala.inline
  def CanvasSourceRaw(
    canvas: String | HTMLCanvasElement,
    coordinates: js.Array[js.Array[Double]],
    `type`: canvas,
    animate: js.UndefOr[Boolean] = js.undefined
  ): AnySourceData = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
  @scala.inline
  def ImageSourceRaw(`type`: image_, coordinates: js.Array[js.Array[Double]] = null, url: String = null): AnySourceData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
}

