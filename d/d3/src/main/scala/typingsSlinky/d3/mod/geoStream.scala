package typingsSlinky.d3.mod

import typingsSlinky.d3Geo.mod.ExtendedFeature
import typingsSlinky.d3Geo.mod.ExtendedFeatureCollection
import typingsSlinky.d3Geo.mod.ExtendedGeometryCollection
import typingsSlinky.d3Geo.mod.GeoGeometryObjects
import typingsSlinky.d3Geo.mod.GeoStream_
import typingsSlinky.geojson.mod.GeoJsonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "geoStream")
@js.native
object geoStream extends js.Object {
  def apply(
    `object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]],
    stream: GeoStream_
  ): Unit = js.native
  def apply(`object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties], stream: GeoStream_): Unit = js.native
  def apply(`object`: ExtendedGeometryCollection[GeoGeometryObjects], stream: GeoStream_): Unit = js.native
  def apply(`object`: GeoGeometryObjects, stream: GeoStream_): Unit = js.native
}

