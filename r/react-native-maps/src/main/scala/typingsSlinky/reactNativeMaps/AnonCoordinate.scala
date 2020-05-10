package typingsSlinky.reactNativeMaps

import typingsSlinky.reactNativeMaps.mod.LatLng
import typingsSlinky.reactNativeMaps.mod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCoordinate extends js.Object {
  var coordinate: LatLng = js.native
  var position: Point = js.native
}

object AnonCoordinate {
  @scala.inline
  def apply(coordinate: LatLng, position: Point): AnonCoordinate = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCoordinate]
  }
  @scala.inline
  implicit class AnonCoordinateOps[Self <: AnonCoordinate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoordinate(value: LatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

