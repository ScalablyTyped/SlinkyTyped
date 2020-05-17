package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the coordinates for a poly polygon Bezier. */
@js.native
trait PolyPolygonBezierCoords extends js.Object {
  var Coordinates: PointSequenceSequence = js.native
  var Flags: FlagSequenceSequence = js.native
}

object PolyPolygonBezierCoords {
  @scala.inline
  def apply(Coordinates: PointSequenceSequence, Flags: FlagSequenceSequence): PolyPolygonBezierCoords = {
    val __obj = js.Dynamic.literal(Coordinates = Coordinates.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyPolygonBezierCoords]
  }
  @scala.inline
  implicit class PolyPolygonBezierCoordsOps[Self <: PolyPolygonBezierCoords] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoordinates(value: PointSequenceSequence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Coordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: FlagSequenceSequence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Flags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

