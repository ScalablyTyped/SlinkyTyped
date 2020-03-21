package typingsSlinky.geojson2osm

import typingsSlinky.geojson.mod.Feature
import typingsSlinky.geojson.mod.FeatureCollection
import typingsSlinky.geojson.mod.GeoJsonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geojson2osm", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def geojson2osm(features: Feature[_, GeoJsonProperties]): js.Any = js.native
  def geojson2osm(features: FeatureCollection[_, GeoJsonProperties]): js.Any = js.native
}

