package typingsSlinky.d3.d3Mod

import typingsSlinky.d3DashGeo.d3DashGeoMod.ExtendedFeature
import typingsSlinky.d3DashGeo.d3DashGeoMod.ExtendedFeatureCollection
import typingsSlinky.d3DashGeo.d3DashGeoMod.ExtendedGeometryCollection
import typingsSlinky.d3DashGeo.d3DashGeoMod.GeoGeometryObjects
import typingsSlinky.geojson.geojsonMod.GeoJsonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "geoBounds")
@js.native
object geoBounds extends js.Object {
  def apply(`object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
  def apply(`object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]]): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
  def apply(`object`: ExtendedGeometryCollection[GeoGeometryObjects]): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
  def apply(`object`: GeoGeometryObjects): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
}

