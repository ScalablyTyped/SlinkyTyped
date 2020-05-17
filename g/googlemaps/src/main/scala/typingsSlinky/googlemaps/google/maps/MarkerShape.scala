package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object defines the clickable region of a marker image. The shape
  * consists of two properties — `type` and `coord` — which define the
  * non-transparent region of an image.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerShape Maps JavaScript API}
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googlemaps.google.maps.MarkerShapeCircle
  - typingsSlinky.googlemaps.google.maps.MarkerShapeRect
  - typingsSlinky.googlemaps.google.maps.MarkerShapePoly
*/
trait MarkerShape extends js.Object

object MarkerShape {
  @scala.inline
  implicit def apply(value: MarkerShapeCircle): MarkerShape = value.asInstanceOf[MarkerShape]
  @scala.inline
  implicit def apply(value: MarkerShapePoly): MarkerShape = value.asInstanceOf[MarkerShape]
  @scala.inline
  implicit def apply(value: MarkerShapeRect): MarkerShape = value.asInstanceOf[MarkerShape]
}

