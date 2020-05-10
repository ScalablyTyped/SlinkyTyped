package typingsSlinky.googleMaps.mod

import typingsSlinky.googleMaps.AnonLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NearestRoadsResponse extends js.Object {
  /** An array of snapped points. */
  var snappedPoints: js.Array[AnonLocation] = js.native
}

object NearestRoadsResponse {
  @scala.inline
  def apply(snappedPoints: js.Array[AnonLocation]): NearestRoadsResponse = {
    val __obj = js.Dynamic.literal(snappedPoints = snappedPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[NearestRoadsResponse]
  }
  @scala.inline
  implicit class NearestRoadsResponseOps[Self <: NearestRoadsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSnappedPoints(value: js.Array[AnonLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snappedPoints")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

