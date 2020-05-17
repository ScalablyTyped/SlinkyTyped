package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisJsApi.esri.Extent
  - typingsSlinky.arcgisJsApi.esri.Multipoint
  - typingsSlinky.arcgisJsApi.esri.Point
  - typingsSlinky.arcgisJsApi.esri.Polygon
  - typingsSlinky.arcgisJsApi.esri.Polyline
  - typingsSlinky.arcgisJsApi.esri.Mesh
*/
trait geometryGeometry extends js.Object

object geometryGeometry {
  @scala.inline
  implicit def apply(value: Extent): geometryGeometry = value.asInstanceOf[geometryGeometry]
  @scala.inline
  implicit def apply(value: Mesh): geometryGeometry = value.asInstanceOf[geometryGeometry]
  @scala.inline
  implicit def apply(value: Multipoint): geometryGeometry = value.asInstanceOf[geometryGeometry]
  @scala.inline
  implicit def apply(value: Point): geometryGeometry = value.asInstanceOf[geometryGeometry]
  @scala.inline
  implicit def apply(value: Polygon): geometryGeometry = value.asInstanceOf[geometryGeometry]
  @scala.inline
  implicit def apply(value: Polyline): geometryGeometry = value.asInstanceOf[geometryGeometry]
}

