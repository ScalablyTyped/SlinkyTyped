package typingsSlinky.playcanvas.anon

import typingsSlinky.playcanvas.pc.BoundingBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aabb extends js.Object {
  var aabb: js.UndefOr[BoundingBox] = js.native
  var deltaNormals: js.UndefOr[js.Array[Double]] = js.native
  var deltaPositions: js.Array[Double] = js.native
  var deltaTangents: js.UndefOr[js.Array[Double]] = js.native
  var indices: js.UndefOr[js.Array[Double]] = js.native
  var name: js.UndefOr[String] = js.native
}

object Aabb {
  @scala.inline
  def apply(deltaPositions: js.Array[Double]): Aabb = {
    val __obj = js.Dynamic.literal(deltaPositions = deltaPositions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aabb]
  }
  @scala.inline
  implicit class AabbOps[Self <: Aabb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeltaPositions(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaPositions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAabb(value: BoundingBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aabb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAabb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aabb")(js.undefined)
        ret
    }
    @scala.inline
    def withDeltaNormals(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaNormals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeltaNormals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaNormals")(js.undefined)
        ret
    }
    @scala.inline
    def withDeltaTangents(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaTangents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeltaTangents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaTangents")(js.undefined)
        ret
    }
    @scala.inline
    def withIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

