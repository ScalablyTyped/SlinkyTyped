package typingsSlinky.d3.mod

import typingsSlinky.d3Geo.mod.ExtendedFeature
import typingsSlinky.d3Geo.mod.ExtendedFeatureCollection
import typingsSlinky.d3Geo.mod.ExtendedGeometryCollection
import typingsSlinky.d3Geo.mod.GeoGeometryObjects
import typingsSlinky.geojson.mod.GeoJsonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "geoBounds")
@js.native
object geoBounds extends js.Object {
  
  def apply(`object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
  def apply(`object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]]): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
  def apply(`object`: ExtendedGeometryCollection[GeoGeometryObjects]): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
  def apply(`object`: GeoGeometryObjects): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
}
