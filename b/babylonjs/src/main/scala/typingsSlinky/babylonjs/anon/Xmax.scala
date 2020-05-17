package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Xmax extends js.Object {
  var precision: js.UndefOr[H] = js.native
  var subdivisions: js.UndefOr[H] = js.native
  var updatable: js.UndefOr[Boolean] = js.native
  var xmax: Double = js.native
  var xmin: Double = js.native
  var zmax: Double = js.native
  var zmin: Double = js.native
}

object Xmax {
  @scala.inline
  def apply(xmax: Double, xmin: Double, zmax: Double, zmin: Double): Xmax = {
    val __obj = js.Dynamic.literal(xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], zmax = zmax.asInstanceOf[js.Any], zmin = zmin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xmax]
  }
  @scala.inline
  implicit class XmaxOps[Self <: Xmax] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withUpdatable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatable")(js.undefined)
        ret
    }
  }
  
}

