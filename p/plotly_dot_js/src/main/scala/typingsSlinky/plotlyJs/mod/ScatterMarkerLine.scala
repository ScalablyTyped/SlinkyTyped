package typingsSlinky.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScatterMarkerLine extends js.Object {
  var autocolorscale: Boolean = js.native
  var cauto: Boolean = js.native
  var cmax: Double = js.native
  var cmin: Double = js.native
  var color: Color = js.native
  var colorscale: ColorScale = js.native
  var reversescale: Boolean = js.native
  var width: Double | js.Array[Double] = js.native
}

object ScatterMarkerLine {
  @scala.inline
  def apply(
    autocolorscale: Boolean,
    cauto: Boolean,
    cmax: Double,
    cmin: Double,
    color: Color,
    colorscale: ColorScale,
    reversescale: Boolean,
    width: Double | js.Array[Double]
  ): ScatterMarkerLine = {
    val __obj = js.Dynamic.literal(autocolorscale = autocolorscale.asInstanceOf[js.Any], cauto = cauto.asInstanceOf[js.Any], cmax = cmax.asInstanceOf[js.Any], cmin = cmin.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], colorscale = colorscale.asInstanceOf[js.Any], reversescale = reversescale.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterMarkerLine]
  }
  @scala.inline
  implicit class ScatterMarkerLineOps[Self <: ScatterMarkerLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutocolorscale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocolorscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCauto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cauto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCmax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCmin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorscale(value: ColorScale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReversescale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversescale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

