package typingsSlinky.openlayers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[typingsSlinky.openlayers.mod.Attribution | java.lang.String]
  - typingsSlinky.openlayers.mod.Attribution
*/
trait AttributionLike extends js.Object

object AttributionLike {
  @scala.inline
  implicit def apply(value: js.Array[Attribution | String]): AttributionLike = value.asInstanceOf[AttributionLike]
  @scala.inline
  implicit def apply(value: Attribution): AttributionLike = value.asInstanceOf[AttributionLike]
  @scala.inline
  implicit def apply(value: String): AttributionLike = value.asInstanceOf[AttributionLike]
}

