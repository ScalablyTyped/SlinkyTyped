package typingsSlinky.geojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.geojson.mod.Geometry
  - typingsSlinky.geojson.mod.Feature[typingsSlinky.geojson.mod.Geometry, typingsSlinky.geojson.mod.GeoJsonProperties]
  - typingsSlinky.geojson.mod.FeatureCollection[typingsSlinky.geojson.mod.Geometry, typingsSlinky.geojson.mod.GeoJsonProperties]
*/
trait GeoJSON extends js.Object

object GeoJSON {
  @scala.inline
  implicit def apply(value: Feature[Geometry, GeoJsonProperties]): GeoJSON = value.asInstanceOf[GeoJSON]
  @scala.inline
  implicit def apply(value: FeatureCollection[Geometry, GeoJsonProperties]): GeoJSON = value.asInstanceOf[GeoJSON]
  @scala.inline
  implicit def apply(value: Geometry): GeoJSON = value.asInstanceOf[GeoJSON]
}

