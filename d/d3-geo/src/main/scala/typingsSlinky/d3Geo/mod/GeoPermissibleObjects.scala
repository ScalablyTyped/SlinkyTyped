package typingsSlinky.d3Geo.mod

import typingsSlinky.geojson.mod.GeoJsonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.d3Geo.mod.GeoGeometryObjects
  - typingsSlinky.d3Geo.mod.ExtendedGeometryCollection[typingsSlinky.d3Geo.mod.GeoGeometryObjects]
  - typingsSlinky.d3Geo.mod.ExtendedFeature[
typingsSlinky.d3Geo.mod.GeoGeometryObjects | scala.Null, 
typingsSlinky.geojson.mod.GeoJsonProperties]
  - typingsSlinky.d3Geo.mod.ExtendedFeatureCollection[
typingsSlinky.d3Geo.mod.ExtendedFeature[
  typingsSlinky.d3Geo.mod.GeoGeometryObjects | scala.Null, 
  typingsSlinky.geojson.mod.GeoJsonProperties
]]
*/
trait GeoPermissibleObjects extends js.Object

object GeoPermissibleObjects {
  @scala.inline
  implicit def apply(value: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]): GeoPermissibleObjects = value.asInstanceOf[GeoPermissibleObjects]
  @scala.inline
  implicit def apply(value: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]]): GeoPermissibleObjects = value.asInstanceOf[GeoPermissibleObjects]
  @scala.inline
  implicit def apply(value: ExtendedGeometryCollection[GeoGeometryObjects]): GeoPermissibleObjects = value.asInstanceOf[GeoPermissibleObjects]
  @scala.inline
  implicit def apply(value: GeoGeometryObjects): GeoPermissibleObjects = value.asInstanceOf[GeoPermissibleObjects]
}

