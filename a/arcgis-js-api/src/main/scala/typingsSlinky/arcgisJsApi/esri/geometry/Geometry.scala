package typingsSlinky.arcgisJsApi.esri.geometry

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
trait Geometry extends js.Object

object Geometry {
  @scala.inline
  implicit def apply(value: typingsSlinky.arcgisJsApi.esri.Extent): Geometry = value.asInstanceOf[Geometry]
  @scala.inline
  implicit def apply(value: typingsSlinky.arcgisJsApi.esri.Mesh): Geometry = value.asInstanceOf[Geometry]
  @scala.inline
  implicit def apply(value: typingsSlinky.arcgisJsApi.esri.Multipoint): Geometry = value.asInstanceOf[Geometry]
  @scala.inline
  implicit def apply(value: typingsSlinky.arcgisJsApi.esri.Point): Geometry = value.asInstanceOf[Geometry]
  @scala.inline
  implicit def apply(value: typingsSlinky.arcgisJsApi.esri.Polygon): Geometry = value.asInstanceOf[Geometry]
  @scala.inline
  implicit def apply(value: typingsSlinky.arcgisJsApi.esri.Polyline): Geometry = value.asInstanceOf[Geometry]
}

