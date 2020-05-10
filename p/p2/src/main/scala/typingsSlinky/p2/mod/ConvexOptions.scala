package typingsSlinky.p2.mod

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConvexOptions extends SharedShapeOptions {
  var axes: js.UndefOr[(js.Tuple2[Double, Double]) | js.Array[ArrayLike[Double]]] = js.native
  var vertices: js.UndefOr[(js.Tuple2[Double, Double]) | js.Array[ArrayLike[Double]]] = js.native
}

object ConvexOptions {
  @scala.inline
  def apply(): ConvexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConvexOptions]
  }
  @scala.inline
  implicit class ConvexOptionsOps[Self <: ConvexOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxes(value: (js.Tuple2[Double, Double]) | js.Array[ArrayLike[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(js.undefined)
        ret
    }
    @scala.inline
    def withVertices(value: (js.Tuple2[Double, Double]) | js.Array[ArrayLike[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertices")(js.undefined)
        ret
    }
  }
  
}

