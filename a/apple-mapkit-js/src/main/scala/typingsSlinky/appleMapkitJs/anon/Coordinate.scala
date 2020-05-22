package typingsSlinky.appleMapkitJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coordinate extends js.Object {
  var annotation: typingsSlinky.appleMapkitJs.mapkit.Annotation
  var coordinate: typingsSlinky.appleMapkitJs.mapkit.Coordinate
}

object Coordinate {
  @scala.inline
  def apply(
    annotation: typingsSlinky.appleMapkitJs.mapkit.Annotation,
    coordinate: typingsSlinky.appleMapkitJs.mapkit.Coordinate
  ): Coordinate = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], coordinate = coordinate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinate]
  }
}

