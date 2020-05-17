package typingsSlinky.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisRestApi.mod.SpatialReferenceWkt
  - typingsSlinky.arcgisRestApi.mod.SpatialReferenceWkid
*/
trait SpatialReference extends js.Object

object SpatialReference {
  @scala.inline
  implicit def apply(value: SpatialReferenceWkid): SpatialReference = value.asInstanceOf[SpatialReference]
  @scala.inline
  implicit def apply(value: SpatialReferenceWkt): SpatialReference = value.asInstanceOf[SpatialReference]
}

