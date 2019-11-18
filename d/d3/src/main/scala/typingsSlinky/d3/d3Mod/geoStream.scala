package typingsSlinky.d3.d3Mod

import typingsSlinky.d3DashGeo.d3DashGeoMod.ExtendedFeature
import typingsSlinky.d3DashGeo.d3DashGeoMod.ExtendedFeatureCollection
import typingsSlinky.d3DashGeo.d3DashGeoMod.ExtendedGeometryCollection
import typingsSlinky.d3DashGeo.d3DashGeoMod.GeoGeometryObjects
import typingsSlinky.d3DashGeo.d3DashGeoMod.GeoStream
import typingsSlinky.geojson.geojsonMod.GeoJsonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "geoStream")
@js.native
object geoStream extends js.Object {
  def apply(
    `object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]],
    stream: GeoStream
  ): Unit = js.native
  def apply(`object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties], stream: GeoStream): Unit = js.native
  def apply(`object`: ExtendedGeometryCollection[GeoGeometryObjects], stream: GeoStream): Unit = js.native
  def apply(`object`: GeoGeometryObjects, stream: GeoStream): Unit = js.native
}

