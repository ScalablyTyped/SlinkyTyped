package typingsSlinky.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Projection extends js.Object {
  def fromCoordToPoint(coord: Coord): Point = js.native
  def fromPointToCoord(point: Point): Coord = js.native
}

object Projection {
  @scala.inline
  def apply(fromCoordToPoint: Coord => Point, fromPointToCoord: Point => Coord): Projection = {
    val __obj = js.Dynamic.literal(fromCoordToPoint = js.Any.fromFunction1(fromCoordToPoint), fromPointToCoord = js.Any.fromFunction1(fromPointToCoord))
    __obj.asInstanceOf[Projection]
  }
  @scala.inline
  implicit class ProjectionOps[Self <: Projection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromCoordToPoint(value: Coord => Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromCoordToPoint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFromPointToCoord(value: Point => Coord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromPointToCoord")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

