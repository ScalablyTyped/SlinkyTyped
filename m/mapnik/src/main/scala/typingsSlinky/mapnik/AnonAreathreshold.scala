package typingsSlinky.mapnik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAreathreshold extends js.Object {
  var area_threshold: js.UndefOr[Double] = js.native
  var fill_type: js.UndefOr[Double] = js.native
  var multi_polygon_union: js.UndefOr[Boolean] = js.native
  var process_all_rings: js.UndefOr[Boolean] = js.native
  var simplify_distance: js.UndefOr[Double] = js.native
  var strictly_simple: js.UndefOr[Boolean] = js.native
}

object AnonAreathreshold {
  @scala.inline
  def apply(): AnonAreathreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAreathreshold]
  }
  @scala.inline
  implicit class AnonAreathresholdOps[Self <: AnonAreathreshold] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArea_threshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area_threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArea_threshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area_threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withFill_type(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill_type")(js.undefined)
        ret
    }
    @scala.inline
    def withMulti_polygon_union(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi_polygon_union")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMulti_polygon_union: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi_polygon_union")(js.undefined)
        ret
    }
    @scala.inline
    def withProcess_all_rings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process_all_rings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcess_all_rings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process_all_rings")(js.undefined)
        ret
    }
    @scala.inline
    def withSimplify_distance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplify_distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimplify_distance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplify_distance")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictly_simple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictly_simple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictly_simple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictly_simple")(js.undefined)
        ret
    }
  }
  
}

