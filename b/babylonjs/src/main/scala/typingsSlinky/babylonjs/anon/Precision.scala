package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Precision extends js.Object {
  var precision: js.UndefOr[H] = js.native
  var subdivisions: js.UndefOr[H] = js.native
  var xmax: Double = js.native
  var xmin: Double = js.native
  var zmax: Double = js.native
  var zmin: Double = js.native
}

object Precision {
  @scala.inline
  def apply(xmax: Double, xmin: Double, zmax: Double, zmin: Double): Precision = {
    val __obj = js.Dynamic.literal(xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], zmax = zmax.asInstanceOf[js.Any], zmin = zmin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Precision]
  }
  @scala.inline
  implicit class PrecisionOps[Self <: Precision] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXmax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXmin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZmax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zmax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZmin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrecision(value: H): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withSubdivisions(value: H): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdivisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubdivisions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdivisions")(js.undefined)
        ret
    }
  }
  
}

