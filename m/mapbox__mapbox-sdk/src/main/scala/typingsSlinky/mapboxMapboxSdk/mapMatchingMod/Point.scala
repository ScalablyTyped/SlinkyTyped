package typingsSlinky.mapboxMapboxSdk.mapMatchingMod

import typingsSlinky.mapboxGl.mod.LngLatLike
import typingsSlinky.mapboxMapboxSdk.mapiRequestMod.DirectionsApproach
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Point extends js.Object {
  /**
    * Used to indicate how requested routes consider from which side of the road to approach a waypoint.
    */
  var approach: js.UndefOr[DirectionsApproach] = js.native
  var coordinates: LngLatLike = js.native
}

object Point {
  @scala.inline
  def apply(coordinates: LngLatLike): Point = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
  @scala.inline
  implicit class PointOps[Self <: Point] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoordinates(value: LngLatLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApproach(value: DirectionsApproach): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApproach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approach")(js.undefined)
        ret
    }
  }
  
}

