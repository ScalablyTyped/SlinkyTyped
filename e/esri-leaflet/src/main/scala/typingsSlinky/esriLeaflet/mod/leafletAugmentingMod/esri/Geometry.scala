package typingsSlinky.esriLeaflet.mod.leafletAugmentingMod.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.esriLeaflet.mod.leafletAugmentingMod.esri.LeafletGeometry
  - typingsSlinky.esriLeaflet.mod.leafletAugmentingMod.esri.GeoJSONGeometry
*/
trait Geometry extends js.Object

object Geometry {
  @scala.inline
  implicit def apply(value: GeoJSONGeometry): Geometry = value.asInstanceOf[Geometry]
  @scala.inline
  implicit def apply(value: LeafletGeometry): Geometry = value.asInstanceOf[Geometry]
}

