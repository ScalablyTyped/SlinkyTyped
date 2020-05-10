package typingsSlinky.d3Voronoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoronoiCell[T] extends js.Object {
  /**
    * An array of indexes into diagram.edges representing the cell’s polygon.
    */
  var halfedges: js.Array[Double] = js.native
  /**
    * The Voronoi Site of the cell’s associated input point.
    */
  var site: VoronoiSite[T] = js.native
}

object VoronoiCell {
  @scala.inline
  def apply[T](halfedges: js.Array[Double], site: VoronoiSite[T]): VoronoiCell[T] = {
    val __obj = js.Dynamic.literal(halfedges = halfedges.asInstanceOf[js.Any], site = site.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoronoiCell[T]]
  }
  @scala.inline
  implicit class VoronoiCellOps[Self[t] <: VoronoiCell[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withHalfedges(value: js.Array[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halfedges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSite(value: VoronoiSite[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

