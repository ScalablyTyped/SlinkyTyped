package typingsSlinky.mapboxGl.mod

import typingsSlinky.geojson.mod.Feature
import typingsSlinky.geojson.mod.FeatureCollection
import typingsSlinky.geojson.mod.GeoJsonProperties
import typingsSlinky.geojson.mod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "GeoJSONSource")
@js.native
class GeoJSONSource ()
  extends GeoJSONSourceRaw
     with AnySourceImpl {
  def this(options: GeoJSONSourceOptions) = this()
  
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
