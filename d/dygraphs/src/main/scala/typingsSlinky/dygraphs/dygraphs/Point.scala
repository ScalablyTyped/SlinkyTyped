package typingsSlinky.dygraphs.dygraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Point structure.
  *
  * xval_* and yval_* are the original unscaled data values,
  * while x_* and y_* are scaled to the range (0.0-1.0) for plotting.
  * yval_stacked is the cumulative Y value used for stacking graphs,
  * and bottom/top/minus/plus are used for error bar graphs.
  */
@js.native
trait Point extends js.Object {
  var annotation: js.UndefOr[Annotation] = js.native
  var idx: Double = js.native
  var name: String = js.native
  var x: js.UndefOr[Double] = js.native
  var xval: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
  var y_bottom: js.UndefOr[Double] = js.native
  var y_stacked: js.UndefOr[Double] = js.native
  var y_top: js.UndefOr[Double] = js.native
  var yval: js.UndefOr[Double] = js.native
  var yval_minus: js.UndefOr[Double] = js.native
  var yval_plus: js.UndefOr[Double] = js.native
  var yval_stacked: js.UndefOr[Double] = js.native
}

object Point {
  @scala.inline
  def apply(idx: Double, name: String): Point = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
  @scala.inline
  implicit class PointOps[Self <: Point] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnnotation(value: Annotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withXval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xval")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
    @scala.inline
    def withY_bottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y_bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY_bottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y_bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withY_stacked(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y_stacked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY_stacked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y_stacked")(js.undefined)
        ret
    }
    @scala.inline
    def withY_top(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y_top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY_top: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y_top")(js.undefined)
        ret
    }
    @scala.inline
    def withYval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yval")(js.undefined)
        ret
    }
    @scala.inline
    def withYval_minus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yval_minus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYval_minus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yval_minus")(js.undefined)
        ret
    }
    @scala.inline
    def withYval_plus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yval_plus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYval_plus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yval_plus")(js.undefined)
        ret
    }
    @scala.inline
    def withYval_stacked(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yval_stacked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYval_stacked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yval_stacked")(js.undefined)
        ret
    }
  }
  
}

