package typingsSlinky.appleMapkitJs

import typingsSlinky.appleMapkitJs.mapkit.Annotation
import typingsSlinky.appleMapkitJs.mapkit.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCoordinate extends js.Object {
  var annotation: Annotation = js.native
  var coordinate: Coordinate = js.native
}

object AnonCoordinate {
  @scala.inline
  def apply(annotation: Annotation, coordinate: Coordinate): AnonCoordinate = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], coordinate = coordinate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCoordinate]
  }
  @scala.inline
  implicit class AnonCoordinateOps[Self <: AnonCoordinate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotation(value: Annotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoordinate(value: Coordinate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

