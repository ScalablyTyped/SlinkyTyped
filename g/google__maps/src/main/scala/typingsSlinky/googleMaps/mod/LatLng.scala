package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googleMaps.mod.LatLngArray
  - typingsSlinky.googleMaps.mod.LatLngString
  - typingsSlinky.googleMaps.mod.LatLngLiteral
  - typingsSlinky.googleMaps.mod.LatLngLiteralVerbose
*/
trait LatLng extends js.Object

object LatLng {
  @scala.inline
  implicit def apply(value: LatLngArray): LatLng = value.asInstanceOf[LatLng]
  @scala.inline
  implicit def apply(value: LatLngLiteral): LatLng = value.asInstanceOf[LatLng]
  @scala.inline
  implicit def apply(value: LatLngLiteralVerbose): LatLng = value.asInstanceOf[LatLng]
  @scala.inline
  implicit def apply(value: LatLngString): LatLng = value.asInstanceOf[LatLng]
}

