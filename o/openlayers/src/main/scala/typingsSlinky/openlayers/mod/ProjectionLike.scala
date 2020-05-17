package typingsSlinky.openlayers.mod

import typingsSlinky.openlayers.mod.proj.Projection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openlayers.mod.proj.Projection
  - java.lang.String
  - js.UndefOr[scala.Nothing]
*/
trait ProjectionLike extends js.Object

object ProjectionLike {
  @scala.inline
  implicit def apply(value: Projection): ProjectionLike = value.asInstanceOf[ProjectionLike]
  @scala.inline
  implicit def apply(value: String): ProjectionLike = value.asInstanceOf[ProjectionLike]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => ProjectionLike): ProjectionLike = value.asInstanceOf[ProjectionLike]
}

