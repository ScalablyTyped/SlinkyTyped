package typingsSlinky.d3.mod

import typingsSlinky.d3Geo.mod.ExtendedFeature
import typingsSlinky.d3Geo.mod.ExtendedFeatureCollection
import typingsSlinky.d3Geo.mod.ExtendedGeometryCollection
import typingsSlinky.d3Geo.mod.GeoGeometryObjects
import typingsSlinky.geojson.mod.GeoJsonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "geoArea")
@js.native
object geoArea extends js.Object {
  def apply(`object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]): Double = js.native
  def apply(`object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]]): Double = js.native
  def apply(`object`: ExtendedGeometryCollection[GeoGeometryObjects]): Double = js.native
  def apply(`object`: GeoGeometryObjects): Double = js.native
}

