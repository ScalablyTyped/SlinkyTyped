package typingsSlinky.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Envelope extends Geometry {
  var mmax: js.UndefOr[Double] = js.native
  var mmin: js.UndefOr[Double] = js.native
  var xmax: Double = js.native
  var xmin: Double = js.native
  var ymax: Double = js.native
  var ymin: Double = js.native
  var zmax: js.UndefOr[Double] = js.native
  var zmin: js.UndefOr[Double] = js.native
}

object Envelope {
  @scala.inline
  def apply(xmax: Double, xmin: Double, ymax: Double, ymin: Double): Envelope = {
    val __obj = js.Dynamic.literal(xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], ymax = ymax.asInstanceOf[js.Any], ymin = ymin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Envelope]
  }
  @scala.inline
  implicit class EnvelopeOps[Self <: Envelope] (val x: Self) extends AnyVal {
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
    def withYmax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ymax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYmin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ymin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMmax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mmax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMmax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mmax")(js.undefined)
        ret
    }
    @scala.inline
    def withMmin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMmin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mmin")(js.undefined)
        ret
    }
    @scala.inline
    def withZmax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zmax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZmax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zmax")(js.undefined)
        ret
    }
    @scala.inline
    def withZmin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZmin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zmin")(js.undefined)
        ret
    }
  }
  
}

