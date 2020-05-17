package typingsSlinky.d3Geo.mod

import typingsSlinky.geojson.mod.GeometryObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.geojson.mod.GeometryObject
  - typingsSlinky.d3Geo.mod.GeoSphere
*/
trait GeoGeometryObjects extends GeoPermissibleObjects

object GeoGeometryObjects {
  @scala.inline
  implicit def apply(value: GeoSphere): GeoGeometryObjects = value.asInstanceOf[GeoGeometryObjects]
  @scala.inline
  implicit def apply(value: GeometryObject): GeoGeometryObjects = value.asInstanceOf[GeoGeometryObjects]
}

