package typingsSlinky.amapJsApi.AMap.GeoJSON

import typingsSlinky.amapJsApi.anon.Coordinates
import typingsSlinky.amapJsApi.anon.CoordinatesArray
import typingsSlinky.amapJsApi.anon.CoordinatesType
import typingsSlinky.amapJsApi.anon.Geometries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.amapJsApi.anon.Coordinates
  - typingsSlinky.amapJsApi.anon.CoordinatesType
  - typingsSlinky.amapJsApi.anon.CoordinatesArray
  - typingsSlinky.amapJsApi.anon.Geometries
*/
trait Geometry extends js.Object

object Geometry {
  @scala.inline
  implicit def apply(value: Coordinates): Geometry = value.asInstanceOf[Geometry]
  @scala.inline
  implicit def apply(value: CoordinatesArray): Geometry = value.asInstanceOf[Geometry]
  @scala.inline
  implicit def apply(value: CoordinatesType): Geometry = value.asInstanceOf[Geometry]
  @scala.inline
  implicit def apply(value: Geometries): Geometry = value.asInstanceOf[Geometry]
}

