package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapToRoadsResponse extends js.Object {
  /** An array of snapped points. */
  var snappedPoints: js.Array[SnappedPoint] = js.native
}

object SnapToRoadsResponse {
  @scala.inline
  def apply(snappedPoints: js.Array[SnappedPoint]): SnapToRoadsResponse = {
    val __obj = js.Dynamic.literal(snappedPoints = snappedPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapToRoadsResponse]
  }
  @scala.inline
  implicit class SnapToRoadsResponseOps[Self <: SnapToRoadsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSnappedPoints(value: js.Array[SnappedPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snappedPoints")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

