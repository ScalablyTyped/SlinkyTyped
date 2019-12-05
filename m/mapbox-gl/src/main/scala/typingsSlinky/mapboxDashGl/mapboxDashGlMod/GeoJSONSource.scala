package typingsSlinky.mapboxDashGl.mapboxDashGlMod

import typingsSlinky.geojson.geojsonMod.Feature
import typingsSlinky.geojson.geojsonMod.FeatureCollection
import typingsSlinky.geojson.geojsonMod.GeoJsonProperties
import typingsSlinky.geojson.geojsonMod.Geometry
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.`raster-dem`
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.canvas
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.geojson
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.image_
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.raster
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.vector
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "GeoJSONSource")
@js.native
class GeoJSONSource ()
  extends GeoJSONSourceRaw
     with AnySourceImpl {
  def this(options: GeoJSONSourceOptions) = this()
  /* CompleteClass */
  override var `type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas = js.native
  /* CompleteClass */
  @JSName("type")
  override var type_GeoJSONSourceRaw: geojson = js.native
  def getClusterChildren(
    clusterId: Double,
    callback: js.Function2[
      /* error */ js.Any, 
      /* features */ js.Array[Feature[Geometry, GeoJsonProperties]], 
      Unit
    ]
  ): this.type = js.native
  def getClusterExpansionZoom(clusterId: Double, callback: js.Function2[/* error */ js.Any, /* zoom */ Double, Unit]): this.type = js.native
  def getClusterLeaves(
    cluserId: Double,
    limit: Double,
    offset: Double,
    callback: js.Function2[
      /* error */ js.Any, 
      /* features */ js.Array[Feature[Geometry, GeoJsonProperties]], 
      Unit
    ]
  ): this.type = js.native
  def setData(data: String): this.type = js.native
  def setData(data: Feature[Geometry, GeoJsonProperties]): this.type = js.native
  def setData(data: FeatureCollection[Geometry, GeoJsonProperties]): this.type = js.native
}

