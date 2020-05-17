package typingsSlinky.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.leaflet.mod.LatLng_
  - typingsSlinky.leaflet.mod.LatLngLiteral
  - typingsSlinky.leaflet.mod.LatLngTuple
*/
trait LatLngExpression extends js.Object

object LatLngExpression {
  @scala.inline
  implicit def apply(value: LatLngLiteral): LatLngExpression = value.asInstanceOf[LatLngExpression]
  @scala.inline
  implicit def apply(value: LatLngTuple): LatLngExpression = value.asInstanceOf[LatLngExpression]
  @scala.inline
  implicit def apply(value: LatLng_): LatLngExpression = value.asInstanceOf[LatLngExpression]
}

